package com.vertraining.springcidemo.autowiring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class Book {
	
	@Value("The Alchemist")
	private String name;
	
	@Value("Paulo Choelo")
	private String author;
	
	private List<String> cities;
	
	
	@Autowired
	@Qualifier("publisher2")
	private Publisher publisher;

	
	
	

	public Book() {
		
	}

	public void init() {
		System.out.println("This method will be called while creating the bean");
	}

	public void destroy() {
		System.out.println("This method will be called while destroying the bean");
	}

	
	public Book(String name, String author, List<String> cities, Publisher publisher) {
		super();
		this.name = name;
		this.author = author;
		this.cities = cities;
		this.publisher = publisher;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getAuthor() {
		return author;
	}



	public void setAuthor(String author) {
		this.author = author;
	}



	public List<String> getCities() {
		return cities;
	}



	public void setCities(List<String> cities) {
		this.cities = cities;
	}



	public Publisher getPublisher() {
		return publisher;
	}


	
	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}



	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + ", cities=" + cities + ", publisher=" + publisher + "]";
	}

	
	
	
	
	

}
