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
	private String fullName;
	private int age;

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

	public void move() {
		System.out.println("����� move() \n" + "fullName= " + fullName + "\n" + "age = " + age + "\n");
	}

	public void talk() {
		System.out.println("����� talk() \n" + "fullName= " + fullName + "\n" + "age = " + age);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((fullName == null) ? 0 : fullName.hashCode());
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
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (fullName == null) {
			if (other.fullName != null)
				return false;
		} else if (!fullName.equals(other.fullName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return String.format("Person [fullName = %s age = %d]", fullName, age);
	}

	public static void main(String[] args) {
		Person per1 = new Person("Dasha", 25);
		Person per2 = new Person();
		per1.move();
		per2.talk();
		System.out.println(per1.toString());
		System.out.println(per2.toString());
	}
}
