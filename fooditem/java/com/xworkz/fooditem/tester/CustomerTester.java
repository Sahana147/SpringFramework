package com.xworkz.fooditem.tester;

import java.applet.AppletContext;

import org.omg.CORBA.portable.ApplicationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.fooditem.entity.CustomerEntity;
import com.xworkz.fooditem.repository.CustomerRepository;
import com.xworkz.fooditem.repository.CustomerRepositoryImpl;
import com.xworkz.fooditem.service.CustomerService;
import com.xworkz.fooditem.service.CustomerServiceImpl;

public class CustomerTester {

	public static void main(String[] args) {
		
		ApplicationContext container = new ClassPathXmlApplicationContext("injectionFile.xml");
		CustomerService ref  = container.getBean(CustomerService.class);
		CustomerEntity entity = new CustomerEntity("sahana", "Rajajinagar Bangalore", 5, 5421215454f,
				"sahana.xworkz@gmail.com", "female");
		ref.validateAndSave(entity);
		
		
		//CustomerRepository customerRepository = new CustomerRepositoryImpl();
		//CustomerService customer = new CustomerServiceImpl(customerRepository);
		//customer.validateAndSave(entity);
				
	}

}
