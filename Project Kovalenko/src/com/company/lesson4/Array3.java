package com.company.lesson4;

/**
 * Создание и распечатка массива типа String размером 3х6 с заданными
 * значениями.
 * 
 * @author Elen
 *
 */
public class Array3 {
	public static void main(String[] args) {
		char c = 'a';
		String[][] array = new String[3][6];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 6; j++) {
				array[i][j] = c + "" + (j + 1);
			}
			c++;
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
}