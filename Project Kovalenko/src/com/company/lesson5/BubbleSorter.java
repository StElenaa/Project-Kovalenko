package com.company.lesson5;

import java.util.Arrays;

public class BubbleSorter {
	public static void main(String[] args) {
		int[] array = new int[] { 5, 2, 3, 1, 4 };
		System.out.println(Arrays.toString(array));
		bubbleSort(array);
		System.out.println(Arrays.toString(array));
	}

	/**
	 * ����� ��������� �������� ������ �� �������� � �������� �������� ���������.
	 * ������������� ��������� ��������� ����������.
	 * 
	 * @param array
	 *            - ����������� ������
	 */
	public static void bubbleSort(int[] array) {
		boolean fin = false;
		int maxCount = array.length * (array.length - 1);
		int count = 0;
		for (int i = 0; i < array.length && !fin; i++) {
			fin = true;
			for (int j = 1; j < array.length; j++) {
				count++;
				if (array[j - 1] < array[j]) {
					fin = false;
					int tmp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = tmp;
				}
			}
		}
		System.out.println("������������ ���������� ������ - " + maxCount);
		System.out.println("�������� ���������� ������ - " + count);
		if (maxCount > count) {
			System.out.println("��������� ��������� ����������");
		}
	}
}
