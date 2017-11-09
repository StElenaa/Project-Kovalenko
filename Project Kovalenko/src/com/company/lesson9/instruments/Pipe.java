package com.company.lesson9.instruments;

public class Pipe implements Instrument {
	private int diameter;

	public Pipe(int diameter) {
		this.diameter = diameter;
	}

	public int getDiameter() {
		return diameter;
	}

	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + diameter;
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
		Pipe other = (Pipe) obj;
		if (diameter != other.diameter)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Pipe [diameter=" + diameter + "]";
	}

	@Override
	public void play() {
		System.out.println("Играет труба. Диаметр - " + diameter);
	}
}
