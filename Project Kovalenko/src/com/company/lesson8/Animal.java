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
	private String food;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((food == null) ? 0 : food.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
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
		Animal other = (Animal) obj;
		if (food == null) {
			if (other.food != null)
				return false;
		} else if (!food.equals(other.food))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Animal [food=" + food + ", location=" + location + "]";
	}

	abstract public void makeNoise();

	abstract public void eat();

	public void sleep() {
		System.out.println("�������� ����");
	}
}
