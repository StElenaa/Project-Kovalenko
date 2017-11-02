package com.company.lesson10.clothes;

public class TeeShirt extends Clothes implements ManClothing, WomanClothing {

	public TeeShirt(SizeClothes size, float cost, String color) {
		super(size, cost, color);
	}

	@Override
	public String clotheWoman() {
		return "Женская футболка, размер " + getSize() + " (" + getSize().getDescription() + ")" + ", цвет - "
				+ getColor() + ", цена - " + getCost();
	}

	@Override
	public String clotheMan() {
		return "Мужская футболка, размер " + getSize() + " (" + getSize().getDescription() + ")" + ", цвет - "
				+ getColor() + ", цена - " + getCost();
	}
}