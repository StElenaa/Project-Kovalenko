package com.company.lesson14;

public class Box6 {
	double width;
	double height;
	double depth;

	Box6(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}

	public Box6() {
		width = -1;
		height = -1;
		depth = -1;
	}

	Box6(double len) {
		width = height = depth = len;
	}

	double volume() {
		return width * height * depth;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(depth);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(height);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(width);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Box6 other = (Box6) obj;
		if (Double.doubleToLongBits(depth) != Double.doubleToLongBits(other.depth))
			return false;
		if (Double.doubleToLongBits(height) != Double.doubleToLongBits(other.height))
			return false;
		if (Double.doubleToLongBits(width) != Double.doubleToLongBits(other.width))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Box6 [width=" + width + ", height=" + height + ", depth=" + depth + "]";
	}
}
