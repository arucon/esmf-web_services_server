/**
 * ESMFSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
package org.earthsystemmodeling.ws;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.earthsystemmodeling.ws.component.Component;
import org.earthsystemmodeling.ws.component.ComponentConnector;

/**
 *  ESMFSkeleton java skeleton for the axisService
 */
public class ESMFSkeleton implements ESMFSkeletonInterface {
	
	private static Log log = LogFactory.getLog(ESMFSkeleton.class);
	
	/**
     * Auto generated method signature
     *
     * @param newModelService0
     * @return newModelServiceResponse1
     */
    public NewModelServiceResponse newModelService(NewModelService newModelService) {
         	
    	log.debug("Inside newModelService");

    	Component esmfComponent = new Component("CAM Comp", 
                                                "CAM Component", 
                                                "localhost", 
                                                "27071");
		ComponentConnector	connector = new ComponentConnector(esmfComponent);
		int	clientId = connector.newClient("fflintstone", "bambam");

		
		String	clientIdStr = String.valueOf(clientId);

		
    	
    	
    	RequestResult r = new RequestResult();
    	r.setMessage("good");
    	r.setStatus(RequestStatus.OK);
    	
    	NewModelServiceResponse resp = new NewModelServiceResponse();
    	resp.setServiceKey("your-service-key");
    	resp.setResult(r);
    	
    	log.debug("Leaving newModelService");
    	
    	return resp;
    	
    	
    }

    /**
     * Auto generated method signature
     *
     * @param terminateModelService2
     * @return terminateModelServiceResponse3
     */
    public TerminateModelServiceResponse terminateModelService(
        TerminateModelService terminateModelService) {
        //TODO : fill this with the necessary business logic
        throw new java.lang.UnsupportedOperationException("Please implement " +
            this.getClass().getName() + "#terminateModelService");
    }

	@Override
	public GetModelServiceStatusResponse getModelServiceStatus(GetModelServiceStatus getModelServiceStatus) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListModelServicesResponse listModelServices(ListModelServices listModelServices) {
		
		ListModelServicesResponse resp = new ListModelServicesResponse();
		
		ModelService ms1 = new ModelService();
		ms1.setApp("nems.regional_0.1");
		ms1.setPlatform("theia");
		CompsetList cl = new CompsetList();
		
		cl.addCompset("2009_nems_gsm_slnd_cice_mom5_shyd");
		cl.addCompset("2009_nems_gsm_lis_cice_mom5_wrfhydro");
		cl.addCompset("2009_sbys_lis");
		cl.addCompset("2009_sbys_wrfhydro");
		cl.addCompset("2009_sbys_lis_wrfhydro");
		
		ms1.setCompsets(cl);
		
		resp.addModelService(ms1);
		return resp;
		
	}
	
	
	
}
