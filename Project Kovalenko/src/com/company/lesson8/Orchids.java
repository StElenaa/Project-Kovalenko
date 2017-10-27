package com.company.lesson8;

public class Orchids extends Flower {

	public Orchids() {
		super("Орхидея", 20);
	}

	@Override
	public int getCost() {
		return 50;
	}
}
