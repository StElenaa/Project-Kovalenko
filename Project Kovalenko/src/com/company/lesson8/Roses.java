package com.company.lesson8;

public class Roses extends Flower {

	public Roses() {
		super("Роза", 10);
	}

	@Override
	public String toString() {
		return "Roses [getCost()=" + getCost() + ", getName()=" + getName() + ", getShelfLife()=" + getShelfLife()
				+ "]";
	}

	@Override
	public int getCost() {
		return 20;
	}
}
