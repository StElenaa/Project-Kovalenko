package com.company.lesson7;

public class TestLibrary {
	public static void main(String[] args) {
		LibraryUser[] users = new LibraryUser[] {
				new LibraryUser("Petrov", "01011980", "java2017", "01011980", "0671234567"),
				new LibraryUser("Ivanov", "01011985", "java2017", "01011985", "0677654321") };
		Library library = new Library();
		library.setUsers(users);
		library.printUsers();
	}
}
