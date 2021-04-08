package com.xworkz.fooddelivery.service;

import com.xworkz.fooddelivery.entity.CustomerEntity;
import com.xworkz.fooddelivery.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository;

	public CustomerServiceImpl(CustomerRepository customerRepo) {
		System.out.println("created " + this.getClass().getSimpleName());
		this.customerRepository = customerRepo;
	}

	@Override
	public boolean validateAndPersist(CustomerEntity entity) {
		System.out.println("Invoked validateAndPersist");
		if (entity != null) {
			System.out.println("entity is not null");
			System.out.println("entity:" + entity);
			this.customerRepository.persist(entity);
		}

		return false;
	}

}
