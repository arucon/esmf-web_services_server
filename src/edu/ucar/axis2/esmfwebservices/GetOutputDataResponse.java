/**
 * GetOutputDataResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:18:31 BST)
 */
package edu.ucar.axis2.esmfwebservices;


/**
 *  GetOutputDataResponse bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class GetOutputDataResponse implements org.apache.axis2.databinding.ADBBean {
    public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://ucar.edu/axis2/ESMFWebServices",
            "GetOutputDataResponse", "ns1");

    /**
     * field for NumberOfVariables
     */
    protected int localNumberOfVariables;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localNumberOfVariablesTracker = false;

    /**
     * field for VariableNames
     */
    protected edu.ucar.axis2.esmfwebservices.ArrayOfString localVariableNames;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localVariableNamesTracker = false;

    /**
     * field for NumberOfLatValues
     */
    protected int localNumberOfLatValues;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localNumberOfLatValuesTracker = false;

    /**
     * field for NumberOfLonValues
     */
    protected int localNumberOfLonValues;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localNumberOfLonValuesTracker = false;

    /**
     * field for Values
     */
    protected edu.ucar.axis2.esmfwebservices.ArrayOfDouble localValues;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localValuesTracker = false;

    /**
     * field for Status
     */
    protected edu.ucar.axis2.esmfwebservices.StatusMsg localStatus;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localStatusTracker = false;

    public boolean isNumberOfVariablesSpecified() {
        return localNumberOfVariablesTracker;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getNumberOfVariables() {
        return localNumberOfVariables;
    }

    /**
     * Auto generated setter method
     * @param param NumberOfVariables
     */
    public void setNumberOfVariables(int param) {
        // setting primitive attribute tracker to true
        localNumberOfVariablesTracker = param != java.lang.Integer.MIN_VALUE;

        this.localNumberOfVariables = param;
    }

    public boolean isVariableNamesSpecified() {
        return localVariableNamesTracker;
    }

    /**
     * Auto generated getter method
     * @return edu.ucar.axis2.esmfwebservices.ArrayOfString
     */
    public edu.ucar.axis2.esmfwebservices.ArrayOfString getVariableNames() {
        return localVariableNames;
    }

    /**
     * Auto generated setter method
     * @param param VariableNames
     */
    public void setVariableNames(
        edu.ucar.axis2.esmfwebservices.ArrayOfString param) {
        localVariableNamesTracker = param != null;

        this.localVariableNames = param;
    }

    public boolean isNumberOfLatValuesSpecified() {
        return localNumberOfLatValuesTracker;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getNumberOfLatValues() {
        return localNumberOfLatValues;
    }

    /**
     * Auto generated setter method
     * @param param NumberOfLatValues
     */
    public void setNumberOfLatValues(int param) {
        // setting primitive attribute tracker to true
        localNumberOfLatValuesTracker = param != java.lang.Integer.MIN_VALUE;

        this.localNumberOfLatValues = param;
    }

    public boolean isNumberOfLonValuesSpecified() {
        return localNumberOfLonValuesTracker;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getNumberOfLonValues() {
        return localNumberOfLonValues;
    }

    /**
     * Auto generated setter method
     * @param param NumberOfLonValues
     */
    public void setNumberOfLonValues(int param) {
        // setting primitive attribute tracker to true
        localNumberOfLonValuesTracker = param != java.lang.Integer.MIN_VALUE;

        this.localNumberOfLonValues = param;
    }

    public boolean isValuesSpecified() {
        return localValuesTracker;
    }

    /**
     * Auto generated getter method
     * @return edu.ucar.axis2.esmfwebservices.ArrayOfDouble
     */
    public edu.ucar.axis2.esmfwebservices.ArrayOfDouble getValues() {
        return localValues;
    }

    /**
     * Auto generated setter method
     * @param param Values
     */
    public void setValues(edu.ucar.axis2.esmfwebservices.ArrayOfDouble param) {
        localValuesTracker = param != null;

        this.localValues = param;
    }

    public boolean isStatusSpecified() {
        return localStatusTracker;
    }

    /**
     * Auto generated getter method
     * @return edu.ucar.axis2.esmfwebservices.StatusMsg
     */
    public edu.ucar.axis2.esmfwebservices.StatusMsg getStatus() {
        return localStatus;
    }

    /**
     * Auto generated setter method
     * @param param Status
     */
    public void setStatus(edu.ucar.axis2.esmfwebservices.StatusMsg param) {
        localStatusTracker = param != null;

        this.localStatus = param;
    }

    /**
     *
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName,
        final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {
        org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this,
                MY_QNAME);

        return factory.createOMElement(dataSource, MY_QNAME);
    }

    public void serialize(final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException,
            org.apache.axis2.databinding.ADBException {
        serialize(parentQName, xmlWriter, false);
    }

    public void serialize(final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
        throws javax.xml.stream.XMLStreamException,
            org.apache.axis2.databinding.ADBException {
        java.lang.String prefix = null;
        java.lang.String namespace = null;

        prefix = parentQName.getPrefix();
        namespace = parentQName.getNamespaceURI();
        writeStartElement(prefix, namespace, parentQName.getLocalPart(),
            xmlWriter);

        if (serializeType) {
            java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                    "http://ucar.edu/axis2/ESMFWebServices");

            if ((namespacePrefix != null) &&
                    (namespacePrefix.trim().length() > 0)) {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    namespacePrefix + ":GetOutputDataResponse", xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "GetOutputDataResponse", xmlWriter);
            }
        }

        if (localNumberOfVariablesTracker) {
            namespace = "";
            writeStartElement(null, namespace, "NumberOfVariables", xmlWriter);

            if (localNumberOfVariables == java.lang.Integer.MIN_VALUE) {
                throw new org.apache.axis2.databinding.ADBException(
                    "NumberOfVariables cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localNumberOfVariables));
            }

            xmlWriter.writeEndElement();
        }

        if (localVariableNamesTracker) {
            if (localVariableNames == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "VariableNames cannot be null!!");
            }

            localVariableNames.serialize(new javax.xml.namespace.QName("",
                    "VariableNames"), xmlWriter);
        }

        if (localNumberOfLatValuesTracker) {
            namespace = "";
            writeStartElement(null, namespace, "NumberOfLatValues", xmlWriter);

            if (localNumberOfLatValues == java.lang.Integer.MIN_VALUE) {
                throw new org.apache.axis2.databinding.ADBException(
                    "NumberOfLatValues cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localNumberOfLatValues));
            }

            xmlWriter.writeEndElement();
        }

        if (localNumberOfLonValuesTracker) {
            namespace = "";
            writeStartElement(null, namespace, "NumberOfLonValues", xmlWriter);

            if (localNumberOfLonValues == java.lang.Integer.MIN_VALUE) {
                throw new org.apache.axis2.databinding.ADBException(
                    "NumberOfLonValues cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localNumberOfLonValues));
            }

            xmlWriter.writeEndElement();
        }

        if (localValuesTracker) {
            if (localValues == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "Values cannot be null!!");
            }

            localValues.serialize(new javax.xml.namespace.QName("", "Values"),
                xmlWriter);
        }

        if (localStatusTracker) {
            if (localStatus == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "Status cannot be null!!");
            }

            localStatus.serialize(new javax.xml.namespace.QName("", "Status"),
                xmlWriter);
        }

        xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
        if (namespace.equals("http://ucar.edu/axis2/ESMFWebServices")) {
            return "ns1";
        }

        return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /**
     * Utility method to write an element start tag.
     */
    private void writeStartElement(java.lang.String prefix,
        java.lang.String namespace, java.lang.String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

        if (writerPrefix != null) {
            xmlWriter.writeStartElement(namespace, localPart);
        } else {
            if (namespace.length() == 0) {
                prefix = "";
            } else if (prefix == null) {
                prefix = generatePrefix(namespace);
            }

            xmlWriter.writeStartElement(prefix, localPart, namespace);
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
        }
    }

    /**
     * Util method to write an attribute with the ns prefix
     */
    private void writeAttribute(java.lang.String prefix,
        java.lang.String namespace, java.lang.String attName,
        java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        if (xmlWriter.getPrefix(namespace) == null) {
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
        }

        xmlWriter.writeAttribute(namespace, attName, attValue);
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeAttribute(java.lang.String namespace,
        java.lang.String attName, java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attValue);
        } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(java.lang.String namespace,
        java.lang.String attName, javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        java.lang.String attributeNamespace = qname.getNamespaceURI();
        java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

        if (attributePrefix == null) {
            attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
        }

        java.lang.String attributeValue;

        if (attributePrefix.trim().length() > 0) {
            attributeValue = attributePrefix + ":" + qname.getLocalPart();
        } else {
            attributeValue = qname.getLocalPart();
        }

        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attributeValue);
        } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(namespace, attName, attributeValue);
        }
    }

    /**
     *  method to handle Qnames
     */
    private void writeQName(javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        java.lang.String namespaceURI = qname.getNamespaceURI();

        if (namespaceURI != null) {
            java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

            if (prefix == null) {
                prefix = generatePrefix(namespaceURI);
                xmlWriter.writeNamespace(prefix, namespaceURI);
                xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
                xmlWriter.writeCharacters(prefix + ":" +
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            } else {
                // i.e this is the default namespace
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            }
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    qname));
        }
    }

    private void writeQNames(javax.xml.namespace.QName[] qnames,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        if (qnames != null) {
            // we have to store this data until last moment since it is not possible to write any
            // namespace data after writing the charactor data
            java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
            java.lang.String namespaceURI = null;
            java.lang.String prefix = null;

            for (int i = 0; i < qnames.length; i++) {
                if (i > 0) {
                    stringToWrite.append(" ");
                }

                namespaceURI = qnames[i].getNamespaceURI();

                if (namespaceURI != null) {
                    prefix = xmlWriter.getPrefix(namespaceURI);

                    if ((prefix == null) || (prefix.length() == 0)) {
                        prefix = generatePrefix(namespaceURI);
                        xmlWriter.writeNamespace(prefix, namespaceURI);
                        xmlWriter.setPrefix(prefix, namespaceURI);
                    }

                    if (prefix.trim().length() > 0) {
                        stringToWrite.append(prefix).append(":")
                                     .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    }
                } else {
                    stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qnames[i]));
                }
            }

            xmlWriter.writeCharacters(stringToWrite.toString());
        }
    }

    /**
     * Register a namespace prefix
     */
    private java.lang.String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
        throws javax.xml.stream.XMLStreamException {
        java.lang.String prefix = xmlWriter.getPrefix(namespace);

        if (prefix == null) {
            prefix = generatePrefix(namespace);

            javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

            while (true) {
                java.lang.String uri = nsContext.getNamespaceURI(prefix);

                if ((uri == null) || (uri.length() == 0)) {
                    break;
                }

                prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
            }

            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
        }

        return prefix;
    }

    /**
     * databinding method to get an XML representation of this object
     *
     */
    public javax.xml.stream.XMLStreamReader getPullParser(
        javax.xml.namespace.QName qName)
        throws org.apache.axis2.databinding.ADBException {
        java.util.ArrayList elementList = new java.util.ArrayList();
        java.util.ArrayList attribList = new java.util.ArrayList();

        if (localNumberOfVariablesTracker) {
            elementList.add(new javax.xml.namespace.QName("",
                    "NumberOfVariables"));

            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localNumberOfVariables));
        }

        if (localVariableNamesTracker) {
            elementList.add(new javax.xml.namespace.QName("", "VariableNames"));

            if (localVariableNames == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "VariableNames cannot be null!!");
            }

            elementList.add(localVariableNames);
        }

        if (localNumberOfLatValuesTracker) {
            elementList.add(new javax.xml.namespace.QName("",
                    "NumberOfLatValues"));

            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localNumberOfLatValues));
        }

        if (localNumberOfLonValuesTracker) {
            elementList.add(new javax.xml.namespace.QName("",
                    "NumberOfLonValues"));

            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localNumberOfLonValues));
        }

        if (localValuesTracker) {
            elementList.add(new javax.xml.namespace.QName("", "Values"));

            if (localValues == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "Values cannot be null!!");
            }

            elementList.add(localValues);
        }

        if (localStatusTracker) {
            elementList.add(new javax.xml.namespace.QName("", "Status"));

            if (localStatus == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "Status cannot be null!!");
            }

            elementList.add(localStatus);
        }

        return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName,
            elementList.toArray(), attribList.toArray());
    }

    /**
     *  Factory class that keeps the parse method
     */
    public static class Factory {
        /**
         * static method to create the object
         * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
         *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
         * Postcondition: If this object is an element, the reader is positioned at its end element
         *                If this object is a complex type, the reader is positioned at the end element of its outer element
         */
        public static GetOutputDataResponse parse(
            javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            GetOutputDataResponse object = new GetOutputDataResponse();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix = "";
            java.lang.String namespaceuri = "";

            try {
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                    java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "type");

                    if (fullTypeName != null) {
                        java.lang.String nsPrefix = null;

                        if (fullTypeName.indexOf(":") > -1) {
                            nsPrefix = fullTypeName.substring(0,
                                    fullTypeName.indexOf(":"));
                        }

                        nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

                        java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(
                                    ":") + 1);

                        if (!"GetOutputDataResponse".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (GetOutputDataResponse) edu.ucar.axis2.esmfwebservices.ExtensionMapper.getTypeObject(nsUri,
                                type, reader);
                        }
                    }
                }

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                reader.next();

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("http://ucar.edu/axis2/ESMFWebServices", "NumberOfVariables").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "NumberOfVariables" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setNumberOfVariables(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    object.setNumberOfVariables(java.lang.Integer.MIN_VALUE);
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("http://ucar.edu/axis2/ESMFWebServices", "VariableNames").equals(
                            reader.getName())) {
                    object.setVariableNames(edu.ucar.axis2.esmfwebservices.ArrayOfString.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("http://ucar.edu/axis2/ESMFWebServices", "NumberOfLatValues").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "NumberOfLatValues" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setNumberOfLatValues(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    object.setNumberOfLatValues(java.lang.Integer.MIN_VALUE);
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("http://ucar.edu/axis2/ESMFWebServices", "NumberOfLonValues").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "NumberOfLonValues" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setNumberOfLonValues(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    object.setNumberOfLonValues(java.lang.Integer.MIN_VALUE);
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("http://ucar.edu/axis2/ESMFWebServices", "Values").equals(
                            reader.getName())) {
                    object.setValues(edu.ucar.axis2.esmfwebservices.ArrayOfDouble.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("http://ucar.edu/axis2/ESMFWebServices", "Status").equals(
                            reader.getName())) {
                    object.setStatus(edu.ucar.axis2.esmfwebservices.StatusMsg.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()) {
                    // A start element we are not expecting indicates a trailing invalid property
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }
            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }
    } //end of factory class
}
