package com.company.lesson9.instruments;

public class Guitar implements Instrument {
	private int stringNumber;

	public Guitar(int stringNumber) {
		this.stringNumber = stringNumber;
	}

	public int getStringNumber() {
		return stringNumber;
	}

	@Override
	public void play() {
		System.out.println("Играет гитара " + stringNumber + " струн");
	}
}
