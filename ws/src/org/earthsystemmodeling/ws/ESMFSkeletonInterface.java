/**
 * ESMFSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
package org.earthsystemmodeling.ws;

/**
 *  ESMFSkeletonInterface java skeleton interface for the axisService
 */
public interface ESMFSkeletonInterface {
    /**
     * Auto generated method signature
     *
     * @param newModelService
     */
    public org.earthsystemmodeling.ws.NewModelServiceResponse newModelService(
        org.earthsystemmodeling.ws.NewModelService newModelService);

    /**
     * Auto generated method signature
     *
     * @param getModelServiceStatus
     */
    public org.earthsystemmodeling.ws.GetModelServiceStatusResponse getModelServiceStatus(
        org.earthsystemmodeling.ws.GetModelServiceStatus getModelServiceStatus);

    /**
     * Auto generated method signature
     *
     * @param listModelServices
     */
    public org.earthsystemmodeling.ws.ListModelServicesResponse listModelServices(
        org.earthsystemmodeling.ws.ListModelServices listModelServices);

    /**
     * Auto generated method signature
     *
     * @param terminateModelService
     */
    public org.earthsystemmodeling.ws.TerminateModelServiceResponse terminateModelService(
        org.earthsystemmodeling.ws.TerminateModelService terminateModelService);
}
