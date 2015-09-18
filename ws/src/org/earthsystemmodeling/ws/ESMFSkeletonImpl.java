/**
 * This class maintained separately from ESMFSkeleton.java so that is it
 * not overwritten when wsdl2java.sh (from AXIS2) generates code.
 * 
 * 
 */
package org.earthsystemmodeling.ws;

/**
 *  ESMFSkeleton java skeleton for the axisService
 */
public class ESMFSkeletonImpl implements ESMFSkeletonInterface {
    
	/**
     * Auto generated method signature
     *
     * @param newModelService0
     * @return newModelServiceResponse1
     */
    public NewModelServiceResponse newModelService(
        NewModelService newModelService) {
        
    	
    	RequestResult r = new RequestResult();
    	r.setMessage("good");
    	r.setStatus(RequestStatus.OK);
    	
    	NewModelServiceResponse resp = new NewModelServiceResponse();
    	resp.setServiceKey("your-service-key");
    	resp.setResult(r);
    	
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
}
