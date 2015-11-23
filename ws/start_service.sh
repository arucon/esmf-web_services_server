#!/bin/bash

WSROOT=/home/ubuntu/web_services_server
ESMFBIN=/home/ubuntu/ESMF-INSTALLS/latest/bin

./stop_service.sh
sleep 5

cd $WSROOT/ws
source set_env.sh

cd $WSROOT/compservice
make dust

cd $WSROOT/ws
./run_registrar.sh &

cd $ESMFBIN
./ESMF_WebServController 27071 localhost 45002 $WSROOT/compservice runjob.sh &
