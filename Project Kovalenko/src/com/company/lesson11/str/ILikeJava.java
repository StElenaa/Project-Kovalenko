package com.company.lesson11.str;

public class ILikeJava {

	public static void main(String[] args) {
		String str = "I like Java!!!";
		System.out.println("Позиция подстроки 'Java' в строке 'I like Java!!!' - " + str.lastIndexOf("Java"));
		System.out.println(
				"В строке 'I like Java!!!' меняем все символы 'а' на 'о' - " + "I like Java!!!".replace('a', 'o'));
		System.out.println("Преобразуем строку к верхнему регистру - " + "I like Java!!!".toUpperCase());
		System.out.println("Преобразуем строку к нижнему регистру - " + "I like Java!!!".toLowerCase());
		String s = "'I like Java!!!'";
		int index = s.indexOf("Java");
		s = "Вырезаем подстроку Java в строке 'I like Java!!!' - " + s.substring(0, index)
				+ s.substring(index + "Java".length());
		System.out.println(s);
	}
}
