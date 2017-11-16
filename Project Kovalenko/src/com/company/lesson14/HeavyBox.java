package com.company.lesson14;

public class HeavyBox extends Box6 implements Comparable<HeavyBox> {

	private int weight;

	public HeavyBox(double w, double h, double d, int weight) {
		super(w, h, d);
		this.weight = weight;
	}

	public HeavyBox() {
	}

	@Override
	public int compareTo(HeavyBox other) {
		if (this.equals(other)) {
			return 0;
		}
		if (this.weight < other.weight) {
			return -1;
		}
		return 1;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + weight;
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
		HeavyBox other = (HeavyBox) obj;
		if (weight != other.weight)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "HeavyBox [weight=" + weight + ", width=" + width + ", height=" + height + ", depth=" + depth + "]";
	}
}
