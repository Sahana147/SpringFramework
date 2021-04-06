package com.xworkz.spring.component.tester;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.spring.component.RocketComponent;

public class RocketTester {

	public static void main(String[] args) {
		
    String xmlFile = "rocket.xml";
    
    ApplicationContext container = new ClassPathXmlApplicationContext(xmlFile);
   // System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
    
  // RocketComponent refOfRocket =  container.getBean(RocketComponent.class);
   
  // System.out.println(refOfRocket.getCountry() + " " + refOfRocket.getFuelType());
    
	}

}
