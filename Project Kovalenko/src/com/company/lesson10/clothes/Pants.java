package com.company.lesson10.clothes;

public class Pants extends Clothes implements ManClothing, WomanClothing {

	public Pants(SizeClothes size, float cost, String color) {
		super(size, cost, color);
	}

	@Override
	public String clotheWoman() {
		return "Женские штаны, размер " + getSize() + " (" + getSize().getDescription() + ")" + ", цвет - " + getColor()
				+ ", цена - " + getCost();
	}

	@Override
	public String clotheMan() {
		return "Мужские штаны, размер " + getSize() + " (" + getSize().getDescription() + ")" + ", цвет - " + getColor()
				+ ", цена - " + getCost();
	}

	@Override
	public String toString() {
		return "Pants [super.toString()=" + super.toString() + "]";
	}
}
