package com.company.lesson14;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * TreeSet содержащий HeavyBox. HeavyBox реализует интерфейс Comparable.
 * 
 * @author Elen
 *
 */
public class PrintTreeSet {

	public static void main(String[] args) {
		SortedSet<HeavyBox> set = new TreeSet<HeavyBox>();
		set.add(new HeavyBox(1, 2, 3, 4));
		set.add(new HeavyBox(1, 2, 3, 4));
		set.add(new HeavyBox(1, 4, 2, 1));
		set.add(new HeavyBox(1, 2, 3, 5));
		for (HeavyBox heavyBox : set) {
			System.out.println(heavyBox);
		}
	}
}
