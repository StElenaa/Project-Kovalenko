package com.company.lesson8;

public class CircleL8 extends Shape {
	private int radius;

	public CircleL8(String color, int radius) {
		super(color);
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("Draw: ������ - ����; " + "������ - " + radius);
		System.out.println("���� - " + color);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + radius;
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
		CircleL8 other = (CircleL8) obj;
		if (radius != other.radius)
			return false;
		return true;
	}

	public static void main(String[] args) {
		CircleL8 c1 = new CircleL8("�������", 25);
		c1.draw();
		CircleL8 c2 = new CircleL8("�����", 47);
		c2.draw();
	}
}
