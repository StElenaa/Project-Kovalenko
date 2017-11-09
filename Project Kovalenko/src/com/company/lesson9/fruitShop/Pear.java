package com.company.lesson9.fruitShop;

public class Pear extends Fruit {
	private float cost;

	public Pear(float weight, float cost) {
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
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Float.floatToIntBits(cost);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pear other = (Pear) obj;
		if (Float.floatToIntBits(cost) != Float.floatToIntBits(other.cost))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Pear [cost=" + cost + ", weight=" + getWeight() + "]";
	}
}
