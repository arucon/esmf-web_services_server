//***************************************************************************
//
// $Id$
//
// Earth System Modeling Framework
// Copyright 2002-2014, University Corporation for Atmospheric Research,
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
import edu.ucar.esmf.component.*;


/**
 *****************************************************************************
 *
 *****************************************************************************
 */
public class RegistrarClient
{
	private final int		MAGIC = 0x8765;

	private String			theRegistrarHost = "localhost";
	private int				theRegistrarPort = 9999;


	/**
	 **************************************************************************
	 *
	 **************************************************************************
	 */
	public RegistrarClient(String  hostName,
                          int     portNum)
		throws Exception
	{
		theRegistrarHost = hostName;
		theRegistrarPort = portNum;

		try
		{
		}
		catch (Exception  e)
		{
			String	msg = "Error while connecting to server: " + e.getMessage();

			throw new Exception(msg);
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
	public String  registerService(Component  svcToRegister)
		throws Exception
	{
		String	statusMsg = "NOT SET";

		try
		{
			//***
			// Open up the connection to the registrar and setup the input and
			// output streams
			//***
			Socket	clientSocket = new Socket(theRegistrarHost, theRegistrarPort);

			System.out.println("***********************************************");
			System.out.println("Connected to Registrar:");
			System.out.println("  Host : " + theRegistrarHost);
			System.out.println("  Port : " + theRegistrarPort);
			System.out.println("***********************************************");

			InputStream		inStream  = clientSocket.getInputStream();
			OutputStream	outStream = clientSocket.getOutputStream();

			DataInputStream	dataIn  = new DataInputStream(inStream);
			DataOutputStream	dataOut = new DataOutputStream(outStream);

			//***
			// Write out the register request
			//***
			writeStringPkg(dataOut, "register");
			writeStringPkg(dataOut, svcToRegister.getName());
			writeStringPkg(dataOut, svcToRegister.getDescription());
			writeStringPkg(dataOut, svcToRegister.getHostName());
			writeStringPkg(dataOut, String.valueOf(svcToRegister.getPortNum()));

			//***
			// Get status response
			//***
			statusMsg = readStringPkg(dataIn);

			//***
			// Close things out (might want to move to finally)
			//***
			dataOut.close();
			dataIn.close();

			clientSocket.close();
		}
		catch (Exception  e)
		{
			String	msg = "Error registering service: " + e.getMessage();
			System.out.println(msg);
			throw new Exception(msg);
		}

		return statusMsg;
	}


	/**
	 **************************************************************************
	 *
	 **************************************************************************
	 */
	public String  unregisterService(Component  svcToUnregister)
		throws Exception
	{
		String	statusMsg = "NOT SET";

		try
		{
			//***
			// Open up the connection to the registrar and setup the input and
			// output streams
			//***
			Socket	clientSocket = new Socket(theRegistrarHost, theRegistrarPort);

			System.out.println("***********************************************");
			System.out.println("Connected to Registrar:");
			System.out.println("  Host : " + theRegistrarHost);
			System.out.println("  Port : " + theRegistrarPort);
			System.out.println("***********************************************");

			InputStream		inStream  = clientSocket.getInputStream();
			OutputStream	outStream = clientSocket.getOutputStream();

			DataInputStream	dataIn  = new DataInputStream(inStream);
			DataOutputStream	dataOut = new DataOutputStream(outStream);

			//***
			// Write out the register request
			//***
			writeStringPkg(dataOut, "unregister");
			writeStringPkg(dataOut, svcToUnregister.getName());
			writeStringPkg(dataOut, svcToUnregister.getHostName());
			writeStringPkg(dataOut, String.valueOf(svcToUnregister.getPortNum()));

			//***
			// Get status response
			//***
			statusMsg = readStringPkg(dataIn);

			//***
			// Close things out (might want to move to finally)
			//***
			dataOut.close();
			dataIn.close();

			clientSocket.close();
		}
		catch (Exception  e)
		{
			String	msg = "Error unregistering service: " + e.getMessage();
			System.out.println(msg);
			throw e;
		}

		return statusMsg;
	}


	/**
	 **************************************************************************
	 *
	 **************************************************************************
	 */
	public String[]  listServices()
		throws Exception
	{
		String[]	services = new String[0];

		try
		{
			//***
			// Open up the connection to the registrar and setup the input and
			// output streams
			//***
			Socket	clientSocket = new Socket(theRegistrarHost, theRegistrarPort);

			System.out.println("***********************************************");
			System.out.println("Connected to Registrar:");
			System.out.println("  Host : " + theRegistrarHost);
			System.out.println("  Port : " + theRegistrarPort);
			System.out.println("***********************************************");

			InputStream		inStream  = clientSocket.getInputStream();
			OutputStream	outStream = clientSocket.getOutputStream();

			DataInputStream	dataIn  = new DataInputStream(inStream);
			DataOutputStream	dataOut = new DataOutputStream(outStream);

			//***
			// Write out the register request
			//***
			writeStringPkg(dataOut, "list");

			//***
			// Get status response
			//***
			String	numServicesStr = readStringPkg(dataIn);
			int		numServices = Integer.parseInt(numServicesStr);

			services = new String[numServices];

			for (int i = 0; i < numServices; ++i)
			{
				services[i] = readStringPkg(dataIn);
			}

			//***
			// Close things out (might want to move to finally)
			//***
			dataOut.close();
			dataIn.close();

			clientSocket.close();
		}
		catch (Exception  e)
		{
			String	msg = "Error unregistering service: " + e.getMessage();
			System.out.println(msg);
			throw e;
		}

		return services;
	}
}
