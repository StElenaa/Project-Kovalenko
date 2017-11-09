package com.company.lesson8;

public class Horse extends Animal {
	private String voice;

	public Horse(String food, String location) {
		super(food, location);
		voice = "Игого";
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
		Horse other = (Horse) obj;
		if (voice == null) {
			if (other.voice != null)
				return false;
		} else if (!voice.equals(other.voice))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Horse [voice=" + voice + ", super.toString()=" + super.toString() + "]";
	}

	@Override
	public void makeNoise() {
		System.out.println("Лошадь говорит " + voice);
	}

	@Override
	public void eat() {
		setFood("oats");
	}
}
