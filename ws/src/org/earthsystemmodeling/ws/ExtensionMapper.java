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
                "DataDesc".equals(typeName)) {
            return org.earthsystemmodeling.ws.DataDesc.Factory.parse(reader);
        }

        if ("http://earthsystemmodeling.org/ws".equals(namespaceURI) &&
                "ArrayOfDouble".equals(typeName)) {
            return org.earthsystemmodeling.ws.ArrayOfDouble.Factory.parse(reader);
        }

        if ("http://earthsystemmodeling.org/ws".equals(namespaceURI) &&
                "ArrayOfString".equals(typeName)) {
            return org.earthsystemmodeling.ws.ArrayOfString.Factory.parse(reader);
        }

        if ("http://earthsystemmodeling.org/ws".equals(namespaceURI) &&
                "StatusMsg".equals(typeName)) {
            return org.earthsystemmodeling.ws.StatusMsg.Factory.parse(reader);
        }

        throw new org.apache.axis2.databinding.ADBException("Unsupported type " +
            namespaceURI + " " + typeName);
    }
}
