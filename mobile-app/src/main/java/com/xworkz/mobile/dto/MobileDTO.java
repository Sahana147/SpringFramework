package com.xworkz.mobile.dto;

public class MobileDTO {
	
	private String mobileName;
	private String mobileBrand;
	private int ram;
	private double cost;

	public MobileDTO() {
		System.out.println(this.getClass().getSimpleName() + "objected created ");
	}

	public MobileDTO(String mobileName, String mobileBrand, int ram, double cost) {
		super();
		this.mobileName = mobileName;
		this.mobileBrand = mobileBrand;
		this.ram = ram;
		this.cost = cost;
	}

	public String getMobileName() {
		return mobileName;
	}

	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}

	public String getMobileBrand() {
		return mobileBrand;
	}

	public void setMobileBrand(String mobileBrand) {
		this.mobileBrand = mobileBrand;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "MobileDTO [mobileName=" + mobileName + ", mobileBrand=" + mobileBrand + ", ram=" + ram + ", cost="
				+ cost + "]";
	}

}
