package com.company.lesson7.vehicles;

import com.company.lesson7.details.Engine;
import com.company.lesson7.proffesions.Driver;

public class Lorry extends Car {
	private int carrying;

	public Lorry(String marka, String carClass, int weight, Driver driver, Engine engine, int carrying) {
		super(marka, carClass, weight, driver, engine);
		this.carrying = carrying;
	}

	public int getCarrying() {
		return carrying;
	}

	public void setCarrying(int carrying) {
		this.carrying = carrying;
	}
}
