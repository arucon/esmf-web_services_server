from pysimplesoap.client import SoapClient

client = SoapClient(wsdl='http://localhost:8080/axis2/services/ESMFWebServices?wsdl',trace=True)
#response1 = client.NewClient(ServerName="localhost") 
ID = '101' 
response2 = client.InitComponent(ServerName="localhost",ClientId = ID)
#response3 = client.RunComponent(ServerName="localhost",ClientId = ID)
#response4 = client.SetInputData(ServerName="localhost",ClientId = ID)
#response5 = client.GetOutputData(ServerName="localhost",ClientId = ID)
#response6 = client.FinalizeComponent(ServerName="localhost",ClientId = ID)
#response7 = client.EndClient(ServerName="localhost",ClientId = ID)
#ComponentStatusRequests
#InitComponentRequest
#RunComponentRequest
#####during run###
#SetInputDataRequest
#GetOutputDataRequest
#FinalizeComponentRequest
#response = client.ListServers(RegistrarHostName="localhost")
#print 'Yun Test 1'

#print response1
print response2
#print response3
#print response4
#print response5
#print response6
#print response7




