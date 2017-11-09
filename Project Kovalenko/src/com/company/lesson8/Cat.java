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
		Cat other = (Cat) obj;
		if (voice == null) {
			if (other.voice != null)
				return false;
		} else if (!voice.equals(other.voice))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Cat [voice=" + voice + ", super.toString()=" + super.toString() + "]";
	}

	@Override
	public void eat() {
		setFood("fish");
	}

	@Override
	public void makeNoise() {
		System.out.println(" ошка говорит " + voice);
	}
}
