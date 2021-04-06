package com.xworkz.camera;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.cameracomponents.CameraComponent;

public class SpringTester {
	public static void main(String[] args) {
		
		String xmlFileName = "spring-first-step.xml";
		ApplicationContext spring = new ClassPathXmlApplicationContext(xmlFileName);
		CameraComponent refOfCameraComponenet = spring.getBean(CameraComponent.class);
		refOfCameraComponenet.toCapture("chandana");
		
		
		
		
	}

	
}
