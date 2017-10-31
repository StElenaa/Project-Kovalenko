package com.company.lesson7.details;

public class Engine {
	private String company;
	private int power;

	public Engine(String company, int power) {
		this.company = company;
		this.power = power;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}
}
