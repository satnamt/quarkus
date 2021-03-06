package com.bs.controller;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.bs.entity.Book;
import com.bs.service.BookService;

@Path("/books")
public class BookController {
	
	@Inject
	private BookService service;
	
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<Book> list() {
        return service.findAll();
    }
	
    @POST
    @Transactional
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public List<Book> add(List<Book> books) {
    	
    	books.stream().forEach(book -> {
    		if(book.getId() != null) {
    			book.setId(null); // AutoGenerated
    		}
    	});
    	
    	service.add(books);
        return service.findAll();
    }
    
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Book get(@PathParam("id") Long id) {
    	return service.findById(id);
    }

}
