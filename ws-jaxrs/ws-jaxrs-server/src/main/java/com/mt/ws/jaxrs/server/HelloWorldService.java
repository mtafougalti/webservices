package com.mt.ws.jaxrs.server;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("/")
public class HelloWorldService {
	
	@GET
	@Path("/hello")
	public String sayHello() {
		return "Hello World !";
	}
	
	@GET
	@Path("/hola")
	public String sayHola(@QueryParam("name") String name) {
		return "Hola " + name;
	}

}
