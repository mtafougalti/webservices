# WS Server
After starting the web server you can get access to the wsdl via the following URL :

	http://localhost:9090/person?wsdl
	
To generate the skeleton :
 1- Open a window dos and go to : ../webservices/ws-jaxws-server/src/main/generated 
 2- Excute the following command on dos :
 	> wsgen -s . -wsdl ../generated -cp  ../../../bin com.mt.ws.jaxws.server.service.PersonService
 	