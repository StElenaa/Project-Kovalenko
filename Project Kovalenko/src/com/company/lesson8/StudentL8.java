package com.company.lesson8;

/**
 * Создаy метод getScholarship() для класса Student, который переопределен в
 * классе Aspirant.
 * 
 * @author Elen
 *
 */
public class StudentL8 {
	String lastName;
	String firstName;
	String group;
	int scholarship;

	public StudentL8(String lastName, String firstName, String group, int scholarship) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.group = group;
		this.scholarship = scholarship;
	}

	public void studentCard() {
		System.out.println("Карточка студента: ");
		System.out.println(lastName + " " + firstName + "; " + "Группа - " + group);
	}

	public int getScholarship() {
		scholarship = 100;
		return scholarship;
	}

	public static void main(String[] args) {
		int scholarship = 0;
		StudentL8 st1 = new StudentL8("Иванов", "Иван", "java17", scholarship);
		StudentL8 st2 = new StudentL8("Петров", "Петр", "java17", scholarship);
		StudentL8 st3 = new StudentL8("Сидоров", "Сидор", "java17", scholarship);

		st1.studentCard();
		System.out.println("Степендия студента: " + st1.getScholarship() + "\n");
		st2.studentCard();
		System.out.println("Степендия студента: " + st2.getScholarship() + "\n");
		st3.studentCard();
		System.out.println("Степендия студента: " + st3.getScholarship() + "\n");
	}
}