package com.xworkz.spring.component;

public class JailComponent {
	public JailComponent() {
		System.out.println("obj created " + this.getClass().getSimpleName());
	}
	
	
	public void noFreedomAndHope(String name) {
		System.out.println("invoked noFreedom");
		System.out.println("args: " +name );
	}

}
