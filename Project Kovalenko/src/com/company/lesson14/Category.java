package com.company.lesson14;

import java.util.HashSet;
import java.util.Set;

public class Category {
	private String nameCategory;
	private Set<Product> setOfProduct;

	public Category(String nameCategory) {
		this.nameCategory = nameCategory;
		this.setOfProduct = new HashSet<>();
	}

	public Category(String nameCategory, Set<Product> setOfProduct) {
		this.nameCategory = nameCategory;
		this.setOfProduct = setOfProduct;
	}

	public void addProduct(Product p) {
		setOfProduct.add(p);
	}

	public String getNameCategory() {
		return nameCategory;
	}

	public void setNameCategory(String nameCategory) {
		this.nameCategory = nameCategory;
	}

	public Set<Product> getSetOfProduct() {
		return setOfProduct;
	}

	public void setSetOfProduct(Set<Product> setOfProduct) {
		this.setOfProduct = setOfProduct;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nameCategory == null) ? 0 : nameCategory.hashCode());
		result = prime * result + ((setOfProduct == null) ? 0 : setOfProduct.hashCode());
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
		Category other = (Category) obj;
		if (nameCategory == null) {
			if (other.nameCategory != null)
				return false;
		} else if (!nameCategory.equals(other.nameCategory))
			return false;
		if (setOfProduct == null) {
			if (other.setOfProduct != null)
				return false;
		} else if (!setOfProduct.equals(other.setOfProduct))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Category [nameCategory=" + nameCategory + ", setOfProduct=" + setOfProduct + "]";
	}
}
