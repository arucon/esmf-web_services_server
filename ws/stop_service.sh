#!/bin/bash

WSROOT=/home/ubuntu/web_services_server
ESMFBIN=/home/ubuntu/ESMF-INSTALLS/latest/bin

echo "Killing Registrar and Process Controller"
pkill -f RegistrarMain
pkill -f ESMF_WebServController


