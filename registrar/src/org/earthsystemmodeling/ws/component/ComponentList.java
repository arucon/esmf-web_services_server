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

package org.earthsystemmodeling.ws.component;

import java.util.Vector;


/**
 *****************************************************************************
 *
 *****************************************************************************
 */
public class ComponentList
{
	private Vector<Component>		theComponents = new Vector<Component>();


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
	public void  removeComponent(String  clientId)
	{
		int	index = findComponentIndex(clientId);

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
	public Component  findComponent(String  clientId)
	{
		Component	foundComponent = null;
		int			i = 0;

		while ((foundComponent == null)  &&  (i < theComponents.size()))
		{
			Component	thisComponent = theComponents.elementAt(i);

			if (thisComponent.getClientId().equals(clientId))
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
	public int  findComponentIndex(String  clientId)
	{
		Component	foundComponent = null;
		int			i = 0;

		while ((foundComponent == null)  &&  (i < theComponents.size()))
		{
			Component	thisComponent = theComponents.elementAt(i);

			if (thisComponent.getClientId().equals(clientId))
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
   public void  removeComponent(Component  thisComponent)
   {
      int   index = findComponentIndex(thisComponent);

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
      Component   foundComponent = null;
      int         i = 0;

      while ((foundComponent == null)  &&  (i < theComponents.size()))
      {
         Component   thisComponent = theComponents.elementAt(i);

         if (thisComponent.getClientId().equals(findComponent.getClientId()))
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
      Component   foundComponent = null;
      int         i = 0;

      while ((foundComponent == null)  &&  (i < theComponents.size()))
      {
         Component   thisComponent = theComponents.elementAt(i);

         if (thisComponent.getClientId().equals(findComponent.getClientId()))
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
