package com.xworkz.component;

public class PowerComponent {
 private boolean on;

	public PowerComponent() {

		System.out.println("obj created for:" + this.getClass().getSimpleName());
	}

	public boolean isOn() {
		System.out.println("invoked isOn method");
		if (on) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean getOn() {
		return on;
		
	}

	public void setOn(boolean on) {
		System.out.println("invoked setOn");
		this.on = on;

	}

}
