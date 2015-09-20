from pysimplesoap.client import SoapClient

client = SoapClient(wsdl='http://localhost:8080/axis2/services/ESMFWebServices?wsdl',trace=True)
response = client.NewClient(ServerName="localhost")
print response



