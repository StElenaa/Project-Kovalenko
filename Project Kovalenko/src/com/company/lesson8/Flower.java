package com.company.lesson8;

/**
 * ����� "Flower", �������� ���������� ��� � ���� �������� ������ � ����.
 * ������� ������ Roses, Carnations, Tulips, Orchids, ����������� ����� Flower.
 * ���������� "Flower" �������� ����������� ����� ������������ ��������� ������,
 * ���� ����� ������������� � ������� �����������. ������� 3 ������
 * (������������ ������) � ������������ �� ���������. ���������� ����������
 * ��������� ������ (���������� ����������� �����).
 * 
 * @author Elen
 *
 */
abstract public class Flower {
	String name;
	int shelfLife;

	public Flower(String name, int shelfLife) {
		super();
		this.name = name;
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

	public static void main(String[] args) {
		Flower[] bouquet1 = new Flower[5];
		bouquet1[0] = new Roses();
		bouquet1[1] = new Carnations();
		bouquet1[2] = new Tulips();
		bouquet1[3] = new Orchids();
		bouquet1[4] = new Roses();
		int cost = sumCost(bouquet1);
		System.out.println("��������� ������� ������: " + sumCost(bouquet1));

		Flower[] bouquet2 = new Flower[3];
		bouquet2[0] = new Roses();
		bouquet2[1] = new Carnations();
		bouquet2[2] = new Tulips();
		cost = cost + sumCost(bouquet2);
		System.out.println("��������� ������� ������: " + sumCost(bouquet2));

		Flower[] bouquet3 = new Flower[5];
		bouquet3[0] = new Roses();
		bouquet3[1] = new Carnations();
		bouquet3[2] = new Tulips();
		bouquet3[3] = new Orchids();
		bouquet3[4] = new Roses();
		cost = cost + sumCost(bouquet3);
		System.out.println("��������� �������� ������: " + sumCost(bouquet3));
		System.out.println("\n���������� ��������� ������: " + (bouquet1.length + bouquet2.length + bouquet3.length)
				+ "\n����� ��������� ��������� ������: " + cost);
	}
}
