package com.company.lesson3;

/**
 * �������� �� ���� ��������� ����� �� 1 �� 7 � �������� ���������. ���� �����
 * ����� 1, ������� �� ������� ������������, 2 ��������� � �.�. ���� 6 ��� 7 �
 * ���������, ��������� ����������� if-else-if.
 * 
 * @author Elen
 *
 */
public class DaysOfTheWeek {
	public static void main(String[] args) {
		if (args.length > 0) {
			String s = args[0];
			try {
				int i = Integer.parseInt(s);
				if (i < 1 || i > 7) {
					System.out.println("��������� ����� ��� ������ 1 ��� ������ 7");
				} else if (i == 1) {
					System.out.println("�����������");
				} else if (i == 2) {
					System.out.println("�������");
				} else if (i == 3) {
					System.out.println("�����");
				} else if (i == 4) {
					System.out.println("�������");
				} else if (i == 5) {
					System.out.println("�������");
				} else if ((i == 6) || (i == 7)) {
					System.out.println("��������");
				}
			} catch (NumberFormatException e) {
				System.out.println("��������� �������� �� �������� ����� ������.");
			}
		} else {
			System.out.println("��������� �������� ");
		}
	}
}
