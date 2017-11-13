package com.company.lesson13;

public class User {

	public class Query {
		public void printToLog() {
			System.out.print("\nПользователь с логином: " + login + "," + " паролем: " + password + " отправил запрос");
		}
	}

	private String login;
	private String password;

	public User(String login, String password) {
		this.login = login;
		this.password = password;
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

	public void createQuery() {
		Query q1 = new Query();
		q1.printToLog();
	}

	@Override
	public String toString() {
		return "User [login=" + login + ", password=" + password + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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

	public static void main(String[] args) {
		User u1 = new User("login1", "password1");
		u1.createQuery();
		User.Query query1 = u1.new Query();
		query1.printToLog();
		User.Query query2 = new User("login2", "password2").new Query();
		query2.printToLog();
	}
}
