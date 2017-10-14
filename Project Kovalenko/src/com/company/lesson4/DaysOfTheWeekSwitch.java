package com.company.lesson4;

/**
 * Передатча на вход программы число От 1 до 7 в качестве аргумента. Если число
 * равно 1, выводится на консоль “Понедельник”, 2 –”Вторник” и т.д. Если 6 или 7
 * – “Выходной”, используя switch.
 * 
 * @author Elen
 */
public class DaysOfTheWeekSwitch {
	public static void main(String[] args) {
		if (args.length > 0) {
			String s = args[0];
			try {
				int i = Integer.parseInt(s);
				if (i < 1 || i > 7) {
					System.out.println("Введенное число или меньше 1 или больше 7");
				}
				switch (i) {
				case 1:
					System.out.println("Понедельник");
					break;
				case 2:
					System.out.println("Вторник");
					break;
				case 3:
					System.out.println("Среда");
					break;
				case 4:
					System.out.println("Четверг");
					break;
				case 5:
					System.out.println("Пятница");
					break;
				case 6:
				case 7:
					System.out.println("Выходной");
					break;
				}
			} catch (NumberFormatException e) {
				System.out.println("Введенный аргумент не является целым числом.");
			}
		} else {
			System.out.println("Необходим аргумент ");
		}
	}
}
