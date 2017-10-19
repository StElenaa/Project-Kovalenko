package com.company.lesson6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Создание класса Phone, который содержит переменные number, model и weight.
 * Создание трех экземпляров этого класса. В класс Phone добавлены метод -
 * receiveCall, имееющий один параметр – имя звонящего и выводит на консоль
 * сообщение “Звонит {name}” и метод - getPhoneNumber – возвращает номер
 * телефона. Вызваются эти методы для каждого из объектов. Добавлен конструктор
 * в класс Phone, который принимает на вход параметры для инициализации
 * переменных класса. Добавлен конструктор без параметров. Из конструктора с
 * параметрами вызывается конструктор по умолчанию. Добавлен перегруженный метод
 * receiveCall, который принимает два параметра - имя звонящего и номер телефона
 * звонящего. Вызван этот метод.
 * 
 * @author Elen
 *
 */
public class Phone {
	String model;
	int number, weight;

	public Phone(String model, int number, int weight) {
		this();
		this.model = model;
		this.number = number;
		this.weight = weight;
	}

	public Phone() {
	}

	public void receiveCall(String name) {
		System.out.println("Звонит- " + name);
	}

	public void receiveCall(String name, int number) {
		System.out.println("Звонит- " + name + " Номер телефона - " + number);
	}

	public Integer getPhoneNumber() {
		return number;
	}

	public static void main(String args[]) {
		Phone p1 = new Phone();
		Phone p2 = new Phone();
		Phone p3 = new Phone("GGG", 1234567, 123);

		p1.number = 14356;
		p1.model = "NNN";
		p1.weight = 15;

		p2.receiveCall("Dasha", 5555);
		p1.receiveCall("Glasha");
		System.out.println("Номер телефона: " + p1.getPhoneNumber());
		p3.receiveCall("Sasha");
		System.out.println("Номер телефона: " + p3.getPhoneNumber());
	}
}