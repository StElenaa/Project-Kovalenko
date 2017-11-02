package com.company.lesson10.clothes;

public abstract class Clothes {
	private SizeClothes size;
	private float cost;
	private String color;

	public Clothes(SizeClothes size, float cost, String color) {
		this.size = size;
		this.cost = cost;
		this.color = color;
	}

	public SizeClothes getSize() {
		return size;
	}

	public void setSize(SizeClothes size) {
		this.size = size;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
