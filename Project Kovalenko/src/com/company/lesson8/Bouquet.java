package com.company.lesson8;

import java.util.Arrays;

public class Bouquet {
	private Flower[] flowers;

	public Bouquet(Flower... flowers) {
		this.flowers = new Flower[flowers.length];
		this.flowers = Arrays.copyOf(flowers, flowers.length);
	}

	public Flower[] getFlowers() {
		return flowers;
	}

	public void setFlowers(Flower[] flowers) {
		this.flowers = flowers;
	}

	public String getFlowerNames() {
		String flowerNames = "";
		for (Flower flower : flowers) {
			flowerNames = flowerNames + flower.getName() + " ";
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(flowers);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bouquet other = (Bouquet) obj;
		if (!Arrays.equals(flowers, other.flowers))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Bouquet [flowers=" + Arrays.toString(flowers) + "]";
	}

	public static void main(String[] args) {
		Bouquet b1 = new Bouquet(new Roses(), new Carnations(), new Tulips());
		Bouquet b2 = new Bouquet(new Roses());
		System.out.println("Продано цветов - " + Bouquet.soltNumber(b1, b2));
	}
}
