package com.company.lesson14;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Создана очередь, содержащая объекты класса HeavyBox. Используется класс
 * ArrayDeque. Объекты помещены в очередь с помощью метода offer(). Удалены
 * объекты методом poll().
 * 
 * @author Elen
 *
 */
public class MyQueue {

	public static void main(String[] args) {
		Deque<HeavyBox> arrHeavy = new ArrayDeque<>();
		HeavyBox hb1 = new HeavyBox(1, 2, 3, 4);
		HeavyBox hb2 = new HeavyBox(5, 6, 7, 8);
		HeavyBox hb3 = new HeavyBox(9, 10, 11, 12);
		HeavyBox hb4 = new HeavyBox(13, 14, 15, 16);
		arrHeavy.offer(hb1);
		arrHeavy.offer(hb2);
		arrHeavy.offer(hb4);
		arrHeavy.offer(hb3);
		while (!arrHeavy.isEmpty()) {
			System.out.println(arrHeavy.poll());
		}
	}
}
