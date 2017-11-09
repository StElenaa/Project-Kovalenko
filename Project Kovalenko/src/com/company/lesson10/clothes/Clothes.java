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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + Float.floatToIntBits(cost);
		result = prime * result + ((size == null) ? 0 : size.hashCode());
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
		Clothes other = (Clothes) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (Float.floatToIntBits(cost) != Float.floatToIntBits(other.cost))
			return false;
		if (size != other.size)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Clothes [size=" + size + ", cost=" + cost + ", color=" + color + "]";
	}

}
