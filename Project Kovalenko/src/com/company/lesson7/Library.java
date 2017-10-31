package com.company.lesson7;

/**
 * K���� LibraryUser, ������ ����� ���������� � ������������ ����������: ���,
 * ����� ������������� ������, ���������, ���� ��������, �������. ������
 * takeBook(), returnBook(). ����������� ���������, � ������� ��������� ������
 * �������� ������� ������, ������������: ���� ������ � ���������, �����
 * ���������� � ���������. ����������� ������ takeBook(), returnBook(): -
 * takeBook, ������� ��������� ���������� ������ ����. - takeBook, �������
 * ��������� ���������� ���������� �������� ����. - takeBook, ������� ���������
 * ���������� ���������� �������� ������ Book (������ ����� ����� Book).
 * ����������� ������� ���������� ����� returnBook().
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
		super();
		this.users = users;
	}

	public LibraryUser[] getUsers() {
		return users;
	}

	public void setUsers(LibraryUser... users) {
		this.users = users;
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
			System.out.println("��������� ���");
		} else {
			for (LibraryUser user : users) {
				System.out.println("�������� - " + user.getFullName() + " ����� ������������� ������ - "
						+ user.getLibraryCard() + " ������� - " + user.getPhone());
			}
		}
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
