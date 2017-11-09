package com.company.lesson8;

public class Vet {

	static void treatAnimal(Animal animal) {
		System.out.println("Food - " + animal.getFood());
		System.out.println("Location - " + animal.getLocation());
	}

	public static void main(String[] args) {
		Animal[] animals = new Animal[3];
		animals[0] = new Dog("����", "��������");
		animals[1] = new Cat("�������", "�����");
		animals[2] = new Horse("����", "����������");
		for (Animal animal : animals) {
			animal.makeNoise();
			treatAnimal(animal);
			animal.sleep();
		}
	}
}
