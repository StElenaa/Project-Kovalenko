package com.company.lesson7;

public class StudentL7 {
	String lastName, firstName, group;

	public StudentL7(String lastName, String firstName, String group) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.group = group;
	}

	public void studentCard() {
		System.out.println("�������� ��������: ");
		System.out.println(lastName + " " + firstName + "; " + "������ - " +group + "\n");
	}

	public static void main(String[] args) {
		StudentL7 st1 = new StudentL7("������", "����", "java17");
		StudentL7 st2 = new StudentL7("������", "����", "java17");
		StudentL7 st3 = new StudentL7("�������", "�����", "java17");

		st1.studentCard();
		st2.studentCard();
		st3.studentCard();
	}
}
