//***************************************************************************
//
// $Id$
//
// Earth System Modeling Framework
// Copyright 2002-2008, University Corporation for Atmospheric Research,
// Massachusetts Institute of Technology, Geophysical Fluid Dynamics
// Laboratory, University of Michigan, National Centers for Environmental
// Prediction, Los Alamos National Laboratory, Argonne National Laboratory,
// NASA Goddard Space Flight Center.
//
// Licensed under the University of Illinois-NCSA License
//
//***************************************************************************

package edu.ucar.esmf.registrar;

import java.io.*;
import java.net.*;
import java.util.*;
import edu.ucar.esmf.component.*;


/**
 *****************************************************************************
 *
 *****************************************************************************
 */
public class Registrar
{
	private final int		MAGIC = 0x8765;

	private ServerSocket			theServerSocket = null;
	private int						theSocketPort = 9999;
	private ComponentListXML	theComponentsFile;
	private ComponentList		theComponents;


	/**
	 **************************************************************************
	 *
	 **************************************************************************
	 */
	public Registrar(int     portNum,
                    String  componentsFilename)
		throws Exception
	{
		theSocketPort = portNum;
		try
		{
			theComponentsFile = new ComponentListXML(componentsFilename);
			theComponents = theComponentsFile.getList();
		}
		catch (Exception  e)
		{
			String	msg = "Error while opening/reading components file: " +
								e.getMessage();

			throw new Exception(msg);
		}
	}


	/**
	 **************************************************************************
	 *
	 **************************************************************************
	 */
	public void  registrationLoop()
		throws Exception
	{
		try
		{
			try
			{
				theServerSocket = new ServerSocket(theSocketPort);
			}
			catch (IOException  e)
			{
				String	msg = "Could not listen on port: " + e.getMessage();
				System.out.println(msg);
				throw e;
			}

			while (true)
			{
				Socket	clientSocket = null;

				try
				{
System.out.println("\nWaiting for connection from client");
					clientSocket = theServerSocket.accept();
				}
				catch (IOException  e)
				{
					String	msg = "Accept failed: " + e.getMessage();
					System.out.println(msg);
					throw e;
				}

				InputStream		inStream  = clientSocket.getInputStream();
				OutputStream	outStream = clientSocket.getOutputStream();

				DataInputStream	dataIn  = new DataInputStream(inStream);
				DataOutputStream	dataOut = new DataOutputStream(outStream);

				//***
				// Process registration request
				//***
				String	messageType = readStringPkg(dataIn);
System.out.println("Type: " + messageType);

				if (messageType.equalsIgnoreCase("register"))
				{
					registerService(dataIn, dataOut);
				}
				else if (messageType.equalsIgnoreCase("unregister"))
				{
					unregisterService(dataIn, dataOut);
				}
				else if (messageType.equalsIgnoreCase("list"))
				{
					listServices(dataIn, dataOut);
				}

				dataOut.close();
				dataIn.close();

				clientSocket.close();
			}
		}
		catch (Exception  e)
		{
			String	msg = "Registrar Error: " + e.getMessage();
			System.out.println(msg);
			throw e;
		}
		finally
		{
			theServerSocket.close();
		}
	}


	/**
	 **************************************************************************
	 *
	 **************************************************************************
	 */
	private String  readStringPkg(DataInputStream  dataIn)
		throws Exception
	{
		//***
		// Read and validate the magic number
		//***
		int	magicNum = dataIn.readInt();

		if (magicNum != MAGIC)
		{
			String	msg = "Invalid magic number: " + magicNum;

			Exception	ex = new Exception(msg);
			throw ex;
		}

		//***
		// Read the msg size from the buffer... this size should include enough
		// space for the string plus the null character at the end of the string
		//***
		int	msgSize = dataIn.readInt();

		//***
		// Finally, read the string (as bytes) from the buffer and return it
		//***
		byte[]	str = new byte[msgSize];
		dataIn.readFully(str);

		String	buf = new String(str);

		return buf.substring(0, msgSize - 1);
	}


	/**
	 **************************************************************************
	 *
	 **************************************************************************
	 */
	private void  writeStringPkg(DataOutputStream  dataOut,
                                String            str)
		throws Exception
	{
		//***
		// Write out the magic number and the msg size... the size should
		// include 1 byte for the null character
		//***
		dataOut.writeInt(MAGIC);
		dataOut.writeInt(str.length() + 1);

		//***
		// Write out the string (as bytes -- 1 byte per character) and also
		// write out the null terminating character.
		//***
		dataOut.writeBytes(str);
		dataOut.writeBytes("\0");

		//***
		// Finally, flush the data to the buffer so that it gets written to
		// the socket.
		//***
		dataOut.flush();
	}


	/**
	 **************************************************************************
	 *
	 **************************************************************************
	 */
	private void  registerService(DataInputStream   dataIn,
	                              DataOutputStream  dataOut)
		throws Exception
	{
		try
		{
			String	name = readStringPkg(dataIn);
			String	desc = readStringPkg(dataIn);
			String	hostName = readStringPkg(dataIn);
			String	portNum = readStringPkg(dataIn);

			// add new component to component list and write to file
			System.out.println("Register: " + name);
			System.out.println("   " + desc);
			System.out.println("   " + hostName + ":" + portNum);

			Component	newComponent = new Component(
														name, 
                                              desc, 
                                              hostName, 
                                              Integer.parseInt(portNum));

			theComponents.addComponent(newComponent);
			theComponentsFile.setList(theComponents);

			//***
			// Send status response
			//***
			writeStringPkg(dataOut, "OK");
		}
		catch (Exception  e)
		{
			String	msg = "Error registering service: " + e.getMessage();
			System.out.println(msg);
			throw e;
		}
	}


	/**
	 **************************************************************************
	 *
	 **************************************************************************
	 */
	private void  unregisterService(DataInputStream   dataIn,
	                                DataOutputStream  dataOut)
		throws Exception
	{
		try
		{
			String	name = readStringPkg(dataIn);
			String	hostName = readStringPkg(dataIn);
			String	portNum = readStringPkg(dataIn);

			// add new component to component list and write to file
			System.out.println("Unregister: " + name);
			System.out.println("   " + hostName + ":" + portNum);

			Component	delComponent = new Component(
														name, 
                                          "", 
                                          hostName, 
                                          Integer.parseInt(portNum));

			theComponents.removeComponent(delComponent);
			theComponentsFile.setList(theComponents);

			//***
			// Send status response
			//***
			writeStringPkg(dataOut, "OK");
		}
		catch (Exception  e)
		{
			String	msg = "Error unregistering service: " + e.getMessage();
			System.out.println(msg);
			throw e;
		}
	}


	/**
	 **************************************************************************
	 *
	 **************************************************************************
	 */
	private void  listServices(DataInputStream   dataIn,
	                           DataOutputStream  dataOut)
		throws Exception
	{
		try
		{
			//***
			// First, write out the number of services
			//***
			Vector<Component>		compList = theComponents.components();
			writeStringPkg(dataOut, String.valueOf(compList.size()));

			//***
			// Then, write out the service name for each one
			//***
			for (int i = 0; i < compList.size(); ++i)
			{
				Component	thisComponent = compList.elementAt(i);
				writeStringPkg(dataOut, thisComponent.getName());
			}
		}
		catch (Exception  e)
		{
			String	msg = "Error unregistering service: " + e.getMessage();
			System.out.println(msg);
			throw e;
		}
	}
}
