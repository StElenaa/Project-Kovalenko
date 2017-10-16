package com.company.lesson5;

import java.util.Arrays;

public class SelectionSorter {
	public static void main(String[] args) {
		int[] garland = new int[] { 3, 3, 3, 0, 9, 0, 3 };
		sort(garland);
		System.out.println(Arrays.toString(garland));
	}

	/**
	 * ���������� ������� �������. �������� ����� ��������, ���� ���������
	 * ����������� ������� ����� array[i].
	 * 
	 * @param array
	 *            - ����������� ������
	 */
	public static void sort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int k = i;
			int x = array[i];
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < x) {
					k = j;
					x = array[j];
				}
			}
			if (array[k] != array[i]) {
				array[k] = array[i];
				array[i] = x;
			}
		}
	}
}
