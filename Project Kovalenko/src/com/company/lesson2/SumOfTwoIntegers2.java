package com.company.lesson2;

import java.util.Scanner;

public class SumOfTwoIntegers2 {

	/**
	 * Метод возвращает считанное целое число
	 * 
	 * @param sc
	 *            - сканер
	 * @return - целое число
	 * @throws Exception
	 *             - в случае, если введено не целое число
	 */
	public static int getInt(Scanner sc) throws Exception {
		System.out.print("Ведите целое число: ");
		if (sc.hasNextInt()) {
			return sc.nextInt();
		} else {
			throw new Exception();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int a = getInt(sc);
			int b = getInt(sc);
			System.out.println(a + " + " + b + " = " + (a + b));
		} catch (Exception e) {
			System.out.println("Вводить можно только целые числа");
		}
	}
}
