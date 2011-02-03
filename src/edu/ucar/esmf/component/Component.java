//***************************************************************************
//
// $Id:
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


/**
 *****************************************************************************
 *
 *****************************************************************************
 */
public class Component
{
	private String				theName = "";
	private String				theDescription = "";
	private String				theHostName = "";
	private int					thePortNum = 0;


	/**
	 **************************************************************************
	 *
	 **************************************************************************
	 */
	public Component(String  name,
                    String  description,
                    String  hostName,
                    int     portNum)
	{
		theName = name;
		theDescription = description;
		theHostName = hostName;
		thePortNum = portNum;
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
	public String  getHostName()
	{
		return theHostName;
	}


	/**
	 **************************************************************************
	 *
	 **************************************************************************
	 */
	public int  getPortNum()
	{
		return thePortNum;
	}


	/**
	 **************************************************************************
	 *
	 **************************************************************************
	 */
	public void  print()
	{
		System.out.println("************** BEGIN Component *****************");
		System.out.println("Name        : " + theName);
		System.out.println("Description : " + theDescription);
		System.out.println("Host Name   : " + theHostName);
		System.out.println("Port Num    : " + thePortNum);
		System.out.println("************** END Component *****************");
	}
}
