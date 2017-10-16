package com.company.lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class GarlandArray {
	public static void main(String[] args) {
		int[] garland = new int[] { 1, 3, 0, 9, 0, 1, 3, 0, 9, 0, 1, 3, 0, 9, 9, 0, 1, 3, 0, 0, 1, 3, 0, 9, 0, 3, 0, 9,
				9, 0, 5, 4 };

		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("������� ����� ��������: ");
		System.out.println("   1 - ��������� ��������� ��������");
		System.out.println("   2 - ��������� ������ ��������");
		System.out.println("   3 - �������");
		System.out.println("   4 - ������� ������");
		System.out.print(" > ");
		if (sc.hasNextInt()) {
			a = sc.nextInt();
			if (a < 1 || a > 4) {
				System.out.println("������ �������� ����� ��������");
			}
			switch (a) {
			case 1:
				System.out.println("��������� ��������� �������� - ");
				printState(garland);
				break;
			case 2:
				System.out.println("������ �������� - " + (firstLamp(garland) ? "�����" : "�� �����"));
				break;
			case 3:
				System.out.println("�������: ");
				blinkLamps(5, garland);
				break;
			case 4:
				System.out.println("������� ������ - ");
				runStr();
				break;
			}
		}
		sc.close();
	}

	/**
	 * ������� �������� �������� ���������� ���
	 * 
	 * @param count
	 *            - ���������� �������
	 * @param garland
	 *            - ��������� ��������� ��������
	 */
	public static void blinkLamps(int count, int[] garland) {
		int[] gcopy = new int[garland.length];
		System.arraycopy(garland, 0, gcopy, 0, garland.length);
		for (int i = 0; i < count; i++) {
			printState(gcopy);
			for (int j = 0; j < gcopy.length; j++) {
				if (gcopy[j] != 0) {
					gcopy[j] = 0;
				} else {
					gcopy[j] = 1;
				}
			}
		}
	}

	/**
	 * ����� ������������� ������� ��������� ��������
	 * 
	 * @param garland
	 *            - ������� ��������� ��������
	 */
	public static void printState(int[] garland) {
		System.out.println(Arrays.toString(garland));
	}

	/**
	 * ������ �������� � ������ ������� ������
	 */
	public static void runStr() {
		int[] garland = new int[32];
		Arrays.fill(garland, 0);
		garland[0] = 1;
		printState(garland);
		for (int i = 0; i < 31; i++) {
			System.arraycopy(garland, i, garland, i + 1, 1);
			garland[i] = 0;
			printState(garland);
		}
	}

	/**
	 * ����������� ��������� ������ ��������
	 * 
	 * @param garland
	 *            - ��������� ��������
	 * @return true - �������� �����, false - �������� �� �����
	 */
	public static boolean firstLamp(int[] garland) {
		return (garland[0] != 0);
	}
}
