package com.company.lesson3;

import java.util.Scanner;

public class Modulo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a, b, c;
		System.out.print("Введите три вещественных числа: ");
		a = getDbl(sc);
		b = getDbl(sc);
		c = getDbl(sc);

		a = a < 0 ? -a : a;
		b = b < 0 ? -b : b;
		c = c < 0 ? -c : c;

		double min = a < b ? (a < c ? a : c) : (b < c ? b : c);
		System.out.println("Меньшее по модулю число - " + min);
	}

	public static double getDbl(Scanner sc) {
		if (sc.hasNextDouble()) {
			return sc.nextDouble();
		}
		System.out.println("Не все числа, из введенных, являются вещественными");
		System.exit(0);
		return 0;
	}
}
