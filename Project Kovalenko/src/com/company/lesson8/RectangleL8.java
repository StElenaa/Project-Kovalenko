package com.company.lesson8;

public class RectangleL8 extends Shape {
	private int x1, y1;

	public RectangleL8(String color, int x1, int y1) {
		super(color);
		this.x1 = x1;
		this.y1 = y1;
	}

	public int getX1() {
		return x1;
	}

	public void setX1(int x1) {
		this.x1 = x1;
	}

	public int getY1() {
		return y1;
	}

	public void setY1(int y1) {
		this.y1 = y1;
	}

	@Override
	public void draw() {
		System.out.println("Draw: Фигура - прямоугольник; " + "Координаты точек - " + "x1 = " + x1 + " y1 = " + y1);
		System.out.println("Цвет - " + getColor());
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

	@Override
	public String toString() {
		return "RectangleL8 [x1=" + x1 + ", y1=" + y1 + ", super.toString()=" + super.toString() + "]";
	}

	public static void main(String[] args) {
		RectangleL8 r1 = new RectangleL8("Зеленый", 25, 35);
		r1.draw();
		RectangleL8 r2 = new RectangleL8("Желтый", 67, 44);
		r2.draw();
	}
}
