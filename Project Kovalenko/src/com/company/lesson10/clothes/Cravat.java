package com.company.lesson10.clothes;

public class Cravat extends Clothes implements ManClothing {

	public Cravat(SizeClothes size, float cost, String color) {
		super(size, cost, color);
	}

	@Override
	public String clotheMan() {
		return "�������, ������ " + getSize() + " (" + getSize().getDescription() + ")" + ", ���� - " + getColor()
				+ ", ���� - " + getCost();
	}
}
