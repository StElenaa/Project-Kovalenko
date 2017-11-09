package com.company.lesson8;

public class Tulips extends Flower {

	public Tulips() {
		super("Òşëüïàí", 5);
	}

	@Override
	public String toString() {
		return "Tulips [getCost()=" + getCost() + ", getName()=" + getName() + ", getShelfLife()=" + getShelfLife()
				+ "]";
	}

	@Override
	public int getCost() {
		return 10;
	}
}
