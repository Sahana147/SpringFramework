package com.xworkz.fooddelivery.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.fooddelivery.constants.HotelVendorType;
import com.xworkz.fooddelivery.entity.HotelVendorEntity;
import com.xworkz.fooddelivery.service.HotelVendorService;

public class HotelTester {

	public static void main(String[] args) {
		
		HotelVendorEntity entity = new HotelVendorEntity("sahana", "mysore", 6, 745417874f, HotelVendorType.CEREMONY);

		ApplicationContext conatainer=new ClassPathXmlApplicationContext("application.xml");
		HotelVendorService ref=conatainer.getBean(HotelVendorService.class);
		ref.ValidateAndSave(entity);

	}

}
