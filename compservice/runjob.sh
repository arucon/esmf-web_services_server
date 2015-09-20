#!/bin/bash

echo "Starting coupled flow component service"
cd /home/rocky/esmf-web_services_server/compservice
mpirun -np 4 ./ESMF_CoupledFlow
echo "End of coupled flow component service"
