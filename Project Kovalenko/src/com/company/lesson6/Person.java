package com.company.lesson6;

/**
 * Класс Person содержит поля: fullName; age и методы move() и talk(). Два
 * конструктора - Person() и Person(fullName, age). Создано два объекта этого
 * класса. Один объект инициализируется конструктором Person(), другой -
 * Person(fullName, age).
 * 
 * @author Elen
 *
 */
public class Person {
	String fullName;
	int age;

	public Person(String fullName, int age) {
		this();
		this.fullName = fullName;
		this.age = age;
	}

	public Person() {
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	void move() {
		System.out.println("Метод move() \n" + "fullName= " + fullName + "\n" + "age = " + age + "\n");
	}

	void talk() {
		System.out.println("Метод talk() \n" + "fullName= " + fullName + "\n" + "age = " + age);
	}

	public static void main(String[] args) {
		Person per1 = new Person("Dasha", 25);
		Person per2 = new Person();
		per1.move();
		per2.talk();
	}
}
