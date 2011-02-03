package edu.ucar.axis2.esmfwebservices;

import edu.ucar.esmf.component.*;
import edu.ucar.esmf.registrar.*;
import edu.ucar.esmf.componentsvc.*;

/**
 * ESMFWebServicesServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4  Built on : Apr 26, 2008 (06:24:30 EDT)
 */

/**
 *  ESMFWebServicesServiceSkeleton java skeleton for the axisService
 */
public class ESMFWebServicesServiceSkeleton
{
     
         
   /**
    * Auto generated method signature
    * 
    * @param listServersRequest
    */
	public ListServersResponse  ListServers(ListServersRequest  request)
   {
		System.out.println("ESMFWebServices::ListServers()");
		System.out.println("Registrar Host Name: " + 
                         request.getRegistrarHostName());

		//***
		// Connect to the registrar service
		//***
		String[]	services = new String[0];

		try
		{
			RegistrarClient	registrar = 
				new RegistrarClient(request.getRegistrarHostName(), 45002);

			services = registrar.listServices();
		}
		catch (Exception  e)
		{
			String	msg = "Error getting service names from registrar: " +
								e.getMessage();
			System.out.println(msg);
		}

		//***
		// Build the response
		//***
		ListServersResponse		response = new ListServersResponse();

		ArrayOfString	serverList = new ArrayOfString();
		for (int i = 0; i < services.length; ++i)
		{
			serverList.addItem(services[i]);
		}
		response.setServerList(serverList);

		StatusMsg		status = new StatusMsg();
		status.setCode("1");
		status.setMsg("Operation successful");
		response.setStatus(status);

		return response;
	}
     
         
   /**
    * Auto generated method signature
    * 
    * @param newClientRequest
    */
	public NewClientResponse  NewClient(NewClientRequest  request)
   {
		System.out.println("ESMFWebServices::NewClient()");
		System.out.println("Server Name: " + request.getServerName());

		//***
		// Connect to the component service
		//***
		Component	esmfComponent = new Component("CAM Comp", 
                                                "CAM Component", 
                                                "localhost", 
                                                27001);
		ComponentConnector	connector = new ComponentConnector(esmfComponent);

		//***
		// Make the call, passing the client name
		//***
		int	clientId = connector.newClient(request.getServerName());

		//***
		// Convert the client id to a string and pass it back
		//***
		String	clientIdStr = String.valueOf(clientId);

		NewClientResponse		response = new NewClientResponse();
		response.setClientId(clientIdStr);

		StatusMsg		status = new StatusMsg();
		status.setCode("2");
		status.setMsg("Operation successful");
		response.setStatus(status);

		return response;
   }
     
         
   /**
    * Auto generated method signature
    * 
    * @param initComponentRequest
    */
   public InitComponentResponse  InitComponent(InitComponentRequest  request)
   {
		System.out.println("ESMFWebServices::InitComponent()");
		System.out.println("Server Name: " + request.getServerName());
		System.out.println("Client ID: " + request.getClientId());

/*
		ArrayOfString	importFiles = request.getImportFiles();
		String[]			importFilenames = importFiles.getItem();
		for (int i = 0; i < importFilenames.length; ++i)
		{
			System.out.println("Import Filename: " + importFilenames[i]);
		}
*/

		//***
		// Use the Server name to get the component information from the
      // Registrar, and then...
		// Connect to the component service
		//***
		Component	esmfComponent = new Component("CAM Comp", 
                                                "CAM Component", 
                                                "localhost", 
                                                27001);
		ComponentConnector	connector = new ComponentConnector(esmfComponent);

		//***
		// Make the call, passing the client id (after parsing the integer
		// from the string)
		//***
		System.out.println("Client ID: " + request.getClientId());
		int	clientId = Integer.parseInt(request.getClientId());
		int	statusCode = connector.compInit(clientId);

		//***
		// Convert the status to a string and pass it back
		//***
		String	statusStr = String.valueOf(statusCode);

		InitComponentResponse		response = new InitComponentResponse();

		StatusMsg		status = new StatusMsg();
		status.setCode(statusStr);
		status.setMsg("Operation successful");
		response.setStatus(status);

		return response;
   }
     
         
   /**
    * Auto generated method signature
    * 
    * @param runComponentRequest
    */
   public RunComponentResponse  RunComponent(RunComponentRequest  request)
   {
		System.out.println("ESMFWebServices::RunComponent()");
		System.out.println("Server Name: " + request.getServerName());
		System.out.println("Client ID: " + request.getClientId());

		//***
		// Connect to the component service
		//***
		Component	esmfComponent = new Component("CAM Comp", 
                                                "CAM Component", 
                                                "localhost", 
                                                27001);
		ComponentConnector	connector = new ComponentConnector(esmfComponent);

		//***
		// Make the call, passing the client id (after parsing the integer
		// from the string)
		//***
		System.out.println("Client ID: " + request.getClientId());
		int	clientId = Integer.parseInt(request.getClientId());
		int	statusCode = connector.compRun(clientId);

		//***
		// Convert the status to a string and pass it back
		//***
		String	statusStr = String.valueOf(statusCode);

		RunComponentResponse		response = new RunComponentResponse();

		StatusMsg		status = new StatusMsg();
		status.setCode(statusStr);
		status.setMsg("Operation successful");
		response.setStatus(status);

		return response;
   }
     
         
   /**
    * Auto generated method signature
    * 
    * @param finalizeComponentRequest
    */
   public FinalizeComponentResponse  
		FinalizeComponent(FinalizeComponentRequest  request)
   {
		System.out.println("ESMFWebServices::FinalizeComponent()");
		System.out.println("Server Name: " + request.getServerName());
		System.out.println("Client ID: " + request.getClientId());

		//***
		// Connect to the component service
		//***
		Component	esmfComponent = new Component("CAM Comp", 
                                                "CAM Component", 
                                                "localhost", 
                                                27001);
		ComponentConnector	connector = new ComponentConnector(esmfComponent);

		//***
		// Make the call, passing the client id (after parsing the integer
		// from the string)
		//***
		System.out.println("Client ID: " + request.getClientId());
		int	clientId = Integer.parseInt(request.getClientId());
		int	statusCode = connector.compFinalize(clientId);

		//***
		// Convert the status to a string and pass it back
		//***
		String	statusStr = String.valueOf(statusCode);

		FinalizeComponentResponse		response = new FinalizeComponentResponse();

		StatusMsg		status = new StatusMsg();
		status.setCode(statusStr);
		status.setMsg("Operation successful");
		response.setStatus(status);

		return response;
   }
     
         
   /**
    * Auto generated method signature
    * 
    * @param componentStatusRequest
    */
   public ComponentStatusResponse  
		ComponentStatus(ComponentStatusRequest  request)
   {
		System.out.println("ESMFWebServices::ComponentStatus()");
		System.out.println("Server Name: " + request.getServerName());
		System.out.println("Client ID: " + request.getClientId());

		//***
		// Connect to the component service
		//***
		Component	esmfComponent = new Component("CAM Comp", 
                                                "CAM Component", 
                                                "localhost", 
                                                27001);
		ComponentConnector	connector = new ComponentConnector(esmfComponent);

		//***
		// Make the call, passing the client id (after parsing the integer
		// from the string)
		//***
		System.out.println("Client ID: " + request.getClientId());
		int	clientId = Integer.parseInt(request.getClientId());
		int	statusCode = connector.compState(clientId);

		//***
		// Convert the status to a string and pass it back
		//***
		String	statusStr = String.valueOf(statusCode);

		ComponentStatusResponse		response = new ComponentStatusResponse();

		StatusMsg		status = new StatusMsg();
		status.setCode(statusStr);
		status.setMsg("Operation successful");
		response.setStatus(status);

		return response;
   }
     
         
   /**
    * Auto generated method signature
    * 
    * @param componentStatusRequest
    */
   public GetFilesResponse  GetFiles(GetFilesRequest  request)
   {
		System.out.println("ESMFWebServices::GetFiles()");
		System.out.println("Server Name: " + request.getServerName());
		System.out.println("Client ID: " + request.getClientId());

		//***
		// Connect to the component service
		//***
/*
		Component	esmfComponent = new Component("Test Comp1", 
                                                "blah", 
                                                "localhost", 
                                                27060);
		ComponentConnector	connector = new ComponentConnector(esmfComponent);

		//***
		// Make the call, passing the client id (after parsing the integer
		// from the string)
		//***
		System.out.println("Client ID: " + request.getClientId());
		int	clientId = Integer.parseInt(request.getClientId());
		int	statusCode = connector.compState(clientId);
*/
		int	statusCode = 8;

		//***
		// Convert the status to a string and pass it back
		//***
		String	exportFilename = "/home/ksaint/some/file/name.nc";

		GetFilesResponse		response = new GetFilesResponse();

		ArrayOfString	fileList = new ArrayOfString();
		fileList.addItem("/some/location/filename.nc");
		fileList.addItem("/another/location/filename.nc");
		fileList.addItem("http://www.netloc.gov/some/network/location.nc");
		response.setFileList(fileList);

		StatusMsg		status = new StatusMsg();
		status.setCode("0");
		status.setMsg("Operation successful");
		response.setStatus(status);

		return response;
   }
     
         
   /**
    * Auto generated method signature
    * 
    * @param GetOutputDataRequest
    */
   public GetOutputDataResponse  GetOutputData(GetOutputDataRequest  request)
   {
		System.out.println("ESMFWebServices::GetOutputData()");
		System.out.println("Server Name   : " + request.getServerName());
		System.out.println("Client ID     : " + request.getClientId());
		System.out.println("Variable Name : " + request.getVariableName());
		System.out.println("Time          : " + request.getTime());
		System.out.println("Lat           : " + request.getLat());
		System.out.println("Lon           : " + request.getLon());

		//***
		// Connect to the component service
		//***
		Component	esmfComponent = new Component("CAM Comp", 
                                                "CAM Component", 
                                                "localhost", 
                                                27001);
		ComponentConnector	connector = new ComponentConnector(esmfComponent);

		//***
		// Make the call, passing the client id (after parsing the integer
		// from the string)
		//***
		System.out.println("Client ID: " + request.getClientId());
		int	clientId = Integer.parseInt(request.getClientId());

		String	dataValue = connector.getOutputData(clientId,
                                                   request.getVariableName(),
                                                   request.getTime(),
                                                   request.getLat(),
                                                   request.getLon());

		int	statusCode = connector.compState(clientId);

		//***
		// Convert the status to a string and pass it back
		//***
		String	exportFilename = "/home/ksaint/some/file/name.nc";

		GetOutputDataResponse		response = new GetOutputDataResponse();

/*
		String[]			values = new String[1];
		values[0] = dataValue;

		ArrayOfString	dataValues = new ArrayOfString();
		dataValues.setItem(values);
		response.setValues(dataValues);
*/
		response.setValues(dataValue);

		StatusMsg		status = new StatusMsg();
		String			statusStr = String.valueOf(statusCode);
		status.setCode(statusStr);
		status.setMsg("Operation successful");
		response.setStatus(status);

		return response;
   }
     

	/**
    * Auto generated method signature
    * 
    * @param endClientRequest
    */
   public EndClientResponse  EndClient(EndClientRequest  request)
   {
		System.out.println("ESMFWebServices::EndClient()");
		System.out.println("Server Name: " + request.getServerName());
		System.out.println("Client ID: " + request.getClientId());

		//***
		// Connect to the component service
		//***
		Component	esmfComponent = new Component("CAM Comp", 
                                                "CAM Component", 
                                                "localhost", 
                                                27001);
		ComponentConnector	connector = new ComponentConnector(esmfComponent);

		//***
		// Make the call, passing the client id (after parsing the integer
		// from the string)
		//***
		System.out.println("Client ID: " + request.getClientId());
		int	clientId = Integer.parseInt(request.getClientId());
		int	statusCode = connector.endClient(clientId);

		//***
		// Convert the status to a string and pass it back
		//***
		String	statusStr = String.valueOf(statusCode);

		EndClientResponse		response = new EndClientResponse();

		StatusMsg		status = new StatusMsg();
		status.setCode(statusStr);
		status.setMsg("Operation successful");
		response.setStatus(status);

		return response;
   }
}
    
