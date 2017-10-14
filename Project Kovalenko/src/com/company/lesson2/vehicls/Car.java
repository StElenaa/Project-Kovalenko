package com.company.lesson2.vehicls;

import com.company.lesson2.details.Engine;
import com.company.lesson2.professions.Driver;

public class Car {
	public static void main(String[] args) {
		Driver d = new Driver();
		Engine e = new Engine();
		// this is argument counter
		int count = 0;
		/*
		 * ���� ���������� ���������� (�����) ��������� ������
		 */
		for (String str : args) {
			System.out.println(count++ + " - " + str);
		}
		// Print out boolean literal
		int a = 5;
		boolean b = true;
		b = a > 5;
		System.out.println("boolean literal = " + b);
		// Print out string literal
		System.out.println("string literal");
		// ����� �� ������� ������������� ���������
		int c = 0b10001;
		System.out.println("�������� ������������� ������� = " + c);
		int v = 016;
		System.out.println("������������ ������������� ������� = " + v);
		int g = 1247;
		System.out.println("���������� ������������� ������� = " + g);
		int f = 0x7ddfffff;
		System.out.println("����������������� ������������� ������� = " + f);
		// ����� �� ������� ��������� ���� float � ���� double
		float ft = 3658.3546f;
		System.out.println("������� ���� float = " + ft);
		double db = 36548.324530546;
		System.out.println("������� ���� double = " + db);
	}
}
