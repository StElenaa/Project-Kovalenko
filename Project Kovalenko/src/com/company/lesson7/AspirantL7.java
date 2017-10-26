package com.company.lesson7;

/**
 * ������ ������ ������������, ���������� ����� Student � ����� Aspirant,
 * �������� ���������� �� �������� �������� ����� ������� ������. �������
 * ���������� ���� Student, ������� ��������� �� ������ ���� Aspirant.
 * 
 * @author Elen
 *
 */
public class AspirantL7 extends StudentL7 {
	String work;

	public AspirantL7(String lastName, String firstName, String group, String work) {
		super(lastName, firstName, group);
		this.work = work;
	}

	public void aspirantCard() {
		System.out.println("�������� ���������: ");
		System.out.println(
				lastName + " " + firstName + "; " + "������ - " + group + "\n" + "������� ������ �� ����: " + work);
	}

	public static void main(String[] args) {
		AspirantL7 as1 = new AspirantL7("������", "�������", "java15", "���������������� �� java");
		AspirantL7 as2 = new AspirantL7("��������", "����", "java15", "���������������� �� javaFX");
		StudentL7 st = new AspirantL7("��������", "����", "java15", "���������������� �� javaFX");
		as1.aspirantCard();
		as2.aspirantCard();
	}
}
