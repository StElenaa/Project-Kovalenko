package com.company.lesson16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Catalog {
	public static void printSorted(String title, List<Producer> s, Comparator<Producer> c) {
		Collections.sort(s, c);
		System.out.println(title);
		for (Producer product : s) {
			System.out.println(product);
		}
	}

	public static void printRevers(String title, List<Producer> s) {
		System.out.println(title);
		Collections.reverse(s);
		for (Producer product : s) {
			System.out.println(product);
		}
	}

	public static void main(String[] args) {

		Category c1 = new Category("����");
		c1.addProduct(new Producer("�����", 10.5, 1));
		c1.addProduct(new Producer("�����", 5.5, 1));
		c1.addProduct(new Producer("������", 20.5, 2));

		List<Producer> s1 = new ArrayList<>(c1.getSetOfProduct());

		Category c2 = new Category("�������");
		c2.addProduct(new Producer("�������", 100.5, 1));
		c2.addProduct(new Producer("�������", 180.0, 2));

		s1.addAll(c2.getSetOfProduct());

		Category c3 = new Category("������");
		c3.addProduct(new Producer("��������", 200.5, 3));
		c3.addProduct(new Producer("��������", 170.5, 3));
		c3.addProduct(new Producer("�����", 100.0, 4));
		c3.addProduct(new Producer("��������", 135.5, 3));
		c3.addProduct(new Producer("��������", 117.5, 3));

		s1.addAll(c3.getSetOfProduct());

		Category c4 = new Category("����������");
		c4.addProduct(new Producer("���������", 50.7, 4));
		c4.addProduct(new Producer("����������", 70.7, 4));

		s1.addAll(c4.getSetOfProduct());

		printSorted("���������� �� ��������: ", s1, new Comparator<Producer>() {

			@Override
			public int compare(Producer o1, Producer o2) {
				int p1 = o1.getRating();
				int p2 = o2.getRating();
				return p1-p2;
			}
		});
		printRevers("������ �� ��������: ", s1);

		printSorted("���������� �� ������: ", s1, new Comparator<Producer>() {
			@Override
			public int compare(Producer o1, Producer o2) {
				return o1.getNameProduct().compareTo(o2.getNameProduct());
			}
		});
		printRevers("������ �� ������: ", s1);

		printSorted("���������� �� ����: ", s1, new Comparator<Producer>() {

			@Override
			public int compare(Producer o1, Producer o2) {
				double p1 = o1.getPrice();
				double p2 = o2.getPrice();
				return p1 < p2 ? -1 : 1;
			}
		});
		printRevers("������ �� ����: ", s1);
	}
}
