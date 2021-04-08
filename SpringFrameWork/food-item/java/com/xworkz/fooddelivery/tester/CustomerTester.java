package com.xworkz.fooddelivery.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.fooddelivery.entity.CustomerEntity;
import com.xworkz.fooddelivery.service.CustomerService;

public class CustomerTester {

	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("injection.xml");
		CustomerService service = container.getBean(CustomerService.class);
		CustomerEntity entity = new CustomerEntity("sahana", "Rajajinagar Bangalore", 5, 5421215454f,
				"sahana.xworkz@gmail.com", "female");
		service.validateAndPersist(entity);


	}

}
