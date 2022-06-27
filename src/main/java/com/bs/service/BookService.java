package com.bs.service;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import com.bs.entity.Book;
import com.bs.repository.BookRepository;

@ApplicationScoped
public class BookService {

	@Inject
	BookRepository repository;
	
	public void add(List<Book> books) {
		repository.persist(books);
	}

	public Book findById(Long id) {
		return repository.findById(id);
	}

	public List<Book> findAll() {
		return repository.findAll().list();
	}

	
}
