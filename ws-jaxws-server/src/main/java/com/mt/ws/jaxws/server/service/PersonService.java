package com.mt.ws.jaxws.server.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(serviceName="person")
public class PersonService {
	
	@WebMethod(operationName="test")
	public String test() {
		return "OK";
	}

}
