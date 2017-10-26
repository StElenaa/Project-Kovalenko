package com.company.lesson8;

public class Horse extends Animal {
	String voice;

	public Horse(String food, String location) {
		super(food, location);
		voice = "Игого";
	}

	@Override
	public void makeNoise() {
		System.out.println("Лошадь говорит " + voice);
	}

	@Override
	public void eat() {
		food = "oats";
	}
}
