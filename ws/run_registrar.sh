#!/bin/bash

REGISTRAR_DATA_DIR=.
REGISTRAR_PORT=45002

#$AXIS2_HOME/lib/commons-logging-1.1.1.jar 
java -cp build/lib/registrar.jar:lib/xercesImpl.jar:lib/commons-logging-1.1.1.jar  org.earthsystemmodeling.ws.registrar.RegistrarMain $REGISTRAR_DATA_DIR $REGISTRAR_PORT

