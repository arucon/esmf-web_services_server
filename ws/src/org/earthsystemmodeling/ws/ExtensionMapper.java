/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:18:31 BST)
 */
package org.earthsystemmodeling.ws;


/**
 *  ExtensionMapper class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class ExtensionMapper {
    public static java.lang.Object getTypeObject(
        java.lang.String namespaceURI, java.lang.String typeName,
        javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
        if ("http://earthsystemmodeling.org/ws".equals(namespaceURI) &&
                "RequestStatus".equals(typeName)) {
            return org.earthsystemmodeling.ws.RequestStatus.Factory.parse(reader);
        }

        if ("http://earthsystemmodeling.org/ws".equals(namespaceURI) &&
                "ModelServiceStatus".equals(typeName)) {
            return org.earthsystemmodeling.ws.ModelServiceStatus.Factory.parse(reader);
        }

        if ("http://earthsystemmodeling.org/ws".equals(namespaceURI) &&
                "RequestResult".equals(typeName)) {
            return org.earthsystemmodeling.ws.RequestResult.Factory.parse(reader);
        }

        throw new org.apache.axis2.databinding.ADBException("Unsupported type " +
            namespaceURI + " " + typeName);
    }
}
