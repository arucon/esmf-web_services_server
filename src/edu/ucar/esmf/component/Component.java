//***************************************************************************
//
// $Id$
//
// Earth System Modeling Framework
// Copyright 2002-2015, University Corporation for Atmospheric Research,
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


/**
 *****************************************************************************
 *
 *****************************************************************************
 */
public class Component
{
   private String          theClientId = "";
   private String          theJobId = "";
	private String				theHostName = "";
	private String				thePortNum = "";
	private String				theName = "";
	private String				theDescription = "";
   private String          thePhysicalHostName = "";
   private String          theCurrentState = "";


   /**
    **************************************************************************
    *
    **************************************************************************
    */
   public Component()
   {
   }


	/**
	 **************************************************************************
	 *
	 **************************************************************************
	 */
   public Component(String  clientId,
                    String  jobId,
                    String  hostName,
                    String  portNum)
	{
      theClientId = clientId;
      theJobId = jobId;
      theHostName = hostName;
      thePortNum = portNum;
      thePhysicalHostName = hostName;
	}


   /**
    **************************************************************************
    *
    **************************************************************************
    */
   public void  setClientId(String  clientId)
   {
      theClientId = clientId;
   }


   /**
    **************************************************************************
    *
    **************************************************************************
    */
   public void  setJobId(String  jobId)
   {
      theJobId = jobId;
   }


   /**
    **************************************************************************
    *
    **************************************************************************
    */
   public void  setHostName(String  hostName)
   {
      theHostName = hostName;
   }


   /**
    **************************************************************************
    *
    **************************************************************************
    */
   public void  setPortNum(String  portNum)
   {
      thePortNum = portNum;
   }


   /**
    **************************************************************************
    *
    **************************************************************************
    */
   public void  setName(String  name)
   {
      theName = name;
   }


   /**
    **************************************************************************
    *
    **************************************************************************
    */
   public void  setDescription(String  description)
   {
      theDescription = description;
   }


   /**
    **************************************************************************
    *
    **************************************************************************
    */
   public void  setPhysicalHostName(String  hostName)
   {
      thePhysicalHostName = hostName;
   }


   /**
    **************************************************************************
    *
    **************************************************************************
    */
   public void  setCurrentState(String  state)
   {
      theCurrentState = state;
   }


   /**
    **************************************************************************
    *
    **************************************************************************
    */
   public String  getClientId()
   {
      return theClientId;
   }


   /**
    **************************************************************************
    *
    **************************************************************************
    */
   public String  getJobId()
   {
      return theJobId;
   }


	/**
	 **************************************************************************
	 *
	 **************************************************************************
	 */
	public String  getHostName()
	{
		return theHostName;
	}


	/**
	 **************************************************************************
	 *
	 **************************************************************************
	 */
	public String  getPortNum()
	{
		return thePortNum;
	}


   /**
    **************************************************************************
    *
    **************************************************************************
    */
   public String  getName()
   {
      return theName;
   }


   /**
    **************************************************************************
    *
    **************************************************************************
    */
   public String  getDescription()
   {
      return theDescription;
   }


   /**
    **************************************************************************
    *
    **************************************************************************
    */
   public String  getPhysicalHostName()
   {
      return thePhysicalHostName;
   }


   /**
    **************************************************************************
    *
    **************************************************************************
    */
   public String  getCurrentState()
   {
      return theCurrentState;
   }


	/**
	 **************************************************************************
	 *
	 **************************************************************************
	 */
	public void  print()
	{
		System.out.println("************** BEGIN Component *****************");
      System.out.println("Client ID     : " + theClientId);
      System.out.println("Job ID        : " + theJobId);
      System.out.println("Host Name     : " + theHostName);
      System.out.println("Port Num      : " + thePortNum);
      System.out.println("Name          : " + theName);
      System.out.println("Description   : " + theDescription);
      System.out.println("Physical Host : " + thePhysicalHostName);
      System.out.println("Current State : " + theCurrentState);
		System.out.println("************** END Component *****************");
	}
}
