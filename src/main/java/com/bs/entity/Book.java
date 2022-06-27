package com.bs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_book", schema = "demo")
public class Book{

	@javax.persistence.Id
	@SequenceGenerator(name = "book_sequence", sequenceName = "demo.book_sequence", allocationSize = 1, initialValue = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "book_sequence")
	@Column(name = "id")
	private Long Id;
	
	@Column(name = "name")
	private String Name;
	
	@Column(name = "description")
	private String Description;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}
	
}
