package com.company.lesson8;

/**
 * ������ ����� Animal � ����������� ��� ������ Dog, Cat, Horse. ����� Animal,
 * �������� ���������� food, location � ������ makeNoise, eat, sleep. Dog, Cat,
 * Horse �������������� ������ makeNoise, eat. � ������ Dog, Cat, Horse
 * ��������� ����������, ��������������� ������ ���� ��������. ������ �����
 * ���������, � ������� ��������� ����� void treatAnimal(Animal animal), �������
 * ������������� food � location ���������� �� ����� ���������. � ������ main
 * ������ ������ ���� Animal, � ������� �������� �������� ���� ��������� �����.
 * � ����� �������� ������������ �� ����� � ����������.
 * 
 * @author Elen
 *
 */
public abstract class Animal {
	protected String food;
	private String location;

	public Animal(String food, String location) {
		this.food = food;
		this.location = location;
	}

	public String getFood() {
		return food;
	}

	public String getLocation() {
		return location;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	abstract public void makeNoise();

	abstract public void eat();

	public void sleep() {
	}
}
