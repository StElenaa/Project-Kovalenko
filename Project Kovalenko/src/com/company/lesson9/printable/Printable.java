package com.company.lesson9.printable;

public interface Printable {

	void print();

	static void printMagazines(Printable[] printables) {
		System.out.println("\n�������:");
		for (Printable printable : printables) {
			if (printable instanceof Magazine) {
				System.out.println(((Magazine) printable).getName());
			}
		}
	}

	static void printBooks(Printable[] printables) {
		System.out.println("\n�����:");
		for (Printable printable : printables) {
			if (printable instanceof Book) {
				System.out.println(((Book) printable).getName());
			}
		}
	}
}
