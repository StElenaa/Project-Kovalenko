package com.company.lesson7.vehicles;

import com.company.lesson7.details.Engine;
import com.company.lesson7.proffesions.Driver;

/**
 * Класс Car в пакете com.company.vehicles, Engine в пакете com.company.details
 * и Driver в пакете com.company.professions. Класс Driver содержит поля - ФИО,
 * стаж вождения. Класс Engine содержит поля - мощность, производитель. Класс
 * Car содержит поля - марка автомобиля, класс автомобиля, вес, водитель типа
 * Driver, мотор типа Engine. Методы start(), stop(), turnRight(), turnLeft(),
 * которые выводят на печать: "Поехали", "Останавливаемся", "Поворот направо"
 * или "Поворот налево". А также метод printInfo(), который выводит полную
 * информацию об автомобиле, ее водителе и моторе. Создан производный от Car
 * класс - Lorry (грузовик), характеризуемый также грузоподъемностью кузова.
 * Создан производный от Car класс - SportCar, характеризуемый также предельной
 * скоростью. Класс Driver расширяет класс Person.
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
		System.out.println("Поехали ");
	}

	public void stop() {
		System.out.println("Останавливаемся ");
	}

	public void turnRight() {
		System.out.println("Поворот направо ");
	}

	public void turnLeft() {
		System.out.println("Поворот налево ");
	}

	public void printInfo() {
		System.out.println("Марка авто: " + marka + "\nКласс авто: " + carClass);
		System.out.println(
				"Производитель: " + engine.getCompany() + "\nМощность: " + engine.getPower() + "\nВес: " + weight);
		System.out.println("Имя водителя - " + driver.getFullName() + ", Возраст: " + driver.getAge() + ", Стаж: "
				+ driver.getExperience());

	}

	public static void main(String[] args) {
		Driver driver = new Driver("Ivanov Ivan", 28, 5);
		Engine engine = new Engine("BMW", 200);
		Car car1 = new Car("BMW7", "Business", 2000, driver, engine);
		car1.printInfo();

	}
}
