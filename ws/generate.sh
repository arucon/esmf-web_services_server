#!/bin/bash

rm -r resources
$AXIS2_HOME/bin/wsdl2java.sh -uri ESMF.wsdl -ss -sd -ssi -or
