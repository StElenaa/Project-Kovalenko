package com.company.lesson12;

import java.util.HashSet;
import java.util.Set;

public class Words {

	public static int quantity(String s) {
		Set<Character> c = new HashSet<Character>();
		for (Character character : s.toCharArray()) {
			c.add(character);
		}
		return c.size();
	}

	public static boolean isLatin(String s) {
		return s.matches("[a-z,A-Z]+");
	}

	public static boolean isDigits(String s) {
		return s.matches("\\d+");
	}

	public static String revers(String s) {
		StringBuffer s1 = new StringBuffer(s);
		return s1.reverse().toString();
	}

	public static void main(String[] args) {
		String s = "Creating t2he fir1st th3e application the and абв";
		String s1 = "Если есть хвосты по дз, начните с 1 не сданного задания. 12,3 123 324 111 4554.";
		String[] words = s.split("\\W+");
		String[] words1 = s1.split("\\W+");
		int n = quantity(words[0]);
		int i = 0;
		String min = words[0];
		for (String word : words) {
			if (quantity(word) < n) {
				n = quantity(word);
				min = word;
			}
			if (isLatin(word)) {
				i++;
			}
		}
		System.out.println("Первое слово в строке, в котором число различных символов минимально - " + min + "\n");
		System.out.println("Количество слов с латинскими символами - " + i + "\n");
		System.out.println("Среди слов, состоящих только из цифр, имеются следующие слова-палиндромы:");
		for (String word : words1) {
			if (isDigits(word)) {
				if (word.equals(revers(word))) {
					System.out.println(word);
				}
			}
		}
	}
}
