package com.company.lesson8;

/**
 * Создан суперкласс Shape и его наследники Circle, Rectangle. Класс Shape
 * содержит абстрактный метод draw() и переменную хранящую цвет. Классы Circle,
 * Rectangle содержат координаты точек. Создан массив содержащий эти фигуры. В
 * цикле нарисовать их (вызвать метод draw). Добавить метод equals() для классов
 * Shape, Circle, Rectangle.
 * 
 * @author Elen
 *
 */
abstract public class Shape {
	protected String color;

	public Shape(String color) {
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

	public static void main(String[] args) {

		Shape[] shapes = new Shape[2];
		shapes[0] = new CircleL8("Зеленый", 25);
		shapes[1] = new RectangleL8("Желтый", 67, 44);
		for (Shape shape : shapes) {
			shape.draw();
		}
	}
}
