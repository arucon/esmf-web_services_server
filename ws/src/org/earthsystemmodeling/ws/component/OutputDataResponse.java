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

package org.earthsystemmodeling.ws.component;

/**
 *****************************************************************************
 *
 *****************************************************************************
 */
public class OutputDataResponse
{
	private int			theNumVars = 0;
	private String[]	theVarNames = new String[0];
	private int			theNumLats = 0;
	private int			theNumLons = 0;
	private int			theStatus = 0;
   private double[]	theDataValues = new double[0];


	/**
	 **************************************************************************
	 *
	 **************************************************************************
	 */
	public OutputDataResponse()
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

	public void  setNumLons(int  numLons)
	{
		theNumLons = numLons;
	}

   public void  setDataValues(double[]  dataValues)
   {
		theDataValues = new double[dataValues.length];
		for (int i = 0; i < dataValues.length; ++i)
		{
			theDataValues[i] = dataValues[i];
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

	public int  getNumLons()
	{
		return theNumLons;
	}

   public double[]  getDataValues()
   {
      return theDataValues;
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
		System.out.println("*********** BEGIN OutputDataResponse *************");

		System.out.println("Num Vars : " + theNumVars);
		for (int i = 0; i < theVarNames.length; ++i)
		{
			System.out.println("Var Name[" + i + "]: " + theVarNames[i]);
		}

		System.out.println("Num Lats : " + theNumLats);
		System.out.println("Num Lons : " + theNumLons);

		for (int varNum = 0; varNum < theNumVars; ++varNum)
		{
      	for (int i = 0; i < theNumLats; ++i)
      	{
      		for (int j = 0; j < theNumLons; ++j)
      		{
         		System.out.print(theDataValues[(varNum * theNumLats * theNumLons) + ((j * theNumLats) + i)] + " ");
      		}
        		System.out.println();
      	}
        	System.out.println();
		}

		System.out.println("Status : " + theStatus);
			
		System.out.println("*********** END OutputDataResponse **************");
	}
}
