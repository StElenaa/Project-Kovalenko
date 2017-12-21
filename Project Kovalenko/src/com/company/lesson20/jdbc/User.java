package com.company.lesson20.jdbc;

public class User {
	private int id;
	private String login;
	private String passwod;

	public User(int id, String login, String passwod) {
		this.id = id;
		this.login = login;
		this.passwod = passwod;
	}

	public User(String login, String passwod) {
		this.login = login;
		this.passwod = passwod;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPasswod() {
		return passwod;
	}

	public void setPasswod(String passwod) {
		this.passwod = passwod;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		result = prime * result + ((passwod == null) ? 0 : passwod.hashCode());
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
		if (id != other.id)
			return false;
		if (login == null) {
			if (other.login != null)
				return false;
		} else if (!login.equals(other.login))
			return false;
		if (passwod == null) {
			if (other.passwod != null)
				return false;
		} else if (!passwod.equals(other.passwod))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", login=" + login + ", passwod=" + passwod + "]";
	}
}
