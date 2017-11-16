package com.company.lesson14;

import java.util.ArrayList;
import java.util.List;

/**
 * Динамический массив, содержащий объекты класса HeavyBox.
 * 
 * @author Elen
 *
 */
public class DinMassiv extends HeavyBox {
	public static void main(String[] args) {
		List<HeavyBox> boxes = new ArrayList<>();
		boxes.add(new HeavyBox(1, 2, 3, 4));
		boxes.add(new HeavyBox(2, 3, 4, 5));

		HeavyBox[] objectArray = boxes.toArray(new HeavyBox[0]);
		for (HeavyBox heavyBox : objectArray) {
			System.out.println(heavyBox);
		}
	}
}
