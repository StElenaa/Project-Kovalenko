package com.company.lesson11.str;

public class ILikeJava {

	public static void main(String[] args) {
		String str = "I like Java!!!";
		System.out.println("������� ��������� 'Java' � ������ 'I like Java!!!' - " + str.lastIndexOf("Java"));
		System.out.println(
				"� ������ 'I like Java!!!' ������ ��� ������� '�' �� '�' - " + "I like Java!!!".replace('a', 'o'));
		System.out.println("����������� ������ � �������� �������� - " + "I like Java!!!".toUpperCase());
		System.out.println("����������� ������ � ������� �������� - " + "I like Java!!!".toLowerCase());
		String s = "'I like Java!!!'";
		int index = s.indexOf("Java");
		s = "�������� ��������� Java � ������ 'I like Java!!!' - " + s.substring(0, index)
				+ s.substring(index + "Java".length());
		System.out.println(s);
	}
}
