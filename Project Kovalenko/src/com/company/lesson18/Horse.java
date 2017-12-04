package com.company.lesson18;

import java.io.Serializable;

public class Horse extends Animal implements Serializable {
	private static final long serialVersionUID = 1L;
	private Halter halter;

	public Horse(Halter halter) {
		this.setHalter(halter);
	}

	public Halter getHalter() {
		return halter;
	}

	public void setHalter(Halter halter) {
		this.halter = halter;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((halter == null) ? 0 : halter.hashCode());
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
		Horse other = (Horse) obj;
		if (halter == null) {
			if (other.halter != null)
				return false;
		} else if (!halter.equals(other.halter))
			return false;
		return true;
	}
}
