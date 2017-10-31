package com.company.lesson8;

import java.util.Arrays;

public class Bouquet {

	Flower[] flowers;

	public Bouquet(Flower... flowers) {
		super();
		this.flowers = new Flower[flowers.length];
		this.flowers = Arrays.copyOf(flowers, flowers.length);
	}

	public String getFlowerNames() {
		String flowerNames = "";
		for (Flower flower : flowers) {
			flowerNames = flowerNames + flower.name + " ";
		}
		return flowerNames;
	}

	public static int soltNumber(Bouquet... bouquets) {
		int fullNumber = 0;
		for (Bouquet bouquet : bouquets) {
			fullNumber = fullNumber + bouquet.flowers.length;
		}
		return fullNumber;
	}

	public static void main(String[] args) {
		Bouquet b1 = new Bouquet(new Roses(), new Carnations(), new Tulips());
		Bouquet b2 = new Bouquet(new Roses());
		System.out.println("Продано цветов - " + Bouquet.soltNumber(b1, b2));
	}
}
