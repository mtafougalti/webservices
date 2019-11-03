package com.mt.ws.jaxws.server;

import javax.xml.ws.Endpoint;

import com.mt.ws.jaxws.server.service.PersonService;

public class WebServer {
	public static void main(String[] args) {
		System.out.println("Starting web Server ... ");
		String url = "http://localhost:9090/";
		Endpoint.publish(url, new PersonService());
		System.out.println("Web Server started. ");
	}
}
