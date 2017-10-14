package com.company.lesson3;

public class PrintOdd {
	public static void main(String[] args) {
		if (args.length > 0) {
			String s = args[0];
			try {
				int i = Integer.parseInt(s);
				if (i % 2 != 0) {
					System.out.println("�������� " + i + " �������� �����.");
				}
			} catch (NumberFormatException e) {
				System.out.println("���������� ������ ���� ����� ����� ..... " + e);
			}
		} else {
			System.out.println("��������� �������� ");
		}

	}

}
