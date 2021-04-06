package com.xworkz.component.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.component.WashingMachine;

public class WashingTester {

	public static void main(String[] args) {


		ApplicationContext container = new ClassPathXmlApplicationContext("injection.xml");
		WashingMachine refOfWM = container.getBean(WashingMachine.class);
		refOfWM.wash();
		
	}

	
}
