package com.xworkz.spring.component;

public class RocketComponent {

	private String fuelType;

	private String country;

	public RocketComponent(String fuelType, String country) {
		System.out.println("object created for " + this.getClass().getSimpleName());
		System.out.println("invoked fueltype:"+ fuelType);
		System.out.println("invoked country:"+ country );
		this.fuelType = fuelType;
		this.country = country;
	}

	public String getFuelType() {
		return fuelType;
	}

	public String getCountry() {
		return country;
	}

}
