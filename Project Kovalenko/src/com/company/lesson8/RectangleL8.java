package com.company.lesson8;

public class RectangleL8 extends Shape {
	private int x1, y1;

	public RectangleL8(String color, int x1, int y1) {
		super(color);
		this.x1 = x1;
		this.y1 = y1;
	}

	@Override
	public void draw() {
		System.out.println("Draw: ������ - �������������; " + "���������� ����� - " + "x1 = " + x1 + " y1 = " + y1);
		System.out.println("���� - " + color);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + x1;
		result = prime * result + y1;
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
		RectangleL8 other = (RectangleL8) obj;
		if (x1 != other.x1)
			return false;
		if (y1 != other.y1)
			return false;
		return true;
	}

	public static void main(String[] args) {
		RectangleL8 r1 = new RectangleL8("�������", 25, 35);
		r1.draw();
		RectangleL8 r2 = new RectangleL8("������", 67, 44);
		r2.draw();
	}
}
