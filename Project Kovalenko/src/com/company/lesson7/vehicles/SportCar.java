package com.company.lesson7.vehicles;

import com.company.lesson7.details.Engine;
import com.company.lesson7.proffesions.Driver;

public class SportCar extends Car {
	int speed;

	public SportCar(String marka, String carClass, int weight, Driver driver, Engine engine, int speed) {
		super(marka, carClass, weight, driver, engine);
		this.speed = speed;
	}

	public static void main(String[] args) {
	}
}