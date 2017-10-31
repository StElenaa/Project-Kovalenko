package com.company.lesson8;

/**
 * Создан класс Animal и расширяющие его классы Dog, Cat, Horse. Класс Animal,
 * содержит переменные food, location и методы makeNoise, eat, sleep. Dog, Cat,
 * Horse переопределяют методы makeNoise, eat. В классы Dog, Cat, Horse
 * добавлены переменные, характеризующие только этих животных. Создан класс
 * Ветеринар, в котором определен метод void treatAnimal(Animal animal), который
 * распечатывает food и location пришедшего на прием животного. В методе main
 * создан массив типа Animal, в который записаны животные всех имеющихся типов.
 * В цикле животные отправляются на прием к ветеринару.
 * 
 * @author Elen
 *
 */
public abstract class Animal {
	protected String food;
	private String location;

	public Animal(String food, String location) {
		this.food = food;
		this.location = location;
	}

	public String getFood() {
		return food;
	}

	public String getLocation() {
		return location;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	abstract public void makeNoise();

	abstract public void eat();

	public void sleep() {
	}
}
