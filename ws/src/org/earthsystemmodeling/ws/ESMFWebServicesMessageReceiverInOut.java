/**
 * ESMFWebServicesMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
package org.earthsystemmodeling.ws;


/**
 *  ESMFWebServicesMessageReceiverInOut message receiver
 */
public class ESMFWebServicesMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver {
    public void invokeBusinessLogic(
        org.apache.axis2.context.MessageContext msgContext,
        org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault {
        try {
            // get the implementation class for the Web Service
            Object obj = getTheImplementationObject(msgContext);

            ESMFWebServicesSkeletonInterface skel = (ESMFWebServicesSkeletonInterface) obj;

            //Out Envelop
            org.apache.axiom.soap.SOAPEnvelope envelope = null;

            //Find the axisOperation that has been set by the Dispatch phase.
            org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext()
                                                                      .getAxisOperation();

            if (op == null) {
                throw new org.apache.axis2.AxisFault(
                    "Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
            }

            java.lang.String methodName;

            if ((op.getName() != null) &&
                    ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(
                            op.getName().getLocalPart())) != null)) {
                if ("runComponent".equals(methodName)) {
                    org.earthsystemmodeling.ws.RunComponentResponse runComponentResponse85 =
                        null;
                    org.earthsystemmodeling.ws.RunComponentRequest wrappedParam = (org.earthsystemmodeling.ws.RunComponentRequest) fromOM(msgContext.getEnvelope()
                                                                                                                                                    .getBody()
                                                                                                                                                    .getFirstElement(),
                            org.earthsystemmodeling.ws.RunComponentRequest.class,
                            getEnvelopeNamespaces(msgContext.getEnvelope()));

                    runComponentResponse85 = skel.runComponent(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            runComponentResponse85, false,
                            new javax.xml.namespace.QName(
                                "http://earthsystemmodeling.org/ws",
                                "runComponent"));
                } else
                 if ("finalizeComponent".equals(methodName)) {
                    org.earthsystemmodeling.ws.FinalizeComponentResponse finalizeComponentResponse87 =
                        null;
                    org.earthsystemmodeling.ws.FinalizeComponentRequest wrappedParam =
                        (org.earthsystemmodeling.ws.FinalizeComponentRequest) fromOM(msgContext.getEnvelope()
                                                                                               .getBody()
                                                                                               .getFirstElement(),
                            org.earthsystemmodeling.ws.FinalizeComponentRequest.class,
                            getEnvelopeNamespaces(msgContext.getEnvelope()));

                    finalizeComponentResponse87 = skel.finalizeComponent(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            finalizeComponentResponse87, false,
                            new javax.xml.namespace.QName(
                                "http://earthsystemmodeling.org/ws",
                                "finalizeComponent"));
                } else
                 if ("getOutputDataDesc".equals(methodName)) {
                    org.earthsystemmodeling.ws.GetOutputDataDescResponse getOutputDataDescResponse89 =
                        null;
                    org.earthsystemmodeling.ws.GetOutputDataDescRequest wrappedParam =
                        (org.earthsystemmodeling.ws.GetOutputDataDescRequest) fromOM(msgContext.getEnvelope()
                                                                                               .getBody()
                                                                                               .getFirstElement(),
                            org.earthsystemmodeling.ws.GetOutputDataDescRequest.class,
                            getEnvelopeNamespaces(msgContext.getEnvelope()));

                    getOutputDataDescResponse89 = skel.getOutputDataDesc(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            getOutputDataDescResponse89, false,
                            new javax.xml.namespace.QName(
                                "http://earthsystemmodeling.org/ws",
                                "getOutputDataDesc"));
                } else
                 if ("initComponent".equals(methodName)) {
                    org.earthsystemmodeling.ws.InitComponentResponse initComponentResponse91 =
                        null;
                    org.earthsystemmodeling.ws.InitComponentRequest wrappedParam =
                        (org.earthsystemmodeling.ws.InitComponentRequest) fromOM(msgContext.getEnvelope()
                                                                                           .getBody()
                                                                                           .getFirstElement(),
                            org.earthsystemmodeling.ws.InitComponentRequest.class,
                            getEnvelopeNamespaces(msgContext.getEnvelope()));

                    initComponentResponse91 = skel.initComponent(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            initComponentResponse91, false,
                            new javax.xml.namespace.QName(
                                "http://earthsystemmodeling.org/ws",
                                "initComponent"));
                } else
                 if ("getOutputData".equals(methodName)) {
                    org.earthsystemmodeling.ws.GetOutputDataResponse getOutputDataResponse93 =
                        null;
                    org.earthsystemmodeling.ws.GetOutputDataRequest wrappedParam =
                        (org.earthsystemmodeling.ws.GetOutputDataRequest) fromOM(msgContext.getEnvelope()
                                                                                           .getBody()
                                                                                           .getFirstElement(),
                            org.earthsystemmodeling.ws.GetOutputDataRequest.class,
                            getEnvelopeNamespaces(msgContext.getEnvelope()));

                    getOutputDataResponse93 = skel.getOutputData(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            getOutputDataResponse93, false,
                            new javax.xml.namespace.QName(
                                "http://earthsystemmodeling.org/ws",
                                "getOutputData"));
                } else
                 if ("newClient".equals(methodName)) {
                    org.earthsystemmodeling.ws.NewClientResponse newClientResponse95 =
                        null;
                    org.earthsystemmodeling.ws.NewClientRequest wrappedParam = (org.earthsystemmodeling.ws.NewClientRequest) fromOM(msgContext.getEnvelope()
                                                                                                                                              .getBody()
                                                                                                                                              .getFirstElement(),
                            org.earthsystemmodeling.ws.NewClientRequest.class,
                            getEnvelopeNamespaces(msgContext.getEnvelope()));

                    newClientResponse95 = skel.newClient(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            newClientResponse95, false,
                            new javax.xml.namespace.QName(
                                "http://earthsystemmodeling.org/ws", "newClient"));
                } else
                 if ("setInputDataDesc".equals(methodName)) {
                    org.earthsystemmodeling.ws.SetInputDataDescResponse setInputDataDescResponse97 =
                        null;
                    org.earthsystemmodeling.ws.SetInputDataDescRequest wrappedParam =
                        (org.earthsystemmodeling.ws.SetInputDataDescRequest) fromOM(msgContext.getEnvelope()
                                                                                              .getBody()
                                                                                              .getFirstElement(),
                            org.earthsystemmodeling.ws.SetInputDataDescRequest.class,
                            getEnvelopeNamespaces(msgContext.getEnvelope()));

                    setInputDataDescResponse97 = skel.setInputDataDesc(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            setInputDataDescResponse97, false,
                            new javax.xml.namespace.QName(
                                "http://earthsystemmodeling.org/ws",
                                "setInputDataDesc"));
                } else
                 if ("getFiles".equals(methodName)) {
                    org.earthsystemmodeling.ws.GetFilesResponse getFilesResponse99 =
                        null;
                    org.earthsystemmodeling.ws.GetFilesRequest wrappedParam = (org.earthsystemmodeling.ws.GetFilesRequest) fromOM(msgContext.getEnvelope()
                                                                                                                                            .getBody()
                                                                                                                                            .getFirstElement(),
                            org.earthsystemmodeling.ws.GetFilesRequest.class,
                            getEnvelopeNamespaces(msgContext.getEnvelope()));

                    getFilesResponse99 = skel.getFiles(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            getFilesResponse99, false,
                            new javax.xml.namespace.QName(
                                "http://earthsystemmodeling.org/ws", "getFiles"));
                } else
                 if ("setOutputVariables".equals(methodName)) {
                    org.earthsystemmodeling.ws.SetOutputVariablesResponse setOutputVariablesResponse101 =
                        null;
                    org.earthsystemmodeling.ws.SetOutputVariablesRequest wrappedParam =
                        (org.earthsystemmodeling.ws.SetOutputVariablesRequest) fromOM(msgContext.getEnvelope()
                                                                                                .getBody()
                                                                                                .getFirstElement(),
                            org.earthsystemmodeling.ws.SetOutputVariablesRequest.class,
                            getEnvelopeNamespaces(msgContext.getEnvelope()));

                    setOutputVariablesResponse101 = skel.setOutputVariables(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            setOutputVariablesResponse101, false,
                            new javax.xml.namespace.QName(
                                "http://earthsystemmodeling.org/ws",
                                "setOutputVariables"));
                } else
                 if ("endClient".equals(methodName)) {
                    org.earthsystemmodeling.ws.EndClientResponse endClientResponse103 =
                        null;
                    org.earthsystemmodeling.ws.EndClientRequest wrappedParam = (org.earthsystemmodeling.ws.EndClientRequest) fromOM(msgContext.getEnvelope()
                                                                                                                                              .getBody()
                                                                                                                                              .getFirstElement(),
                            org.earthsystemmodeling.ws.EndClientRequest.class,
                            getEnvelopeNamespaces(msgContext.getEnvelope()));

                    endClientResponse103 = skel.endClient(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            endClientResponse103, false,
                            new javax.xml.namespace.QName(
                                "http://earthsystemmodeling.org/ws", "endClient"));
                } else
                 if ("componentStatus".equals(methodName)) {
                    org.earthsystemmodeling.ws.ComponentStatusResponse componentStatusResponse105 =
                        null;
                    org.earthsystemmodeling.ws.ComponentStatusRequest wrappedParam =
                        (org.earthsystemmodeling.ws.ComponentStatusRequest) fromOM(msgContext.getEnvelope()
                                                                                             .getBody()
                                                                                             .getFirstElement(),
                            org.earthsystemmodeling.ws.ComponentStatusRequest.class,
                            getEnvelopeNamespaces(msgContext.getEnvelope()));

                    componentStatusResponse105 = skel.componentStatus(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            componentStatusResponse105, false,
                            new javax.xml.namespace.QName(
                                "http://earthsystemmodeling.org/ws",
                                "componentStatus"));
                } else
                 if ("listServers".equals(methodName)) {
                    org.earthsystemmodeling.ws.ListServersResponse listServersResponse107 =
                        null;
                    org.earthsystemmodeling.ws.ListServersRequest wrappedParam = (org.earthsystemmodeling.ws.ListServersRequest) fromOM(msgContext.getEnvelope()
                                                                                                                                                  .getBody()
                                                                                                                                                  .getFirstElement(),
                            org.earthsystemmodeling.ws.ListServersRequest.class,
                            getEnvelopeNamespaces(msgContext.getEnvelope()));

                    listServersResponse107 = skel.listServers(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            listServersResponse107, false,
                            new javax.xml.namespace.QName(
                                "http://earthsystemmodeling.org/ws",
                                "listServers"));
                } else
                 if ("setInputData".equals(methodName)) {
                    org.earthsystemmodeling.ws.SetInputDataResponse setInputDataResponse109 =
                        null;
                    org.earthsystemmodeling.ws.SetInputDataRequest wrappedParam = (org.earthsystemmodeling.ws.SetInputDataRequest) fromOM(msgContext.getEnvelope()
                                                                                                                                                    .getBody()
                                                                                                                                                    .getFirstElement(),
                            org.earthsystemmodeling.ws.SetInputDataRequest.class,
                            getEnvelopeNamespaces(msgContext.getEnvelope()));

                    setInputDataResponse109 = skel.setInputData(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            setInputDataResponse109, false,
                            new javax.xml.namespace.QName(
                                "http://earthsystemmodeling.org/ws",
                                "setInputData"));
                } else
                 if ("timestepComponent".equals(methodName)) {
                    org.earthsystemmodeling.ws.TimestepComponentResponse timestepComponentResponse111 =
                        null;
                    org.earthsystemmodeling.ws.TimestepComponentRequest wrappedParam =
                        (org.earthsystemmodeling.ws.TimestepComponentRequest) fromOM(msgContext.getEnvelope()
                                                                                               .getBody()
                                                                                               .getFirstElement(),
                            org.earthsystemmodeling.ws.TimestepComponentRequest.class,
                            getEnvelopeNamespaces(msgContext.getEnvelope()));

                    timestepComponentResponse111 = skel.timestepComponent(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            timestepComponentResponse111, false,
                            new javax.xml.namespace.QName(
                                "http://earthsystemmodeling.org/ws",
                                "timestepComponent"));
                } else {
                    throw new java.lang.RuntimeException("method not found");
                }

                newMsgContext.setEnvelope(envelope);
            }
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    //
    private org.apache.axiom.om.OMElement toOM(
        org.earthsystemmodeling.ws.RunComponentRequest param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.earthsystemmodeling.ws.RunComponentRequest.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.earthsystemmodeling.ws.RunComponentResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.earthsystemmodeling.ws.RunComponentResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.earthsystemmodeling.ws.FinalizeComponentRequest param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.earthsystemmodeling.ws.FinalizeComponentRequest.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.earthsystemmodeling.ws.FinalizeComponentResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.earthsystemmodeling.ws.FinalizeComponentResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.earthsystemmodeling.ws.GetOutputDataDescRequest param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.earthsystemmodeling.ws.GetOutputDataDescRequest.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.earthsystemmodeling.ws.GetOutputDataDescResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.earthsystemmodeling.ws.GetOutputDataDescResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.earthsystemmodeling.ws.InitComponentRequest param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.earthsystemmodeling.ws.InitComponentRequest.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.earthsystemmodeling.ws.InitComponentResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.earthsystemmodeling.ws.InitComponentResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.earthsystemmodeling.ws.GetOutputDataRequest param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.earthsystemmodeling.ws.GetOutputDataRequest.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.earthsystemmodeling.ws.GetOutputDataResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.earthsystemmodeling.ws.GetOutputDataResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.earthsystemmodeling.ws.NewClientRequest param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.earthsystemmodeling.ws.NewClientRequest.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.earthsystemmodeling.ws.NewClientResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.earthsystemmodeling.ws.NewClientResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.earthsystemmodeling.ws.SetInputDataDescRequest param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.earthsystemmodeling.ws.SetInputDataDescRequest.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.earthsystemmodeling.ws.SetInputDataDescResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.earthsystemmodeling.ws.SetInputDataDescResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.earthsystemmodeling.ws.GetFilesRequest param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.earthsystemmodeling.ws.GetFilesRequest.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.earthsystemmodeling.ws.GetFilesResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.earthsystemmodeling.ws.GetFilesResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.earthsystemmodeling.ws.SetOutputVariablesRequest param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.earthsystemmodeling.ws.SetOutputVariablesRequest.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.earthsystemmodeling.ws.SetOutputVariablesResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.earthsystemmodeling.ws.SetOutputVariablesResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.earthsystemmodeling.ws.EndClientRequest param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.earthsystemmodeling.ws.EndClientRequest.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.earthsystemmodeling.ws.EndClientResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.earthsystemmodeling.ws.EndClientResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.earthsystemmodeling.ws.ComponentStatusRequest param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.earthsystemmodeling.ws.ComponentStatusRequest.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.earthsystemmodeling.ws.ComponentStatusResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.earthsystemmodeling.ws.ComponentStatusResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.earthsystemmodeling.ws.ListServersRequest param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.earthsystemmodeling.ws.ListServersRequest.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.earthsystemmodeling.ws.ListServersResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.earthsystemmodeling.ws.ListServersResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.earthsystemmodeling.ws.SetInputDataRequest param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.earthsystemmodeling.ws.SetInputDataRequest.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.earthsystemmodeling.ws.SetInputDataResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.earthsystemmodeling.ws.SetInputDataResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.earthsystemmodeling.ws.TimestepComponentRequest param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.earthsystemmodeling.ws.TimestepComponentRequest.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.earthsystemmodeling.ws.TimestepComponentResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.earthsystemmodeling.ws.TimestepComponentResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.earthsystemmodeling.ws.RunComponentResponse param,
        boolean optimizeContent, javax.xml.namespace.QName methodQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.earthsystemmodeling.ws.RunComponentResponse.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.earthsystemmodeling.ws.RunComponentResponse wrapRunComponent() {
        org.earthsystemmodeling.ws.RunComponentResponse wrappedElement = new org.earthsystemmodeling.ws.RunComponentResponse();

        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.earthsystemmodeling.ws.FinalizeComponentResponse param,
        boolean optimizeContent, javax.xml.namespace.QName methodQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.earthsystemmodeling.ws.FinalizeComponentResponse.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.earthsystemmodeling.ws.FinalizeComponentResponse wrapFinalizeComponent() {
        org.earthsystemmodeling.ws.FinalizeComponentResponse wrappedElement = new org.earthsystemmodeling.ws.FinalizeComponentResponse();

        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.earthsystemmodeling.ws.GetOutputDataDescResponse param,
        boolean optimizeContent, javax.xml.namespace.QName methodQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.earthsystemmodeling.ws.GetOutputDataDescResponse.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.earthsystemmodeling.ws.GetOutputDataDescResponse wrapGetOutputDataDesc() {
        org.earthsystemmodeling.ws.GetOutputDataDescResponse wrappedElement = new org.earthsystemmodeling.ws.GetOutputDataDescResponse();

        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.earthsystemmodeling.ws.InitComponentResponse param,
        boolean optimizeContent, javax.xml.namespace.QName methodQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.earthsystemmodeling.ws.InitComponentResponse.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.earthsystemmodeling.ws.InitComponentResponse wrapInitComponent() {
        org.earthsystemmodeling.ws.InitComponentResponse wrappedElement = new org.earthsystemmodeling.ws.InitComponentResponse();

        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.earthsystemmodeling.ws.GetOutputDataResponse param,
        boolean optimizeContent, javax.xml.namespace.QName methodQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.earthsystemmodeling.ws.GetOutputDataResponse.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.earthsystemmodeling.ws.GetOutputDataResponse wrapGetOutputData() {
        org.earthsystemmodeling.ws.GetOutputDataResponse wrappedElement = new org.earthsystemmodeling.ws.GetOutputDataResponse();

        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.earthsystemmodeling.ws.NewClientResponse param,
        boolean optimizeContent, javax.xml.namespace.QName methodQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.earthsystemmodeling.ws.NewClientResponse.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.earthsystemmodeling.ws.NewClientResponse wrapNewClient() {
        org.earthsystemmodeling.ws.NewClientResponse wrappedElement = new org.earthsystemmodeling.ws.NewClientResponse();

        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.earthsystemmodeling.ws.SetInputDataDescResponse param,
        boolean optimizeContent, javax.xml.namespace.QName methodQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.earthsystemmodeling.ws.SetInputDataDescResponse.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.earthsystemmodeling.ws.SetInputDataDescResponse wrapSetInputDataDesc() {
        org.earthsystemmodeling.ws.SetInputDataDescResponse wrappedElement = new org.earthsystemmodeling.ws.SetInputDataDescResponse();

        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.earthsystemmodeling.ws.GetFilesResponse param,
        boolean optimizeContent, javax.xml.namespace.QName methodQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.earthsystemmodeling.ws.GetFilesResponse.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.earthsystemmodeling.ws.GetFilesResponse wrapGetFiles() {
        org.earthsystemmodeling.ws.GetFilesResponse wrappedElement = new org.earthsystemmodeling.ws.GetFilesResponse();

        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.earthsystemmodeling.ws.SetOutputVariablesResponse param,
        boolean optimizeContent, javax.xml.namespace.QName methodQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.earthsystemmodeling.ws.SetOutputVariablesResponse.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.earthsystemmodeling.ws.SetOutputVariablesResponse wrapSetOutputVariables() {
        org.earthsystemmodeling.ws.SetOutputVariablesResponse wrappedElement = new org.earthsystemmodeling.ws.SetOutputVariablesResponse();

        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.earthsystemmodeling.ws.EndClientResponse param,
        boolean optimizeContent, javax.xml.namespace.QName methodQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.earthsystemmodeling.ws.EndClientResponse.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.earthsystemmodeling.ws.EndClientResponse wrapEndClient() {
        org.earthsystemmodeling.ws.EndClientResponse wrappedElement = new org.earthsystemmodeling.ws.EndClientResponse();

        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.earthsystemmodeling.ws.ComponentStatusResponse param,
        boolean optimizeContent, javax.xml.namespace.QName methodQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.earthsystemmodeling.ws.ComponentStatusResponse.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.earthsystemmodeling.ws.ComponentStatusResponse wrapComponentStatus() {
        org.earthsystemmodeling.ws.ComponentStatusResponse wrappedElement = new org.earthsystemmodeling.ws.ComponentStatusResponse();

        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.earthsystemmodeling.ws.ListServersResponse param,
        boolean optimizeContent, javax.xml.namespace.QName methodQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.earthsystemmodeling.ws.ListServersResponse.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.earthsystemmodeling.ws.ListServersResponse wrapListServers() {
        org.earthsystemmodeling.ws.ListServersResponse wrappedElement = new org.earthsystemmodeling.ws.ListServersResponse();

        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.earthsystemmodeling.ws.SetInputDataResponse param,
        boolean optimizeContent, javax.xml.namespace.QName methodQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.earthsystemmodeling.ws.SetInputDataResponse.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.earthsystemmodeling.ws.SetInputDataResponse wrapSetInputData() {
        org.earthsystemmodeling.ws.SetInputDataResponse wrappedElement = new org.earthsystemmodeling.ws.SetInputDataResponse();

        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.earthsystemmodeling.ws.TimestepComponentResponse param,
        boolean optimizeContent, javax.xml.namespace.QName methodQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.earthsystemmodeling.ws.TimestepComponentResponse.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.earthsystemmodeling.ws.TimestepComponentResponse wrapTimestepComponent() {
        org.earthsystemmodeling.ws.TimestepComponentResponse wrappedElement = new org.earthsystemmodeling.ws.TimestepComponentResponse();

        return wrappedElement;
    }

    /**
     *  get the default envelope
     */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory) {
        return factory.getDefaultEnvelope();
    }

    private java.lang.Object fromOM(org.apache.axiom.om.OMElement param,
        java.lang.Class type, java.util.Map extraNamespaces)
        throws org.apache.axis2.AxisFault {
        try {
            if (org.earthsystemmodeling.ws.ComponentStatusRequest.class.equals(
                        type)) {
                return org.earthsystemmodeling.ws.ComponentStatusRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.earthsystemmodeling.ws.ComponentStatusResponse.class.equals(
                        type)) {
                return org.earthsystemmodeling.ws.ComponentStatusResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.earthsystemmodeling.ws.EndClientRequest.class.equals(type)) {
                return org.earthsystemmodeling.ws.EndClientRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.earthsystemmodeling.ws.EndClientResponse.class.equals(type)) {
                return org.earthsystemmodeling.ws.EndClientResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.earthsystemmodeling.ws.FinalizeComponentRequest.class.equals(
                        type)) {
                return org.earthsystemmodeling.ws.FinalizeComponentRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.earthsystemmodeling.ws.FinalizeComponentResponse.class.equals(
                        type)) {
                return org.earthsystemmodeling.ws.FinalizeComponentResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.earthsystemmodeling.ws.GetFilesRequest.class.equals(type)) {
                return org.earthsystemmodeling.ws.GetFilesRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.earthsystemmodeling.ws.GetFilesResponse.class.equals(type)) {
                return org.earthsystemmodeling.ws.GetFilesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.earthsystemmodeling.ws.GetOutputDataDescRequest.class.equals(
                        type)) {
                return org.earthsystemmodeling.ws.GetOutputDataDescRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.earthsystemmodeling.ws.GetOutputDataDescResponse.class.equals(
                        type)) {
                return org.earthsystemmodeling.ws.GetOutputDataDescResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.earthsystemmodeling.ws.GetOutputDataRequest.class.equals(
                        type)) {
                return org.earthsystemmodeling.ws.GetOutputDataRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.earthsystemmodeling.ws.GetOutputDataResponse.class.equals(
                        type)) {
                return org.earthsystemmodeling.ws.GetOutputDataResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.earthsystemmodeling.ws.InitComponentRequest.class.equals(
                        type)) {
                return org.earthsystemmodeling.ws.InitComponentRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.earthsystemmodeling.ws.InitComponentResponse.class.equals(
                        type)) {
                return org.earthsystemmodeling.ws.InitComponentResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.earthsystemmodeling.ws.ListServersRequest.class.equals(type)) {
                return org.earthsystemmodeling.ws.ListServersRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.earthsystemmodeling.ws.ListServersResponse.class.equals(
                        type)) {
                return org.earthsystemmodeling.ws.ListServersResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.earthsystemmodeling.ws.NewClientRequest.class.equals(type)) {
                return org.earthsystemmodeling.ws.NewClientRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.earthsystemmodeling.ws.NewClientResponse.class.equals(type)) {
                return org.earthsystemmodeling.ws.NewClientResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.earthsystemmodeling.ws.RunComponentRequest.class.equals(
                        type)) {
                return org.earthsystemmodeling.ws.RunComponentRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.earthsystemmodeling.ws.RunComponentResponse.class.equals(
                        type)) {
                return org.earthsystemmodeling.ws.RunComponentResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.earthsystemmodeling.ws.SetInputDataDescRequest.class.equals(
                        type)) {
                return org.earthsystemmodeling.ws.SetInputDataDescRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.earthsystemmodeling.ws.SetInputDataDescResponse.class.equals(
                        type)) {
                return org.earthsystemmodeling.ws.SetInputDataDescResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.earthsystemmodeling.ws.SetInputDataRequest.class.equals(
                        type)) {
                return org.earthsystemmodeling.ws.SetInputDataRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.earthsystemmodeling.ws.SetInputDataResponse.class.equals(
                        type)) {
                return org.earthsystemmodeling.ws.SetInputDataResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.earthsystemmodeling.ws.SetOutputVariablesRequest.class.equals(
                        type)) {
                return org.earthsystemmodeling.ws.SetOutputVariablesRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.earthsystemmodeling.ws.SetOutputVariablesResponse.class.equals(
                        type)) {
                return org.earthsystemmodeling.ws.SetOutputVariablesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.earthsystemmodeling.ws.TimestepComponentRequest.class.equals(
                        type)) {
                return org.earthsystemmodeling.ws.TimestepComponentRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.earthsystemmodeling.ws.TimestepComponentResponse.class.equals(
                        type)) {
                return org.earthsystemmodeling.ws.TimestepComponentResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

        return null;
    }

    /**
     *  A utility method that copies the namepaces from the SOAPEnvelope
     */
    private java.util.Map getEnvelopeNamespaces(
        org.apache.axiom.soap.SOAPEnvelope env) {
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();

        while (namespaceIterator.hasNext()) {
            org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
            returnMap.put(ns.getPrefix(), ns.getNamespaceURI());
        }

        return returnMap;
    }

    private org.apache.axis2.AxisFault createAxisFault(java.lang.Exception e) {
        org.apache.axis2.AxisFault f;
        Throwable cause = e.getCause();

        if (cause != null) {
            f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
        } else {
            f = new org.apache.axis2.AxisFault(e.getMessage());
        }

        return f;
    }
} //end of class
