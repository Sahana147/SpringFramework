package com.xworkz.fooditem.entity;

import com.xworkz.fooditem.constants.FoodType;

public class FoodItemEntity {
	
	private String name;
	private int price;
	private FoodType type;
	private int quantity; 
	private int discount;
	
	public FoodItemEntity(String name, int price, FoodType type, int quantity, int discount) {
		super();
		this.name = name;
		this.price = price;
		this.type = type;
		this.quantity = quantity;
		this.discount = discount;
	}

	@Override
	public String toString() {
		return "FoodItemEntity [name=" + name + ", price=" + price + ", type=" + type + ", quantity=" + quantity
				+ ", discount=" + discount + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + discount;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + price;
		result = prime * result + quantity;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FoodItemEntity other = (FoodItemEntity) obj;
		if (discount != other.discount)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (price != other.price)
			return false;
		if (quantity != other.quantity)
			return false;
		if (type != other.type)
			return false;
		return true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public FoodType getType() {
		return type;
	}

	public void setType(FoodType type) {
		this.type = type;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}
	
	
	
	
	
	
	
	

}
