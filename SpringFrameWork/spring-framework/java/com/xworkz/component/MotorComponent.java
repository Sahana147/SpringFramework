package com.xworkz.component;

public class MotorComponent {

	private int warrentyPeriod;

	public MotorComponent() {
		System.out.println("obj created for:" + this.getClass().getSimpleName());
	}

	public void rotate() {
		System.out.println("job of the motor is to rotate all the time ");
	}

	public void setWarrentyPeriod(int warrentyPeriod) {
		System.out.println("invoked warrentyPeriod");
		this.warrentyPeriod = warrentyPeriod;

	}

}
