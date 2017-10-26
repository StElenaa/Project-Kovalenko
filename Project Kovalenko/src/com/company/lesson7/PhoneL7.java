package com.company.lesson7;

/**
 * Метод sendMessage с аргументами переменной длины. Данный метод принимает на
 * вход номера телефонов, которым будет отправлено сообщение. Метод выводит на
 * консоль номера этих телефонов. Изменен класс Phone в соответствии с
 * концепцией JavaBean. Реализован подсчет количества созданных телефонов с
 * помощью статической переменной.
 * 
 * @author Elen
 *
 */
public class PhoneL7 {
	String model;
	int number, weight;

	public PhoneL7(String model, int number, int weight) {
		this();
		this.model = model;
		this.number = number;
		this.weight = weight;
	}

	public PhoneL7() {
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public void sendMessage(int... numbers) {
		System.out.println("Сообщение будет отправлено на номера: ");
		for (int number : numbers) {
			System.out.println(number);
		}
	}

	public void receiveCall(String name) {
		System.out.println("Звонит- " + name);
	}

	public void receiveCall(String name, int number) {
		System.out.println("Звонит- " + name + " Номер телефона - " + number);
	}

	public int getPhoneNumber() {
		return number;
	}

	public static void main(String args[]) {
		PhoneL7 p1 = new PhoneL7();
		PhoneL7 p2 = new PhoneL7();
		PhoneL7 p3 = new PhoneL7("GGG", 1234567, 123);
		PhoneL7 p4 = new PhoneL7();

		p1.number = 14356;
		p1.model = "NNN";
		p1.weight = 15;

		p2.receiveCall("Dasha", 5555);
		p1.receiveCall("Glasha");
		System.out.println("Номер телефона: " + p1.getPhoneNumber());
		p3.receiveCall("Sasha");
		System.out.println("Номер телефона: " + p3.getPhoneNumber());
		p4.sendMessage(387465, 948775);
	}
}