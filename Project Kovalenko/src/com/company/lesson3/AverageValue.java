package com.company.lesson3;

public class AverageValue {
	public static void main(String[] args) {
		int count = 0;
		double i = 0;
		if (args.length > 0) {
			try {
				for (String s : args) {
					i = i + Double.parseDouble(s);
					count++;
				}
				System.out.println("Среднее значение = " + i / count);
			} catch (NumberFormatException e) {
				System.out.println("Аргументами должны быть вещественные числа ");
			}
		} else {
			System.out.println("Необходим аргумент ");
		}
	}
}