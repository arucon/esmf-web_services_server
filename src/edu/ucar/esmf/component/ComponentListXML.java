//***************************************************************************
//
// $Id$
//
// Earth System Modeling Framework
// Copyright 2002-2008, University Corporation for Atmospheric Research,
// Massachusetts Institute of Technology, Geophysical Fluid Dynamics
// Laboratory, University of Michigan, National Centers for Environmental
// Prediction, Los Alamos National Laboratory, Argonne National Laboratory,
// NASA Goddard Space Flight Center.
//
// Licensed under the University of Illinois-NCSA License
//
//***************************************************************************

package edu.ucar.esmf.component;

import java.io.*;
import java.util.*;
import org.xml.sax.*;
import org.xml.sax.helpers.*;


/**
 *****************************************************************************
 *
 *****************************************************************************
 */
public class ComponentListXML
{
   private String    		theFilename;
   private File      		theFile;
	private ComponentList	theList = null;


	/**
	 **************************************************************************
	 *
	 **************************************************************************
	 */
	public ComponentListXML(String  filename)
		throws IOException
	{
      theFilename = filename;
      theFile = new File(theFilename);

      if (theFile.exists())
      {
         theList = readListFile();
      }
		else
		{
			theList = new ComponentList();
			writeListFile();
		}
	}


   /**
    **************************************************************************
    *
    **************************************************************************
    */
   private ComponentList  readListFile()
   {
      ErrorHandler						errorHandler = 
													new ComponentListXMLErrorHandler();
      ComponentListXMLFileHandler	contentHandler = 
													new ComponentListXMLFileHandler();
      ComponentList             		thisList = null;

      try
      {
         XMLReader   parser = XMLReaderFactory.createXMLReader(
                                    "org.apache.xerces.parsers.SAXParser");

         parser.setContentHandler(contentHandler);
         parser.setErrorHandler(errorHandler);

         FileReader  reader = new FileReader(theFilename);
         InputSource input = new InputSource(reader);

         parser.parse(input);

         thisList = contentHandler.getComponentList();
      }
      catch (Exception  e)
      {
         System.out.println("Error parsing Component List XML: " + 
                            e.getMessage());
      }

      return thisList;
   }


   /**
    **************************************************************************
    *
    **************************************************************************
    */
   private void  writeListFile()
      throws IOException
   {
      if (theList == null)
      {
         return;
      }

      BufferedWriter writer = new BufferedWriter(new FileWriter(theFilename));

      writer.write("<componentlist>");
      writer.newLine();

      Vector<Component>		components = theList.components();
      for (int i = 0; i < components.size(); ++i)
      {
			Component	thisComponent = components.elementAt(i);

         writer.write("   <component clientid=\"" +
            thisComponent.getClientId() + "\"");
         writer.newLine();

         writer.write("              jobid=\"" +
            thisComponent.getJobId() + "\"");
         writer.newLine();

         writer.write("              hostname=\"" + 
				thisComponent.getHostName() + "\"");
         writer.newLine();

         writer.write("              portnum=\"" + 
				thisComponent.getPortNum() + "\">");
         writer.newLine();

         writer.write("              name=\"" +
            thisComponent.getName() + "\"");
         writer.newLine();

         writer.write("              desc=\"" +
            thisComponent.getDescription() + "\"");
         writer.newLine();

         writer.write("              physhost=\"" +
            thisComponent.getPhysicalHostName() + "\"");
         writer.newLine();

         writer.write("              state=\"" +
            thisComponent.getCurrentState() + "\">");
         writer.newLine();

         writer.write("   </component>");
         writer.newLine();
      }

      writer.write("</componentlist>");
      writer.newLine();

      writer.close();
   }


   /**
    **************************************************************************
    *
    **************************************************************************
    */
   public void  setList(ComponentList  list)
      throws IOException
   {
      theList = list;
      writeListFile();
   }


   /**
    **************************************************************************
    *
    **************************************************************************
    */
   public ComponentList  getList()
   {
      return theList;
   }
}
