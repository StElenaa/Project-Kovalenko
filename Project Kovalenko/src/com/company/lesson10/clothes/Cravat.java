package com.company.lesson10.clothes;

public class Cravat extends Clothes implements ManClothing {

	public Cravat(SizeClothes size, float cost, String color) {
		super(size, cost, color);
	}

	@Override
	public String clotheMan() {
		return "Галстук, размер " + getSize() + " (" + getSize().getDescription() + ")" + ", цвет - " + getColor()
				+ ", цена - " + getCost();
	}
}
