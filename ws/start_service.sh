#!/bin/bash

WSROOT=/home/ubuntu/web_services_server
ESMFBIN=/home/ubuntu/ESMF-INSTALLS/latest/bin

# ESMF Coupled Flow Service
#COMP_SERVICE_DIR=$WSROOT/compservice
#COMP_SERVICE_SCRIPT=runjob.sh

# WRF-Hydro Service
COMP_SERVICE_DIR=/home/ubuntu/WRFHYDRO/CPL/NUOPC_cpl/run
COMP_SERVICE_SCRIPT=runjob.sh

$WSROOT/ws/stop_service.sh
sleep 3

#sudo hostname localhost

cd $WSROOT/ws
source set_env.sh

cd $WSROOT/ws
./run_registrar.sh &

cd $ESMFBIN
./ESMF_WebServController 27071 localhost 45002 $COMP_SERVICE_DIR $COMP_SERVICE_SCRIPT &
