package com.company.lesson7;

public class LibraryUser {
	private String fullName, libraryCard, faculty, dateOfBirth, phone;
	private Book myBook;

	public LibraryUser(String fullName, String libraryCard, String faculty, String dateOfBirth, String phone) {
		this.fullName = fullName;
		this.libraryCard = libraryCard;
		this.faculty = faculty;
		this.dateOfBirth = dateOfBirth;
		this.phone = phone;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getLibraryCard() {
		return libraryCard;
	}

	public void setLibraryCard(String libraryCard) {
		this.libraryCard = libraryCard;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Book getMyBook() {
		return myBook;
	}

	public void setMyBook(Book myBook) {
		this.myBook = myBook;
	}

	public void takeBook(Book book) {
		myBook = book;
	}

	public Book returnBook() {
		return myBook;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateOfBirth == null) ? 0 : dateOfBirth.hashCode());
		result = prime * result + ((faculty == null) ? 0 : faculty.hashCode());
		result = prime * result + ((fullName == null) ? 0 : fullName.hashCode());
		result = prime * result + ((libraryCard == null) ? 0 : libraryCard.hashCode());
		result = prime * result + ((myBook == null) ? 0 : myBook.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
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
		LibraryUser other = (LibraryUser) obj;
		if (dateOfBirth == null) {
			if (other.dateOfBirth != null)
				return false;
		} else if (!dateOfBirth.equals(other.dateOfBirth))
			return false;
		if (faculty == null) {
			if (other.faculty != null)
				return false;
		} else if (!faculty.equals(other.faculty))
			return false;
		if (fullName == null) {
			if (other.fullName != null)
				return false;
		} else if (!fullName.equals(other.fullName))
			return false;
		if (libraryCard == null) {
			if (other.libraryCard != null)
				return false;
		} else if (!libraryCard.equals(other.libraryCard))
			return false;
		if (myBook == null) {
			if (other.myBook != null)
				return false;
		} else if (!myBook.equals(other.myBook))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "LibraryUser [fullName=" + fullName + ", libraryCard=" + libraryCard + ", faculty=" + faculty
				+ ", dateOfBirth=" + dateOfBirth + ", phone=" + phone + ", myBook=" + myBook + "]";
	}
}
