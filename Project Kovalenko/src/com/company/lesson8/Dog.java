package com.company.lesson8;

public class Dog extends Animal {
	private String voice;

	public Dog(String food, String location) {
		super(food, location);
		voice = "���";
	}

	public String getVoice() {
		return voice;
	}

	public void setVoice(String voice) {
		this.voice = voice;
	}

	@Override
	public void eat() {
		food = "meat";
	}

	@Override
	public void makeNoise() {
		System.out.println("������ ������� " + voice);
	}
}
