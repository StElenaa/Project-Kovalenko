package com.company.lesson7.vehicles;

import com.company.lesson7.details.Engine;
import com.company.lesson7.proffesions.Driver;

public class SportCar extends Car {
	private int speed;

	public SportCar(String marka, String carClass, int weight, Driver driver, Engine engine, int speed) {
		super(marka, carClass, weight, driver, engine);
		this.speed = speed;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
}
