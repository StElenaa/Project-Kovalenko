package com.company.lesson9.printable;

abstract class ListPrintable {

	public static void main(String[] args) {
		Printable[] printables = new Printable[] { new Magazine("������1"), new Magazine("������2"), new Book("�����1"),
				new Book("�����2") };
		Printable.printBooks(printables);
		Printable.printMagazines(printables);
		System.out.println();
		printables[0].print();
		printables[2].print();
	}
}
