package org.earthsystemmodeling.ws.registrar;


/**
 ***************************************************************************
 *
 ***************************************************************************
 */
public class RegistrarMain
{

   /**
    ************************************************************************
    *
    ************************************************************************
    */
	public RegistrarMain()
	{
	}


   /**
    ************************************************************************
    *
    ************************************************************************
    */
	public static void  main(String[]  args)
	{
		try
		{
         if (args.length < 1)
			{
				System.out.println(
					"Make sure to specify a directory for the registrants.xml file");
				System.exit(1);
			}

			String		filename = args[0] + "/registrants.xml";

			System.out.println("********************************************");
			System.out.println("  Registrar");
         System.out.println("  Filename: " + filename);
         System.out.println("  Port Num: " + 45002);
			System.out.println("********************************************");
			Registrar	thisRegistrar = new Registrar(45002, filename);

			thisRegistrar.registrationLoop();
		}
		catch (Exception  e)
		{
			System.err.println("ESMF Registrar Server exception:");
			e.printStackTrace();
		}
	}
}
