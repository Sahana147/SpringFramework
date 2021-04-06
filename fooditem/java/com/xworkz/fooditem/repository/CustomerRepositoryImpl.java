package com.xworkz.fooditem.repository;

import com.xworkz.fooditem.entity.CustomerEntity;

public class CustomerRepositoryImpl implements CustomerRepository {

	@Override
	public void save(CustomerEntity entity) {
		System.out.println("invoked save method of CustomerEntity"+ entity);
		
	}

}
