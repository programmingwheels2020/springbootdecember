package com.vertraining.springcidemo.javaconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;



@Component
public class Publisher {
	
	@Value("XYZ Publisher")
	private String name;
	
	@Value("Trivandrum")
	private String city;
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	@Override
	public String toString() {
		return "Publisher [name=" + name + ", city=" + city + "]";
	}
	
	
}
