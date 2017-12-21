package com.company.lesson20.jdbc;

import java.util.List;

public class MainDAO {
	private static void printAll(UserDAO userDAO) {
		System.out.println("findAll:");
		for (User user : userDAO.findAll()) {
			System.out.println(user);
		}
	}

	public static void main(String[] args) {
		UserDAO userDAO = new UserDAO();
		printAll(userDAO);
		System.out.println("\nfindEntityById - " + userDAO.findEntityById(1));
		System.out.println("\ndelete (Integer id) - " + userDAO.delete(3));
		printAll(userDAO);
		List<User> users = userDAO.findAll();
		User user2delete = null;
		if (users.size() > 0) {
			for (User user : users) {
				if ("grisha".equals(user.getLogin())) {
					user2delete = user;
				}
			}
			if (user2delete != null) {
				System.out.println("\ndelete (User entity) - " + userDAO.delete(user2delete));
			} else {
				System.out.println("\ndelete (User entity) - Логин не был зарегистирован или уже удален");
			}
		}
		printAll(userDAO);
		User user2create = new User("grisha", "grisha555");
		System.out.println("\ncreate(User entity) - " + userDAO.create(user2create));
		printAll(userDAO);
		users = userDAO.findAll();
		User user2beChanged = users.get(0);
		int id = user2beChanged.getId();
		System.out.println("\nИзменение -" + user2beChanged);
		user2beChanged.setPasswod("222");
		userDAO.update(user2beChanged);
		user2beChanged = userDAO.findEntityById(id);
		System.out.println("\nИзмененный -" +user2beChanged);
	}
}
