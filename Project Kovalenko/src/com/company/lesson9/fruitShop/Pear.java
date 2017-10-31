package com.company.lesson9.fruitShop;

public class Pear extends Fruit {
	private float cost;

	public Pear(float weight, float cost) {
		super(weight);
		this.cost = cost;
	}

	@Override
	public float costFruit() {
		return cost * getWeight();
	}

	@Override
	public String toString() {
		return "Pear";
	}
}
