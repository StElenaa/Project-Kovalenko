package com.company.lesson14;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Catalog {
	public static void printByName(Category... categories) {
		SortedSet<Product> sortByName = new TreeSet<>(new Comparator<Product>() {
			@Override
			public int compare(Product o1, Product o2) {
				if (o1.getNameProduct().equals(o2.getNameProduct())) {
					return 1;
				}
				return o1.getNameProduct().compareTo(o2.getNameProduct());
			}
		});
		for (Category c : categories) {
			sortByName.addAll(c.getSetOfProduct());
		}
		System.out.println("������ ������������� �� ������:");
		for (Product product : sortByName) {
			System.out.println(product);
		}
	}

	public static void printByPrice(Category... categories) {
		SortedSet<Product> sortByPrice = new TreeSet<>(new Comparator<Product>() {
			@Override
			public int compare(Product o1, Product o2) {
				double p1 = o1.getPrice();
				double p2 = o2.getPrice();
				return p1 < p2 ? -1 : 1;
			}
		});
		for (Category c : categories) {
			sortByPrice.addAll(c.getSetOfProduct());
		}
		System.out.println("������ ������������� �� ����:");
		for (Product product : sortByPrice) {
			System.out.println(product);
		}
	}

	public static void printByRating(Category... categories) {
		SortedSet<Product> sortByRating = new TreeSet<>(new Comparator<Product>() {

			@Override
			public int compare(Product o1, Product o2) {
				int p1 = o1.getRating();
				int p2 = o2.getRating();
				return p1 < p2 ? -1 : 1;
			}
		});
		for (Category c : categories) {
			sortByRating.addAll(c.getSetOfProduct());
		}
		System.out.println("������ ������������� �� ��������:");
		for (Product product : sortByRating) {
			System.out.println(product);
		}
	}

	public static void main(String[] args) {

		Category c1 = new Category("����");
		c1.addProduct(new Product("�����", 10.5, 1));
		c1.addProduct(new Product("�����", 5.5, 1));
		c1.addProduct(new Product("������", 20.5, 2));

		Category c2 = new Category("�������");
		c2.addProduct(new Product("�������", 100.5, 1));
		c2.addProduct(new Product("�������", 180.0, 2));

		Category c3 = new Category("������");
		c3.addProduct(new Product("��������", 200.5, 3));
		c3.addProduct(new Product("��������", 170.5, 3));
		c3.addProduct(new Product("�����", 100.0, 4));
		c3.addProduct(new Product("��������", 135.5, 3));
		c3.addProduct(new Product("��������", 117.5, 3));

		Category c4 = new Category("����������");
		c4.addProduct(new Product("���������", 50.7, 4));
		c4.addProduct(new Product("����������", 70.7, 4));

		printByName(c1, c2, c3, c4);
		System.out.println();
		printByPrice(c1, c2, c3, c4);
		System.out.println();
		printByRating(c1, c2, c3, c4);
	}
}
