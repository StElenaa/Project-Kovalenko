package com.company.lesson10.clothes;

public class Pants extends Clothes implements ManClothing, WomanClothing {

	public Pants(SizeClothes size, float cost, String color) {
		super(size, cost, color);
	}

	@Override
	public String clotheWoman() {
		return "������� �����, ������ " + getSize() + " (" + getSize().getDescription() + ")" + ", ���� - " + getColor()
				+ ", ���� - " + getCost();
	}

	@Override
	public String clotheMan() {
		return "������� �����, ������ " + getSize() + " (" + getSize().getDescription() + ")" + ", ���� - " + getColor()
				+ ", ���� - " + getCost();
	}

	@Override
	public String toString() {
		return "Pants [super.toString()=" + super.toString() + "]";
	}
}
