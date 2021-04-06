package com.xworkz.fooditem.service;

import com.xworkz.fooditem.entity.HotelVendorEntity;
import com.xworkz.fooditem.repository.HotelVendorRepository;

public class HotelVendorServiceImpl implements HotelVendorService {

	private HotelVendorRepository hotelVendorRepository;
	
	public HotelVendorServiceImpl(HotelVendorRepository hotelVendorRepository) {
		System.out.println("created obj" + this.getClass().getSimpleName());
		this.hotelVendorRepository= hotelVendorRepository;
	}
	
	@Override
	public boolean validateAndSave(HotelVendorEntity entity) {
		System.out.println("invoked  validateAndSave" + entity);
		if(entity != null) {
		System.out.println("entity is valid ");
		hotelVendorRepository.save(entity);
		}
		else {
			System.out.println("entity is null");
		}
		return false;
	}

}
