package com.company.lesson8;

public class Horse extends Animal {
	String voice;

	public Horse(String food, String location) {
		super(food, location);
		voice = "�����";
	}

	@Override
	public void makeNoise() {
		System.out.println("������ ������� " + voice);
	}

	@Override
	public void eat() {
		food = "oats";
	}
}
