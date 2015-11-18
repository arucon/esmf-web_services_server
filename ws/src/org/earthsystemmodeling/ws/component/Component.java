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

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 *****************************************************************************
 *
 *****************************************************************************
 */
public class Component
{
	private String          theClientId = "";
	private String          theJobId = "";
	private String			theHostName = "";
	private String			thePortNum = "";
	private String			theName = "";
	private String			theDescription = "";
	private String          thePhysicalHostName = "";
	private String          theCurrentState = "";


	/**
	 **************************************************************************
	 *
	 **************************************************************************
	 */
	private static Log log = LogFactory.getLog(Component.class);
	public Component()
	{
         	log.info("Instantiating Component object");
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
		log.info("setClientId");
	}


	/**
	 **************************************************************************
	 *
	 **************************************************************************
	 */
	public void  setJobId(String  jobId)
	{
		theJobId = jobId;
		log.info("setJobId");
	}


	/**
	 **************************************************************************
	 *
	 **************************************************************************
	 */
	public void  setHostName(String  hostName)
	{
		theHostName = hostName;
		log.info("setHostName");
	}


	/**
	 **************************************************************************
	 *
	 **************************************************************************
	 */
	public void  setPortNum(String  portNum)
	{
		thePortNum = portNum;
		log.info("setPortNum");
	}


	/**
	 **************************************************************************
	 *
	 **************************************************************************
	 */
	public void  setName(String  name)
	{
		theName = name;
		log.info("setName");
	}


	/**
	 **************************************************************************
	 *
	 **************************************************************************
	 */
	public void  setDescription(String  description)
	{
		theDescription = description;
		log.info("setDescription");
	}


	/**
	 **************************************************************************
	 *
	 **************************************************************************
	 */
	public void  setPhysicalHostName(String  hostName)
	{
		thePhysicalHostName = hostName;
		log.info("setPhysicalHostName");
	}


	/**
	 **************************************************************************
	 *
	 **************************************************************************
	 */
	public void  setCurrentState(String  state)
	{
		theCurrentState = state;
		log.info("setCurrentState");
	}


	/**
	 **************************************************************************
	 *
	 **************************************************************************
	 */
	public String  getClientId()
	{
		log.info("theClientId: " + theClientId );
		return theClientId;
	}


	/**
	 **************************************************************************
	 *
	 **************************************************************************
	 */
	public String  getJobId()
	{
		log.info("JobId: " + theJobId );
		return theJobId;
	}


	/**
	 **************************************************************************
	 *
	 **************************************************************************
	 */
	public String  getHostName()
	{
		log.info("theHostName: " + theHostName );
		return theHostName;
	}


	/**
	 **************************************************************************
	 *
	 **************************************************************************
	 */
	public String  getPortNum()
	{
		log.info("thePortNum: " + thePortNum );
		return thePortNum;

	}


	/**
	 **************************************************************************
	 *
	 **************************************************************************
	 */
	public String  getName()
	{
		log.info("theName: " + theName );
		return theName;

	}


	/**
	 **************************************************************************
	 *
	 **************************************************************************
	 */
	public String  getDescription()
	{
		log.info("theDescription: " + theDescription );
		return theDescription;

	}


	/**
	 **************************************************************************
	 *
	 **************************************************************************
	 */
	public String  getPhysicalHostName()
	{
		log.info("thePhysicalHostName: " + thePhysicalHostName );
		return thePhysicalHostName;

	}


	/**
	 **************************************************************************
	 *
	 **************************************************************************
	 */
	public String  getCurrentState()
	{
		log.info("theCurrentState: " + theCurrentState );
		return theCurrentState;

	}


	/**
	 **************************************************************************
	 *
	 **************************************************************************
	 */
	public void  print()
	{
		log.info("************** BEGIN Component *****************");
		log.info("Client ID     : " + theClientId);
		log.info("Job ID        : " + theJobId);
		log.info("Host Name     : " + theHostName);
		log.info("Port Num      : " + thePortNum);
		log.info("Name          : " + theName);
		log.info("Description   : " + theDescription);
		log.info("Physical Host : " + thePhysicalHostName);
		log.info("Current State : " + theCurrentState);
		log.info("************** END Component *****************");
	}
}
