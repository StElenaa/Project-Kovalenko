package com.company.lesson4;

import java.util.Scanner;

public class GarlandSwitch {
	public static void main(String[] args) {
		int garland = 2873564;
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
	}

	/**
	 * ������� �������� �������� ���������� ���
	 * 
	 * @param count
	 *            - ���������� �������
	 * @param g
	 *            - ��������� ��������� ��������
	 */
	public static void blinkLamps(int count, int g) {
		int b = g;
		for (int i = 0; i < count; i++) {
			b = ~b;
			printState(b);
		}
	}

	/**
	 * ����� ������������� ������� ��������� ��������
	 * 
	 * @param i
	 *            - ������� ��������� ��������
	 */
	public static void printState(int i) {
		String s = Integer.toBinaryString(i);
		int nulls = 32 - s.length();
		for (int j = 0; j < nulls; j++) {
			System.out.print("0");
		}
		System.out.println(s);
	}

	/**
	 * ������ �������� � ������ ������� ������
	 */
	public static void runStr() {
		int l = 1;
		for (int i = 1; i <= 32; i++) {
			printState(l);
			l = l << 1;
		}
	}

	/**
	 * ����������� ��������� ������ ��������
	 * 
	 * @param g
	 *            - ��������� ��������
	 * @return true - �������� �����, false - �������� �� �����
	 */
	public static boolean firstLamp(int g) {
		return (g & 1) != 0;
	}
}