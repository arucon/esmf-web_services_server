from pysimplesoap.client import SoapClient

#client = SoapClient(wsdl='http://localhost:8080/axis2/services/ESMFWebServicesService?wsdl',trace=False)

#response = client.NewClient(ServerName='localhost')
#newClientId = response['ClientId']
#print "new ClientId = ", newClientId

#response = client.ComponentStatus(ServerName='localhost', ClientId=newClientId)
#print response

client = SoapClient(wsdl='http://localhost:8080/axis2/services/ESMF?wsdl',trace=True)
response = client.NewModelService(app="app", compset="compset2")
print response

response = client.ListModelServices(dummy="1")
print response



