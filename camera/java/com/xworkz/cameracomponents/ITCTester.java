package com.xworkz.cameracomponents;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ITCTester {

	public static void main(String[] args) {

		ApplicationContext container = new ClassPathXmlApplicationContext("spring.xml");
		ITCProduct ref = container.getBean(ITCProduct.class);
		// ref.System.out.println(container.getEnvironment());

		System.out.println(ref.getName());
		System.out.println(ref.getType());
	}

}
