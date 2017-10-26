package com.company.lesson8;

public class RectangleL8 extends Shape {
	int x1, y1;

	public RectangleL8(String color, int x1, int y1) {
		super(color);
		this.x1 = x1;
		this.y1 = y1;
	}

	@Override
	public void draw() {
		System.out.println("Draw: Фигура - прямоугольник; " + "Координаты точек - " + "x1 = " + x1 + " y1 = " + y1);
		System.out.println("Цвет - " + color);
	}

	public void equals() {
	}

	public static void main(String[] args) {
		RectangleL8 r1 = new RectangleL8("Зеленый", 25, 35);
		r1.draw();
		RectangleL8 r2 = new RectangleL8("Желтый", 67, 44);
		r2.draw();
	}
}
