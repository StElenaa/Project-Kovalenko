package com.company.lesson5;

import java.util.Arrays;

public class BubbleSorter {
	public static void main(String[] args) {
		int[] array = new int[] { 12, 13, 17, 5, 50 };
		bubbleSort(array);
		System.out.println(Arrays.toString(array));
	}

	public static void bubbleSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j < array.length; j++) {
				if (array[j - 1] < array[j]) {
					int tmp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = tmp;
				}
			}
		}
	}
}
