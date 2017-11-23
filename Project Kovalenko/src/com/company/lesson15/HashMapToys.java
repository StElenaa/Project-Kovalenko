package com.company.lesson15;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Создан HashMap, содержащий пары значений - имя игрушки и объект игрушки
 * (класс Toy). Перебраются и распечатываются пары значений - entrySet().
 * Перебрается и распечатывается набор из имен игрушек - keySet(). Перебраются и
 * распечатываются значения игрушек - values(). Для каждого перебора создан свой
 * метод.
 * 
 * @author Elen
 *
 */
public class HashMapToys {

	public static void main(String[] args) {
		Map<String, Toy> map = new HashMap<>();
		map.put("Doll", new Toy("Doll", 30));
		map.put("Car", new Toy("Car", 40));
		map.put("Ball", new Toy("Ball", 50));

		iterateValues(map);
		iterateKeys(map);
		iterateEntries(map);
	}

	private static void iterateValues(Map<String, Toy> map) {
		Collection<Toy> values = map.values();
		for (Toy value : values) {
			System.out.println("Value - " + value + " - ");
		}
	}

	private static void iterateKeys(Map<String, Toy> map) {
		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.print("Key - " + key + " - ");
			System.out.println(map.get(key));
		}
	}

	private static void iterateEntries(Map<String, Toy> map) {
		Set<Map.Entry<String, Toy>> entries = map.entrySet();
		for (Entry<String, Toy> entry : entries) {
			System.out.print("Entry - " + entry.getKey() + " - ");
			System.out.println(entry.getValue());
		}
	}
}
