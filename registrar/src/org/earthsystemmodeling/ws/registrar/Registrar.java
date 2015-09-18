//***************************************************************************
//
// $Id$
//
// Earth System Modeling Framework
// Copyright 2002-2015, University Corporation for Atmospheric Research,
// Massachusetts Institute of Technology, Geophysical Fluid Dynamics
// Laboratory, University of Michigan, National Centers for Environmental
// Prediction, Los Alamos National Laboratory, Argonne National Laboratory,
// NASA Goddard Space Flight Center.
//
// Licensed under the University of Illinois-NCSA License
//
//***************************************************************************

package org.earthsystemmodeling.ws.registrar;

import java.io.*;
import java.net.*;
import java.util.*;

import org.earthsystemmodeling.ws.component.Component;
import org.earthsystemmodeling.ws.component.ComponentList;
import org.earthsystemmodeling.ws.component.ComponentListXML;


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
            else if (messageType.equalsIgnoreCase("submitted"))
            {
               serviceSubmitted(dataIn, dataOut);
            }
            else if (messageType.equalsIgnoreCase("started"))
            {
               serviceStarted(dataIn, dataOut);
            }
				else if (messageType.equalsIgnoreCase("list"))
				{
					listServices(dataIn, dataOut);
				}
            else if (messageType.equalsIgnoreCase("get"))
            {
               getService(dataIn, dataOut);
            }
            else if (messageType.equalsIgnoreCase("getstatus"))
            {
               getServiceStatus(dataIn, dataOut);
            }
            else if (messageType.equalsIgnoreCase("setstatus"))
            {
               setServiceStatus(dataIn, dataOut);
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
         String   clientId = readStringPkg(dataIn);
			String	hostName = readStringPkg(dataIn);
			String	portNum = readStringPkg(dataIn);
         String   state = "PENDING";

			// add new component to component list and write to file
         System.out.println("** Register **");
         System.out.println("    Client ID: " + clientId);
         System.out.println("    Host Name: " + hostName);
         System.out.println("     Port Num: " + portNum);

			Component	newComponent = new Component(clientId,
                                                  "",
                                                  hostName,
                                                  portNum);

         newComponent.setCurrentState(state);

			theComponents.addComponent(newComponent);
			theComponentsFile.setList(theComponents);

			//***
			// Send status response
			//***
         writeStringPkg(dataOut, state);
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
   private void  serviceSubmitted(DataInputStream   dataIn,
                                  DataOutputStream  dataOut)
      throws Exception
   {
      try
      {
         String   clientId = readStringPkg(dataIn);
         String   jobId = readStringPkg(dataIn);

         // add new component to component list and write to file
         System.out.println("** Update Service **");
         System.out.println("    Client ID: " + clientId);
         System.out.println("       Job ID: " + jobId);

         Component   thisComponent = theComponents.findComponent(clientId);

         if (thisComponent != null)
         {
            thisComponent.setJobId(jobId);

            //***
            // This gets a bit tricky because of timing... If the component
            // service is started using the "fork" method, then the service
            // itself will probably indicate the job has started before the
            // process controller has time to indicate the job has been
            // submitted.  In either case, we want to make sure the job id
            // gets set, but if the job has already started, we don't want
            // the state to revert to submitted... it should stay at ready.
            //***
            if (!(thisComponent.getCurrentState().equalsIgnoreCase("READY")))
            {
               System.out.println("Component Service submitted.");
               thisComponent.setCurrentState("SUBMITTED");
            }
            else
            {
               System.out.println("Component Service already started.");
            }

            theComponentsFile.setList(theComponents);

            //***
            // Send status response
            //***
            writeStringPkg(dataOut, thisComponent.getCurrentState());
         }
         else
         {
            //***
            // Send error response
            //***
            writeStringPkg(dataOut, "NOTFOUND");
         }
      }
      catch (Exception  e)
      {
         String   msg = "Error updating service as started: " + e.getMessage();
         System.out.println(msg);
         throw e;
      }
   }


   /**
    **************************************************************************
    *
    **************************************************************************
    */
   private void  serviceStarted(DataInputStream   dataIn,
                                DataOutputStream  dataOut)
      throws Exception
   {
      try
      {
         String   clientId = readStringPkg(dataIn);
         String   name = readStringPkg(dataIn);
         String   desc = readStringPkg(dataIn);
         String   physHostName = readStringPkg(dataIn);

         // add new component to component list and write to file
         System.out.println("** Update Service **");
         System.out.println("    Client ID: " + clientId);
         System.out.println("         Name: " + name);
         System.out.println("         Desc: " + desc);
         System.out.println("    Host Name: " + physHostName);

         Component   thisComponent = theComponents.findComponent(clientId);

         if (thisComponent != null)
         {
            thisComponent.setName(name);
            thisComponent.setDescription(desc);
            thisComponent.setPhysicalHostName(physHostName);
            thisComponent.setCurrentState("READY");

            theComponentsFile.setList(theComponents);

            //***
            // Send status response
            //***
            writeStringPkg(dataOut, "READY");
         }
         else
         {
            //***
            // Send error response
            //***
            writeStringPkg(dataOut, "NOTFOUND");
         }
      }
      catch (Exception  e)
      {
         String   msg = "Error updating service as started: " + e.getMessage();
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
			String	clientId = readStringPkg(dataIn);

			// add new component to component list and write to file
			System.out.println("Unregister: " + clientId);

			theComponents.removeComponent(clientId);
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


   /**
    **************************************************************************
    *
    **************************************************************************
    */
   private void  getService(DataInputStream   dataIn,
                            DataOutputStream  dataOut)
      throws Exception
   {
      try
      {
         //***
         // First, read the client id from the socket
         //***
         String   clientId = readStringPkg(dataIn);

         System.out.println("Get Component for client ID: " + clientId);

         //***
         // Find the component
         //***
         int         numComps = 1;
         Component   thisComponent = theComponents.findComponent(clientId);

         if (thisComponent == null)
         {
            numComps = 0;
         }

         //***
         // First, write out the number of services (1 if found, 0 otherwise)
         //***
         writeStringPkg(dataOut, String.valueOf(numComps));

         //***
         // Then, if it was found, write out the service information
         //***
         if (thisComponent != null)
         {
            writeStringPkg(dataOut, thisComponent.getClientId());
            writeStringPkg(dataOut, thisComponent.getJobId());
            writeStringPkg(dataOut, thisComponent.getHostName());
            writeStringPkg(dataOut, thisComponent.getPortNum());
            writeStringPkg(dataOut, thisComponent.getName());
            writeStringPkg(dataOut, thisComponent.getDescription());
            writeStringPkg(dataOut, thisComponent.getPhysicalHostName());
            writeStringPkg(dataOut, thisComponent.getCurrentState());
         }
      }
      catch (Exception  e)
      {
         String   msg = "Error getting service: " + e.getMessage();
         System.out.println(msg);
         throw e;
      }
   }


   /**
    **************************************************************************
    *
    **************************************************************************
    */
   private void  getServiceStatus(DataInputStream   dataIn,
                                  DataOutputStream  dataOut)
      throws Exception
   {
      try
      {
         //***
         // First, read the client id from the socket
         //***
         String   clientId = readStringPkg(dataIn);

         System.out.println("Get Component for client ID: " + clientId);

         //***
         // Find the component
         //***
         Component   thisComponent = theComponents.findComponent(clientId);

         //***
         // Then, if it was found, write out the service information
         //***
         if (thisComponent != null)
         {
            writeStringPkg(dataOut, thisComponent.getCurrentState());
         }
         else
         {
            writeStringPkg(dataOut, "NOTFOUND");
         }
      }
      catch (Exception  e)
      {
         String   msg = "Error getting service: " + e.getMessage();
         System.out.println(msg);
         throw e;
      }
   }


   /**
    **************************************************************************
    *
    **************************************************************************
    */
   private void  setServiceStatus(DataInputStream   dataIn,
                                  DataOutputStream  dataOut)
      throws Exception
   {
      try
      {
         String   clientId = readStringPkg(dataIn);
         String   state = readStringPkg(dataIn);

         // add new component to component list and write to file
         System.out.println("** Update Service **");
         System.out.println("    Client ID: " + clientId);
         System.out.println("        State: " + state);

         Component   thisComponent = theComponents.findComponent(clientId);

         if (thisComponent != null)
         {
            thisComponent.setCurrentState(state);

            theComponentsFile.setList(theComponents);

            //***
            // Send status response
            //***
            System.out.println("   Returning: " + state);
            writeStringPkg(dataOut, state);
         }
         else
         {
            //***
            // Send error response
            //***
            writeStringPkg(dataOut, "NOTFOUND");
         }
      }
      catch (Exception  e)
      {
         String   msg = "Error updating service status: " + e.getMessage();
         System.out.println(msg);
         throw e;
      }
   }
}
