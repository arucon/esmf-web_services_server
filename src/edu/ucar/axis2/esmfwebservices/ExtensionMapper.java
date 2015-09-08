/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:18:31 BST)
 */
package edu.ucar.axis2.esmfwebservices;


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
        if ("http://ucar.edu/axis2/ESMFWebServices".equals(namespaceURI) &&
                "ArrayOfString".equals(typeName)) {
            return edu.ucar.axis2.esmfwebservices.ArrayOfString.Factory.parse(reader);
        }

        if ("http://ucar.edu/axis2/ESMFWebServices".equals(namespaceURI) &&
                "StatusMsg".equals(typeName)) {
            return edu.ucar.axis2.esmfwebservices.StatusMsg.Factory.parse(reader);
        }

        if ("http://ucar.edu/axis2/ESMFWebServices".equals(namespaceURI) &&
                "DataDesc".equals(typeName)) {
            return edu.ucar.axis2.esmfwebservices.DataDesc.Factory.parse(reader);
        }

        if ("http://ucar.edu/axis2/ESMFWebServices".equals(namespaceURI) &&
                "ArrayOfDouble".equals(typeName)) {
            return edu.ucar.axis2.esmfwebservices.ArrayOfDouble.Factory.parse(reader);
        }

        throw new org.apache.axis2.databinding.ADBException("Unsupported type " +
            namespaceURI + " " + typeName);
    }
}
