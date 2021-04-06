package com.xworkz.cameracomponents;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

public class ITCProduct {
	
	private String name;
	private String type;
	private String expiryDate;
	
	PropertyPlaceholderConfigurer configr= new PropertyPlaceholderConfigurer();
	
	
	public ITCProduct(String name) {
		super();
		System.out.println("obj created:"+ this.getClass().getSimpleName());
		
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	
	public String getName() {
		return name;
	}
	
	
}
