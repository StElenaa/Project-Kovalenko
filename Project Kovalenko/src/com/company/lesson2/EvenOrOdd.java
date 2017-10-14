package com.company.lesson2;

import java.util.Scanner;

/**
 * Программа, которая сообщает, каким является целое число, введенное
 * пользователем, чётным или нечётным. Если пользователем введено не целое
 * число, то ему сообщается об ошибке
 * 
 * @author Elen
 *
 */
public class EvenOrOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		System.out.print("Введите целое число: ");
		if (sc.hasNextInt()) {
			i = sc.nextInt();
			int b = i / 2;
			if (b * 2 == i) {
				System.out.println("Вы ввели четное число");
			} else {
				System.out.println("Вы ввели нечетное число");
			}
		} else {
			System.out.println("Вы ввели не целое число");
		}
	}
}
