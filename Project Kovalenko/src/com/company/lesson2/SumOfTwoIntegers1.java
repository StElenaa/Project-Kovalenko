package com.company.lesson2;

import java.util.Scanner;

/**
 * Программа, которая вычисляет и выводит на экран сумму двух целых чисел,
 * введенных пользователем. Если пользователь некорректно введёт хотя бы одно из
 * чисел, то ему будет сообщено об ошибке
 * 
 * @author Elen
 *
 */
public class SumOfTwoIntegers1 {

	/**
	 * Метод возвращает целое число, сосканированное из входного потока, заданного
	 * параметром
	 * 
	 * @param sc
	 *            - объект типа Scanner
	 * @return - целое число
	 */
	public static int getInt(Scanner sc) {
		System.out.print("Введите целое число: ");
		return sc.nextInt();
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
