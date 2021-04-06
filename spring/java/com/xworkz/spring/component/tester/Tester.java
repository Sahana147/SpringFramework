package com.xworkz.spring.component.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.spring.component.CameraComponent;
import com.xworkz.spring.component.JailComponent;

public class Tester {

	public static void main(String[] args) {
		
		String firstXmlFile = "first.xml";
		String secondXmlFile = "second.xml";
		
		ApplicationContext container = new ClassPathXmlApplicationContext(firstXmlFile);
		ApplicationContext container2 = new ClassPathXmlApplicationContext(secondXmlFile);
		
		JailComponent refOfJailComponent = container.getBean("jailComponent1",JailComponent.class);
		
		CameraComponent refOfCameraComponent = container2.getBean(CameraComponent.class);
		
		System.out.println(container.getBeanDefinitionCount());
		
		refOfJailComponent.noFreedomAndHope("Sahana");
		
		refOfCameraComponent.toCreateApp("chandana");
		
		
	}

}
