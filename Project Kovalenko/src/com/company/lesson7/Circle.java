package com.company.lesson7;

/**
 * ����� Circle �������� ���������� radius; ������, ����������� ������� � �����
 * ����������; ��������� PI.
 * 
 * @author Elen
 *
 */
public class Circle {
	double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	static final double PI = 3.14;

	public double circumference() {
		double circumference = radius * 2 * PI;
		return circumference;
	}

	public double area() {

		double area = radius * radius * PI;
		return area;
	}

	public void print() {
		System.out.println("���� ������ ���������� = " + radius + "\n" + "����� ���������� = " + circumference() + "\n"
				+ "������� ���������� = " + area() + "\n");
	}

	public static void main(String[] args) {
		Circle circle1 = new Circle(25.2);
		Circle circle2 = new Circle(15);
		circle1.area();
		circle1.circumference();
		circle2.area();
		circle2.circumference();
		circle1.print();
		circle2.print();
	}
}