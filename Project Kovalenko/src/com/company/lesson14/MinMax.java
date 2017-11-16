package com.company.lesson14;

import java.util.Arrays;

/**
 * Обобщенный класс MinMax, который содержит методы для нахождения минимального
 * и максимального элемента массива. Массив является переменной класса. Массив
 * должен передаваться в класс через конструктор
 * 
 * @author Elen
 *
 * @param <M>
 */
public class MinMax<M extends Number> {
	private M[] array;

	public MinMax(M[] array) {
		this.array = array;
	}

	public M[] getArray() {
		return array;
	}

	public void setArray(M[] array) {
		this.array = array;
	}

	public M min() {
		M min = array[0];
		for (int i = 1; i < array.length; i++) {
			if (min.doubleValue() > array[i].doubleValue()) {
				min = array[i];
			}
		}
		return min;
	}

	public M max() {
		M max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (max.doubleValue() < array[i].doubleValue()) {
				max = array[i];
			}
		}
		return max;
	}

	@Override
	public String toString() {
		return "MinMax [array=" + Arrays.toString(array) + "]";
	}

	public static void main(String[] args) {
		MinMax<Number> minMax = new MinMax<>(new Float[] { 1.5f, 1.1f, 2.9f, 2.7f });
		System.out.println("Минимальный элемент массива - " + minMax.min());
		System.out.println("Максимальный элемент массива - " + minMax.max());
	}
}
