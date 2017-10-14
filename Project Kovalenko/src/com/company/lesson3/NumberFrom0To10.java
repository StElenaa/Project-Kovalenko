package com.company.lesson3;

import java.util.Scanner;

public class NumberFrom0To10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		System.out.print("Введите целое число: ");
		if (sc.hasNextInt()) {
			i = sc.nextInt();
			if (i >= 0 && i < 10) {
				System.out.println("Вы ввели положительное число меньше 10");
			} else {
				System.out.println("Вы ввели положительное число больше 10 или отрицательное");
			}
		} else {
			System.out.println("Вы ввели не целое число");
		}
	}
}
