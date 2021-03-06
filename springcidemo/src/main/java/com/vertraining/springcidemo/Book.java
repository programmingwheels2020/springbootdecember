package com.vertraining.springcidemo;

import java.util.List;

public class Book {
	
	private String name;
	private String author;
	
	private List<String> cities;

	public Book(String name, String author, List<String> cities) {
		super();
		this.name = name;
		this.author = author;
		this.cities = cities;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + ", cities=" + cities + "]";
	}
	
	
	
	

}
