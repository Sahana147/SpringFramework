package com.xworkz.spring.component;

public class CameraComponent {
	public CameraComponent() {
		System.out.println("obj created " + this.getClass().getSimpleName());

	}

	public void toCreateApp(String name) {
		System.out.println("invoked toCreateApp");
		System.out.println("arg1: " + name);
	}

}
