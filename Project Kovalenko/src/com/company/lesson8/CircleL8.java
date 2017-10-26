package com.company.lesson8;

public class CircleL8 extends Shape {
	int radius;

	public CircleL8(String color, int radius) {
		super(color);
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("Draw: ������ - ����; " + "������ - " + radius);
		System.out.println("���� - " + color);
	}

	public void equals() {
	}

	public static void main(String[] args) {
		CircleL8 c1 = new CircleL8("�������", 25);
		c1.draw();
		CircleL8 c2 = new CircleL8("�����", 47);
		c2.draw();
	}
}
