/**
 * ESMFMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
package org.earthsystemmodeling.ws;


/**
 *  ESMFMessageReceiverInOut message receiver
 */
public class ESMFMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver {
    public void invokeBusinessLogic(
        org.apache.axis2.context.MessageContext msgContext,
        org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault {
        try {
            // get the implementation class for the Web Service
            Object obj = getTheImplementationObject(msgContext);

            ESMFSkeletonInterface skel = (ESMFSkeletonInterface) obj;

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
                if ("newModelService".equals(methodName)) {
                    org.earthsystemmodeling.ws.NewModelServiceResponse newModelServiceResponse19 =
                        null;
                    org.earthsystemmodeling.ws.NewModelService wrappedParam = (org.earthsystemmodeling.ws.NewModelService) fromOM(msgContext.getEnvelope()
                                                                                                                                            .getBody()
                                                                                                                                            .getFirstElement(),
                            org.earthsystemmodeling.ws.NewModelService.class,
                            getEnvelopeNamespaces(msgContext.getEnvelope()));

                    newModelServiceResponse19 = skel.newModelService(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            newModelServiceResponse19, false,
                            new javax.xml.namespace.QName(
                                "http://earthsystemmodeling.org/ws",
                                "newModelService"));
                } else
                 if ("getModelServiceStatus".equals(methodName)) {
                    org.earthsystemmodeling.ws.GetModelServiceStatusResponse getModelServiceStatusResponse21 =
                        null;
                    org.earthsystemmodeling.ws.GetModelServiceStatus wrappedParam =
                        (org.earthsystemmodeling.ws.GetModelServiceStatus) fromOM(msgContext.getEnvelope()
                                                                                            .getBody()
                                                                                            .getFirstElement(),
                            org.earthsystemmodeling.ws.GetModelServiceStatus.class,
                            getEnvelopeNamespaces(msgContext.getEnvelope()));

                    getModelServiceStatusResponse21 = skel.getModelServiceStatus(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            getModelServiceStatusResponse21, false,
                            new javax.xml.namespace.QName(
                                "http://earthsystemmodeling.org/ws",
                                "getModelServiceStatus"));
                } else
                 if ("terminateModelService".equals(methodName)) {
                    org.earthsystemmodeling.ws.TerminateModelServiceResponse terminateModelServiceResponse23 =
                        null;
                    org.earthsystemmodeling.ws.TerminateModelService wrappedParam =
                        (org.earthsystemmodeling.ws.TerminateModelService) fromOM(msgContext.getEnvelope()
                                                                                            .getBody()
                                                                                            .getFirstElement(),
                            org.earthsystemmodeling.ws.TerminateModelService.class,
                            getEnvelopeNamespaces(msgContext.getEnvelope()));

                    terminateModelServiceResponse23 = skel.terminateModelService(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            terminateModelServiceResponse23, false,
                            new javax.xml.namespace.QName(
                                "http://earthsystemmodeling.org/ws",
                                "terminateModelService"));
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
        org.earthsystemmodeling.ws.NewModelService param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.earthsystemmodeling.ws.NewModelService.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.earthsystemmodeling.ws.NewModelServiceResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.earthsystemmodeling.ws.NewModelServiceResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.earthsystemmodeling.ws.GetModelServiceStatus param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.earthsystemmodeling.ws.GetModelServiceStatus.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.earthsystemmodeling.ws.GetModelServiceStatusResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.earthsystemmodeling.ws.GetModelServiceStatusResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.earthsystemmodeling.ws.TerminateModelService param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.earthsystemmodeling.ws.TerminateModelService.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.earthsystemmodeling.ws.TerminateModelServiceResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.earthsystemmodeling.ws.TerminateModelServiceResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.earthsystemmodeling.ws.NewModelServiceResponse param,
        boolean optimizeContent, javax.xml.namespace.QName methodQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.earthsystemmodeling.ws.NewModelServiceResponse.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.earthsystemmodeling.ws.NewModelServiceResponse wrapNewModelService() {
        org.earthsystemmodeling.ws.NewModelServiceResponse wrappedElement = new org.earthsystemmodeling.ws.NewModelServiceResponse();

        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.earthsystemmodeling.ws.GetModelServiceStatusResponse param,
        boolean optimizeContent, javax.xml.namespace.QName methodQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.earthsystemmodeling.ws.GetModelServiceStatusResponse.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.earthsystemmodeling.ws.GetModelServiceStatusResponse wrapGetModelServiceStatus() {
        org.earthsystemmodeling.ws.GetModelServiceStatusResponse wrappedElement = new org.earthsystemmodeling.ws.GetModelServiceStatusResponse();

        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.earthsystemmodeling.ws.TerminateModelServiceResponse param,
        boolean optimizeContent, javax.xml.namespace.QName methodQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.earthsystemmodeling.ws.TerminateModelServiceResponse.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.earthsystemmodeling.ws.TerminateModelServiceResponse wrapTerminateModelService() {
        org.earthsystemmodeling.ws.TerminateModelServiceResponse wrappedElement = new org.earthsystemmodeling.ws.TerminateModelServiceResponse();

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
            if (org.earthsystemmodeling.ws.GetModelServiceStatus.class.equals(
                        type)) {
                return org.earthsystemmodeling.ws.GetModelServiceStatus.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.earthsystemmodeling.ws.GetModelServiceStatusResponse.class.equals(
                        type)) {
                return org.earthsystemmodeling.ws.GetModelServiceStatusResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.earthsystemmodeling.ws.NewModelService.class.equals(type)) {
                return org.earthsystemmodeling.ws.NewModelService.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.earthsystemmodeling.ws.NewModelServiceResponse.class.equals(
                        type)) {
                return org.earthsystemmodeling.ws.NewModelServiceResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.earthsystemmodeling.ws.TerminateModelService.class.equals(
                        type)) {
                return org.earthsystemmodeling.ws.TerminateModelService.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.earthsystemmodeling.ws.TerminateModelServiceResponse.class.equals(
                        type)) {
                return org.earthsystemmodeling.ws.TerminateModelServiceResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
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
