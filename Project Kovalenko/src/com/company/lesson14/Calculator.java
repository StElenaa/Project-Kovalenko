package com.company.lesson14;

/**
 * Класс Калькулятор (необобщенный), который содержит обобщенные статические
 * методы - sum, multiply, divide, subtraction. Параметры этих методов - два
 * числа разного типа, над которыми должна быть произведена операция
 * 
 * @author Elen
 *
 */
public class Calculator {
	static <A extends Number, B extends Number> Number sum(A a, B b) {
		return a.doubleValue() + b.doubleValue();
	}

	static <A extends Number, B extends Number> Number multiply(A a, B b) {
		return a.doubleValue() * b.doubleValue();
	}

	static <A extends Number, B extends Number> Number divide(A a, B b) {
		return a.doubleValue() / b.doubleValue();
	}

	static <A extends Number, B extends Number> Number subtraction(A a, B b) {
		return a.doubleValue() - b.doubleValue();
	}

	public static void main(String[] args) {
		float a = 2.3f;
		float b = 3.2f;
		System.out.println(sum(a, b));
		System.out.println(multiply(a, b));
		System.out.println(divide(a, b));
		System.out.println(subtraction(a, b));
	}
}
