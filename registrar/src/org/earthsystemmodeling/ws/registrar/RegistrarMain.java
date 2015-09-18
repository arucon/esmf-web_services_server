package org.earthsystemmodeling.ws.registrar;


/**
 ***************************************************************************
 *
 ***************************************************************************
 */
public class RegistrarMain
{

   public static int DEFAULT_PORT = 45002;
   
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
			
			int portToUse = DEFAULT_PORT;
			if (args.length==2) {
				try {
					portToUse = Integer.parseInt(args[1]);
				}
				catch (Exception e) {
					/* ignore and use default port */
				}
			}

			System.out.println("********************************************");
			System.out.println("  Registrar");
			System.out.println("  Filename: " + filename);
			System.out.println("  Port Num: " + portToUse);
			System.out.println("********************************************");
			
			Registrar	thisRegistrar = new Registrar(portToUse, filename);
			thisRegistrar.registrationLoop();
			
		}
		catch (Exception  e)
		{
			System.err.println("ESMF Registrar Server exception:");
			e.printStackTrace();
		}
	}
}
