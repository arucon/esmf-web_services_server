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

package org.earthsystemmodeling.ws.component;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.util.Vector;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


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

	private static Log log = LogFactory.getLog(ComponentConnector.class);

	public ComponentConnector(Component component)
	{
		theComponent = component;
 //        	log.info("Instantiating ComponentConnector object");

	}


	/**
	 **************************************************************************
	 *
	 **************************************************************************
	 */
	public int  newClient(String userName, 	String password)
	{
		int		clientId = 0;
		Socket	socket = null;

		try
		{
			//***
			// Connect to socket interface
			//***
			log.info("Connecting to: " + theComponent.getPhysicalHostName() + ": " + theComponent.getPortNum());
			socket = new Socket(theComponent.getPhysicalHostName(),
					Integer.parseInt(theComponent.getPortNum()));

			InputStream inStream = socket.getInputStream();
			OutputStream outStream = socket.getOutputStream();

			DataInputStream	dataIn = new DataInputStream(inStream);
			DataOutputStream dataOut = new DataOutputStream(outStream);

			//***
			// Pass call to create a new client with the client name
			//***
			String	requestId = "NEW";

			writeStringPkg(dataOut, requestId);
			writeStringPkg(dataOut, userName);
			writeStringPkg(dataOut, password);

			//***
			// Read the returned client id
			//***
			clientId = readIntPkg(dataIn);
		}
		catch (Exception  e)
		{
			String	msg = "Error communicating with component: " + e.getMessage();
			log.info(msg);
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
					log.info(msg);
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
			socket = new Socket(theComponent.getPhysicalHostName(),
					Integer.parseInt(theComponent.getPortNum()));

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
			// Read the returned status string
			//***
			status = readIntPkg(dataIn);
		}
		catch (Exception  e)
		{
			String	msg = "Error communicating with component: " + e.getMessage();
			log.info(msg);
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
					log.info(msg);
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
			socket = new Socket(theComponent.getPhysicalHostName(),
					Integer.parseInt(theComponent.getPortNum()));

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
			log.info(msg);
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
					log.info(msg);
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
	public int  compTimestep(int  clientId,
			int  numTimesteps)
	{
		Socket   socket = null;
		int      status = 0;

		try
		{
			//***
			// Connect to socket interface
			//***
			socket = new Socket(theComponent.getPhysicalHostName(),
					Integer.parseInt(theComponent.getPortNum()));

			InputStream    inStream = socket.getInputStream();
			OutputStream   outStream = socket.getOutputStream();

			DataInputStream   dataIn = new DataInputStream(inStream);
			DataOutputStream  dataOut = new DataOutputStream(outStream);

			//***
			// Pass run call along with the client id
			//***
			String   requestId = "TIMESTEP";

			writeStringPkg(dataOut, requestId);
			writeIntPkg(dataOut, clientId);
			writeIntPkg(dataOut, numTimesteps);

			//***
			// Read the returned status string
			//***
			status = readIntPkg(dataIn);
		}
		catch (Exception  e)
		{
			String   msg = "Error communicating with component: " + e.getMessage();
			log.info(msg);
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
					String   msg = "Error closing socket: " + e.getMessage();
					log.info(msg);
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
			socket = new Socket(theComponent.getPhysicalHostName(),
					Integer.parseInt(theComponent.getPortNum()));

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
			log.info(msg);
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
					log.info(msg);
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
	public DataDescResponse  dataDesc(int  clientId)
	{
		DataDescResponse  response = new DataDescResponse();
		Socket            socket = null;
		int               status = 0;

		try
		{
			//***
			// Connect to socket interface
			//***
			socket = new Socket(theComponent.getPhysicalHostName(),
					Integer.parseInt(theComponent.getPortNum()));

			InputStream    inStream = socket.getInputStream();
			OutputStream   outStream = socket.getOutputStream();

			DataInputStream   dataIn = new DataInputStream(inStream);
			DataOutputStream  dataOut = new DataOutputStream(outStream);

			//***
			// Pass data desc call along with the client id
			//***
			String   requestId = "DATADESC";

			writeStringPkg(dataOut, requestId);
			writeIntPkg(dataOut, clientId);

			//***
			// Read the data description info
			//   - number of variables
			//   - variable names
			//   - number of latitude values
			//   - array of latitude values
			//   - number of longitude values
			//   - array of longitude values
			//***
			int   numVars = readIntPkg(dataIn);
			//log.info("Num Vars: " + numVars);
			response.setNumVars(numVars);

			String   varNames[] = new String[numVars];
			for (int i = 0; i < numVars; ++i)
			{
				varNames[i] = readStringPkg(dataIn);
				//log.info("Var Name[" + i + "]: " + varNames[i]);
			}
			response.setVarNames(varNames);

			int   numLats = readIntPkg(dataIn);
			int   dataSize = 8 * numLats;
			//log.info("Num Lats: " + numLats);
			response.setNumLats(numLats);

			byte[]   netLatValues = readBytePkg(dataIn, dataSize);
			double[] latValues = new double[numLats];

			ByteBuffer  thisBuffer = ByteBuffer.allocate(dataSize);
			thisBuffer.put(netLatValues, 0, dataSize);

			for (int i = 0; i < numLats; ++i)
			{
				double   netThisValue = thisBuffer.getDouble(i * 8);
				latValues[i] = ByteSwapper.swap(netThisValue);
				//log.info("Lat Value[" + i + "]: " + latValues[i]);
			}
			response.setLatValues(latValues);

			int   numLons = readIntPkg(dataIn);
			dataSize = 8 * numLons;
			//log.info("Num Lons: " + numLons);
			response.setNumLons(numLons);

			byte[]   netLonValues = readBytePkg(dataIn, dataSize);
			double[] lonValues = new double[numLons];

			thisBuffer = ByteBuffer.allocate(dataSize);
			thisBuffer.put(netLonValues, 0, dataSize);

			for (int i = 0; i < numLons; ++i)
			{
				double   netThisValue = thisBuffer.getDouble(i * 8);
				lonValues[i] = ByteSwapper.swap(netThisValue);
				//log.info("Lon Value[" + i + "]: " + lonValues[i]);
			}
			response.setLonValues(lonValues);

			//***
			// Read the returned status string
			//***
			status = readIntPkg(dataIn);
			response.setStatus(status);
		}
		catch (Exception  e)
		{
			String   msg = "Error communicating with component: " + e.getMessage();
			log.info(msg);
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
					String   msg = "Error closing socket: " + e.getMessage();
					log.info(msg);
				}
			}
		}

		return response;
	}


	/**
	 **************************************************************************
	 *
	 **************************************************************************
	 */
	public OutputDataResponse  outputData(int     clientId,
			double  timestamp)
	{
		OutputDataResponse   response = new OutputDataResponse();
		Socket               socket = null;
		int                  status = 0;

		log.info("Timestamp: " + timestamp);
		try
		{
			//***
			// Connect to socket interface
			//***
			socket = new Socket(theComponent.getPhysicalHostName(),
					Integer.parseInt(theComponent.getPortNum()));

			InputStream    inStream = socket.getInputStream();
			OutputStream   outStream = socket.getOutputStream();

			DataInputStream   dataIn = new DataInputStream(inStream);
			DataOutputStream  dataOut = new DataOutputStream(outStream);

			//***
			// Pass get data call along with the client id and the timestamp
			// for the data to be fetched.
			//***
			String   requestId = "DATA";

			writeStringPkg(dataOut, requestId);
			writeIntPkg(dataOut, clientId);
			writeDoublePkg(dataOut, ByteSwapper.swap(timestamp));

			//***
			// Read the data description info
			//   - number of variables
			//   - variable names
			//   - number of latitude values
			//   - number of longitude values
			//***
			int   numVars = readIntPkg(dataIn);
			log.info("Num Vars: " + numVars);
			response.setNumVars(numVars);

			String   varNames[] = new String[numVars];
			for (int i = 0; i < numVars; ++i)
			{
				varNames[i] = readStringPkg(dataIn);
				log.info("Var Name[" + i + "]: " + varNames[i]);
			}
			response.setVarNames(varNames);

			int   numLats = readIntPkg(dataIn);
			log.info("Num Lats: " + numLats);
			response.setNumLats(numLats);

			int   numLons = readIntPkg(dataIn);
			log.info("Num Lons: " + numLons);
			response.setNumLons(numLons);

			//***
			// Get the data
			//***
			double[] dataValues = new double[numVars * numLats * numLons];

			for (int i = 0; i < numVars; ++i)
			{
				int   numDataValues = numLats * numLons;
				int   dataSize = 8 * numDataValues;
				log.info("Num Data Values: " + numDataValues);

				byte[]   netDataValues = readBytePkg(dataIn, dataSize);

				ByteBuffer  thisBuffer = ByteBuffer.allocate(dataSize);
				thisBuffer.put(netDataValues, 0, dataSize);

				for (int j = 0; j < numLats; ++j)
				{
					for (int k = 0; k < numLons; ++k)
					{
						double   netThisValue =
								thisBuffer.getDouble(((k * numLats) + j) * 8);

						dataValues[(i * numLats * numLons) + ((k * numLats) + j)] =
								ByteSwapper.swap(netThisValue);

						log.info(
								dataValues[(i*numLats*numLons) + ((k*numLats) + j)] + " ");
					}
					//log.info();
				}
				//log.info();

			}
			response.setDataValues(dataValues);

			//***
			// Read the returned status string
			//***
			status = readIntPkg(dataIn);
		}
		catch (Exception  e)
		{
			String   msg = "Error communicating with component: " + e.getMessage();
			log.info(msg);
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
					String   msg = "Error closing socket: " + e.getMessage();
					log.info(msg);
				}
			}
		}

		return response;
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
			socket = new Socket(theComponent.getPhysicalHostName(),
					Integer.parseInt(theComponent.getPortNum()));

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
			log.info(msg);
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
					log.info(msg);
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
			socket = new Socket(theComponent.getPhysicalHostName(),
					Integer.parseInt(theComponent.getPortNum()));

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
			log.info(msg);
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
					log.info(msg);
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
			socket = new Socket(theComponent.getPhysicalHostName(),
					Integer.parseInt(theComponent.getPortNum()));

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
			log.info(msg);
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
					log.info(msg);
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
			socket = new Socket(theComponent.getPhysicalHostName(),
					Integer.parseInt(theComponent.getPortNum()));

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
			log.info(msg);
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
					log.info(msg);
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


	/**
	 **************************************************************************
	 *
	 **************************************************************************
	 */
	private void  writeDoublePkg(DataOutputStream  dataOut,
			double            value)
					throws Exception
	{
		//***
		// Write out the magic number and the msg size... the size should
		// be 8 bytes... since we're assuming all doubles are 8 bytes long
		//***
		dataOut.writeInt(MAGIC);
		dataOut.writeInt(8);

		//***
		// Write out the int
		//***
		log.info("Writing value: " + value);
		dataOut.writeDouble(value);

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
	private double  readDoublePkg(DataInputStream  dataIn)
			throws Exception
	{
		//***
		// Read and validate the magic number
		//***
		int   magicNum = dataIn.readInt();

		if (magicNum != MAGIC)
		{
			String   msg = "Invalid magic number: " + magicNum;

			Exception   ex = new Exception(msg);
			throw ex;
		}

		//***
		// Read the msg size from the buffer... Since I'm expecting an integer,
		// this value should always be 4.
		//***
		int   msgSize = dataIn.readInt();

		//***
		// Finally, read the double from the buffer and return it
		//***
		double   dataValue = dataIn.readDouble();

		return dataValue;
	}


	/**
	 **************************************************************************
	 *
	 **************************************************************************
	 */
	private byte[]  readBytePkg(DataInputStream  dataIn,
			int              numBytesToRead)
					throws Exception
	{
		log.info("Num Bytes to Read: " + numBytesToRead);
		//***
		// Read and validate the magic number
		//***
		int   magicNum = dataIn.readInt();

		if (magicNum != MAGIC)
		{
			String   msg = "Invalid magic number: " + magicNum;

			Exception   ex = new Exception(msg);
			throw ex;
		}

		//***
		// Read the msg size from the buffer... Since I'm expecting an integer,
		// this value should always be 4.
		//***
		int   msgSize = dataIn.readInt();
		log.info("Msg Size: " + msgSize);

		//***
		// Finally, read the double from the buffer and return it
		//***
		byte[]   dataBuf = new byte[msgSize];
		int      bytesRead = dataIn.read(dataBuf, 0, msgSize);
		log.info("Bytes Read: " + bytesRead);

		return dataBuf;
	}
}
