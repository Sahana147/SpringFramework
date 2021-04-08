package com.xworkz.fooddelivery.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.fooddelivery.constants.FoodType;
import com.xworkz.fooddelivery.entity.FoodItemEntity;
import com.xworkz.fooddelivery.service.FoodDeliveryService;

public class FoodDeliveryTester {

	public static void main(String[] args) {

		FoodItemEntity entity = new FoodItemEntity("Dosa", 50, FoodType.SOUTHINDIAN, 2, 20);
		ApplicationContext container = new ClassPathXmlApplicationContext("application.xml");
		FoodDeliveryService service = container.getBean(FoodDeliveryService.class);
		service.validateAndSave(entity);
	}

}
