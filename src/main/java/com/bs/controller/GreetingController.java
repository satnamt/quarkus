package com.bs.controller;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.bs.service.GreetingService;

@Path("/greeting")
public class GreetingController {

	@Inject
	private GreetingService service;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/hello")
    public String hello() {
        return "Hello from RESTEasy Reactive!";
    }
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/{name}")
    public String greeting(String name) {
        return service.greeting(name);
    }
    
}
