package com.company.lesson17.shop;

import java.util.Comparator;

public class Cravat implements Product {
	private String name;
	private float price;
	private int size;
	private String color;

	public Cravat(String name, float price, int size, String color) {
		this.name = name;
		this.price = price;
		this.size = size;
		this.color = color;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public float getPrice() {
		return price;
	}

	@Override
	public Comparator<Product> getComparator(String propName) {
		Comparator<Product> c;
		if ("color".equals(propName)) {
			c = new Comparator<Product>() {
				@Override
				public int compare(Product o1, Product o2) {
					return ((Cravat) o1).getColor().compareTo(((Cravat) o2).getColor());
				}
			};
		} else if ("price".equals(propName)) {
			c = new Comparator<Product>() {
				@Override
				public int compare(Product o1, Product o2) {
					float p1 = ((Cravat) o1).getPrice();
					float p2 = ((Cravat) o2).getPrice();
					return p1 == p2 ? 0 : p1 > p2 ? 1 : -1;
				}
			};
		} else if ("size".equals(propName)) {
			c = new Comparator<Product>() {
				@Override
				public int compare(Product o1, Product o2) {
					int p1 = ((Cravat) o1).getSize();
					int p2 = ((Cravat) o2).getSize();
					return p1 - p2;
				}
			};
		} else {
			c = new Comparator<Product>() {
				@Override
				public int compare(Product o1, Product o2) {
					return ((Cravat) o1).getName().compareTo(((Cravat) o2).getName());
				}
			};
		}
		return c;
	}

	@Override
	public String toString() {
		return "Cravat [name=" + name + ", price=" + price + ", size=" + size + ", color=" + color + "]";
	}
}
