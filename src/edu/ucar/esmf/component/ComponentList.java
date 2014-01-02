//***************************************************************************
//
// $Id$
//
// Earth System Modeling Framework
// Copyright 2002-2014, University Corporation for Atmospheric Research,
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
public class ComponentList
{
	private Vector<Component>		theComponents = new Vector<Component>();
	private boolean					theAllowDupNamesFlag = false;


	/**
	 **************************************************************************
	 *
	 **************************************************************************
	 */
	public ComponentList()
	{
	}


	/**
	 **************************************************************************
	 *
	 **************************************************************************
	 */
	public ComponentList(boolean  allowDupNames)
	{
		theAllowDupNamesFlag = allowDupNames;
	}


	/**
	 **************************************************************************
	 *
	 **************************************************************************
	 */
	public void  addComponent(Component  thisComponent)
	{
		if (findComponent(thisComponent) == null)
		{
			theComponents.addElement(thisComponent);
		}
	}


	/**
	 **************************************************************************
	 *
	 **************************************************************************
	 */
	public void  removeComponent(Component  thisComponent)
	{
		int	index = findComponentIndex(thisComponent);

		if (index >= 0)
		{
			theComponents.removeElementAt(index);
		}
	}


	/**
	 **************************************************************************
	 *
	 **************************************************************************
	 */
	public Component  findComponent(Component  findComponent)
	{
		Component	foundComponent = null;
		int			i = 0;

		while ((foundComponent == null)  &&  (i < theComponents.size()))
		{
			Component	thisComponent = theComponents.elementAt(i);

			if (theAllowDupNamesFlag  &&
			    (thisComponent.getName().equals(findComponent.getName())))
			{
				foundComponent = thisComponent;
			}
			else if (thisComponent.getName().equals(findComponent.getName())  &&
			    thisComponent.getHostName().equals(findComponent.getHostName()) &&
			    (thisComponent.getPortNum() == findComponent.getPortNum()))
			{
				foundComponent = thisComponent;
			}
			else
			{
				++i;
			}
		}

		return foundComponent;
	}


	/**
	 **************************************************************************
	 *
	 **************************************************************************
	 */
	public int  findComponentIndex(Component  findComponent)
	{
		Component	foundComponent = null;
		int			i = 0;

		while ((foundComponent == null)  &&  (i < theComponents.size()))
		{
			Component	thisComponent = theComponents.elementAt(i);

			if (theAllowDupNamesFlag  &&
			    (thisComponent.getName().equals(findComponent.getName())))
			{
				foundComponent = thisComponent;
			}
			else if (thisComponent.getName().equals(findComponent.getName())  &&
			    thisComponent.getHostName().equals(findComponent.getHostName()) &&
			    (thisComponent.getPortNum() == findComponent.getPortNum()))
			{
				foundComponent = thisComponent;
			}
			else
			{
				++i;
			}
		}

		if (foundComponent != null)
		{
			return i;
		}
		else
		{
			return -1;
		}
	}


	/**
	 **************************************************************************
	 *
	 **************************************************************************
	 */
	public Component  findComponentByName(String  componentName)
	{
		Component	foundComponent = null;
		int			i = 0;

		while ((foundComponent == null)  &&  (i < theComponents.size()))
		{
			Component	thisComponent = theComponents.elementAt(i);

			if (thisComponent.getName().equals(componentName))
			{
				foundComponent = thisComponent;
			}
			else
			{
				++i;
			}
		}

		return foundComponent;
	}


	/**
	 **************************************************************************
	 *
	 **************************************************************************
	 */
	public Vector<Component>  components()
	{
		return theComponents;
	}


	/**
	 **************************************************************************
	 *
	 **************************************************************************
	 */
	public void  print()
	{
		System.out.println("************ BEGIN ComponentList ***************");
		System.out.println("Number of components: " + theComponents.size());
		for (int i = 0; i < theComponents.size(); ++i)
		{
			Component	thisComponent = theComponents.elementAt(i);
			thisComponent.print();
		}
		System.out.println("************  END ComponentList  ***************");
	}
}
