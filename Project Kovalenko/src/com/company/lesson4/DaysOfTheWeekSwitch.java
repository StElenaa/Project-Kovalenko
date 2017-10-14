package com.company.lesson4;

/**
 * ��������� �� ���� ��������� ����� �� 1 �� 7 � �������� ���������. ���� �����
 * ����� 1, ��������� �� ������� ������������, 2 ��������� � �.�. ���� 6 ��� 7
 * � ���������, ��������� switch.
 * 
 * @author Elen
 */
public class DaysOfTheWeekSwitch {
	public static void main(String[] args) {
		if (args.length > 0) {
			String s = args[0];
			try {
				int i = Integer.parseInt(s);
				if (i < 1 || i > 7) {
					System.out.println("��������� ����� ��� ������ 1 ��� ������ 7");
				}
				switch (i) {
				case 1:
					System.out.println("�����������");
					break;
				case 2:
					System.out.println("�������");
					break;
				case 3:
					System.out.println("�����");
					break;
				case 4:
					System.out.println("�������");
					break;
				case 5:
					System.out.println("�������");
					break;
				case 6:
				case 7:
					System.out.println("��������");
					break;
				}
			} catch (NumberFormatException e) {
				System.out.println("��������� �������� �� �������� ����� ������.");
			}
		} else {
			System.out.println("��������� �������� ");
		}
	}
}
