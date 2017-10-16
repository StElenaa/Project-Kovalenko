package com.company.lesson5;

/**
 * Создание класса Phone, который содержит переменные number, model и weight.
 * Создание трех экземпляров этого класса. Изменение значения для number, model
 * и weight для трех объектов.
 * 
 * @author Elen
 *
 */
public class Phone {
	int number;
	int model;
	int weight;

	public static void main(String args[]) {
		Phone p1 = new Phone();
		Phone p2 = new Phone();
		Phone p3 = new Phone();

		p1.number = 10;
		p1.model = 20;
		p1.weight = 15;

		p2.number = 14;
		p2.model = 48;
		p2.weight = 13;

		p3.number = 37;
		p3.model = 87;
		p3.weight = 8;

		System.out.println("number phone 1: " + p1.number);
		System.out.println("model phone 1: " + p1.model);
		System.out.println("weight phone 1: " + p1.weight);

		System.out.println("\nnumber phone 2: " + p2.number);
		System.out.println("model phone 2: " + p2.model);
		System.out.println("weight phone 2: " + p2.weight);

		System.out.println("\nnumber phone 3: " + p3.number);
		System.out.println("model phone 3: " + p3.model);
		System.out.println("weight phone 3: " + p3.weight);

		p1.number = 100;
		p1.model = 200;
		p1.weight = 150;

		p2.number = 140;
		p2.model = 480;
		p2.weight = 130;

		p3.number = 370;
		p3.model = 870;
		p3.weight = 80;

		System.out.println("\nnumber phone 1: " + p1.number);
		System.out.println("model phone 1: " + p1.model);
		System.out.println("weight phone 1: " + p1.weight);

		System.out.println("\nnumber phone 2: " + p2.number);
		System.out.println("model phone 2: " + p2.model);
		System.out.println("weight phone 2: " + p2.weight);

		System.out.println("\nnumber phone 3: " + p3.number);
		System.out.println("model phone 3: " + p3.model);
		System.out.println("weight phone 3: " + p3.weight);
	}
}
