package com.company.lesson7.vehicles;

import com.company.lesson7.details.Engine;
import com.company.lesson7.proffesions.Driver;

/**
 * ����� Car � ������ com.company.vehicles, Engine � ������ com.company.details
 * � Driver � ������ com.company.professions. ����� Driver �������� ���� - ���,
 * ���� ��������. ����� Engine �������� ���� - ��������, �������������. �����
 * Car �������� ���� - ����� ����������, ����� ����������, ���, �������� ����
 * Driver, ����� ���� Engine. ������ start(), stop(), turnRight(), turnLeft(),
 * ������� ������� �� ������: "�������", "���������������", "������� �������"
 * ��� "������� ������". � ����� ����� printInfo(), ������� ������� ������
 * ���������� �� ����������, �� �������� � ������. ������ ����������� �� Car
 * ����� - Lorry (��������), ��������������� ����� ����������������� ������.
 * ������ ����������� �� Car ����� - SportCar, ��������������� ����� ����������
 * ���������. ����� Driver ��������� ����� Person.
 * 
 * @author Elen
 *
 */
public class Car {
	String marka, carClass;
	int weight;
	Driver driver;
	Engine engine;

	public Car(String marka, String carClass, int weight, Driver driver, Engine engine) {
		super();
		this.marka = marka;
		this.carClass = carClass;
		this.weight = weight;
		this.driver = driver;
		this.engine = engine;
	}

	public void start() {
		System.out.println("������� ");
	}

	public void stop() {
		System.out.println("��������������� ");
	}

	public void turnRight() {
		System.out.println("������� ������� ");
	}

	public void turnLeft() {
		System.out.println("������� ������ ");
	}

	public void printInfo() {
		System.out.println("����� ����: " + marka + "\n����� ����: " + carClass);
		System.out.println(
				"�������������: " + engine.getCompany() + "\n��������: " + engine.getPower() + "\n���: " + weight);
		System.out.println("��� �������� - " + driver.getFullName() + ", �������: " + driver.getAge() + ", ����: "
				+ driver.getExperience());

	}

	public static void main(String[] args) {
		Driver driver = new Driver("Ivanov Ivan", 28, 5);
		Engine engine = new Engine("BMW", 200);
		Car car1 = new Car("BMW7", "Business", 2000, driver, engine);
		car1.printInfo();

	}
}
