package com.company.lesson8;

public class Cat extends Animal {
	private String voice;

	public Cat(String food, String location) {
		super(food, location);
		voice = "м€у";
	}

	public String getVoice() {
		return voice;
	}

	public void setVoice(String voice) {
		this.voice = voice;
	}

	@Override
	public void eat() {
		food = "fish";
	}

	@Override
	public void makeNoise() {
		System.out.println(" ошка говорит " + voice);
	}
}
