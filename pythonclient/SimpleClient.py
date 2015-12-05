from pysimplesoap.client import SoapClient
import time

#client = SoapClient(wsdl='http://localhost:8080/axis2/services/ESMFWebServices?wsdl',trace=False)
client = SoapClient(wsdl='http://52.21.215.244:8080/axis2/services/ESMFWebServices?wsdl',trace=False)

response = client.NewClient(ServerName="localhost") 
print response
print "ClientID = " + response['ClientId']
ID = response['ClientId']

print "Sleeping for 5 seconds...."
time.sleep(5)

print "Initializing component..."
response = client.InitComponent(ServerName="localhost", ClientId=ID)
print response

#for i in range(10):
#    print "Updating status..."
#    response = client.ComponentStatus(ServerName="localhost", ClientId=ID)
#    print response
#    time.sleep(1)

print "Sleeping for 5 seconds...."
time.sleep(5)

print "Running component..."
response = client.RunComponent(ServerName="localhost", ClientId=ID)
print response

print "Sleeping for 10 seconds...."
time.sleep(10)

print "Finalizing component..."
response = client.FinalizeComponent(ServerName="localhost", ClientId=ID)
print response

print "Sleeping for 5 seconds...."
time.sleep(5)

print "Ending session..."
response = client.EndClient(ServerName="localhost", ClientId=ID)
print response






