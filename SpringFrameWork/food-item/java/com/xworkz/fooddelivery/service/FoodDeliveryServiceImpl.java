package com.xworkz.fooddelivery.service;

import com.xworkz.fooddelivery.entity.FoodItemEntity;
import com.xworkz.fooddelivery.repository.FoodItemRepository;

public class FoodDeliveryServiceImpl implements FoodDeliveryService {

	
		private FoodItemRepository foodItemRepository;
		
		public FoodDeliveryServiceImpl(FoodItemRepository foodItemRepository) {
			System.out.println("created "+this.getClass().getSimpleName());
			this.foodItemRepository=foodItemRepository;
		}

		@Override
		public boolean validateAndSave(FoodItemEntity entity) {
			System.out.println("Invoked validateAndSave");
			if(entity!=null) {
				System.out.println("entity is not null so valid all fields");
				this.foodItemRepository.save(entity);
				
			}else {
				System.out.println("entity is null");
			}
		return false;
	}

}
