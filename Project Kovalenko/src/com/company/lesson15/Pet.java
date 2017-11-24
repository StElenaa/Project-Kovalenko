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
	private String name;

	public Pet(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Pet [name=" + name + "]";
	}

	public static void main(String[] args) {
		Map<String, Pet> petMap = new HashMap<>();
		Pet cat = new Cat("Cat Murka");
		Pet dog = new Dog("Dog Sharik");
		Pet parrot = new Parrot("Parrot Roma");
		petMap.put(cat.getName(), cat);
		petMap.put(dog.getName(), dog);
		petMap.put(parrot.getName(), parrot);
		iterateKeys(petMap);
	}

	private static void iterateKeys(Map<String, Pet> map) {
		for (String key : map.keySet()) {
			System.out.println("Key - " + key);
		}
	}
}
