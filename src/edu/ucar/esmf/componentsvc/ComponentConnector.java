//***************************************************************************
//
// $Id:
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

package edu.ucar.esmf.componentsvc;

import java.io.*;
import java.net.*;
import java.util.*;
import edu.ucar.esmf.component.*;


/**
 *****************************************************************************
 *
 *****************************************************************************
 */
public class ComponentConnector
{
	private final int		MAGIC = 0x8765;

	private Component		theComponent;


	/**
	 **************************************************************************
	 *
	 **************************************************************************
	 */
	public ComponentConnector(Component  component)
	{
		theComponent = component;
	}


	/**
	 **************************************************************************
	 *
	 **************************************************************************
	 */
	public int  newClient(String  clientName)
	{
		int		clientId = 0;
		Socket	socket = null;

		try
		{
			//***
			// Connect to socket interface
			//***
			socket = new Socket(theComponent.getHostName(), 
                             theComponent.getPortNum());

			InputStream		inStream = socket.getInputStream();
			OutputStream	outStream = socket.getOutputStream();

			DataInputStream	dataIn = new DataInputStream(inStream);
			DataOutputStream	dataOut = new DataOutputStream(outStream);

			//***
			// Pass call to create a new client with the client name
			//***
			String	requestId = "NEW";

			writeStringPkg(dataOut, requestId);
			writeStringPkg(dataOut, clientName);

			//***
			// Read the returned client id
			//***
			clientId = readIntPkg(dataIn);
		}
		catch (Exception  e)
		{
			String	msg = "Error communicating with component: " + e.getMessage();
			System.out.println(msg);
		}
		finally
		{
			//***
			// Close socket connection
			//***
			if (socket != null)
			{
				try
				{
					socket.close();
				}
				catch (IOException  e)
				{
					String	msg = "Error closing socket: " + e.getMessage();
					System.out.println(msg);
				}
			}
		}

		return clientId;
	}


	/**
	 **************************************************************************
	 *
	 **************************************************************************
	 */
	public int  compInit(int  clientId)
	{
		Socket	socket = null;
		int		status = 0;

		try
		{
			//***
			// Connect to socket interface
			//***
			socket = new Socket(theComponent.getHostName(), 
                             theComponent.getPortNum());

			InputStream		inStream = socket.getInputStream();
			OutputStream	outStream = socket.getOutputStream();

			DataInputStream	dataIn = new DataInputStream(inStream);
			DataOutputStream	dataOut = new DataOutputStream(outStream);

			//***
			// Pass init call along with the client id
			//***
			String	requestId = "INIT";

			writeStringPkg(dataOut, requestId);
			writeIntPkg(dataOut, clientId);

			//***
			// Pass the number of files... for the moment, let's just make
			// it 0
			//***
			writeIntPkg(dataOut, 0);

			//***
			// Read the returned status string
			//***
			status = readIntPkg(dataIn);
		}
		catch (Exception  e)
		{
			String	msg = "Error communicating with component: " + e.getMessage();
			System.out.println(msg);
		}
		finally
		{
			//***
			// Close socket connection
			//***
			if (socket != null)
			{
				try
				{
					socket.close();
				}
				catch (IOException  e)
				{
					String	msg = "Error closing socket: " + e.getMessage();
					System.out.println(msg);
				}
			}
		}

		return status;
	}


	/**
	 **************************************************************************
	 *
	 **************************************************************************
	 */
	public int  compInit(int     clientId,
                        String  importFilename)
	{
		Socket	socket = null;
		int		status = 0;

		try
		{
			//***
			// Connect to socket interface
			//***
			socket = new Socket(theComponent.getHostName(), 
                             theComponent.getPortNum());

			InputStream		inStream = socket.getInputStream();
			OutputStream	outStream = socket.getOutputStream();

			DataInputStream	dataIn = new DataInputStream(inStream);
			DataOutputStream	dataOut = new DataOutputStream(outStream);

			//***
			// Pass init call along with the client id
			//***
			String	requestId = "INIT";

			writeStringPkg(dataOut, requestId);
			writeIntPkg(dataOut, clientId);

			if (importFilename != null)
			{
System.out.println("Writing out 1 file");
				//***
				// Pass the number of files... 
				//***
				writeIntPkg(dataOut, 1);
				writeStringPkg(dataOut, importFilename);
			}
			else
			{
System.out.println("Writing out 0 files");
				//***
				// Pass the number of files... since the filename is null, 
				// should be zero
				//***
				writeIntPkg(dataOut, 0);
			}

			//***
			// Read the returned status string
			//***
			status = readIntPkg(dataIn);
		}
		catch (Exception  e)
		{
			String	msg = "Error communicating with component: " + e.getMessage();
			System.out.println(msg);
		}
		finally
		{
			//***
			// Close socket connection
			//***
			if (socket != null)
			{
				try
				{
					socket.close();
				}
				catch (IOException  e)
				{
					String	msg = "Error closing socket: " + e.getMessage();
					System.out.println(msg);
				}
			}
		}

		return status;
	}


