package org.earthsystemmodeling.ws;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.earthsystemmodeling.ws.component.Component;
import org.earthsystemmodeling.ws.component.ComponentConnector;
import org.earthsystemmodeling.ws.component.DataDescResponse;
import org.earthsystemmodeling.ws.component.OutputDataResponse;
import org.earthsystemmodeling.ws.registrar.RegistrarClient;

/**
 * ESMFWebServicesServiceSkeleton.java
 *
 */

/**
 *  ESMFWebServicesServiceSkeleton java skeleton for the axisService
 */
public class ESMFWebServicesSkeleton implements ESMFWebServicesSkeletonInterface
{

	private static Log log = LogFactory.getLog(ESMFWebServicesSkeleton.class);
	
	public ESMFWebServicesSkeleton() {
		log.info("Instantiating ESMFWebServicesServiceSkeleton object");
	}
	
	/**
	 * Auto generated method signature
	 * 
	 * @param listServersRequest
	 */
	public ListServersResponse  listServers(ListServersRequest  request)
	{
		log.info("ESMFWebServices::ListServers()");
		log.info("Registrar Host Name: " + 
				request.getRegistrarHostName());

		//***
		// Connect to the registrar service
		//***
		String[]	services = new String[0];

		try
		{
			RegistrarClient	registrar = 
					new RegistrarClient(request.getRegistrarHostName(), 27071);

			services = registrar.listServices();
		}
		catch (Exception  e)
		{
			log.error("Error getting service names from registrar", e);
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
	public NewClientResponse  newClient(NewClientRequest  request)
	{
		log.info("Inside newClient Yun2");
		log.info("newClient: " + request.getServerName());
		log.info("another message");
		
		//***
		// Connect to the component service
		//***
		Component	esmfComponent = new Component("1234", 
				"CoupledFlow Component", 
				"localhost", 
				"27071");
		ComponentConnector	connector = new ComponentConnector(esmfComponent);

		//***
		// Make the call, passing the client name
		//***
		int	clientId = connector.newClient("fflintstone", "bambam");
                log.info("clientID:" + clientId);

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

		log.info("exiting newClient");
		return response;
	}


	/**
	 * @param SetOutputVariablesRequest
	 */
	public SetOutputVariablesResponse
	setOutputVariables(SetOutputVariablesRequest  request)
	{
		/*
      log.info("ESMFWebServices::SetOutputVariables()");
      log.info("Server Name: " + request.getServerName());
      log.info("Client ID: " + request.getClientId());

      ArrayOfString  importFiles = request.getImportFiles();
      String[]       importFilenames = importFiles.getItem();
      for (int i = 0; i < importFilenames.length; ++i)
      {
         log.info("Import Filename: " + importFilenames[i]);
      }
		 */


		//TODO : fill this with the necessary business logic
		throw new  java.lang.UnsupportedOperationException(
				"Please implement " +
						this.getClass().getName() +
				"#SetOutputVariables");
	}


	/**
	 * Auto generated method signature
	 * 
	 * @param initComponentRequest
	 */
	public InitComponentResponse  initComponent(InitComponentRequest  request)
	{
		log.info("ESMFWebServices::InitComponent()");
		log.info("Server Name: " + request.getServerName());
		log.info("Client ID: " + request.getClientId());

		/*
		ArrayOfString	importFiles = request.getImportFiles();
		String[]			importFilenames = importFiles.getItem();
		for (int i = 0; i < importFilenames.length; ++i)
		{
			log.info("Import Filename: " + importFilenames[i]);
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
				"27071");
		ComponentConnector	connector = new ComponentConnector(esmfComponent);

		//***
		// Make the call, passing the client id (after parsing the integer
		// from the string)
		//***
		log.info("Client ID: " + request.getClientId());
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
	public RunComponentResponse  runComponent(RunComponentRequest  request)
	{
		log.info("ESMFWebServices::RunComponent()");
		log.info("Server Name: " + request.getServerName());
		log.info("Client ID: " + request.getClientId());

		//***
		// Connect to the component service
		//***
		Component	esmfComponent = new Component("CAM Comp", 
				"CAM Component", 
				"localhost", 
				"27071");
		ComponentConnector	connector = new ComponentConnector(esmfComponent);

		//***
		// Make the call, passing the client id (after parsing the integer
		// from the string)
		//***
		log.info("Client ID: " + request.getClientId());
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
	 * @param timestepComponentRequest
	 */
	public TimestepComponentResponse
	timestepComponent(TimestepComponentRequest  request)
	{
		log.info("ESMFWebServices::TimestepComponent()");
		log.info("Server Name: " + request.getServerName());
		log.info("Client ID: " + request.getClientId());
		log.info("Num Timesteps: " + request.getNumTimeSteps());

		//***
		// Connect to the component service
		//***
		Component   esmfComponent = new Component("CAM Comp",
				"CAM Component",
				"localhost",
				"27071");
		ComponentConnector   connector = new ComponentConnector(esmfComponent);

		//***
		// Make the call, passing the client id (after parsing the integer
		// from the string)
		//***
		log.info("Client ID: " + request.getClientId());
		int   clientId = Integer.parseInt(request.getClientId());
		int   numTimeSteps = Integer.parseInt(request.getNumTimeSteps());
		int   statusCode = connector.compTimestep(clientId, numTimeSteps);

		//***
		// Convert the status to a string and pass it back
		//***
		String   statusStr = String.valueOf(statusCode);

		TimestepComponentResponse     response = new TimestepComponentResponse();

		StatusMsg      status = new StatusMsg();
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
	finalizeComponent(FinalizeComponentRequest  request)
	{
		log.info("ESMFWebServices::FinalizeComponent()");
		log.info("Server Name: " + request.getServerName());
		log.info("Client ID: " + request.getClientId());

		//***
		// Connect to the component service
		//***
		Component	esmfComponent = new Component("CAM Comp", 
				"CAM Component", 
				"localhost", 
				"27071");
		ComponentConnector	connector = new ComponentConnector(esmfComponent);

		//***
		// Make the call, passing the client id (after parsing the integer
		// from the string)
		//***
		log.info("Client ID: " + request.getClientId());
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
	componentStatus(ComponentStatusRequest  request)
	{
		log.info("ESMFWebServices::ComponentStatus()");
		log.info("Server Name: " + request.getServerName());
		log.info("Client ID: " + request.getClientId());

		//***
		// Connect to the component service
		//***
		Component	esmfComponent = new Component("CAM Comp", 
				"CAM Component", 
				"localhost", 
				"27071");
		ComponentConnector	connector = new ComponentConnector(esmfComponent);

		//***
		// Make the call, passing the client id (after parsing the integer
		// from the string)
		//***
		log.info("Client ID: " + request.getClientId());
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
	public GetFilesResponse  getFiles(GetFilesRequest  request)
	{
		log.info("ESMFWebServices::GetFiles()");
		log.info("Server Name: " + request.getServerName());
		log.info("Client ID: " + request.getClientId());

		//***
		// Connect to the component service
		//***
		/*
		Component	esmfComponent = new Component("Test Comp1", 
                                                "blah", 
                                                "localhost", 
                                                "27071");
		ComponentConnector	connector = new ComponentConnector(esmfComponent);

		//***
		// Make the call, passing the client id (after parsing the integer
		// from the string)
		//***
		log.info("Client ID: " + request.getClientId());
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
	 * @param GetOutputDataDescRequest
	 */
	public GetOutputDataDescResponse
	getOutputDataDesc(GetOutputDataDescRequest  request)
	{
		//***
		// Connect to the component service
		//***
		Component   esmfComponent = new Component("CAM Comp",
				"CAM Component",
				"localhost",
				"27071");
		ComponentConnector   connector = new ComponentConnector(esmfComponent);

		//***
		// Get the input information
		//***
		log.info("Server Name: " + request.getServerName());
		log.info("Client ID: " + request.getClientId());

		int   clientId = Integer.parseInt(request.getClientId());

		//***
		// Call the server
		//***
		// Temporary fill-in until I actually call the appropriate operation
		DataDescResponse  resp = connector.dataDesc(clientId);
		//resp.print();

		//***
		// Create the response and set its values
		//***
		GetOutputDataDescResponse     response = new GetOutputDataDescResponse();

		// Data Description
		ArrayOfString     varNames = new ArrayOfString();
		ArrayOfDouble     latValues = new ArrayOfDouble();
		ArrayOfDouble     lonValues = new ArrayOfDouble();

		String[]    theseVarNames = resp.getVarNames();
		varNames.setItem(theseVarNames);

		double[]    theseLatValues = resp.getLatValues();
		latValues.setItem(theseLatValues);

		double[]    theseLonValues = resp.getLonValues();
		lonValues.setItem(theseLonValues);

		DataDesc       dataDesc = new DataDesc();

		dataDesc.setNumberOfVariables(resp.getNumVars());
		dataDesc.setVariableNames(varNames);
		dataDesc.setNumberOfLatValues(resp.getNumLats());
		dataDesc.setLatitudeValues(latValues);
		dataDesc.setNumberOfLonValues(resp.getNumLons());
		dataDesc.setLongitudeValues(lonValues);

		response.setOutputDataDesc(dataDesc);

		// Status
		StatusMsg      status = new StatusMsg();
		String         statusStr = String.valueOf(resp.getStatus());

		status.setCode(statusStr);
		status.setMsg("Operation successful");

		response.setStatus(status);

		//***
		// Return
		//***
		return response;
	}


	/**
	 * Auto generated method signature
	 * 
	 * @param GetOutputDataRequest
	 */
	public GetOutputDataResponse  getOutputData(GetOutputDataRequest  request)
	{
		log.info("ESMFWebServices::GetOutputData()");
		log.info("Server Name   : " + request.getServerName());
		log.info("Client ID     : " + request.getClientId());
		log.info("Time          : " + request.getTime());

		//***
		// Connect to the component service
		//***
		Component	esmfComponent = new Component("CAM Comp", 
				"CAM Component", 
				"localhost", 
				"27071");
		ComponentConnector	connector = new ComponentConnector(esmfComponent);
		log.info("Connected");

		//***
		// Make the call, passing the client id (after parsing the integer
		// from the string)
		//***
		log.info("Client ID: " + request.getClientId());
		int	clientId = Integer.parseInt(request.getClientId());

		OutputDataResponse   resp = connector.outputData(clientId,
				request.getTime());
		resp.print();

		//***
		// Convert the status to a string and pass it back
		//***
		GetOutputDataResponse	response = new GetOutputDataResponse();

		// Data Description
		ArrayOfString     varNames = new ArrayOfString();
		String[]          theseVarNames = resp.getVarNames();
		varNames.setItem(theseVarNames);

		response.setNumberOfVariables(resp.getNumVars());
		response.setVariableNames(varNames);
		response.setNumberOfLatValues(resp.getNumLats());
		response.setNumberOfLonValues(resp.getNumLons());

		// Data Values
		ArrayOfDouble     dataValues = new ArrayOfDouble();
		double[]          theseDataValues = resp.getDataValues();
		dataValues.setItem(theseDataValues);

		response.setValues(dataValues);

		// Status
		StatusMsg		status = new StatusMsg();
		String			statusStr = String.valueOf(resp.getStatus());

		status.setCode(statusStr);
		status.setMsg("Operation successful");

		response.setStatus(status);

		//***
		// Return
		//***
		return response;
	}


	/**
	 * Auto generated method signature
	 * 
	 * @param endClientRequest
	 */
	public EndClientResponse  endClient(EndClientRequest  request)
	{
		log.info("ESMFWebServices::EndClient()");
		log.info("Server Name: " + request.getServerName());
		log.info("Client ID: " + request.getClientId());

		//***
		// Connect to the component service
		//***
		Component	esmfComponent = new Component("CAM Comp", 
				"CAM Component", 
				"localhost", 
				"27071");
		ComponentConnector	connector = new ComponentConnector(esmfComponent);

		//***
		// Make the call, passing the client id (after parsing the integer
		// from the string)
		//***
		log.info("Client ID: " + request.getClientId());
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


	/**
	 * Auto generated method signature
	 *
	 * @param setInputDataDescRequest
	 */
	public SetInputDataDescResponse
	setInputDataDesc(SetInputDataDescRequest request)
	{
		//TODO : fill this with the necessary business logic
		throw new  java.lang.UnsupportedOperationException(
				"Please implement " +
						this.getClass().getName() +
				"#SetInputDataDesc");
	}


	/**
	 * Auto generated method signature
	 *
	 * @param setInputDataRequest
	 */
	public SetInputDataResponse  setInputData(SetInputDataRequest  reqeust)
	{
		//TODO : fill this with the necessary business logic
		throw new  java.lang.UnsupportedOperationException(
				"Please implement " +
						this.getClass().getName() +
				"#SetInputData");
	}

}

