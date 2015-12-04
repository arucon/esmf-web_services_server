#!/bin/bash

echo "Ensuring Registrar, Process Controller, and Component Service are not already running..."
pkill -f RegistrarMain
pkill -f ESMF_WebServController
pkill -f ESMF_CoupledFlow
pkill -f wrfhydro_nuopc_app
