package com.company.lesson8;

public class Dog extends Animal {
	private String voice;

	public Dog(String food, String location) {
		super(food, location);
		voice = "Гав";
	}

	public String getVoice() {
		return voice;
	}

	public void setVoice(String voice) {
		this.voice = voice;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((voice == null) ? 0 : voice.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		if (voice == null) {
			if (other.voice != null)
				return false;
		} else if (!voice.equals(other.voice))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Dog [voice=" + voice + ", super.toString()=" + super.toString() + "]";
	}

	@Override
	public void eat() {
		setFood("meat");
	}

	@Override
	public void makeNoise() {
		System.out.println("Собака говорит " + voice);
	}
}
