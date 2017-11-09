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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + speed;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		SportCar other = (SportCar) obj;
		if (speed != other.speed)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "SportCar [speed=" + speed + ", getMarka()=" + getMarka() + ", getCarClass()=" + getCarClass()
				+ ", getWeight()=" + getWeight() + ", getDriver()=" + getDriver() + ", getEngine()=" + getEngine()
				+ ", super.toString()=" + super.toString() + "]";
	}
}
