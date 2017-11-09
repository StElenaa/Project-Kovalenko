package com.company.lesson7.vehicles;

import javax.xml.stream.events.StartDocument;

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
	private String marka, carClass;
	private int weight;
	private Driver driver;
	private Engine engine;

	public Car(String marka, String carClass, int weight, Driver driver, Engine engine) {
		this.marka = marka;
		this.carClass = carClass;
		this.weight = weight;
		this.driver = driver;
		this.engine = engine;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getCarClass() {
		return carClass;
	}

	public void setCarClass(String carClass) {
		this.carClass = carClass;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((carClass == null) ? 0 : carClass.hashCode());
		result = prime * result + ((driver == null) ? 0 : driver.hashCode());
		result = prime * result + ((engine == null) ? 0 : engine.hashCode());
		result = prime * result + ((marka == null) ? 0 : marka.hashCode());
		result = prime * result + weight;
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
		Car other = (Car) obj;
		if (carClass == null) {
			if (other.carClass != null)
				return false;
		} else if (!carClass.equals(other.carClass))
			return false;
		if (driver == null) {
			if (other.driver != null)
				return false;
		} else if (!driver.equals(other.driver))
			return false;
		if (engine == null) {
			if (other.engine != null)
				return false;
		} else if (!engine.equals(other.engine))
			return false;
		if (marka == null) {
			if (other.marka != null)
				return false;
		} else if (!marka.equals(other.marka))
			return false;
		if (weight != other.weight)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Car [marka=" + marka + ", carClass=" + carClass + ", weight=" + weight + ", driver=" + driver
				+ ", engine=" + engine + "]";
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
		car1.turnLeft();
		car1.turnRight();
		car1.start();
		car1.stop();
	}
}
