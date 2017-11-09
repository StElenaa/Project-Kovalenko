package com.company.lesson8;

public class Orchids extends Flower {

	public Orchids() {
		super("Орхидея", 20);
	}

	@Override
	public String toString() {
		return "Orchids [getCost()=" + getCost() + ", getName()=" + getName() + ", getShelfLife()=" + getShelfLife()
				+ "]";
	}

	@Override
	public int getCost() {
		return 50;
	}
}
