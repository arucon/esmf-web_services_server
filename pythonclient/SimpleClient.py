from pysimplesoap.client import SoapClient

client = SoapClient(wsdl='http://localhost:8080/axis2/services/ESMFWebServicesService?wsdl',trace=False)

response = client.NewClient(ServerName='localhost')
#print response
newClientId = response['ClientId']
print "new ClientId = ", newClientId

response = client.ComponentStatus(ServerName='localhost', ClientId=newClientId)
print response



