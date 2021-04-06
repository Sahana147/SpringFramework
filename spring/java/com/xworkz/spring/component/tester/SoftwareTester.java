package com.xworkz.spring.component.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.spring.component.SoftwareComponent;

public class SoftwareTester {

	public static void main(String[] args) {
		
		String xmlFile = "software.xml";
		
		ApplicationContext container = new ClassPathXmlApplicationContext(xmlFile);
		
		SoftwareComponent refOfSoftwarecomponent1 = container.getBean(SoftwareComponent.class);
		
		SoftwareComponent refOfSoftwarecomponent2 =container.getBean("softwareComponent1", SoftwareComponent.class);
		
		System.out.println(refOfSoftwarecomponent2.getType());
		
		System.out.println(refOfSoftwarecomponent2.getVersion());
		
		
	}

}
