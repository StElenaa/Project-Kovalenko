package com.company.lesson3;

public class Garland {
	public static void main(String[] args) {
		int garland = 2873564;
		System.out.println("��������� ��������� �������� - ");
		printState(garland);
		System.out.println("������ �������� - " + (firstLamp(garland) ? "�����" : "�� �����"));
		System.out.println("�������: ");
		blinkLamps(5, garland);
		System.out.println("������� ������ - ");
		runStr();
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
