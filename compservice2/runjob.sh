#!/bin/bash

echo "Starting coupled flow component service"
cd /home/yun/esmf-web_services_server2/compservice
mpirun -np 4 ./ESMF_CoupledFlow
echo "End of coupled flow component service"