package com.company.lesson9.printable;

public interface Printable {

	public void print();

	public static void printMagazines(Printable[] printables) {
		System.out.println("\n∆урналы:");
		for (Printable printable : printables) {
			if (printable instanceof Magazine) {
				System.out.println(((Magazine) printable).getName());
			}
		}
	}

	public static void printBooks(Printable[] printables) {
		System.out.println("\n ниги:");
		for (Printable printable : printables) {
			if (printable instanceof Book) {
				System.out.println(((Book) printable).getName());
			}
		}
	}
}
