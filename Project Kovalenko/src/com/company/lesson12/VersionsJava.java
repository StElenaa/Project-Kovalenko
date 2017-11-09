package com.company.lesson12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ���� ������ �Versions: Java 5, Java 6, Java 7, Java 8.�. ���������� ����� ���
 * ��������� "Java X" � ����������� ��
 * 
 * @author Elen
 *
 */
public class VersionsJava {

	public static void main(String[] args) {

		String regex = "(Java\\s*\\d)";
		String s = "Versions: Java  5, Java 6, Java   7, Java 8.";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(s);
		while (matcher.find()) {
			System.out.println("" + matcher.group());
		}
	}
}
