package com.company.lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class GarlandArray {
	public static void main(String[] args) {
		int[] garland = new int[] { 1, 3, 0, 9, 0, 1, 3, 0, 9, 0, 1, 3, 0, 9, 9, 0, 1, 3, 0, 0, 1, 3, 0, 9, 0, 3, 0, 9,
				9, 0, 5, 4 };

		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("Введите номер операции: ");
		System.out.println("   1 - начальное состояние гирлянды");
		System.out.println("   2 - состояние первой лампочки");
		System.out.println("   3 - мигание");
		System.out.println("   4 - бегущая строка");
		System.out.print(" > ");
		if (sc.hasNextInt()) {
			a = sc.nextInt();
			if (a < 1 || a > 4) {
				System.out.println("Введен неверный номер операции");
			}
			switch (a) {
			case 1:
				System.out.println("Начальное состояние гирлянды - ");
				printState(garland);
				break;
			case 2:
				System.out.println("Первая лампочка - " + (firstLamp(garland) ? "Горит" : "Не горит"));
				break;
			case 3:
				System.out.println("Мигание: ");
				blinkLamps(5, garland);
				break;
			case 4:
				System.out.println("Бегущая строка - ");
				runStr();
				break;
			}
		}
		sc.close();
	}

	/**
	 * Мигание гирлянды заданное количество раз
	 * 
	 * @param count
	 *            - количество миганий
	 * @param garland
	 *            - начальное состояние гирлянды
	 */
	public static void blinkLamps(int count, int[] garland) {
		int[] gcopy = new int[garland.length];
		System.arraycopy(garland, 0, gcopy, 0, garland.length);
		for (int i = 0; i < count; i++) {
			printState(gcopy);
			for (int j = 0; j < gcopy.length; j++) {
				if (gcopy[j] != 0) {
					gcopy[j] = 0;
				} else {
					gcopy[j] = 1;
				}
			}
		}
	}

	/**
	 * Метод распечатывает текущее состояние гирлянды
	 * 
	 * @param garland
	 *            - текущее состояние гирлянды
	 */
	public static void printState(int[] garland) {
		System.out.println(Arrays.toString(garland));
	}

	/**
	 * Запуск гирлянды в режиме бегущей строки
	 */
	public static void runStr() {
		int[] garland = new int[32];
		Arrays.fill(garland, 0);
		garland[0] = 1;
		printState(garland);
		for (int i = 0; i < 31; i++) {
			System.arraycopy(garland, i, garland, i + 1, 1);
			garland[i] = 0;
			printState(garland);
		}
	}

	/**
	 * Определение состояния первой лампочки
	 * 
	 * @param garland
	 *            - состояние гирлянды
	 * @return true - лампочка горит, false - лампочка не горит
	 */
	public static boolean firstLamp(int[] garland) {
		return (garland[0] != 0);
	}
}
