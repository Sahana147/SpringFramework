package com.xworkz.fooditem.repository;

import com.xworkz.fooditem.entity.HotelVendorEntity;

public class HotelVendorRepositoryImpl implements HotelVendorRepository {

	@Override
	public void save(HotelVendorEntity entity) {
		System.out.println("invoked save method of HotelVendorEntity" + entity);		
	}

}
