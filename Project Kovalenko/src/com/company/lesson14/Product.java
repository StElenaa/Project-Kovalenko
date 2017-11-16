package com.company.lesson14;

/**
 * Класс Товар, имеющий переменные имя, цена, рейтинг. Создан класс Категория,
 * имеющий переменные имя и множество товаров. Созданы несколько объектов класса
 * Категория. В классе Catalog создан метод, распечатывающий товары каталога,
 * отсортированные по имени, цене или рейтингу. Используем классы компараторы
 * для каждого вида сортировки.
 * 
 * @author Elen
 *
 */
public class Product {
	private String nameProduct;
	private double price;
	private int rating;

	public Product(String nameProduct, double price, int rating) {
		this.nameProduct = nameProduct;
		this.price = price;
		this.rating = rating;
	}

	public String getNameProduct() {
		return nameProduct;
	}

	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nameProduct == null) ? 0 : nameProduct.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + rating;
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
		Product other = (Product) obj;
		if (nameProduct == null) {
			if (other.nameProduct != null)
				return false;
		} else if (!nameProduct.equals(other.nameProduct))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (rating != other.rating)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Product [nameProduct=" + nameProduct + ", price=" + price + ", rating=" + rating + "]";
	}
}
