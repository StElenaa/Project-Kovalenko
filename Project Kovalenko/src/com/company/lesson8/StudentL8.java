package com.company.lesson8;

/**
 * �����y ����� getScholarship() ��� ������ Student, ������� ������������� �
 * ������ Aspirant.
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
		System.out.println("�������� ��������: ");
		System.out.println(lastName + " " + firstName + "; " + "������ - " + group);
	}

	public int getScholarship() {
		scholarship = 100;
		return scholarship;
	}

	public static void main(String[] args) {
		int scholarship = 0;
		StudentL8 st1 = new StudentL8("������", "����", "java17", scholarship);
		StudentL8 st2 = new StudentL8("������", "����", "java17", scholarship);
		StudentL8 st3 = new StudentL8("�������", "�����", "java17", scholarship);

		st1.studentCard();
		System.out.println("��������� ��������: " + st1.getScholarship() + "\n");
		st2.studentCard();
		System.out.println("��������� ��������: " + st2.getScholarship() + "\n");
		st3.studentCard();
		System.out.println("��������� ��������: " + st3.getScholarship() + "\n");
	}
}