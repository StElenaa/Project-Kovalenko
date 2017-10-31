package com.company.lesson8;

public class Horse extends Animal {
	private String voice;

	public Horse(String food, String location) {
		super(food, location);
		voice = "�����";
	}

	public String getVoice() {
		return voice;
	}

	public void setVoice(String voice) {
		this.voice = voice;
	}

	@Override
	public void makeNoise() {
		System.out.println("������ ������� " + voice);
	}

	@Override
	public void eat() {
		food = "oats";
	}
}
