package com.company.lesson8;

/**
 * Создаy метод getScholarship() для класса Student, который переопределен в
 * классе Aspirant.
 * 
 * @author Elen
 *
 */
public class StudentL8 {
	private String lastName;
	private String firstName;
	private String group;

	public StudentL8(String lastName, String firstName, String group) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.group = group;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public int getScholarship() {
		return 100;
	}

	public void studentCard() {
		System.out.println("Карточка студента: ");
		System.out.println(lastName + " " + firstName + "; " + "Группа - " + group);
	}

	public static void main(String[] args) {
		StudentL8 st1 = new StudentL8("Иванов", "Иван", "java17");
		StudentL8 st2 = new StudentL8("Петров", "Петр", "java17");
		StudentL8 st3 = new StudentL8("Сидоров", "Сидор", "java17");

		st1.studentCard();
		System.out.println("Степендия студента: " + st1.getScholarship() + "\n");
		st2.studentCard();
		System.out.println("Степендия студента: " + st2.getScholarship() + "\n");
		st3.studentCard();
		System.out.println("Степендия студента: " + st3.getScholarship() + "\n");
	}
}