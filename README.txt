//***
// Generate the code based on the wsdl file
//***
% $AXIS2_HOME/bin/wsdl2java.sh -uri ESMFWebServices.wsdl -p edu.ucar.axis2.esmfwebservices -d adb -s -wv 1.5 -ss -sd

//***
// Build the server (just to make sure it worked)
//***
% ant jar.server

//***
// Build the server 
//***
% ant jar.server

//***
// Copy the build to the axis services directory to make it available via
// the internet
//***
% cp build/lib/ESMFWebServicesService.aar $CATALINA_HOME/webapps/axis2/WEB-INF/services/
