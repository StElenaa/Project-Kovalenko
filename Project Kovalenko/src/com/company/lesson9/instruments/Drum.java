package com.company.lesson9.instruments;

public class Drum implements Instrument {
	private int size;

	public Drum(int size) {
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public void play() {
		System.out.println("Играет барабан. Размер - " + size);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + size;
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
		Drum other = (Drum) obj;
		if (size != other.size)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Drum [size=" + size + "]";
	}
}
