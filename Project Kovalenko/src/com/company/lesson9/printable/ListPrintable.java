package com.company.lesson9.printable;

abstract class ListPrintable {

	public static void main(String[] args) {
		Printable[] printables = new Printable[] { new Magazine("∆урнал1"), new Magazine("∆урнал2"), new Book(" нига1"),
				new Book(" нига2") };
		Printable.printBooks(printables);
		Printable.printMagazines(printables);
		System.out.println();
		printables[0].print();
		printables[2].print();
	}
}
