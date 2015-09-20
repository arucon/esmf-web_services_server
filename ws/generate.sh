#!/bin/bash

rm -r resources
$AXIS2_HOME/bin/wsdl2java.sh -uri ESMFWebServices.wsdl -ss -sd -ssi -or
