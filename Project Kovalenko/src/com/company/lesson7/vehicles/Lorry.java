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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + carrying;
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
		Lorry other = (Lorry) obj;
		if (carrying != other.carrying)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Lorry [carrying=" + carrying + ", getMarka()=" + getMarka() + ", getCarClass()=" + getCarClass()
				+ ", getWeight()=" + getWeight() + ", getDriver()=" + getDriver() + ", getEngine()=" + getEngine()
				+ ", super.toString()=" + super.toString() + "]";
	}
}
