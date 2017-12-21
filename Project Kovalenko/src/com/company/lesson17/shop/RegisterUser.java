package com.company.lesson17.shop;

public class RegisterUser {
	public static void main(String[] args) {
		System.out.println(isCorrect("Ivanov", "ppppppppp", "ppppppppp"));
	}

	public static boolean isCorrect(String login, String password, String confPassword) {
		System.out.println(login + " " + password + " " + confPassword);

		try {
			if (login == null || login.length() > 20 || !login.matches("[A-Za-z0-9_]\\w+")) {
				throw new WrongLoginException("Неверный логин");
			}
			if (password == null || password.length() > 20 || !password.matches("[A-Za-z0-9_]\\w+")
					|| !password.equals(confPassword)) {
				throw new WrongPasswordException("Неверный пароль");
			}
		} catch (WrongLoginException e) {
			e.printStackTrace();
			return false;
		} catch (WrongPasswordException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
}
