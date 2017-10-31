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

	public AspirantL8(String lastName, String firstName, String group, String work) {
		super(lastName, firstName, group);
		this.work = work;
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	@Override
	public int getScholarship() {
		return 200;
	}

	public void aspirantCard() {
		System.out.println("�������� ���������: ");
		System.out.println(getLastName() + " " + getFirstName() + "; " + "������ - " + getGroup() + "\n"
				+ "������� ������ �� ����: " + work);
	}

	public static void main(String[] args) {
		AspirantL8 as1 = new AspirantL8("������", "�������", "java15", "���������������� �� java");
		AspirantL8 as2 = new AspirantL8("��������", "����", "java15", "���������������� �� javaFX");
		as1.aspirantCard();
		System.out.println("��������� ���������: " + as1.getScholarship() + "\n");
		as2.aspirantCard();
		System.out.println("��������� ���������: " + as2.getScholarship() + "\n");

		StudentL8[] lists = new StudentL8[2];
		lists[0] = new AspirantL8("������", "�������", "java15", "���������������� �� java");
		lists[1] = new StudentL8("������", "����", "java17");
		for (StudentL8 list : lists) {
			System.out.println("����� ������ getScholarship() ��� �������� ������� - ");
			System.out.println("���������: " + list.getScholarship() + "\n");
		}
	}
}
