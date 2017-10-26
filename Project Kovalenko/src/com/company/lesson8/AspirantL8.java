package com.company.lesson8;

/**
 * ������ ������ ���� Student, ���������� ������� ������ Student � Aspirant.
 * ������ ����� getScholarship() ��� ������� �������� �������.
 * 
 * @author Elen
 *
 */
public class AspirantL8 extends StudentL8 {
	private String work;

	public AspirantL8(String lastName, String firstName, String group, int scholarship, String work) {
		super(lastName, firstName, group, scholarship);
		this.work = work;
	}

	public void aspirantCard() {
		System.out.println("�������� ���������: ");
		System.out.println(
				lastName + " " + firstName + "; " + "������ - " + group + "\n" + "������� ������ �� ����: " + work);
	}

	public int getScholarship() {
		scholarship = 200;
		return scholarship;
	}

	public static void main(String[] args) {
		int scholarship = 0;
		AspirantL8 as1 = new AspirantL8("������", "�������", "java15", scholarship, "���������������� �� java");
		AspirantL8 as2 = new AspirantL8("��������", "����", "java15", scholarship, "���������������� �� javaFX");
		as1.aspirantCard();
		System.out.println("��������� ���������: " + as1.getScholarship() + "\n");
		as2.aspirantCard();
		System.out.println("��������� ���������: " + as2.getScholarship() + "\n");

		StudentL8[] lists = new StudentL8[2];
		lists[0] = new AspirantL8("������", "�������", "java15", scholarship, "���������������� �� java");
		lists[1] = new StudentL8("������", "����", "java17", scholarship);
		for (StudentL8 list : lists) {
			System.out.println("����� ������ getScholarship() ��� �������� ������� - ");
			System.out.println("���������: " + list.getScholarship() + "\n");
		}
	}
}
