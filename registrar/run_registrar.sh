#!/bin/bash

REGISTRAR_DATA_DIR=.

java -cp build/lib/registrar.jar:lib/xercesImpl.jar org.earthsystemmodeling.ws.registrar.RegistrarMain $REGISTRAR_DATA_DIR
