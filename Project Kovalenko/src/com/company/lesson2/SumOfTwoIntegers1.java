package com.company.lesson2;

import java.util.Scanner;

/**
 * ���������, ������� ��������� � ������� �� ����� ����� ���� ����� �����,
 * ��������� �������������. ���� ������������ ����������� ����� ���� �� ���� ��
 * �����, �� ��� ����� �������� �� ������
 * 
 * @author Elen
 *
 */
public class SumOfTwoIntegers1 {

	/**
	 * ����� ���������� ����� �����, ��������������� �� �������� ������, ���������
	 * ����������
	 * 
	 * @param sc
	 *            - ������ ���� Scanner
	 * @return - ����� �����
	 */
	public static int getInt(Scanner sc) {
		System.out.print("������� ����� �����: ");
		return sc.nextInt();
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
