package com.xworkz.component;

public class WashingMachine {

	 String companyName;
	 float capacity;
	 PowerComponent power;
	 MotorComponent motor;

	public WashingMachine(String  companyName, float capacity, PowerComponent power, MotorComponent motor ) {
		System.out.println("obj created:" + this.getClass().getSimpleName());
		this.companyName = companyName;
		this.capacity = capacity;
		this.power = power;
		this.motor = motor;

	}

	public Boolean wash() {
		System.out.println("invoked wash method");
		if (this.power.isOn()) {
			this.motor.rotate();

		}
		return true;
	}

//	public void setPower(PowerComponent power) {
//		this.power = power;
//
//	}
//
//	public void setMotor(MotorComponent motor) {
//		this.motor = motor;
//	}

}
