package com.company.lesson15;

public class Toy {
	private String name;
	private int �ost;

	public Toy(String name, int �ost) {
		this.name = name;
		this.�ost = �ost;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int get�ost() {
		return �ost;
	}

	public void set�ost(int �ost) {
		this.�ost = �ost;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + �ost;
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
		if (�ost != other.�ost)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Toy [name=" + name + ", �ost=" + �ost + "]";
	}
}