	/**
	 **************************************************************************
	 *
	 **************************************************************************
	 */
	public int  compRun(int  clientId)
	{
		Socket	socket = null;
		int		status = 0;

		try
		{
			//***
			// Connect to socket interface
			//***
			socket = new Socket(theComponent.getHostName(), 
                             theComponent.getPortNum());

			InputStream		inStream = socket.getInputStream();
			OutputStream	outStream = socket.getOutputStream();

			DataInputStream	dataIn = new DataInputStream(inStream);
			DataOutputStream	dataOut = new DataOutputStream(outStream);

			//***
			// Pass run call along with the client id
			//***
			String	requestId = "RUN";

			writeStringPkg(dataOut, requestId);
			writeIntPkg(dataOut, clientId);

			//***
			// Read the returned status string
			//***
			status = readIntPkg(dataIn);
		}
		catch (Exception  e)
		{
			String	msg = "Error communicating with component: " + e.getMessage();
			System.out.println(msg);
		}
		finally
		{
			//***
			// Close socket connection
			//***
			if (socket != null)
			{
				try
				{
					socket.close();
				}
				catch (IOException  e)
				{
					String	msg = "Error closing socket: " + e.getMessage();
					System.out.println(msg);
				}
			}
		}

		return status;
	}


	/**
	 **************************************************************************
	 *
	 **************************************************************************
	 */
	public int  compFinalize(int  clientId)
	{
		Socket	socket = null;
		int		status = 0;

		try
		{
			//***
			// Connect to socket interface
			//***
			socket = new Socket(theComponent.getHostName(), 
                             theComponent.getPortNum());

			InputStream		inStream = socket.getInputStream();
			OutputStream	outStream = socket.getOutputStream();

			DataInputStream	dataIn = new DataInputStream(inStream);
			DataOutputStream	dataOut = new DataOutputStream(outStream);

			//***
			// Pass finalize call along with the client id
			//***
			String	requestId = "FINAL";

			writeStringPkg(dataOut, requestId);
			writeIntPkg(dataOut, clientId);

			//***
			// Read the returned status string
			//***
			status = readIntPkg(dataIn);
		}
		catch (Exception  e)
		{
			String	msg = "Error communicating with component: " + e.getMessage();
			System.out.println(msg);
		}
		finally
		{
			//***
			// Close socket connection
			//***
			if (socket != null)
			{
				try
				{
					socket.close();
				}
				catch (IOException  e)
				{
					String	msg = "Error closing socket: " + e.getMessage();
					System.out.println(msg);
				}
			}
		}

		return status;
	}


	/**
	 **************************************************************************
	 *
	 **************************************************************************
	 */
	public int  compState(int  clientId)
	{
		Socket	socket = null;
		int		status = 0;

		try
		{
			//***
			// Connect to socket interface
			//***
			socket = new Socket(theComponent.getHostName(), 
                             theComponent.getPortNum());

			InputStream		inStream = socket.getInputStream();
			OutputStream	outStream = socket.getOutputStream();

			DataInputStream	dataIn = new DataInputStream(inStream);
			DataOutputStream	dataOut = new DataOutputStream(outStream);

			//***
			// Pass finalize call along with the client id
			//***
			String	requestId = "STATE";

			writeStringPkg(dataOut, requestId);
			writeIntPkg(dataOut, clientId);

			//***
			// Read the returned status string
			//***
			status = readIntPkg(dataIn);
		}
		catch (Exception  e)
		{
			String	msg = "Error communicating with component: " + e.getMessage();
			System.out.println(msg);
		}
		finally
		{
			//***
			// Close socket connection
			//***
			if (socket != null)
			{
				try
				{
					socket.close();
				}
				catch (IOException  e)
				{
					String	msg = "Error closing socket: " + e.getMessage();
					System.out.println(msg);
				}
			}
		}

		return status;
	}


