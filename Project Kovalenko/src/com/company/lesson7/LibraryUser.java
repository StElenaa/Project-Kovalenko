package com.company.lesson7;

public class LibraryUser {
	private String fullName, libraryCard, faculty, dateOfBirth, phone;
	private Book myBook;

	public LibraryUser(String fullName, String libraryCard, String faculty, String dateOfBirth, String phone) {
		super();
		this.fullName = fullName;
		this.libraryCard = libraryCard;
		this.faculty = faculty;
		this.dateOfBirth = dateOfBirth;
		this.phone = phone;
	}

	public String getFullName() {
		return fullName;
	}

	public String getLibraryCard() {
		return libraryCard;
	}

	public String getFaculty() {
		return faculty;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public String getPhone() {
		return phone;
	}

	public void takeBook(Book book) {
		myBook = book;
	}

	public Book returnBook() {
		return myBook;
	}
}
