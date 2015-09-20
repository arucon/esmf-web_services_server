#!/bin/bash

AXIS2_SERVICES_DIR=/var/lib/tomcat7/webapps/axis2/WEB-INF/services

# clean
rm -r build

# compile web services server
ant jar.server

# copy to axis2 services directory
sudo cp build/lib/ESMFWebServices.aar $AXIS2_SERVICES_DIR

# restart tomcat
sudo service tomcat7 restart
