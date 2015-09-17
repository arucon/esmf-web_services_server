#
# This requires pysimplesoap.
#
# https://github.com/pysimplesoap/pysimplesoap/releases
# sudo python setup.py install	
#
#
# If not installed, you'll need setuptools as well before installing above.
#
# https://pypi.python.org/pypi/setuptools
# Download ez_setup.py and run "python ez_setup.py"
#

pysimplesoap:
https://github.com/pysimplesoap/pysimplesoap/releases
sudo python setup.py install
from pysimplesoap.client import SoapClient

client = SoapClient(wsdl='http://localhost:8080/axis2/services/ESMFWebServicesService?wsdl',trace=False)

response = client.NewClient(ServerName='localhost')
#print response
newClientId = response['ClientId']
print "new ClientId = ", newClientId

response = client.ComponentStatus(ServerName='localhost', ClientId=newClientId)
print response



