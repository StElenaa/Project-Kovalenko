package com.company.lesson8;

public class Roses extends Flower {

	public Roses() {
		super("Роза", 10);
	}

	@Override
	public int getCost() {
		return 20;
	}
}
