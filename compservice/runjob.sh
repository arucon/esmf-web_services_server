#!/bin/bash

#retrieve clientid from command line parameter
portNum=$1
clientId=$2
echo "clientId = $clientId"

echo "Starting coupled flow component service"
cd /home/ubuntu/web_services_server/compservice
rm -f *.ESMF_LogFile *.nc
mpirun -np 4 ./ESMF_CoupledFlow $clientId
echo "End of coupled flow component service"
