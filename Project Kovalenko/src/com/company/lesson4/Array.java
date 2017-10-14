package com.company.lesson4;

/**
 * Массив типа String с размером 7 (дни недели). На консоль выводится значение
 * последнего элемента.
 * 
 * @author Elen
 */
public class Array {
	public static void main(String[] args) {
		String[] days;
		days = new String[7];
		days[0] = "Понедельник";
		days[1] = "Вторник";
		days[2] = "Среда";
		days[3] = "Четверг";
		days[4] = "Пятница";
		days[5] = "Суббота";
		days[6] = "Воскресенье";
		System.out.println(days[6]);
	}
}
