package com.vertraining.springcidemo.ambuigity;

import java.util.List;

public class Book {
	
	private String name;
	private String author;
	
	private List<String> cities;
	
	private Publisher publisher;

	public Book(String name, String author, List<String> cities, Publisher publisher) {
		super();
		this.name = name;
		this.author = author;
		this.cities = cities;
		this.publisher = publisher;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + ", cities=" + cities + ", publisher=" + publisher + "]";
	}

	
	
	
	
	

}
