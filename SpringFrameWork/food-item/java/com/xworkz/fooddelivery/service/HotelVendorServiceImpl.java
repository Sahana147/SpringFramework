package com.xworkz.fooddelivery.service;

import com.xworkz.fooddelivery.entity.HotelVendorEntity;
import com.xworkz.fooddelivery.repository.HotelVendorRepository;

public class HotelVendorServiceImpl implements HotelVendorService {

	
	private HotelVendorRepository hotelVendorRepository;

	public HotelVendorServiceImpl(HotelVendorRepository hotelVendorRepository) {
		System.out.println("created "+this.getClass().getSimpleName());
		this.hotelVendorRepository=hotelVendorRepository;
	}

	@Override
	public boolean ValidateAndSave(HotelVendorEntity entity) {
		System.out.println("Invoked save");
		if(entity!=null) {
			System.out.println("entity is not null");
			this.hotelVendorRepository.save(entity);
		}
		return false;
		
	}

}
