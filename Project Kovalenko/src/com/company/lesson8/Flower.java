package com.company.lesson8;

/**
 * Класс "Flower", содержит переменные имя и срок хранения цветов в днях.
 * Созданы классы Roses, Carnations, Tulips, Orchids, расширяющие класс Flower.
 * Суперкласс "Flower" содержит абстрактный метод определяющий стоимость цветка,
 * этот метод переопределен в классах наследниках. Собрано 3 букета
 * (используется массив) с определением их стоимости. Подсчитано количество
 * проданных цветов (используем статический метод).
 * 
 * @author Elen
 *
 */
abstract public class Flower {
	private String name;
	private int shelfLife;

	public Flower(String name, int shelfLife) {
		this.name = name;
		this.shelfLife = shelfLife;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getShelfLife() {
		return shelfLife;
	}

	public void setShelfLife(int shelfLife) {
		this.shelfLife = shelfLife;
	}

	abstract public int getCost();

	public static int sumCost(Flower[] bouquet) {
		int cost = 0;
		for (Flower flower : bouquet) {
			cost = cost + flower.getCost();
		}
		return cost;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + shelfLife;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Flower other = (Flower) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (shelfLife != other.shelfLife)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Flower [name=" + name + ", shelfLife=" + shelfLife + "]";
	}

	public static void main(String[] args) {
		Flower[] bouquet1 = new Flower[5];
		bouquet1[0] = new Roses();
		bouquet1[1] = new Carnations();
		bouquet1[2] = new Tulips();
		bouquet1[3] = new Orchids();
		bouquet1[4] = new Roses();
		int cost = sumCost(bouquet1);
		System.out.println("Стоимость первого букета: " + sumCost(bouquet1));

		Flower[] bouquet2 = new Flower[3];
		bouquet2[0] = new Roses();
		bouquet2[1] = new Carnations();
		bouquet2[2] = new Tulips();
		cost = cost + sumCost(bouquet2);
		System.out.println("Стоимость второго букета: " + sumCost(bouquet2));

		Flower[] bouquet3 = new Flower[5];
		bouquet3[0] = new Roses();
		bouquet3[1] = new Carnations();
		bouquet3[2] = new Tulips();
		bouquet3[3] = new Orchids();
		bouquet3[4] = new Roses();
		cost = cost + sumCost(bouquet3);
		System.out.println("Стоимость третьего букета: " + sumCost(bouquet3));
		System.out.println("\nКоличество проданных цветов: " + (bouquet1.length + bouquet2.length + bouquet3.length)
				+ "\nОбщая стоимость проданных цветов: " + cost);
	}
}
