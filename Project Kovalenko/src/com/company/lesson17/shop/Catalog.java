package com.company.lesson17.shop;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Catalog implements Serializable {

	private static final long serialVersionUID = 1L;
	private String name;
	private Map<Product, Integer> products;

	public Catalog(String name, Map<Product, Integer> products) {
		this.name = name;
		this.products = products;
	}

	public Catalog(String name) {
		this.name = name;
		this.products = new HashMap<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<Product, Integer> getProducts() {
		return products;
	}

	public void setProducts(Map<Product, Integer> products) {
		this.products = products;
	}

	public void addProducts(Product product, int q) {
		Integer quantity = products.get(product);
		if (quantity != null) {
			products.put(product, quantity.intValue() + q);
		} else {
			products.put(product, q);
		}
	}

	public void removeProducts(Product product, int q) {
		int quantity = products.get(product);
		if (quantity <= q) {
			products.remove(product);
		} else {
			products.put(product, quantity - q);
		}
	}

	public List<Product> getSorted(Comparator<Product> c) {
		List<Product> sorted = new ArrayList<>(products.keySet());
		Collections.sort(sorted, c);
		return sorted;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((products == null) ? 0 : products.hashCode());
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
		Catalog other = (Catalog) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (products == null) {
			if (other.products != null)
				return false;
		} else if (!products.equals(other.products))
			return false;
		return true;
	}
}
