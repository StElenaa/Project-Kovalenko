package com.company.lesson14;

import com.company.lesson8.Animal;
import com.company.lesson8.Cat;

public class PrintGenClass {

	public static void main(String[] args) {
		GeneralizedClass<Integer, Animal, Integer> gcObj = new GeneralizedClass<>(98, new Cat("сметана", "центр"), 99);

		gcObj.showTypes();

		Comparable<?> t = gcObj.getOb1();
		System.out.println("T: " + t);

		Animal v = gcObj.getOb2();
		System.out.println("V: " + v);

		Number k = gcObj.getOb3();
		System.out.println("K: " + k);
	}
}
