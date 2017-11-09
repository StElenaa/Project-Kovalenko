package com.company.lesson10.clothes;

public class Skirt extends Clothes implements WomanClothing {

	public Skirt(SizeClothes size, float cost, String color) {
		super(size, cost, color);
	}

	@Override
	public String clotheWoman() {
		return "����, ������ " + getSize() + " (" + getSize().getDescription() + ")" + ", ���� - " + getColor()
				+ ", ���� - " + getCost();
	}

	@Override
	public String toString() {
		return "Skirt [super.toString()=" + super.toString() + "]";
	}
}
