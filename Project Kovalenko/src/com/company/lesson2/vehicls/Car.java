package com.company.lesson2.vehicls;

import com.company.lesson2.details.Engine;
import com.company.lesson2.professions.Driver;

public class Car {
	public static void main(String[] args) {
		Driver d = new Driver();
		Engine e = new Engine();
		// this is argument counter
		int count = 0;
		/*
		 * Цикл распечатки аргументов (строк) командной строки
		 */
		for (String str : args) {
			System.out.println(count++ + " - " + str);
		}
		// Print out boolean literal
		int a = 5;
		boolean b = true;
		b = a > 5;
		System.out.println("boolean literal = " + b);
		// Print out string literal
		System.out.println("string literal");
		// Вывод на консоль целочисленных литералов
		int c = 0b10001;
		System.out.println("двоичный целочисленный литерал = " + c);
		int v = 016;
		System.out.println("восьмиричный целочисленный литерал = " + v);
		int g = 1247;
		System.out.println("десятичный целочисленный литерал = " + g);
		int f = 0x7ddfffff;
		System.out.println("шестнадцатиричный целочисленный литерал = " + f);
		// Вывод на консоль литералов типа float и типа double
		float ft = 3658.3546f;
		System.out.println("литерал типа float = " + ft);
		double db = 36548.324530546;
		System.out.println("литерал типа double = " + db);
	}
}
