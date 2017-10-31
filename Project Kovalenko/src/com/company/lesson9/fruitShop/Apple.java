package com.company.lesson9.fruitShop;

public class Apple extends Fruit {

	private float cost;

	public Apple(float weight, float cost) {
		super(weight);
		this.cost = cost;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	@Override
	public float costFruit() {
		return cost * getWeight();
	}

	@Override
	public String toString() {
		return "Apple";
	}
}
