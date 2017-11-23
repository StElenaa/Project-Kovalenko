package com.company.lesson15;

public class Toy {
	private String name;
	private int Òost;

	public Toy(String name, int Òost) {
		this.name = name;
		this.Òost = Òost;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int get—ost() {
		return Òost;
	}

	public void set—ost(int Òost) {
		this.Òost = Òost;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + Òost;
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
		Toy other = (Toy) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Òost != other.Òost)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Toy [name=" + name + ", Òost=" + Òost + "]";
	}
}
