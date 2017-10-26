package com.company.lesson8;

public class Cat extends Animal {
	String voice;

	public Cat(String food, String location) {
		super(food, location);
		voice = "м€у";
	}

	@Override
	public void eat() {
		food = "fish";
	}

	@Override
	public void makeNoise() {
		System.out.println(" ошка говорит " + voice);
	}
}
