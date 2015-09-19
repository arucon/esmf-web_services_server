package org.earthsystemmodeling.ws.component.test;

import java.net.Socket;

import org.earthsystemmodeling.ws.component.Component;
import org.earthsystemmodeling.ws.component.ComponentConnector;
import org.earthsystemmodeling.ws.component.DataDescResponse;
import org.earthsystemmodeling.ws.component.OutputDataResponse;


/**
 *****************************************************************************
 *
 *****************************************************************************
 */
public class TestComponentConnector
{
	private Socket		theClientSocket = null;
	private String		theRegistrarHost = "localhost";
	private String		theRegistrarPort = "9999";
	private Component	theComponent;


	/**
	 **************************************************************************
	 *
	 **************************************************************************
	 */
	public TestComponentConnector(String  hostName,
                                 String  portNum)
	{
		System.out.println("Host Name: " + hostName);
		System.out.println("Port Num: " + portNum);

		//theRegistrarHost = hostName;
		//theRegistrarPort = portNum;

		theComponent = new Component("Test Comp1", "blah", hostName, portNum);

		ComponentConnector	connector = new ComponentConnector(theComponent);

		//***
		// Test newClient
		//***
		int	clientId = connector.newClient("Fred", "bambam");
		System.out.println("Client ID: " + clientId);

		//***
		// Wait for server to get started
		//***
		System.out.println("... Don't panic!  We're sleeping for 5 seconds...");
		try { Thread.sleep(5000); } catch (Exception  e) { }

		System.out.println("Waiting for server to get started ...");
		int	status = connector.compState(clientId);
		while (status == 10)
		{
			System.out.print(".");
			try { Thread.sleep(5000); } catch (Exception  e) { }
			status = connector.compState(clientId);
		}
		System.out.println();

		//***
		// Test compInit
		//***
		if (status != 1)	// READY
		{
			System.out.println("Server is not ready... exiting.");
			return;
		}

		System.out.println("Executing compInit: " + status);
		status = connector.compInit(clientId);
		System.out.println("Init Status: " + status);

		System.out.println("Waiting for initialize to complete...");
		int	waitCount = 0;
		while (status == 3) // INITIALIZING
		{
			try { Thread.sleep(5000); } catch (Exception  e) { }
			++waitCount;
			status = connector.compState(clientId);
		}
		System.out.println("Initialize complete... waited for " + waitCount + 
                         " seconds.");

		//***
		// Test compRun
		//***
/*
		status = connector.compRun(clientId);
		System.out.println("Run Status: " + status);

		System.out.println("Waiting for run to complete...");
		waitCount = 0;
		while (status == 4) // RUNNING
		{
			try { Thread.sleep(5000); } catch (Exception  e) { }
			++waitCount;
			status = connector.compState(clientId);
		}
		System.out.println("Run complete... waited for " + waitCount + 
                         " seconds.");
*/

		//***
		// Test compTimestep
		//***
		System.out.println("Executing compTimestep: " + status);
		status = connector.compTimestep(clientId, 1);
		System.out.println("Timestep Status: " + status);

		System.out.println("Waiting for timestep to complete...");
		waitCount = 0;
		while (status == 4) // RUNNING
		{
			try { Thread.sleep(5000); } catch (Exception  e) { }
			++waitCount;
			status = connector.compState(clientId);
		}
		System.out.println("Timestep complete... waited for " + waitCount + 
                         " seconds.");

		//***
		// Test compTimestep again
		//***
		System.out.println("Executing compTimestep: " + status);
		status = connector.compTimestep(clientId, 1);
		System.out.println("Timestep Status Again: " + status);

		System.out.println("Waiting for timestep to complete...");
		waitCount = 0;
		while (status == 4) // RUNNING
		{
			try { Thread.sleep(5000); } catch (Exception  e) { }
			++waitCount;
			status = connector.compState(clientId);
		}
		System.out.println("Timestep complete... waited for " + waitCount + 
                         " seconds.");

		//***
		// Test compFinalize
		//***
		System.out.println("Executing compFinalize: " + status);
		status = connector.compFinalize(clientId);
		System.out.println("Final Status: " + status);

		System.out.println("Waiting for finalize to complete...");
		waitCount = 0;
		while (status == 5) // FINALIZING
		{
			try { Thread.sleep(5000); } catch (Exception  e) { }
			++waitCount;
			status = connector.compState(clientId);
		}
		System.out.println("Finalize complete... waited for " + waitCount + 
                         " seconds.");

		//***
		// Test get data desc
		//***
		DataDescResponse	dataDescResp = connector.dataDesc(clientId);
		dataDescResp.print();

		//***
		// Test get data 
		//***
		OutputDataResponse	outputDataResp = 
										connector.outputData(clientId, 6.2321);
		outputDataResp.print();

		//***
		// Test compState
		//***
		status = connector.compState(clientId);
		System.out.println("State Status: " + status);

		//***
		// Test endClient
		//***
		status = connector.endClient(clientId);
		System.out.println("End Status: " + status);
	}


	/**
	 **************************************************************************
	 *
	 **************************************************************************
	 */
	public static void  main(String[]  args)
	{
		TestComponentConnector	test1 = 
			new TestComponentConnector("krakenpf3.nics.utk.edu", "27071");
	}
}
