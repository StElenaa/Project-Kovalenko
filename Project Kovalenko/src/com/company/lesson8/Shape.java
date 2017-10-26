package com.company.lesson8;

/**
 * ������ ���������� Shape � ��� ���������� Circle, Rectangle. ����� Shape
 * �������� ����������� ����� draw() � ���������� �������� ����. ������ Circle,
 * Rectangle �������� ���������� �����. ������ ������ ���������� ��� ������. �
 * ����� ���������� �� (������� ����� draw). �������� ����� equals() ��� �������
 * Shape, Circle, Rectangle.
 * 
 * @author Elen
 *
 */
abstract public class Shape {
	String color;

	public Shape(String color) {
		super();
		this.color = color;
	}

	abstract public void draw();
	
	public void equals() {
	}

	public static void main(String[] args) {

		Shape[] shapes = new Shape[2];
		shapes[0] = new CircleL8("�������", 25);
		shapes[1] = new RectangleL8("������", 67, 44);
		for (Shape shape : shapes) {
			shape.draw();
		}
	}
}
