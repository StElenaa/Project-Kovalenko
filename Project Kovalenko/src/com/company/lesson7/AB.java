package com.company.lesson7;

/**
 * ���� ��� ����� ����� A � �. ��������� ��� ����� �� A �� B ������������, �
 * ������� �����������, ���� A < B, ��� � ������� �������� � ��������� ������.
 * ������������ ��������.
 * 
 * @author Elen
 *
 */
public class AB {

	public static void recurcivePrint(int a, int b) {
		if (a != b) {
			System.out.print(a + ",");
			a = a < b ? a + 1 : a - 1;
			recurcivePrint(a, b);
		} else {
			System.out.print(b);
		}
	}

	public static void main(String[] args) {
		recurcivePrint(50, 45);
	}
}
