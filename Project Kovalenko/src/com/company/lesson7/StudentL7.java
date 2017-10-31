package com.company.lesson7;

public class StudentL7 {
	private String lastName, firstName, group;

	public StudentL7(String lastName, String firstName, String group) {
		super();
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

	public void studentCard() {
		System.out.println("Карточка студента: ");
		System.out.println(lastName + " " + firstName + "; " + "Группа - " + group + "\n");
	}

	public static void main(String[] args) {
		StudentL7 st1 = new StudentL7("Иванов", "Иван", "java17");
		StudentL7 st2 = new StudentL7("Петров", "Петр", "java17");
		StudentL7 st3 = new StudentL7("Сидоров", "Сидор", "java17");

		st1.studentCard();
		st2.studentCard();
		st3.studentCard();
	}
}
