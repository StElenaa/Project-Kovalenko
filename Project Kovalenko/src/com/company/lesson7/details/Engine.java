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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + power;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Engine other = (Engine) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (power != other.power)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Engine [company=" + company + ", power=" + power + ", super.toString()=" + super.toString() + "]";
	}
}
