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
	private String work;

	public AspirantL7(String lastName, String firstName, String group, String work) {
		super(lastName, firstName, group);
		this.work = work;
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	public void aspirantCard() {
		System.out.println("�������� ���������: ");
		System.out.println(getLastName() + " " + getFirstName() + "; " + "������ - " + getGroup() + "\n"
				+ "������� ������ �� ����: " + work);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((work == null) ? 0 : work.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		AspirantL7 other = (AspirantL7) obj;
		if (work == null) {
			if (other.work != null)
				return false;
		} else if (!work.equals(other.work))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AspirantL7 [work=" + work + ", getLastName()=" + getLastName() + ", getFirstName()=" + getFirstName()
				+ ", getGroup()=" + getGroup() + ", super.toString()=" + super.toString() + "]";
	}

	public static void main(String[] args) {
		AspirantL7 as1 = new AspirantL7("������", "�������", "java15", "���������������� �� java");
		AspirantL7 as2 = new AspirantL7("��������", "����", "java15", "���������������� �� javaFX");
		StudentL7 st = new AspirantL7("��������", "����", "java15", "���������������� �� javaFX");
		as1.aspirantCard();
		as2.aspirantCard();
		st.studentCard();
	}
}
