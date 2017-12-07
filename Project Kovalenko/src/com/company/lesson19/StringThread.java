package com.company.lesson19;

/**
 * ��� ������ ������� �������� ���� � ��� �� ������. ������ ����� ������� ��
 * ����� ���� ����� 100 ���, � ����� ����������� �������� ������� �� 1. ������
 * ����� ����������� Thread. ������������� ����� run(), ����� ���������
 * ������������������ ���� ����. ��� ���� ����� ��� �������-������ ����� ������
 * � ������ �������, ������ ����������� ����������� �� ���� StringBuilder
 * ������. ������������������ ���� ���� �������� ������� �� ������
 * StringBuilder. ������ ������������������� ����� ���� ��������� StringBuilder
 * �� ����� 100 ���, � ����� ������������ �������� ������� �� 1. � ������ main()
 * ������ ���� ������ ������ StringBuilder, ��������� ������ �a�.
 * 
 * @author Elen
 *
 */
public class StringThread extends Thread {
	private StringBuilder str;

	public StringThread(StringBuilder str) {
		this.str = str;
	}

	@Override
	public void run() {
		synchronized (str) {
			System.out.println(Thread.currentThread().getName());
			for (int i = 0; i < 100; i++) {
				System.out.print(str.charAt(0));
			}
			char c = str.charAt(0);
			str.setCharAt(0, ++c);
			System.out.println();
		}
	}
}
