package com.bs.repository;

import javax.enterprise.context.ApplicationScoped;

import com.bs.entity.Book;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class BookRepository implements PanacheRepository<Book> {

	
}
