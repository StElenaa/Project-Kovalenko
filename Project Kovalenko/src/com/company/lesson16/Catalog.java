package com.company.lesson16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Catalog {
	public static void printSorted(String title, List<Product> l, Comparator<Product> c) {
		Collections.sort(l, c);
		System.out.println(title);
		for (Product product : l) {
			System.out.println(product);
		}
	}

	public static void printRevers(String title, List<Product> l) {
		System.out.println(title);
		Collections.reverse(l);
		for (Product product : l) {
			System.out.println(product);
		}
	}

	public static void main(String[] args) {

		Category c1 = new Category("����");
		c1.addProduct(new Product("�����", 10.5, 1));
		c1.addProduct(new Product("�����", 5.5, 1));
		c1.addProduct(new Product("������", 20.5, 2));

		List<Product> l1 = new ArrayList<>(c1.getSetOfProduct());

		Category c2 = new Category("�������");
		c2.addProduct(new Product("�������", 100.5, 1));
		c2.addProduct(new Product("�������", 180.0, 2));

		l1.addAll(c2.getSetOfProduct());

		Category c3 = new Category("������");
		c3.addProduct(new Product("��������", 200.5, 3));
		c3.addProduct(new Product("��������", 170.5, 3));
		c3.addProduct(new Product("�����", 100.0, 4));
		c3.addProduct(new Product("��������", 135.5, 3));
		c3.addProduct(new Product("��������", 117.5, 3));

		l1.addAll(c3.getSetOfProduct());

		Category c4 = new Category("����������");
		c4.addProduct(new Product("���������", 50.7, 4));
		c4.addProduct(new Product("����������", 70.7, 4));

		l1.addAll(c4.getSetOfProduct());

		printSorted("���������� �� ��������: ", l1, new Comparator<Product>() {

			@Override
			public int compare(Product o1, Product o2) {
				int p1 = o1.getRating();
				int p2 = o2.getRating();
				return p1 < p2 ? -1 : 1;
			}
		});
		printRevers("������ �� ��������: ", l1);

		printSorted("���������� �� ������: ", l1, new Comparator<Product>() {
			@Override
			public int compare(Product o1, Product o2) {
				return o1.getNameProduct().compareTo(o2.getNameProduct());
			}
		});
		printRevers("������ �� ������: ", l1);

		printSorted("���������� �� ����: ", l1, new Comparator<Product>() {

			@Override
			public int compare(Product o1, Product o2) {
				double p1 = o1.getPrice();
				double p2 = o2.getPrice();
				return p1 < p2 ? -1 : 1;
			}
		});
		printRevers("������ �� ����: ", l1);
	}
}
