package com.xworkz.fooditem.tester;

import com.xworkz.fooditem.constants.FoodType;
import com.xworkz.fooditem.entity.FoodItemEntity;
import com.xworkz.fooditem.repository.FoodItemRepository;
import com.xworkz.fooditem.repository.FoodItemRepositoryImpl;
import com.xworkz.fooditem.service.FoodItemService;
import com.xworkz.fooditem.service.FoodItemServiceImpl;

public class FoodTester {

	public static void main(String[] args) {

		FoodItemEntity entity = new FoodItemEntity("Dosa", 50, FoodType.SOUTHINDIAN, 2, 20);
		FoodItemRepository repo = new FoodItemRepositoryImpl();

		FoodItemService service = new FoodItemServiceImpl(repo);
		service.validateAndSave(entity);

	}

}
