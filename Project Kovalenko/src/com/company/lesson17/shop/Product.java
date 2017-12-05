package com.company.lesson17.shop;

import java.util.Comparator;

public interface Product {
	public String getName();

	public float getPrice();

	public Comparator<Product> getComparator(String propName);
}
