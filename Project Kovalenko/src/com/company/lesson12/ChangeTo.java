package com.company.lesson12;

/**
 * ����� �������� � ������ ��� ��������� �object oriented programming�(��
 * ����������� ������� ��������) �� �OOP�.
 * 
 * @author Elen
 *
 */
public class ChangeTo {
	public static String replacer(String s) {
		return s.replace("Object-oriented programming", "OOP");
	}

	public static void main(String[] args) {
		String s = "Object-oriented programming uses objects. Object-oriented programming developed as the dominant programming methodology in the early and ...";
		System.out.println(replacer(s));
	}
}
