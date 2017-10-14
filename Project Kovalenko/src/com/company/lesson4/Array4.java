package com.company.lesson4;

import java.util.Arrays;

/**
 * Создание двумерного массива типа char размером 4х2. Ззначения записаны с
 * помощью блока для инициализации. Распечатка значений массива с помощью метода
 * Arrays.deepToString(m)
 * 
 * @author Elen
 *
 */
public class Array4 {
	public static void main(String[] args) {
		char array[][] = { { 'a', 'b' }, { 'c', 'd' }, { 'e', 'f' }, { 'g', 'h' } };
		System.out.println(Arrays.deepToString(array));
	}
}