package com.company.lesson3;

/**
 * Передача на вход программы числа От 1 до 7 в качестве аргумента. Если число
 * равно 1, выводим на консоль “Понедельник”, 2 –”Вторник” и т.д. Если 6 или 7 –
 * “Выходной”, используя конструкцию if-else-if.
 * 
 * @author Elen
 *
 */
public class DaysOfTheWeek {
	public static void main(String[] args) {
		if (args.length > 0) {
			String s = args[0];
			try {
				int i = Integer.parseInt(s);
				if (i < 1 || i > 7) {
					System.out.println("Введенное число или меньше 1 или больше 7");
				} else if (i == 1) {
					System.out.println("Понедельник");
				} else if (i == 2) {
					System.out.println("Вторник");
				} else if (i == 3) {
					System.out.println("Среда");
				} else if (i == 4) {
					System.out.println("Четверг");
				} else if (i == 5) {
					System.out.println("Пятница");
				} else if ((i == 6) || (i == 7)) {
					System.out.println("Выходной");
				}
			} catch (NumberFormatException e) {
				System.out.println("Введенный аргумент не является целым числом.");
			}
		} else {
			System.out.println("Необходим аргумент ");
		}
	}
}
