package com.company.lesson13;

public class User2 {
	private static String login = "login1";
	private static String password = "password1";

	public static void createQuery() {
		class Query {
			public void printToLog() {
				System.out.print("Пользователь с логином: " + login + 
						", паролем:" + " " + password + " отправил запрос");
			}
		}
		Query query = new Query();
		query.printToLog();
	}

	public static void main(String[] args) {
		User2.createQuery();
	}
}
