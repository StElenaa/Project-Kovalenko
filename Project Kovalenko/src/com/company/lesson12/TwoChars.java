package com.company.lesson12;

/**
 * ƒаны строки разной длины (длина - четное число), необходимо вернуть ее два
 * средних знака: "string" - "ri", "code" - "od", "Practice"-"ct"
 * 
 * @author Elen
 *
 */
public class TwoChars {

	public static String chars(String s) {
		int idx = s.length() / 2;
		return s.substring(idx - 1, idx + 1);
	}

	public static void main(String[] args) {
		System.out.println(chars("string"));
		System.out.println(chars("code"));
		System.out.println(chars("Practice"));
	}
}
