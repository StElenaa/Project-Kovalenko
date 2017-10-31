package com.company.lesson6;

/**
 * ����� Person �������� ����: fullName; age � ������ move() � talk(). ���
 * ������������ - Person() � Person(fullName, age). ������� ��� ������� �����
 * ������. ���� ������ ���������������� ������������� Person(), ������ -
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
		System.out.println("����� move() \n" + "fullName= " + fullName + "\n" + "age = " + age + "\n");
	}

	void talk() {
		System.out.println("����� talk() \n" + "fullName= " + fullName + "\n" + "age = " + age);
	}

	public static void main(String[] args) {
		Person per1 = new Person("Dasha", 25);
		Person per2 = new Person();
		per1.move();
		per2.talk();
	}
}
