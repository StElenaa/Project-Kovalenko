package com.company.lesson3;

public class Garland {
	public static void main(String[] args) {
		int garland = 2873564;
		System.out.println("Начальное состояние гирлянды - ");
		printState(garland);
		System.out.println("Первая лампочка - " + (firstLamp(garland) ? "Горит" : "Не горит"));
		System.out.println("Мигание: ");
		blinkLamps(5, garland);
		System.out.println("Бегущая строка - ");
		runStr();
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
