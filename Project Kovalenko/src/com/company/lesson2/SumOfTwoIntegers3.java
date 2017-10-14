package com.company.lesson2;

import java.util.Scanner;

public class SumOfTwoIntegers3 {
	/**
	 * Метод возвращает считанное целое число или 0
	 * 
	 * @param sc
	 *            - сканер
	 * @return - целое число или 0, если введено не целое число
	 */
	public static int getInt(Scanner sc) {
		System.out.print("Ведите целое число (не 0): ");
		if (sc.hasNextInt()) {
			return sc.nextInt();
		} else {
			System.out.println("Вводить можно только целые числа");
			return 0;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = getInt(sc);
		if (a != 0) {
			int b = getInt(sc);
			if (b != 0) {
				System.out.println(a + " + " + b + " = " + (a + b));
			}
		}
	}
}
