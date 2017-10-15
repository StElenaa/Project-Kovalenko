package com.company.lesson5;

import java.util.Arrays;

/**
 * —оздание двухмерного массива 5х8, инициализаци€ с помощью блока дл€
 * инициализации. Ќахождение максимального и минимального значени€ в каждой
 * "строке" и запись этих значений в двухмерный массив 5х2. –аспечатка обоих
 * массивов.
 * 
 * @author Elen
 *
 */
public class MaxMinValueArray {
	public static void main(String[] args) {
		int array[][] = { { 1, 5, 3, 8, 11, 34, 1, 57 }, { 6, 7, 4, 16, 21, 82, 0, 33 },
				{ 7, 55, 7, 23, 16, 17, 21, 2 }, { 19, 53, 3, 16, 21, 18, 1 }, { 41, 16, 21, 90, 56, 3, 28, 11 } };
		int i = 0;
		int array2[][] = new int[5][2];
		System.out.println("»сходный массив\n");
		for (int[] is : array) {
			System.out.println(Arrays.toString(is));
			array2[i][0] = min(is);
			array2[i][1] = max(is);
			i++;
		}
		System.out.println("\nћинимальные и максимальные значени€ в строках исходного массива\n");
		System.out.println(Arrays.deepToString(array2));
	}

	/**
	 * ћетод возвращает минимальное значение в массиве
	 * 
	 * @param array
	 * @return
	 */
	public static int min(int[] array) {
		int min = array[0];
		for (int i = 1; i < array.length; i++) {
			if (min > array[i]) {
				min = array[i];
			}
		}
		return min;
	}

	/**
	 * ћетод возвращает максимальное значение в массиве
	 * 
	 * @param array
	 * @return
	 */
	public static int max(int[] array) {
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		return max;
	}
}
