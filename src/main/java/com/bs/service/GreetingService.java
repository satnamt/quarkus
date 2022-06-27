package com.bs.service;

import javax.enterprise.context.ApplicationScoped;

import io.quarkus.logging.Log;

@ApplicationScoped
public class GreetingService {

	public String greeting(String name) {

		Log.info("Name - "+name);
		return "Hello " + name;
	}
	
}
