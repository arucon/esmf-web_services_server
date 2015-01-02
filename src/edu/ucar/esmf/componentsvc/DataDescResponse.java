//***************************************************************************
//
// $Id:
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

package edu.ucar.esmf.componentsvc;

import java.io.*;
import java.util.*;


/**
 *****************************************************************************
 *
 *****************************************************************************
 */
public class DataDescResponse
{
	private int			theNumVars = 0;
	private String[]	theVarNames = new String[0];
	private int			theNumLats = 0;
	private double[]	theLatValues = new double[0];
	private int			theNumLons = 0;
	private double[]	theLonValues = new double[0];
	private int			theStatus = 0;

	/**
	 **************************************************************************
	 *
	 **************************************************************************
	 */
	public DataDescResponse()
	{
	}

	public void  setNumVars(int  numVars)
	{
		theNumVars = numVars;
	}

	public void  setVarNames(String[]  varNames)
	{
		theVarNames = new String[varNames.length];
		for (int i = 0; i < varNames.length; ++i)
		{
			theVarNames[i] = varNames[i];
		}
	}

	public void  setNumLats(int  numLats)
	{
		theNumLats = numLats;
	}

	public void  setLatValues(double[]  latValues)
	{
		theLatValues = new double[latValues.length];
		for (int i = 0; i < latValues.length; ++i)
		{
			theLatValues[i] = latValues[i];
		}
	}

	public void  setNumLons(int  numLons)
	{
		theNumLons = numLons;
	}

	public void  setLonValues(double[]  lonValues)
	{
		theLonValues = new double[lonValues.length];
		for (int i = 0; i < lonValues.length; ++i)
		{
			theLonValues[i] = lonValues[i];
		}
	}

	public void  setStatus(int  status)
	{
		theStatus = status;
	}

	public int  getNumVars()
	{
		return theNumVars;
	}

	public String[]  getVarNames()
	{
		return theVarNames;
	}

	public int  getNumLats()
	{
		return theNumLats;
	}

	public double[]  getLatValues()
	{
		return theLatValues;
	}

	public int  getNumLons()
	{
		return theNumLons;
	}

	public double[]  getLonValues()
	{
		return theLonValues;
	}

	public int  getStatus()
	{
		return theStatus;
	}


	/**
	 **************************************************************************
	 *
	 **************************************************************************
	 */
	public void  print()
	{
		System.out.println("************ BEGIN DataDescResponse **************");

		System.out.println("Num Vars : " + theNumVars);
		for (int i = 0; i < theVarNames.length; ++i)
		{
			System.out.println("Var Name[" + i + "]: " + theVarNames[i]);
		}

		System.out.println("Num Lats : " + theNumLats);
		for (int i = 0; i < theLatValues.length; ++i)
		{
			System.out.println("Lat Value[" + i + "]: " + theLatValues[i]);
		}

		System.out.println("Num Lons : " + theNumLons);
		for (int i = 0; i < theLonValues.length; ++i)
		{
			System.out.println("Lon Value[" + i + "]: " + theLonValues[i]);
		}

		System.out.println("Status : " + theStatus);
			
		System.out.println("************ END DataDescResponse ***************");
	}
}
