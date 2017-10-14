package com.company.lesson4;

/**
 * Распечатка всех чисел от 1 до 100, которые делятся на 5 без остатка с
 * использованием цикла do-while.
 * 
 * @author Elen
 *
 */
public class DivisionByFive {
	public static void main(String[] args) {
		int i = 1;
		do {
			if (i % 5 == 0) {
				System.out.println(i);
			}
			i++;
		} while (i >= 1 && i <= 100);
	}
}