package com.company.lesson7.proffesions;

import com.company.lesson6.Person;

public class Driver extends Person {
	private int experience;

	public Driver(String fullName, int age, int experience) {
		super(fullName, age);
		this.experience = experience;
	}

	public int getExperience() {
		return experience;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + experience;
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
		Driver other = (Driver) obj;
		if (experience != other.experience)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Driver [experience=" + experience + ", getFullName()=" + getFullName() + ", getAge()=" + getAge()
				+ ", super.toString()=" + super.toString() + "]";
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}
}
