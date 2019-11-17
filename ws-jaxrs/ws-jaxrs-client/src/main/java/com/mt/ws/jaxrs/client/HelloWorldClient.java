package com.mt.ws.jaxrs.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;

public class HelloWorldClient {

	private final static String BASE_URI = "http://localhost:8080/ws-jaxrs-server/rest";

	public static void main(String[] args) {

		Client client = ClientBuilder.newClient();

		String hello = client.target(BASE_URI + "/hello").request(MediaType.TEXT_PLAIN).get(String.class);

		System.out.println("Message received : " + hello);

		String hola = client.target(BASE_URI + "/hola").queryParam("name", "Mostafa").request(MediaType.TEXT_PLAIN).get(String.class);

		System.out.println("Message received : " + hola);

	}

}
