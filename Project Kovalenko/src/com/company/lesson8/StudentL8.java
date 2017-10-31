package com.company.lesson8;

/**
 * �����y ����� getScholarship() ��� ������ Student, ������� ������������� �
 * ������ Aspirant.
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
		System.out.println("�������� ��������: ");
		System.out.println(lastName + " " + firstName + "; " + "������ - " + group);
	}

	public static void main(String[] args) {
		StudentL8 st1 = new StudentL8("������", "����", "java17");
		StudentL8 st2 = new StudentL8("������", "����", "java17");
		StudentL8 st3 = new StudentL8("�������", "�����", "java17");

		st1.studentCard();
		System.out.println("��������� ��������: " + st1.getScholarship() + "\n");
		st2.studentCard();
		System.out.println("��������� ��������: " + st2.getScholarship() + "\n");
		st3.studentCard();
		System.out.println("��������� ��������: " + st3.getScholarship() + "\n");
	}
}