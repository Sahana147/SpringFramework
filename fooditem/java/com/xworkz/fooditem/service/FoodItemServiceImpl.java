package com.xworkz.fooditem.service;

import com.xworkz.fooditem.entity.FoodItemEntity;
import com.xworkz.fooditem.repository.FoodItemRepository;

public class FoodItemServiceImpl implements FoodItemService {

	private FoodItemRepository foodItemRepository;

	public FoodItemServiceImpl(FoodItemRepository foodItemRepository) {
		System.out.println("obj created" + this.getClass().getSimpleName());
		this.foodItemRepository= foodItemRepository;
	}

	@Override
	public boolean validateAndSave(FoodItemEntity entity) {
		System.out.println("invoked validateAndSave" + entity);
		if (entity != null) {
			System.out.println("entity is valid");
			foodItemRepository.save(entity);

		} else {
			System.out.println("entity is null");
		}
		return false;
	}

}