	/**
	 **************************************************************************
	 *
	 **************************************************************************
	 */
	public Vector<String>  compFiles(int  clientId)
	{
		Socket	socket = null;
		int		status = 0;

		Vector<String>	filenames = new Vector<String>();

		try
		{
			//***
			// Connect to socket interface
			//***
			socket = new Socket(theComponent.getHostName(), 
                             theComponent.getPortNum());

			InputStream		inStream = socket.getInputStream();
			OutputStream	outStream = socket.getOutputStream();

			DataInputStream	dataIn = new DataInputStream(inStream);
			DataOutputStream	dataOut = new DataOutputStream(outStream);

			//***
			// Pass finalize call along with the client id
			//***
			String	requestId = "FILES";

			writeStringPkg(dataOut, requestId);
			writeIntPkg(dataOut, clientId);

			//***
			// Read the returned list of files...
			//***
			int	numFiles = readIntPkg(dataIn);

			for (int i = 0; i < numFiles; ++i)
			{
				String	fileType = readStringPkg(dataIn);
				String	filename = readStringPkg(dataIn);

				filenames.addElement(filename);
			}
		}
		catch (Exception  e)
		{
			String	msg = "Error communicating with component: " + e.getMessage();
			System.out.println(msg);
		}
		finally
		{
			//***
			// Close socket connection
			//***
			if (socket != null)
			{
				try
				{
					socket.close();
				}
				catch (IOException  e)
				{
					String	msg = "Error closing socket: " + e.getMessage();
					System.out.println(msg);
				}
			}
		}

		return filenames;
	}


	/**
	 **************************************************************************
	 *
	 **************************************************************************
	 */
	public String  getOutputData(int     clientId,
                                String  varName,
                                String  time,
                                String  lat,
                                String  lon)
	{
		Socket	socket = null;
		int		status = 0;

		String	dataValue = new String("");

		try
		{
			//***
			// Connect to socket interface
			//***
			socket = new Socket(theComponent.getHostName(), 
                             theComponent.getPortNum());

			InputStream		inStream = socket.getInputStream();
			OutputStream	outStream = socket.getOutputStream();

			DataInputStream	dataIn = new DataInputStream(inStream);
			DataOutputStream	dataOut = new DataOutputStream(outStream);

			//***
			// Pass get data call request along with the client id, variable
			// name, time, latitude and longitude of requested data
			//***
			String	requestId = "DATA";

			writeStringPkg(dataOut, requestId);
			writeIntPkg(dataOut, clientId);
			writeStringPkg(dataOut, varName);
			writeStringPkg(dataOut, time);
			writeStringPkg(dataOut, lat);
			writeStringPkg(dataOut, lon);

			//***
			// Read the returned data value
			//***
			dataValue = readStringPkg(dataIn);

			//***
			// Read the returned status string
			//***
			status = readIntPkg(dataIn);
		}
		catch (Exception  e)
		{
			String	msg = "Error communicating with component: " + e.getMessage();
			System.out.println(msg);
		}
		finally
		{
			//***
			// Close socket connection
			//***
			if (socket != null)
			{
				try
				{
					socket.close();
				}
				catch (IOException  e)
				{
					String	msg = "Error closing socket: " + e.getMessage();
					System.out.println(msg);
				}
			}
		}

		return dataValue;
	}


	/**
	 **************************************************************************
	 *
	 **************************************************************************
	 */
	public int  endClient(int  clientId)
	{
		Socket	socket = null;
		int		status = 0;

		try
		{
			//***
			// Connect to socket interface
			//***
			socket = new Socket(theComponent.getHostName(), 
                             theComponent.getPortNum());

			InputStream		inStream = socket.getInputStream();
			OutputStream	outStream = socket.getOutputStream();

			DataInputStream	dataIn = new DataInputStream(inStream);
			DataOutputStream	dataOut = new DataOutputStream(outStream);

			//***
			// Pass finalize call along with the client id
			//***
			String	requestId = "END";

			writeStringPkg(dataOut, requestId);
			writeIntPkg(dataOut, clientId);

			//***
			// Read the returned status string
			//***
			status = readIntPkg(dataIn);
		}
		catch (Exception  e)
		{
			String	msg = "Error communicating with component: " + e.getMessage();
			System.out.println(msg);
		}
		finally
		{
			//***
			// Close socket connection
			//***
			if (socket != null)
			{
				try
				{
					socket.close();
				}
				catch (IOException  e)
				{
					String	msg = "Error closing socket: " + e.getMessage();
					System.out.println(msg);
				}
			}
		}

		return status;
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
	private void  writeIntPkg(DataOutputStream  dataOut,
                             int               value)
		throws Exception
	{
		//***
		// Write out the magic number and the msg size... the size should 
      // be 4 bytes... since we're assuming all ints are 4 bytes long
		//***
		dataOut.writeInt(MAGIC);
		dataOut.writeInt(4);

		//***
		// Write out the int 
		//***
		dataOut.writeInt(value);

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
	private int  readIntPkg(DataInputStream  dataIn)
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
		// Read the msg size from the buffer... Since I'm expecting an integer,
		// this value should always be 4.
		//***
		int	msgSize = dataIn.readInt();

		//***
		// Finally, read the integer from the buffer and return it
		//***
		int	dataValue = dataIn.readInt();

		return dataValue;
	}
}
