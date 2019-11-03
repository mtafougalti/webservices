package com.mt.ws.jaxws.client;

import com.mt.ws.jaxws.server.service.Person;
import com.mt.ws.jaxws.server.service.PersonService;

public class WebClient {
	public static void main(String[] args) {
		System.out.println("Starting Client ws ... ");
		PersonService personService = new Person().getPersonServicePort();
		System.out.println(personService.test());
		System.out.println("Client started. ");
	}
}
