/**
 * ESMFWebServicesSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
package org.earthsystemmodeling.ws;

/**
 *  ESMFWebServicesSkeletonInterface java skeleton interface for the axisService
 */
public interface ESMFWebServicesSkeletonInterface {
    /**
     * Auto generated method signature
     *
     * @param runComponentRequest
     */
    public org.earthsystemmodeling.ws.RunComponentResponse runComponent(
        org.earthsystemmodeling.ws.RunComponentRequest runComponentRequest);

    /**
     * Auto generated method signature
     *
     * @param finalizeComponentRequest
     */
    public org.earthsystemmodeling.ws.FinalizeComponentResponse finalizeComponent(
        org.earthsystemmodeling.ws.FinalizeComponentRequest finalizeComponentRequest);

    /**
     * Auto generated method signature
     *
     * @param getOutputDataDescRequest
     */
    public org.earthsystemmodeling.ws.GetOutputDataDescResponse getOutputDataDesc(
        org.earthsystemmodeling.ws.GetOutputDataDescRequest getOutputDataDescRequest);

    /**
     * Auto generated method signature
     *
     * @param initComponentRequest
     */
    public org.earthsystemmodeling.ws.InitComponentResponse initComponent(
        org.earthsystemmodeling.ws.InitComponentRequest initComponentRequest);

    /**
     * Auto generated method signature
     *
     * @param getOutputDataRequest
     */
    public org.earthsystemmodeling.ws.GetOutputDataResponse getOutputData(
        org.earthsystemmodeling.ws.GetOutputDataRequest getOutputDataRequest);

    /**
     * Auto generated method signature
     *
     * @param newClientRequest
     */
    public org.earthsystemmodeling.ws.NewClientResponse newClient(
        org.earthsystemmodeling.ws.NewClientRequest newClientRequest);

    /**
     * Auto generated method signature
     *
     * @param setInputDataDescRequest
     */
    public org.earthsystemmodeling.ws.SetInputDataDescResponse setInputDataDesc(
        org.earthsystemmodeling.ws.SetInputDataDescRequest setInputDataDescRequest);

    /**
     * Auto generated method signature
     *
     * @param getFilesRequest
     */
    public org.earthsystemmodeling.ws.GetFilesResponse getFiles(
        org.earthsystemmodeling.ws.GetFilesRequest getFilesRequest);

    /**
     * Auto generated method signature
     *
     * @param setOutputVariablesRequest
     */
    public org.earthsystemmodeling.ws.SetOutputVariablesResponse setOutputVariables(
        org.earthsystemmodeling.ws.SetOutputVariablesRequest setOutputVariablesRequest);

    /**
     * Auto generated method signature
     *
     * @param endClientRequest
     */
    public org.earthsystemmodeling.ws.EndClientResponse endClient(
        org.earthsystemmodeling.ws.EndClientRequest endClientRequest);

    /**
     * Auto generated method signature
     *
     * @param componentStatusRequest
     */
    public org.earthsystemmodeling.ws.ComponentStatusResponse componentStatus(
        org.earthsystemmodeling.ws.ComponentStatusRequest componentStatusRequest);

    /**
     * Auto generated method signature
     *
     * @param listServersRequest
     */
    public org.earthsystemmodeling.ws.ListServersResponse listServers(
        org.earthsystemmodeling.ws.ListServersRequest listServersRequest);

    /**
     * Auto generated method signature
     *
     * @param setInputDataRequest
     */
    public org.earthsystemmodeling.ws.SetInputDataResponse setInputData(
        org.earthsystemmodeling.ws.SetInputDataRequest setInputDataRequest);

    /**
     * Auto generated method signature
     *
     * @param timestepComponentRequest
     */
    public org.earthsystemmodeling.ws.TimestepComponentResponse timestepComponent(
        org.earthsystemmodeling.ws.TimestepComponentRequest timestepComponentRequest);
}
