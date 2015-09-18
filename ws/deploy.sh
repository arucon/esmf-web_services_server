#!/bin/bash

# clean up
rm -r build

# compile web services server
ant jar.server

# copy to axis2 services directory
sudo cp build/lib/ESMF.aar /var/lib/tomcat7/webapps/axis2/WEB-INF/services

# restart tomcat
sudo service tomcat7 restart
