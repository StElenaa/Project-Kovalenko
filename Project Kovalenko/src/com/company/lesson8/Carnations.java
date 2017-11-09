package com.company.lesson8;

public class Carnations extends Flower {

	public Carnations() {
		super("√воздика", 10);
	}

	@Override
	public String toString() {
		return "Carnations [getCost()=" + getCost() + ", getName()=" + getName() + ", getShelfLife()=" + getShelfLife()
				+ "]";
	}

	@Override
	public int getCost() {
		return 15;
	}
}
