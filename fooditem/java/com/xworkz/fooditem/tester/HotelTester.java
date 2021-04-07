package com.xworkz.fooditem.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.fooditem.constants.HotelVendorType;
import com.xworkz.fooditem.entity.HotelVendorEntity;
import com.xworkz.fooditem.repository.HotelVendorRepository;
import com.xworkz.fooditem.repository.HotelVendorRepositoryImpl;
import com.xworkz.fooditem.service.HotelVendorService;
import com.xworkz.fooditem.service.HotelVendorServiceImpl;

public class HotelTester {

	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext( "injectionFile.xml");
		HotelVendorService ref = container.getBean(HotelVendorService.class);
		
		HotelVendorEntity entity = new HotelVendorEntity("sahana", "mysore", 6, 745417874f, HotelVendorType.CEREMONY);
		ref.validateAndSave(entity);
		
//		HotelVendorRepository hotelVendorRepository = new HotelVendorRepositoryImpl();
//		HotelVendorService hotelVendorService = new HotelVendorServiceImpl(hotelVendorRepository);
//		hotelVendorService.validateAndSave(entity);
	}

}
