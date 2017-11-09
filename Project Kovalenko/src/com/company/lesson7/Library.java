package com.company.lesson7;

import java.util.Arrays;

/**
 * Kласс LibraryUser, хранит такую информацию о пользователе библиотеки: ФИО,
 * номер читательского билета, факультет, дата рождения, телефон. Методы
 * takeBook(), returnBook(). Разработана программа, в которой создается массив
 * объектов данного класса, щрганизованы: ввод данных о читателях, вывод
 * информации о читателях. Перегружены методы takeBook(), returnBook(): -
 * takeBook, которые принимают количество взятых книг. - takeBook, который
 * принимает переменное количество названий книг. - takeBook, который принимает
 * переменное количество объектов класса Book (создан новый класс Book).
 * Аналогичным образом перегружен метод returnBook().
 * 
 * @author Elen
 *
 */
public class Library {
	private LibraryUser[] users;
	private Book[] books;

	public Library() {
	}

	public Library(LibraryUser... users) {
		this.users = users;
	}

	public Book[] getBooks() {
		return books;
	}

	public void setBooks(Book[] books) {
		this.books = books;
	}

	public void setUsers(LibraryUser[] users) {
		this.users = users;
	}

	public LibraryUser[] getUsers() {
		return users;
	}

	public void takeBook(int amount) {
		books = new Book[amount];
	}

	public void takeBook(String... bookNames) {
		books = new Book[bookNames.length];
		for (int i = 0; i < bookNames.length; i++) {
			books[i] = new Book(bookNames[i]);
		}
	}

	public void takeBook(Book... books) {
		this.books = books;
	}

	public Book[] returnBook(int amount) {
		return new Book[] { new Book("Pushkin"), new Book("Shekspir") };
	}

	public Book[] returnBook(String... bookNames) {
		Book[] books = new Book[bookNames.length];
		for (int i = 0; i < bookNames.length; i++) {
			books[i] = new Book(bookNames[i]);
		}
		return books;
	}

	public Book[] returnBook(Book... books) {
		return books;
	}

	public void printUsers() {
		if (users == null) {
			System.out.println("Читателей нет");
		} else {
			for (LibraryUser user : users) {
				System.out.println("Читатель - " + user.getFullName() + " Номер читательского билета - "
						+ user.getLibraryCard() + " Телефон - " + user.getPhone());
			}
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(books);
		result = prime * result + Arrays.hashCode(users);
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
		Library other = (Library) obj;
		if (!Arrays.equals(books, other.books))
			return false;
		if (!Arrays.equals(users, other.users))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Library [users=" + Arrays.toString(users) + ", books=" + Arrays.toString(books) + ", super.toString()="
				+ super.toString() + "]";
	}

	public static void main(String[] args) {
		LibraryUser[] users = new LibraryUser[] {
				new LibraryUser("Petrov", "01011980", "java2017", "01011980", "0671234567"),
				new LibraryUser("Ivanov", "01011985", "java2017", "01011985", "0677654321") };
		Library library = new Library();
		library.setUsers(users);
		library.printUsers();
	}
}
