package com.company.lesson14;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Пользователь вводит набор чисел в виде одной строки. Удалены повторяющиеся
 * элементы в строке.
 * 
 * @author Elen
 *
 */
public class SetOfNumbers {

	public static void main(String[] args) {
		String str = "9, 10, 11, 1, 2, 3, 3, 4, 4, 5, 5";
		String[] s = str.split(",|\\s");
		Set<String> setStr = new LinkedHashSet<>();
		for (String string : s) {
			setStr.add(string);
		}
		for (String string : setStr) {
			System.out.print(string + " ");
		}
	}
}
