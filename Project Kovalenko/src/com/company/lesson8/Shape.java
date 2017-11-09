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
	private String color;

	public Shape(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	abstract public void draw();

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
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
		Shape other = (Shape) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Shape [color=" + color + ", getColor()=" + getColor() + ", hashCode()=" + hashCode() + ", getClass()="
				+ getClass() + ", super.toString()=" + super.toString() + "]";
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
