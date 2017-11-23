package com.company.lesson15;

import java.util.HashMap;
import java.util.Map;

/**
 * Класс Pet имеет наследников Cat, Dog, Parrot. Создано отображение из домашних
 * животных, где в качестве ключа выступает имя животного, а в качестве значения
 * класс Pet. Метод iterateKeys выводит на консоль все ключи отображения.
 * 
 * @author Elen
 *
 */
public class Pet {
	String namePet;

	public Pet(String namePet) {
		this.namePet = namePet;
	}

	public String getNamePet() {
		return namePet;
	}

	public void setNamePet(String namePet) {
		this.namePet = namePet;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((namePet == null) ? 0 : namePet.hashCode());
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
		Pet other = (Pet) obj;
		if (namePet == null) {
			if (other.namePet != null)
				return false;
		} else if (!namePet.equals(other.namePet))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Pet [namePet=" + namePet + "]";
	}

	public static void main(String[] args) {
		Map<String, Pet> petMap = new HashMap<>();
		Pet cat = new Cat("Cat Murka");
		Pet dog = new Dog("Dog Sharik");
		Pet parrot = new Parrot("Parrot Roma");
		petMap.put(cat.getNamePet(), cat);
		petMap.put(dog.getNamePet(), dog);
		petMap.put(parrot.getNamePet(), parrot);
		iterateKeys(petMap);
	}

	private static void iterateKeys(Map<String, Pet> map) {
		for (String key : map.keySet()) {
			System.out.println("Key - " + key);
		}
	}
}
