package com.company.lesson7;

/**
 * Даны два целых числа A и В. Выводятся все числа от A до B включительно, в
 * порядке возрастания, если A < B, или в порядке убывания в противном случае.
 * Используется рекурсия.
 * 
 * @author Elen
 *
 */
public class AB {

	public static void recurcivePrint(int a, int b) {
		if (a != b) {
			System.out.print(a + ",");
			a = a < b ? a + 1 : a - 1;
			recurcivePrint(a, b);
		} else {
			System.out.print(b);
		}
	}

	public static void main(String[] args) {
		recurcivePrint(50, 45);
	}
}
