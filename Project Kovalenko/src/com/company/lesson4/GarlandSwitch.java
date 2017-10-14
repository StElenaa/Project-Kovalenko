package com.company.lesson4;

import java.util.Scanner;

public class GarlandSwitch {
	public static void main(String[] args) {
		int garland = 2873564;
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
	}

	/**
	 * Мигание гирлянды заданное количество раз
	 * 
	 * @param count
	 *            - количество миганий
	 * @param g
	 *            - начальное состояние гирлянды
	 */
	public static void blinkLamps(int count, int g) {
		int b = g;
		for (int i = 0; i < count; i++) {
			b = ~b;
			printState(b);
		}
	}

	/**
	 * Метод распечатывает текущее состояние гирлянды
	 * 
	 * @param i
	 *            - текущее состояние гирлянды
	 */
	public static void printState(int i) {
		String s = Integer.toBinaryString(i);
		int nulls = 32 - s.length();
		for (int j = 0; j < nulls; j++) {
			System.out.print("0");
		}
		System.out.println(s);
	}

	/**
	 * Запуск гирлянды в режиме бегущей строки
	 */
	public static void runStr() {
		int l = 1;
		for (int i = 1; i <= 32; i++) {
			printState(l);
			l = l << 1;
		}
	}

	/**
	 * Определение состояния первой лампочки
	 * 
	 * @param g
	 *            - состояние гирлянды
	 * @return true - лампочка горит, false - лампочка не горит
	 */
	public static boolean firstLamp(int g) {
		return (g & 1) != 0;
	}
}