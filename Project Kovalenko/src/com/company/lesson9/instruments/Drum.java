package com.company.lesson9.instruments;

public class Drum implements Instrument {
	private int size;

	public Drum(int size) {
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	@Override
	public void play() {
		System.out.println("Играет барабан. Размер - " + size);
	}
}
