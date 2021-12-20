package com.vertraining.springcidemo.ambuigity;

public class Publisher {
	private String name;
	private String city;
	public Publisher(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Publisher [name=" + name + ", city=" + city + "]";
	}
	
	
}
