package com.xworkz.fooditem.repository;

import com.xworkz.fooditem.entity.FoodItemEntity;

public class FoodItemRepositoryImpl implements FoodItemRepository {

	@Override
	public void save(FoodItemEntity entity) {
		System.out.println("invoked save method of FoodItemEntity" + entity);
		
		
	}

}
