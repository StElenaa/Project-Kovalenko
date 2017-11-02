package com.company.lesson10.clothes;

/**
 * —оздано перечисление SizeClothes, содержащее размеры одежды (XXS,XS,S,M,L).
 * ѕеречисление содержит метод getDescription, возвращающий строку "¬зрослый
 * размер", который переопределен дл€ константы XXS метод возвращает строку
 * Уƒетский размерФ. “акже перечисление содержит числовое значение euroSize,
 * соответствующее каждому размеру. —оздан конструктор, принимающий на вход
 * euroSize.—озданы интерфейсы "ћужска€ ќдежда" с методом "одетьћужчину" и
 * "∆енска€ ќдежда" с методом "одеть∆енщину". —оздан абстрактный класс ќдежда,
 * содержащий переменные - размер одежды, стоимость, цвет. —озданы классы
 * наследники ќдежды - ‘утболка (реализует интерфейсы "ћужска€ ќдежда" и
 * "∆енска€ ќдежда"), Ўтаны (реализует интерфейсы "ћужска€ ќдежда" и "∆енска€
 * ќдежда"), ёбка (реализует интерфейсы "∆енска€ ќдежда"), √алстук (реализует
 * интерфейсы "ћужска€ ќдежда"). —оздан массив, содержащий все типы одежды.
 * —оздан класс јтелье, содержащий методы одеть∆енщину, одетьћужчину, на вход
 * которых поступает массив, содержащий все типы одежды. ћетод одеть∆енщину
 * выводит на консоль всю информацию о женской одежде. ћетод одетьћужчину
 * выводит на консоль всю информацию о мужской одежде.
 * 
 * @author Elen
 *
 */
public class Atelier {

	public static void clotheMan(Clothes[] clothes) {
		for (Clothes cl : clothes) {
			if (!(cl instanceof Skirt)) {
				System.out.println(((ManClothing) cl).clotheMan());
			}
		}
	}

	public static void clotheWoman(Clothes[] clothes) {
		for (Clothes cl : clothes) {
			if (!(cl instanceof Cravat)) {
				System.out.println(((WomanClothing) cl).clotheWoman());
			}
		}
	}

	public static void main(String[] args) {
		Clothes[] cl = new Clothes[] { new TeeShirt(SizeClothes.L, 50, "красный"),
				new Skirt(SizeClothes.M, 70, "зеленый"), new Pants(SizeClothes.S, 80, "синий"),
				new Cravat(SizeClothes.XXS, 60, "желтый") };
		clotheMan(cl);
		System.out.println();
		clotheWoman(cl);
	}
}
