package com.company.lesson9.instruments;

public class Pipe implements Instrument {
private int diameter;

	public Pipe(int diameter) {
	this.diameter = diameter;
}

	public int getDiameter() {
		return diameter;
	}

	@Override
	public void play() {
		System.out.println("Играет труба. Диаметр - " + diameter);
	}
}
