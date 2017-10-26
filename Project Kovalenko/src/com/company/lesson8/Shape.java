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
		shapes[0] = new CircleL8("Зеленый", 25);
		shapes[1] = new RectangleL8("Желтый", 67, 44);
		for (Shape shape : shapes) {
			shape.draw();
		}
	}
}
