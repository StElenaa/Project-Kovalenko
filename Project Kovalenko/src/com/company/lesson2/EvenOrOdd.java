package com.company.lesson2;

import java.util.Scanner;

/**
 * ���������, ������� ��������, ����� �������� ����� �����, ���������
 * �������������, ������ ��� ��������. ���� ������������� ������� �� �����
 * �����, �� ��� ���������� �� ������
 * 
 * @author Elen
 *
 */
public class EvenOrOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		System.out.print("������� ����� �����: ");
		if (sc.hasNextInt()) {
			i = sc.nextInt();
			int b = i / 2;
			if (b * 2 == i) {
				System.out.println("�� ����� ������ �����");
			} else {
				System.out.println("�� ����� �������� �����");
			}
		} else {
			System.out.println("�� ����� �� ����� �����");
		}
	}
}
