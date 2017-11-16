package com.company.lesson14;

import java.util.HashSet;
import java.util.Set;

/**
 * Методы union(Set<?> set1, Set<?> set2) и intersect(Set<?> set1, Set<?> set2),
 * реализующие операции объединения и пересечения двух множеств.
 * 
 * @author Elen
 *
 */
public class UnionSet {

	public static Set<?> union(Set<?> set1, Set<?> set2) {
		Set<Object> result = new HashSet<>();
		result.addAll(set1);
		result.addAll(set2);
		return result;
	}

	public static Set<?> intersect(Set<?> set1, Set<?> set2) {
		Set<Object> result = new HashSet<>();
		result.addAll(set1);
		result.retainAll(set2);
		return result;
	}

	public static void main(String[] args) {
		Set<String> set1 = new HashSet<>();
		set1.add("string1");
		set1.add("string2");
		set1.add("string3");
		set1.add("string4");
		set1.add("string5");
		Set<String> set2 = new HashSet<>();
		set2.add("string1");
		set2.add("string2");
		set2.add("string6");
		set2.add("string7");
		set2.add("string8");
		System.out.println("Union:");
		for (Object string : union(set1, set2)) {
			System.out.println(string);
		}
		System.out.println("Intersect:");
		for (Object string : intersect(set1, set2)) {
			System.out.println(string);
		}
	}
}
