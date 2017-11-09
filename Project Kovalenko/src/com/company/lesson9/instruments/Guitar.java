package com.company.lesson9.instruments;

public class Guitar implements Instrument {
	private int stringNumber;

	public Guitar(int stringNumber) {
		this.stringNumber = stringNumber;
	}

	public int getStringNumber() {
		return stringNumber;
	}

	public void setStringNumber(int stringNumber) {
		this.stringNumber = stringNumber;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + stringNumber;
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
		Guitar other = (Guitar) obj;
		if (stringNumber != other.stringNumber)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Guitar [stringNumber=" + stringNumber + "]";
	}

	@Override
	public void play() {
		System.out.println("Играет гитара " + stringNumber + " струн");
	}
}
