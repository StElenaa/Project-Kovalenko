package com.company.lesson17.shop;

import java.util.Comparator;

public interface Product {
	String getName();

	float getPrice();

	Comparator<Product> getComparator(String propName);
}
