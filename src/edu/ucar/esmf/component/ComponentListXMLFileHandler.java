package edu.ucar.esmf.component;


import java.util.*;
import org.xml.sax.*;


/**
 *************************************************************************
 *
 * <p>
 * </p>
 *
 *
 * <p>
 *      Copyright (C) 2001 SGI.  All rights reserved.
 * </p>
 * 
 * <p>
 * </p>
 *
 * @author  Kathleen D. Saint
 * @version %I%, %G%
 * @since   1.2
 *
 *************************************************************************
 */
class ComponentListXMLFileHandler implements ContentHandler
{
   /**
    * Hold onto the locator for location information
    */
   private Locator   theLocator;

	private ComponentList	theCurrentList = null;
	private Component			theCurrentComponent = null;
	private StringBuffer		theCurrentData = null;
	private boolean			theIsInListFlag = false;


   /**
    *************************************************************************
    *
    *************************************************************************
    */
   public  ComponentListXMLFileHandler()
   {
   }


   /**
    *************************************************************************
    *
    * <p>
    * Provide reference to <code>Locator</code> which provides
    * information about where in a document callbacks occur.
    * </p>
    *
    * @param locator  <code>Locator</code> object tied to callback
    *                 process
    *
    *************************************************************************
    */
   public void  setDocumentLocator(Locator  locator)
   {
      theLocator = locator;
   }

   /**
    *************************************************************************
    *
    * <p>
    * This indicates the start of a Document parse -- this precedes
    * all callbacks in all SAX Handlers with the sole exception
    * of <code>{@link #setDocumentLocator}</code>.
    * </p>
    *
    * @throws  <code>SAXException</code> when things go wrong
    *
    *************************************************************************
    */
   public void  startDocument()
      throws SAXException
   {
      //System.out.println("Parsing begins...");
   }

   /**
    *************************************************************************
    *
    * <p>
    * This indicates the end of a Document parse -- this occurs after
    * all callbacks in all SAX Handlers.
    * </p>
    *
    * @throws  <code>SAXException</code> when things go wrong
    *
    *************************************************************************
    */
   public void  endDocument()
      throws SAXException
   {
      //System.out.println("... parsing ends.");
   }

   /**
    *************************************************************************
    *
    * <p>
    * This indicates that a processing instruction (other than
    * the XML declaration) has been encountered.
    * </p>
    *
    * @param target  <code>String</code> target of PI
    * @param data    <code>String</code> containing all data sent to the PI.
    *                This typically looks like one or more attribute value
    *                pairs.
    *
    * @throws  <code>SAXException</code> when things go wrong
    *
    *************************************************************************
    */
   public void  processingInstruction(String  target,
                                      String  data)
      throws SAXException
   {
      System.out.println("PI: Target:" + target + " and Data:" + data);
   }

   /**
    *************************************************************************
    *
    * <p>
    * This indicates the beginning of an XML Namespace prefix
    * mapping.  Although this typically occurs within the root element
    * of an XML document, it can occur at any point within the
    * document.  Note that a prefix mapping on an element triggers
    * this callback <i>before</i> the callback for the actual element
    * iteself (<code>{@link #startElement}</code>) occurs.
    * </p>
    *
    * @param prefix  <code>String</code> prefix used for the namespace
    *                being reported
    * @param uri     <code>String</code> URI for the namespace being
    *                reported
    *
    * @throws  <code>SAXException</code> when things go wrong
    *
    *************************************************************************
    */
   public void  startPrefixMapping(String  prefix,
                                   String  uri)
      throws SAXException
   {
      //System.out.println("Mapping starts for prefix " +
      //                   prefix +
      //                   " mapped to URI " +
      //                   uri);
   }

   /**
    *************************************************************************
    *
    * <p>
    * This indicates the end of a prefix mapping, when the namespace
    * reported in a <code>{@link #startPrefixMapping}</code> callback
    * is no longer available.
    * </p>
    *
    * @param prefix  <code>String</code> of namespace being reported
    *
    * @throws  <code>SAXException</code> when things go wrong
    *
    *************************************************************************
    */
   public void  endPrefixMapping(String  prefix)
   {
      //System.out.println("Mapping ends for prefix " + prefix);
   }

