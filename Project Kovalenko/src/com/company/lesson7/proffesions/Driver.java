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

	public void setExperience(int experience) {
		this.experience = experience;
	}
}
