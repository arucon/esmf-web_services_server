/**
 * ESMFWebServicesServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
package edu.ucar.axis2.esmfwebservices;


/**
 *  ESMFWebServicesServiceMessageReceiverInOut message receiver
 */
public class ESMFWebServicesServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver {
    public void invokeBusinessLogic(
        org.apache.axis2.context.MessageContext msgContext,
        org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault {
        try {
            // get the implementation class for the Web Service
            Object obj = getTheImplementationObject(msgContext);

            ESMFWebServicesServiceSkeleton skel = (ESMFWebServicesServiceSkeleton) obj;

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
                if ("listServers".equals(methodName)) {
                    edu.ucar.axis2.esmfwebservices.ListServersResponse listServersResponse57 =
                        null;
                    edu.ucar.axis2.esmfwebservices.ListServersRequest wrappedParam =
                        (edu.ucar.axis2.esmfwebservices.ListServersRequest) fromOM(msgContext.getEnvelope()
                                                                                             .getBody()
                                                                                             .getFirstElement(),
                            edu.ucar.axis2.esmfwebservices.ListServersRequest.class,
                            getEnvelopeNamespaces(msgContext.getEnvelope()));

                    listServersResponse57 = skel.listServers(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            listServersResponse57, false,
                            new javax.xml.namespace.QName(
                                "http://ucar.edu/axis2/ESMFWebServices",
                                "listServers"));
                } else
                 if ("componentStatus".equals(methodName)) {
                    edu.ucar.axis2.esmfwebservices.ComponentStatusResponse componentStatusResponse59 =
                        null;
                    edu.ucar.axis2.esmfwebservices.ComponentStatusRequest wrappedParam =
                        (edu.ucar.axis2.esmfwebservices.ComponentStatusRequest) fromOM(msgContext.getEnvelope()
                                                                                                 .getBody()
                                                                                                 .getFirstElement(),
                            edu.ucar.axis2.esmfwebservices.ComponentStatusRequest.class,
                            getEnvelopeNamespaces(msgContext.getEnvelope()));

                    componentStatusResponse59 = skel.componentStatus(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            componentStatusResponse59, false,
                            new javax.xml.namespace.QName(
                                "http://ucar.edu/axis2/ESMFWebServices",
                                "componentStatus"));
                } else
                 if ("setInputData".equals(methodName)) {
                    edu.ucar.axis2.esmfwebservices.SetInputDataResponse setInputDataResponse61 =
                        null;
                    edu.ucar.axis2.esmfwebservices.SetInputDataRequest wrappedParam =
                        (edu.ucar.axis2.esmfwebservices.SetInputDataRequest) fromOM(msgContext.getEnvelope()
                                                                                              .getBody()
                                                                                              .getFirstElement(),
                            edu.ucar.axis2.esmfwebservices.SetInputDataRequest.class,
                            getEnvelopeNamespaces(msgContext.getEnvelope()));

                    setInputDataResponse61 = skel.setInputData(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            setInputDataResponse61, false,
                            new javax.xml.namespace.QName(
                                "http://ucar.edu/axis2/ESMFWebServices",
                                "setInputData"));
                } else
                 if ("timestepComponent".equals(methodName)) {
                    edu.ucar.axis2.esmfwebservices.TimestepComponentResponse timestepComponentResponse63 =
                        null;
                    edu.ucar.axis2.esmfwebservices.TimestepComponentRequest wrappedParam =
                        (edu.ucar.axis2.esmfwebservices.TimestepComponentRequest) fromOM(msgContext.getEnvelope()
                                                                                                   .getBody()
                                                                                                   .getFirstElement(),
                            edu.ucar.axis2.esmfwebservices.TimestepComponentRequest.class,
                            getEnvelopeNamespaces(msgContext.getEnvelope()));

                    timestepComponentResponse63 = skel.timestepComponent(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            timestepComponentResponse63, false,
                            new javax.xml.namespace.QName(
                                "http://ucar.edu/axis2/ESMFWebServices",
                                "timestepComponent"));
                } else
                 if ("setOutputVariables".equals(methodName)) {
                    edu.ucar.axis2.esmfwebservices.SetOutputVariablesResponse setOutputVariablesResponse65 =
                        null;
                    edu.ucar.axis2.esmfwebservices.SetOutputVariablesRequest wrappedParam =
                        (edu.ucar.axis2.esmfwebservices.SetOutputVariablesRequest) fromOM(msgContext.getEnvelope()
                                                                                                    .getBody()
                                                                                                    .getFirstElement(),
                            edu.ucar.axis2.esmfwebservices.SetOutputVariablesRequest.class,
                            getEnvelopeNamespaces(msgContext.getEnvelope()));

                    setOutputVariablesResponse65 = skel.setOutputVariables(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            setOutputVariablesResponse65, false,
                            new javax.xml.namespace.QName(
                                "http://ucar.edu/axis2/ESMFWebServices",
                                "setOutputVariables"));
                } else
                 if ("endClient".equals(methodName)) {
                    edu.ucar.axis2.esmfwebservices.EndClientResponse endClientResponse67 =
                        null;
                    edu.ucar.axis2.esmfwebservices.EndClientRequest wrappedParam =
                        (edu.ucar.axis2.esmfwebservices.EndClientRequest) fromOM(msgContext.getEnvelope()
                                                                                           .getBody()
                                                                                           .getFirstElement(),
                            edu.ucar.axis2.esmfwebservices.EndClientRequest.class,
                            getEnvelopeNamespaces(msgContext.getEnvelope()));

                    endClientResponse67 = skel.endClient(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            endClientResponse67, false,
                            new javax.xml.namespace.QName(
                                "http://ucar.edu/axis2/ESMFWebServices",
                                "endClient"));
                } else
                 if ("newClient".equals(methodName)) {
                    edu.ucar.axis2.esmfwebservices.NewClientResponse newClientResponse69 =
                        null;
                    edu.ucar.axis2.esmfwebservices.NewClientRequest wrappedParam =
                        (edu.ucar.axis2.esmfwebservices.NewClientRequest) fromOM(msgContext.getEnvelope()
                                                                                           .getBody()
                                                                                           .getFirstElement(),
                            edu.ucar.axis2.esmfwebservices.NewClientRequest.class,
                            getEnvelopeNamespaces(msgContext.getEnvelope()));

                    newClientResponse69 = skel.newClient(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            newClientResponse69, false,
                            new javax.xml.namespace.QName(
                                "http://ucar.edu/axis2/ESMFWebServices",
                                "newClient"));
                } else
                 if ("setInputDataDesc".equals(methodName)) {
                    edu.ucar.axis2.esmfwebservices.SetInputDataDescResponse setInputDataDescResponse71 =
                        null;
                    edu.ucar.axis2.esmfwebservices.SetInputDataDescRequest wrappedParam =
                        (edu.ucar.axis2.esmfwebservices.SetInputDataDescRequest) fromOM(msgContext.getEnvelope()
                                                                                                  .getBody()
                                                                                                  .getFirstElement(),
                            edu.ucar.axis2.esmfwebservices.SetInputDataDescRequest.class,
                            getEnvelopeNamespaces(msgContext.getEnvelope()));

                    setInputDataDescResponse71 = skel.setInputDataDesc(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            setInputDataDescResponse71, false,
                            new javax.xml.namespace.QName(
                                "http://ucar.edu/axis2/ESMFWebServices",
                                "setInputDataDesc"));
                } else
                 if ("getFiles".equals(methodName)) {
                    edu.ucar.axis2.esmfwebservices.GetFilesResponse getFilesResponse73 =
                        null;
                    edu.ucar.axis2.esmfwebservices.GetFilesRequest wrappedParam = (edu.ucar.axis2.esmfwebservices.GetFilesRequest) fromOM(msgContext.getEnvelope()
                                                                                                                                                    .getBody()
                                                                                                                                                    .getFirstElement(),
                            edu.ucar.axis2.esmfwebservices.GetFilesRequest.class,
                            getEnvelopeNamespaces(msgContext.getEnvelope()));

                    getFilesResponse73 = skel.getFiles(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            getFilesResponse73, false,
                            new javax.xml.namespace.QName(
                                "http://ucar.edu/axis2/ESMFWebServices",
                                "getFiles"));
                } else
                 if ("finalizeComponent".equals(methodName)) {
                    edu.ucar.axis2.esmfwebservices.FinalizeComponentResponse finalizeComponentResponse75 =
                        null;
                    edu.ucar.axis2.esmfwebservices.FinalizeComponentRequest wrappedParam =
                        (edu.ucar.axis2.esmfwebservices.FinalizeComponentRequest) fromOM(msgContext.getEnvelope()
                                                                                                   .getBody()
                                                                                                   .getFirstElement(),
                            edu.ucar.axis2.esmfwebservices.FinalizeComponentRequest.class,
                            getEnvelopeNamespaces(msgContext.getEnvelope()));

                    finalizeComponentResponse75 = skel.finalizeComponent(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            finalizeComponentResponse75, false,
                            new javax.xml.namespace.QName(
                                "http://ucar.edu/axis2/ESMFWebServices",
                                "finalizeComponent"));
                } else
                 if ("getOutputDataDesc".equals(methodName)) {
                    edu.ucar.axis2.esmfwebservices.GetOutputDataDescResponse getOutputDataDescResponse77 =
                        null;
                    edu.ucar.axis2.esmfwebservices.GetOutputDataDescRequest wrappedParam =
                        (edu.ucar.axis2.esmfwebservices.GetOutputDataDescRequest) fromOM(msgContext.getEnvelope()
                                                                                                   .getBody()
                                                                                                   .getFirstElement(),
                            edu.ucar.axis2.esmfwebservices.GetOutputDataDescRequest.class,
                            getEnvelopeNamespaces(msgContext.getEnvelope()));

                    getOutputDataDescResponse77 = skel.getOutputDataDesc(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            getOutputDataDescResponse77, false,
                            new javax.xml.namespace.QName(
                                "http://ucar.edu/axis2/ESMFWebServices",
                                "getOutputDataDesc"));
                } else
                 if ("runComponent".equals(methodName)) {
                    edu.ucar.axis2.esmfwebservices.RunComponentResponse runComponentResponse79 =
                        null;
                    edu.ucar.axis2.esmfwebservices.RunComponentRequest wrappedParam =
                        (edu.ucar.axis2.esmfwebservices.RunComponentRequest) fromOM(msgContext.getEnvelope()
                                                                                              .getBody()
                                                                                              .getFirstElement(),
                            edu.ucar.axis2.esmfwebservices.RunComponentRequest.class,
                            getEnvelopeNamespaces(msgContext.getEnvelope()));

                    runComponentResponse79 = skel.runComponent(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            runComponentResponse79, false,
                            new javax.xml.namespace.QName(
                                "http://ucar.edu/axis2/ESMFWebServices",
                                "runComponent"));
                } else
                 if ("initComponent".equals(methodName)) {
                    edu.ucar.axis2.esmfwebservices.InitComponentResponse initComponentResponse81 =
                        null;
                    edu.ucar.axis2.esmfwebservices.InitComponentRequest wrappedParam =
                        (edu.ucar.axis2.esmfwebservices.InitComponentRequest) fromOM(msgContext.getEnvelope()
                                                                                               .getBody()
                                                                                               .getFirstElement(),
                            edu.ucar.axis2.esmfwebservices.InitComponentRequest.class,
                            getEnvelopeNamespaces(msgContext.getEnvelope()));

                    initComponentResponse81 = skel.initComponent(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            initComponentResponse81, false,
                            new javax.xml.namespace.QName(
                                "http://ucar.edu/axis2/ESMFWebServices",
                                "initComponent"));
                } else
                 if ("getOutputData".equals(methodName)) {
                    edu.ucar.axis2.esmfwebservices.GetOutputDataResponse getOutputDataResponse83 =
                        null;
                    edu.ucar.axis2.esmfwebservices.GetOutputDataRequest wrappedParam =
                        (edu.ucar.axis2.esmfwebservices.GetOutputDataRequest) fromOM(msgContext.getEnvelope()
                                                                                               .getBody()
                                                                                               .getFirstElement(),
                            edu.ucar.axis2.esmfwebservices.GetOutputDataRequest.class,
                            getEnvelopeNamespaces(msgContext.getEnvelope()));

                    getOutputDataResponse83 = skel.getOutputData(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            getOutputDataResponse83, false,
                            new javax.xml.namespace.QName(
                                "http://ucar.edu/axis2/ESMFWebServices",
                                "getOutputData"));
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
        edu.ucar.axis2.esmfwebservices.ListServersRequest param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(edu.ucar.axis2.esmfwebservices.ListServersRequest.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        edu.ucar.axis2.esmfwebservices.ListServersResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(edu.ucar.axis2.esmfwebservices.ListServersResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        edu.ucar.axis2.esmfwebservices.ComponentStatusRequest param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(edu.ucar.axis2.esmfwebservices.ComponentStatusRequest.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        edu.ucar.axis2.esmfwebservices.ComponentStatusResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(edu.ucar.axis2.esmfwebservices.ComponentStatusResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        edu.ucar.axis2.esmfwebservices.SetInputDataRequest param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(edu.ucar.axis2.esmfwebservices.SetInputDataRequest.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        edu.ucar.axis2.esmfwebservices.SetInputDataResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(edu.ucar.axis2.esmfwebservices.SetInputDataResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        edu.ucar.axis2.esmfwebservices.TimestepComponentRequest param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(edu.ucar.axis2.esmfwebservices.TimestepComponentRequest.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        edu.ucar.axis2.esmfwebservices.TimestepComponentResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(edu.ucar.axis2.esmfwebservices.TimestepComponentResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        edu.ucar.axis2.esmfwebservices.SetOutputVariablesRequest param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(edu.ucar.axis2.esmfwebservices.SetOutputVariablesRequest.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        edu.ucar.axis2.esmfwebservices.SetOutputVariablesResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(edu.ucar.axis2.esmfwebservices.SetOutputVariablesResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        edu.ucar.axis2.esmfwebservices.EndClientRequest param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(edu.ucar.axis2.esmfwebservices.EndClientRequest.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        edu.ucar.axis2.esmfwebservices.EndClientResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(edu.ucar.axis2.esmfwebservices.EndClientResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        edu.ucar.axis2.esmfwebservices.NewClientRequest param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(edu.ucar.axis2.esmfwebservices.NewClientRequest.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        edu.ucar.axis2.esmfwebservices.NewClientResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(edu.ucar.axis2.esmfwebservices.NewClientResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        edu.ucar.axis2.esmfwebservices.SetInputDataDescRequest param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(edu.ucar.axis2.esmfwebservices.SetInputDataDescRequest.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        edu.ucar.axis2.esmfwebservices.SetInputDataDescResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(edu.ucar.axis2.esmfwebservices.SetInputDataDescResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        edu.ucar.axis2.esmfwebservices.GetFilesRequest param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(edu.ucar.axis2.esmfwebservices.GetFilesRequest.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        edu.ucar.axis2.esmfwebservices.GetFilesResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(edu.ucar.axis2.esmfwebservices.GetFilesResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        edu.ucar.axis2.esmfwebservices.FinalizeComponentRequest param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(edu.ucar.axis2.esmfwebservices.FinalizeComponentRequest.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        edu.ucar.axis2.esmfwebservices.FinalizeComponentResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(edu.ucar.axis2.esmfwebservices.FinalizeComponentResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        edu.ucar.axis2.esmfwebservices.GetOutputDataDescRequest param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(edu.ucar.axis2.esmfwebservices.GetOutputDataDescRequest.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        edu.ucar.axis2.esmfwebservices.GetOutputDataDescResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(edu.ucar.axis2.esmfwebservices.GetOutputDataDescResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        edu.ucar.axis2.esmfwebservices.RunComponentRequest param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(edu.ucar.axis2.esmfwebservices.RunComponentRequest.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        edu.ucar.axis2.esmfwebservices.RunComponentResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(edu.ucar.axis2.esmfwebservices.RunComponentResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        edu.ucar.axis2.esmfwebservices.InitComponentRequest param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(edu.ucar.axis2.esmfwebservices.InitComponentRequest.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        edu.ucar.axis2.esmfwebservices.InitComponentResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(edu.ucar.axis2.esmfwebservices.InitComponentResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        edu.ucar.axis2.esmfwebservices.GetOutputDataRequest param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(edu.ucar.axis2.esmfwebservices.GetOutputDataRequest.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        edu.ucar.axis2.esmfwebservices.GetOutputDataResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(edu.ucar.axis2.esmfwebservices.GetOutputDataResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        edu.ucar.axis2.esmfwebservices.ListServersResponse param,
        boolean optimizeContent, javax.xml.namespace.QName methodQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    edu.ucar.axis2.esmfwebservices.ListServersResponse.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private edu.ucar.axis2.esmfwebservices.ListServersResponse wrapListServers() {
        edu.ucar.axis2.esmfwebservices.ListServersResponse wrappedElement = new edu.ucar.axis2.esmfwebservices.ListServersResponse();

        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        edu.ucar.axis2.esmfwebservices.ComponentStatusResponse param,
        boolean optimizeContent, javax.xml.namespace.QName methodQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    edu.ucar.axis2.esmfwebservices.ComponentStatusResponse.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private edu.ucar.axis2.esmfwebservices.ComponentStatusResponse wrapComponentStatus() {
        edu.ucar.axis2.esmfwebservices.ComponentStatusResponse wrappedElement = new edu.ucar.axis2.esmfwebservices.ComponentStatusResponse();

        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        edu.ucar.axis2.esmfwebservices.SetInputDataResponse param,
        boolean optimizeContent, javax.xml.namespace.QName methodQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    edu.ucar.axis2.esmfwebservices.SetInputDataResponse.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private edu.ucar.axis2.esmfwebservices.SetInputDataResponse wrapSetInputData() {
        edu.ucar.axis2.esmfwebservices.SetInputDataResponse wrappedElement = new edu.ucar.axis2.esmfwebservices.SetInputDataResponse();

        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        edu.ucar.axis2.esmfwebservices.TimestepComponentResponse param,
        boolean optimizeContent, javax.xml.namespace.QName methodQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    edu.ucar.axis2.esmfwebservices.TimestepComponentResponse.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private edu.ucar.axis2.esmfwebservices.TimestepComponentResponse wrapTimestepComponent() {
        edu.ucar.axis2.esmfwebservices.TimestepComponentResponse wrappedElement = new edu.ucar.axis2.esmfwebservices.TimestepComponentResponse();

        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        edu.ucar.axis2.esmfwebservices.SetOutputVariablesResponse param,
        boolean optimizeContent, javax.xml.namespace.QName methodQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    edu.ucar.axis2.esmfwebservices.SetOutputVariablesResponse.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private edu.ucar.axis2.esmfwebservices.SetOutputVariablesResponse wrapSetOutputVariables() {
        edu.ucar.axis2.esmfwebservices.SetOutputVariablesResponse wrappedElement =
            new edu.ucar.axis2.esmfwebservices.SetOutputVariablesResponse();

        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        edu.ucar.axis2.esmfwebservices.EndClientResponse param,
        boolean optimizeContent, javax.xml.namespace.QName methodQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    edu.ucar.axis2.esmfwebservices.EndClientResponse.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private edu.ucar.axis2.esmfwebservices.EndClientResponse wrapEndClient() {
        edu.ucar.axis2.esmfwebservices.EndClientResponse wrappedElement = new edu.ucar.axis2.esmfwebservices.EndClientResponse();

        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        edu.ucar.axis2.esmfwebservices.NewClientResponse param,
        boolean optimizeContent, javax.xml.namespace.QName methodQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    edu.ucar.axis2.esmfwebservices.NewClientResponse.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private edu.ucar.axis2.esmfwebservices.NewClientResponse wrapNewClient() {
        edu.ucar.axis2.esmfwebservices.NewClientResponse wrappedElement = new edu.ucar.axis2.esmfwebservices.NewClientResponse();

        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        edu.ucar.axis2.esmfwebservices.SetInputDataDescResponse param,
        boolean optimizeContent, javax.xml.namespace.QName methodQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    edu.ucar.axis2.esmfwebservices.SetInputDataDescResponse.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private edu.ucar.axis2.esmfwebservices.SetInputDataDescResponse wrapSetInputDataDesc() {
        edu.ucar.axis2.esmfwebservices.SetInputDataDescResponse wrappedElement = new edu.ucar.axis2.esmfwebservices.SetInputDataDescResponse();

        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        edu.ucar.axis2.esmfwebservices.GetFilesResponse param,
        boolean optimizeContent, javax.xml.namespace.QName methodQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    edu.ucar.axis2.esmfwebservices.GetFilesResponse.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private edu.ucar.axis2.esmfwebservices.GetFilesResponse wrapGetFiles() {
        edu.ucar.axis2.esmfwebservices.GetFilesResponse wrappedElement = new edu.ucar.axis2.esmfwebservices.GetFilesResponse();

        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        edu.ucar.axis2.esmfwebservices.FinalizeComponentResponse param,
        boolean optimizeContent, javax.xml.namespace.QName methodQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    edu.ucar.axis2.esmfwebservices.FinalizeComponentResponse.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private edu.ucar.axis2.esmfwebservices.FinalizeComponentResponse wrapFinalizeComponent() {
        edu.ucar.axis2.esmfwebservices.FinalizeComponentResponse wrappedElement = new edu.ucar.axis2.esmfwebservices.FinalizeComponentResponse();

        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        edu.ucar.axis2.esmfwebservices.GetOutputDataDescResponse param,
        boolean optimizeContent, javax.xml.namespace.QName methodQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    edu.ucar.axis2.esmfwebservices.GetOutputDataDescResponse.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private edu.ucar.axis2.esmfwebservices.GetOutputDataDescResponse wrapGetOutputDataDesc() {
        edu.ucar.axis2.esmfwebservices.GetOutputDataDescResponse wrappedElement = new edu.ucar.axis2.esmfwebservices.GetOutputDataDescResponse();

        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        edu.ucar.axis2.esmfwebservices.RunComponentResponse param,
        boolean optimizeContent, javax.xml.namespace.QName methodQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    edu.ucar.axis2.esmfwebservices.RunComponentResponse.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private edu.ucar.axis2.esmfwebservices.RunComponentResponse wrapRunComponent() {
        edu.ucar.axis2.esmfwebservices.RunComponentResponse wrappedElement = new edu.ucar.axis2.esmfwebservices.RunComponentResponse();

        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        edu.ucar.axis2.esmfwebservices.InitComponentResponse param,
        boolean optimizeContent, javax.xml.namespace.QName methodQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    edu.ucar.axis2.esmfwebservices.InitComponentResponse.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private edu.ucar.axis2.esmfwebservices.InitComponentResponse wrapInitComponent() {
        edu.ucar.axis2.esmfwebservices.InitComponentResponse wrappedElement = new edu.ucar.axis2.esmfwebservices.InitComponentResponse();

        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        edu.ucar.axis2.esmfwebservices.GetOutputDataResponse param,
        boolean optimizeContent, javax.xml.namespace.QName methodQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    edu.ucar.axis2.esmfwebservices.GetOutputDataResponse.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private edu.ucar.axis2.esmfwebservices.GetOutputDataResponse wrapGetOutputData() {
        edu.ucar.axis2.esmfwebservices.GetOutputDataResponse wrappedElement = new edu.ucar.axis2.esmfwebservices.GetOutputDataResponse();

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
            if (edu.ucar.axis2.esmfwebservices.ComponentStatusRequest.class.equals(
                        type)) {
                return edu.ucar.axis2.esmfwebservices.ComponentStatusRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (edu.ucar.axis2.esmfwebservices.ComponentStatusResponse.class.equals(
                        type)) {
                return edu.ucar.axis2.esmfwebservices.ComponentStatusResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (edu.ucar.axis2.esmfwebservices.EndClientRequest.class.equals(
                        type)) {
                return edu.ucar.axis2.esmfwebservices.EndClientRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (edu.ucar.axis2.esmfwebservices.EndClientResponse.class.equals(
                        type)) {
                return edu.ucar.axis2.esmfwebservices.EndClientResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (edu.ucar.axis2.esmfwebservices.FinalizeComponentRequest.class.equals(
                        type)) {
                return edu.ucar.axis2.esmfwebservices.FinalizeComponentRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (edu.ucar.axis2.esmfwebservices.FinalizeComponentResponse.class.equals(
                        type)) {
                return edu.ucar.axis2.esmfwebservices.FinalizeComponentResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (edu.ucar.axis2.esmfwebservices.GetFilesRequest.class.equals(
                        type)) {
                return edu.ucar.axis2.esmfwebservices.GetFilesRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (edu.ucar.axis2.esmfwebservices.GetFilesResponse.class.equals(
                        type)) {
                return edu.ucar.axis2.esmfwebservices.GetFilesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (edu.ucar.axis2.esmfwebservices.GetOutputDataDescRequest.class.equals(
                        type)) {
                return edu.ucar.axis2.esmfwebservices.GetOutputDataDescRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (edu.ucar.axis2.esmfwebservices.GetOutputDataDescResponse.class.equals(
                        type)) {
                return edu.ucar.axis2.esmfwebservices.GetOutputDataDescResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (edu.ucar.axis2.esmfwebservices.GetOutputDataRequest.class.equals(
                        type)) {
                return edu.ucar.axis2.esmfwebservices.GetOutputDataRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (edu.ucar.axis2.esmfwebservices.GetOutputDataResponse.class.equals(
                        type)) {
                return edu.ucar.axis2.esmfwebservices.GetOutputDataResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (edu.ucar.axis2.esmfwebservices.InitComponentRequest.class.equals(
                        type)) {
                return edu.ucar.axis2.esmfwebservices.InitComponentRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (edu.ucar.axis2.esmfwebservices.InitComponentResponse.class.equals(
                        type)) {
                return edu.ucar.axis2.esmfwebservices.InitComponentResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (edu.ucar.axis2.esmfwebservices.ListServersRequest.class.equals(
                        type)) {
                return edu.ucar.axis2.esmfwebservices.ListServersRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (edu.ucar.axis2.esmfwebservices.ListServersResponse.class.equals(
                        type)) {
                return edu.ucar.axis2.esmfwebservices.ListServersResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (edu.ucar.axis2.esmfwebservices.NewClientRequest.class.equals(
                        type)) {
                return edu.ucar.axis2.esmfwebservices.NewClientRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (edu.ucar.axis2.esmfwebservices.NewClientResponse.class.equals(
                        type)) {
                return edu.ucar.axis2.esmfwebservices.NewClientResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (edu.ucar.axis2.esmfwebservices.RunComponentRequest.class.equals(
                        type)) {
                return edu.ucar.axis2.esmfwebservices.RunComponentRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (edu.ucar.axis2.esmfwebservices.RunComponentResponse.class.equals(
                        type)) {
                return edu.ucar.axis2.esmfwebservices.RunComponentResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (edu.ucar.axis2.esmfwebservices.SetInputDataDescRequest.class.equals(
                        type)) {
                return edu.ucar.axis2.esmfwebservices.SetInputDataDescRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (edu.ucar.axis2.esmfwebservices.SetInputDataDescResponse.class.equals(
                        type)) {
                return edu.ucar.axis2.esmfwebservices.SetInputDataDescResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (edu.ucar.axis2.esmfwebservices.SetInputDataRequest.class.equals(
                        type)) {
                return edu.ucar.axis2.esmfwebservices.SetInputDataRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (edu.ucar.axis2.esmfwebservices.SetInputDataResponse.class.equals(
                        type)) {
                return edu.ucar.axis2.esmfwebservices.SetInputDataResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (edu.ucar.axis2.esmfwebservices.SetOutputVariablesRequest.class.equals(
                        type)) {
                return edu.ucar.axis2.esmfwebservices.SetOutputVariablesRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (edu.ucar.axis2.esmfwebservices.SetOutputVariablesResponse.class.equals(
                        type)) {
                return edu.ucar.axis2.esmfwebservices.SetOutputVariablesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (edu.ucar.axis2.esmfwebservices.TimestepComponentRequest.class.equals(
                        type)) {
                return edu.ucar.axis2.esmfwebservices.TimestepComponentRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (edu.ucar.axis2.esmfwebservices.TimestepComponentResponse.class.equals(
                        type)) {
                return edu.ucar.axis2.esmfwebservices.TimestepComponentResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
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
