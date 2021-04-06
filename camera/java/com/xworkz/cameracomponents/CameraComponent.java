package com.xworkz.cameracomponents;

public class CameraComponent {
	
	public CameraComponent(){
		System.out.println("Obj created"+ this.getClass().getSimpleName());
	}
	
	public void toCapture(String name) {
		System.out.println("invoked toCapture");
		System.out.println("arg1: " + name);
	}
	

}
