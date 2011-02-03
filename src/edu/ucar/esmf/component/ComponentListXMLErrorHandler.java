package edu.ucar.esmf.component;

import org.xml.sax.*;


/**
 *************************************************************************
 *
 * <p>
 * <b><code>MyErrorHandler</code></b> implements the SAX
 * <code>ErrorHandler</code> interface and defines callback
 * behavior for the SAX callbacks associated with an XML
 * document's errors.
 * </p>
 *
 *
 * <p>
 *      Copyright (C) 2001 SGI.  All rights reserved.
 * </p>
 * 
 * <p>
 * Subject to compliance with the terms and conditions of this Agreement,
 * including, without limitation, payment of all related fees, SGI hereby
 * grants to Texas A&M University (TAMU) a world-wide, non-exclusive,
 * perpetual, non-transferable, fully paid license to use the TAMU DL Media
 * Asset Management Core Web Client Software developed by SGI, in TAMU's
 * business, solely for TAMU's own internal business purposes, and to make
 * and replicate the same as necessary for such use.  TAMU may not
 * sublicense its right to use, make or replicate the Deliverables to any
 * third party (except to (sub) contractors of TAMU working on TAMU
 * projects for the benefit of TAMU).  SGI grants TAMU rights to modify or
 * prepare derivative works of the software for TAMU purposes only.  For
 * any software provided to TAMU in object code or machine readable form,
 * and to the fullest extent permitted by applicable law, TAMU agrees not
 * to decompile, disassemble or otherwise reverse engineer such software.
 * All rights not expressly granted under this Agreement to TAMU are
 * retained by SGI.  TAMU expressly agrees that it will comply with the
 * license terms described hereunder and that this license shall terminate
 * automatically if TAMU fails to so comply.
 * </p>
 *
 * @author  Kathleen D. Saint
 * @version %I%, %G%
 * @since   1.2
 *
 *************************************************************************
 */
class ComponentListXMLErrorHandler implements ErrorHandler
{

   /**
    *************************************************************************
    *
    * <p>
    * This will report a warning that has occurred; this indicates
    * that while no XML rules were broken, something appears
    * to be incorrect or missing.
    * </p>
    *
    * @param exception  <code>SAXParseException</code> that occurred.
    *
    * @throws  <code>SAXException</code> when things go wrong
    *
    *************************************************************************
    */
   public void  warning(SAXParseException  exception)
      throws SAXException
   {
      //System.out.println("MyErrorHandler::warning()");

      System.out.println("** Parsing Warning **");
      System.out.println("   Line:    " + exception.getLineNumber());
      System.out.println("   URI:     " + exception.getSystemId());
      System.out.println("   Message: " + exception.getMessage());

      throw new SAXException("Warning encountered");
   }

   /**
    *************************************************************************
    *
    * <p>
    * This will report an error that has occurred; this indicates
    * that a rule was broken, typically in validation, but that
    * parsing can reasonably continue.
    * </p>
    *
    * @param exception  <code>SAXParseException</code> that occurred.
    *
    * @throws  <code>SAXException</code> when things go wrong
    *
    *************************************************************************
    */
   public void  error(SAXParseException  exception)
      throws SAXException
   {
      //System.out.println("MyErrorHandler::error()");

      System.out.println("** Parsing Error **");
      System.out.println("   Line:    " + exception.getLineNumber());
      System.out.println("   URI:     " + exception.getSystemId());
      System.out.println("   Message: " + exception.getMessage());

      throw new SAXException("Error encountered");
   }

   /**
    *************************************************************************
    *
    * <p>
    * This will report a fatal error that has occurred; this indicates
    * that a rule has been broken that makes continued parsing either
    * impossible or an almost certain waste of time.
    * </p>
    *
    * @param exception  <code>SAXParseException</code> that occurred.
    *
    * @throws  <code>SAXException</code> when things go wrong
    *
    *************************************************************************
    */
   public void  fatalError(SAXParseException  exception)
      throws SAXException
   {
      //System.out.println("MyErrorHandler::fatalError()");

      System.out.println("** Parsing Fatal Error **");
      System.out.println("   Line:    " + exception.getLineNumber());
      System.out.println("   URI:     " + exception.getSystemId());
      System.out.println("   Message: " + exception.getMessage());

      throw new SAXException("Fatal Error encountered");
   }
}
