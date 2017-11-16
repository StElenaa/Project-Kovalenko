package com.company.lesson13;

public class User3 {
	private static String login = "login1";
	private static String password = "password1";

	static class Query {
		public void printToLog() {
			System.out.print("Пользователь с логином: " + login + ", паролем:" + " " + password + " отправил запрос");
		}
	}

	public static void createQuery() {
		Query query = new Query();
		query.printToLog();
	}

	public static void main(String[] args) {
		Query query1 = new Query();
		query1.printToLog();
		System.out.println();
		User3.createQuery();
	}
}
