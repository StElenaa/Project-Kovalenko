package com.company.lesson8;

public class Dog extends Animal {
	String voice;

	public Dog(String food, String location) {
		super(food, location);
		voice = "���";
	}

	@Override
	public void eat() {
		food = "meat";
	}

	@Override
	public void makeNoise() {
		System.out.println("������ ������� " + voice);
	}
}
