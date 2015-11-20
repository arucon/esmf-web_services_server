from pysimplesoap.client import SoapClient
import time

client = SoapClient(wsdl='http://localhost:8080/axis2/services/ESMFWebServices?wsdl',trace=False)

response = client.NewClient(ServerName="localhost") 
print response
print "ClientID = " + response['ClientId']
ID = response['ClientId']

print "Sleeping for 5 seconds...."
time.sleep(5)

response = client.InitComponent(ServerName="localhost", ClientId=ID)
print response


print "Sleeping for 5 seconds...."
time.sleep(5)

response = client.RunComponent(ServerName="localhost", ClientId=ID)
print response


print "Sleeping for 10 seconds...."
time.sleep(10)

response = client.FinalizeComponent(ServerName="localhost", ClientId=ID)
print response

print "Sleeping for 5 seconds...."
time.sleep(5)

response = client.EndClient(ServerName="localhost", ClientId=ID)
print response


#response = client.SetInputData(ServerName="localhost",ClientId = ID)
#response = client.GetOutputData(ServerName="localhost",ClientId = ID)