   /**
    *************************************************************************
    *
    * <p>
    * This reports the occurrence of an actual element.  It includes
    * the element's attributes, with the exception of XML vocabulary
    * specific attributes, such as
    *    <code>xmlns:[namespace prefix]</code> and
    *    <code>xsi:schemaLocation</code>.
    * </p>
    *
    * @param namespaceURI <code>String</code> namespace URI this element
    *                     is associated with, or an empty
    *                     <code>String</code>.
    * @param localName    <code>String</code> name of element (with no
    *                     namespace prefix, if one is present).
    * @param rawName      <code>String</code> XML 1.0 version of element
    *                     name:[namespace prefix]:[localName]
    * @param atts         <code>Attributes</code> list for this element
    *
    * @throws  <code>SAXException</code> when things go wrong
    *
    *************************************************************************
    */
   public void  startElement(String      namespaceURI,
                             String      localName,
                             String      rawName,
                             Attributes  atts)
      throws SAXException
   {
		//System.out.println("Start Element: " + localName);

      if (!theIsInListFlag)
      {
         if (localName.equalsIgnoreCase("componentlist"))
         {
            theIsInListFlag = true;
				theCurrentList = new ComponentList();
         }
      }
		else
		{
        	if (localName.equalsIgnoreCase("component"))
        	{
            theCurrentComponent = new Component();

            for (int i = 0; i < atts.getLength(); ++i)
            {
               String   attName = atts.getLocalName(i);

               if (attName.equalsIgnoreCase("clientid"))
               {
                  theCurrentComponent.setClientId(atts.getValue(i));
               }
               else if (attName.equalsIgnoreCase("jobid"))
               {
                  theCurrentComponent.setJobId(atts.getValue(i));
               }
               else if (attName.equalsIgnoreCase("hostname"))
               {
                  theCurrentComponent.setHostName(atts.getValue(i));
               }
               else if (attName.equalsIgnoreCase("portnum"))
               {
                  theCurrentComponent.setPortNum(atts.getValue(i));
               }
               else if (attName.equalsIgnoreCase("name"))
               {
                  theCurrentComponent.setName(atts.getValue(i));
               }
               else if (attName.equalsIgnoreCase("desc"))
               {
                  theCurrentComponent.setDescription(atts.getValue(i));
               }
               else if (attName.equalsIgnoreCase("physhost"))
               {
                  theCurrentComponent.setPhysicalHostName(atts.getValue(i));
               }
               else if (attName.equalsIgnoreCase("state"))
               {
                  theCurrentComponent.setCurrentState(atts.getValue(i));
               }
            }
        	}
		}
   }

   /**
    *************************************************************************
    *
    * <p>
    * Indicates the end of an element (<code>&lt;/[element name]&gt;</code>)
    * is reached.  Note that the parser does not distinguish between empty
    * elements and non-empty elements, so this occurs uniformly.
    * </p>
    *
    * @param namespaceURI <code>String</code> namespace URI this element
    *                     is associated with
    * @param localName    <code>String</code> name of element without prefix
    * @param rawName      <code>String</code> name of element in XML 1.0 form
    *
    * @throws  <code>SAXException</code> when things go wrong
    *
    *************************************************************************
    */
   public void  endElement(String  namespaceURI,
                           String  localName,
                           String  rawName)
      throws SAXException
   {
      if (theIsInListFlag)
      {
	      if (localName.equalsIgnoreCase("componentlist"))
        	{
				theIsInListFlag = false;
        	}
	      else if (localName.equalsIgnoreCase("component"))
        	{
            if (theCurrentComponent != null)
            {
               theCurrentList.addComponent(theCurrentComponent);
               theCurrentComponent = null;
            }
        	}
      }
   }

   /**
    *************************************************************************
    *
    * <p>
    * This reports character data (within an element).
    * </p>
    *
    * @param ch     <code>char[]</code> character array with character data.
    * @param start  <code>int</code> index in array where data starts.
    * @param end    <code>int</code> index in array where data ends.
    *
    * @throws  <code>SAXException</code> when things go wrong
    *
    *************************************************************************
    */
   public void  characters(char[]  ch,
                           int     start,
                           int     end)
      throws SAXException
   {
      String   data = new String(ch, start, end);

/*
** KDS: I don't ever use this... don't know why it's here
      if (theCurrentData != null)
      {
         theCurrentData.append(data.trim());
      }
*/

      //System.out.println("Characters: " + data);
   }

   /**
    *************************************************************************
    *
    * <p>
    * This reports whitespace that can be ignored in the originating
    * document.  This is typically invoked only when validation is
    * ocurring in the parsing process.
    * </p>
    *
    * @param ch     <code>char[]</code> character array with character data.
    * @param start  <code>int</code> index in array where data starts.
    * @param end    <code>int</code> index in array where data ends.
    *
    * @throws  <code>SAXException</code> when things go wrong
    *
    *************************************************************************
    */
   public void  ignorableWhitespace(char[]  ch,
                                    int     start,
                                    int     end)
      throws SAXException
   {
      String   whitespace = new String(ch, start, end);

      //System.out.println("ignorableWhitespace: [" + whitespace + "]");
   }

   /**
    *************************************************************************
    *
    * <p>
    * This reports an entity that is skipped by the parser.  This
    * should only occur for non-validating parsers, and then is still
    * implementation-dependent behavior.
    * </p>
    *
    * @param name  <code>String</code> name of entity being skipped
    *
    * @throws  <code>SAXException</code> when things go wrong
    *
    *************************************************************************
    */
   public void  skippedEntity(String  name)
      throws SAXException
   {
      System.out.println("Skipping entity: " + name);
   }


   /**
    *************************************************************************
    *
    *************************************************************************
    */
	public ComponentList  getComponentList()
	{
		return theCurrentList;
	}
}
