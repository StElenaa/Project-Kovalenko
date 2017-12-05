package com.company.lesson17.shop;

public class User {
	private String login;
	private String password;
	private Catalog bag;

	public User(String login, String password) {
		this.login = login;
		this.password = password;
		this.bag = new Catalog("bag");
	}

	public User() {
		this.bag = new Catalog("bag");
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Catalog getBag() {
		return bag;
	}

	public void setBag(Catalog bag) {
		this.bag = bag;
	}

	public void addToBag(Product product, int q) {
		Integer quantity = bag.getProducts().get(product);
		if (quantity != null) {
			bag.getProducts().put(product, quantity.intValue() + q);
		} else {
			bag.getProducts().put(product, q);
		}
	}

	public void buyFromBag() {
		bag.getProducts().clear();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bag == null) ? 0 : bag.hashCode());
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
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
		User other = (User) obj;
		if (bag == null) {
			if (other.bag != null)
				return false;
		} else if (!bag.equals(other.bag))
			return false;
		if (login == null) {
			if (other.login != null)
				return false;
		} else if (!login.equals(other.login))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [login=" + login + ", password=" + password + "]";
	}
}
