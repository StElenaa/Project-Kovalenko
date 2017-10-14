package com.company.lesson4;

/**
 * ���������� �������� ���������� ��������� ���� for. ����� n �������� ���������
 * �������. ������������ Math.random())
 * 
 * @author Elen
 *
 */
public class Factorial {
	public static double getRandom(int n) {
		return Math.random() * n;
	}

	public static void main(String[] args) {
		long n = (long) (Math.random() * 100);
		double f = 1;
		for (double i = 1; i <= n; i++) {
			f = f * i;
		}
		System.out.println(n + "! = " + f);
	}
}
