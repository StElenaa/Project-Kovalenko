package com.company.lesson2;

import java.util.Scanner;

public class SumOfTwoIntegers2 {

	/**
	 * ����� ���������� ��������� ����� �����
	 * 
	 * @param sc
	 *            - ������
	 * @return - ����� �����
	 * @throws Exception
	 *             - � ������, ���� ������� �� ����� �����
	 */
	public static int getInt(Scanner sc) throws Exception {
		System.out.print("������ ����� �����: ");
		if (sc.hasNextInt()) {
			return sc.nextInt();
		} else {
			throw new Exception();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int a = getInt(sc);
			int b = getInt(sc);
			System.out.println(a + " + " + b + " = " + (a + b));
		} catch (Exception e) {
			System.out.println("������� ����� ������ ����� �����");
		}
	}
}
