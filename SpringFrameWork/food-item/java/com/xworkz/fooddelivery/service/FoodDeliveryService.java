package com.xworkz.fooddelivery.service;

import com.xworkz.fooddelivery.entity.FoodItemEntity;

public interface FoodDeliveryService {
	boolean validateAndSave(FoodItemEntity entity);

}
