package com.xworkz.fooditem.tester;

import com.xworkz.fooditem.entity.CustomerEntity;
import com.xworkz.fooditem.repository.CustomerRepository;
import com.xworkz.fooditem.repository.CustomerRepositoryImpl;
import com.xworkz.fooditem.service.CustomerService;
import com.xworkz.fooditem.service.CustomerServiceImpl;

public class CustomerTester {

	public static void main(String[] args) {
		
		CustomerEntity entity = new CustomerEntity("sahana", "Rajajinagar Bangalore", 5, 5421215454f,
				"sahana.xworkz@gmail.com", "female");
		CustomerRepository customerRepository = new CustomerRepositoryImpl();
		CustomerService customer = new CustomerServiceImpl(customerRepository);
		customer.validateAndSave(entity);
	}

}
