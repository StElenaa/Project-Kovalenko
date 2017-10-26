package com.company.lesson7.vehicles;

import com.company.lesson7.details.Engine;
import com.company.lesson7.proffesions.Driver;

public class Lorry extends Car {
	int carrying;

	public Lorry(String marka, String carClass, int weight, Driver driver, Engine engine, int carrying) {
		super(marka, carClass, weight, driver, engine);
		this.carrying = carrying;
	}

	public static void main(String[] args) {
	}
}
