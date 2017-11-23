package com.company.lesson15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.company.lesson14.HeavyBox;

/**
 * Создана коллекция, содержащая объекты HeavyBox. Метод getBoxes перебирает
 * элементы коллекции и проверяет вес коробок. Если вес коробки больше 300 гр,
 * коробка перемещается в другую коллекцию.
 * 
 * @author Elen
 *
 */
public class WeightOfBoxes {

	public static void main(String[] args) {
		List<HeavyBox> boxes = new ArrayList<>();
		boxes.add(new HeavyBox(34, 76, 9, 170));
		boxes.add(new HeavyBox(34, 76, 9, 305));
		boxes.add(new HeavyBox(34, 76, 9, 140));
		boxes.add(new HeavyBox(34, 76, 9, 340));
		System.out.println(getBoxes(boxes));
		System.out.println(boxes);
	}

	public static List<HeavyBox> getBoxes(List<HeavyBox> boxes) {
		List<HeavyBox> newList = new ArrayList<>();
		Iterator<HeavyBox> iterator = boxes.iterator();
		while (iterator.hasNext()) {
			HeavyBox heavyBox = (HeavyBox) iterator.next();
			if (heavyBox.getWeight() > 300) {
				iterator.remove();
				newList.add(heavyBox);
			}
		}
		return newList;
	}
}
