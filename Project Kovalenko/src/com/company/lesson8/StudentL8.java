package com.company.lesson8;

/**
 * ������ ����� getScholarship() ��� ������ Student, ������� ������������� �
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((group == null) ? 0 : group.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentL8 other = (StudentL8) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (group == null) {
			if (other.group != null)
				return false;
		} else if (!group.equals(other.group))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "StudentL8 [lastName=" + lastName + ", firstName=" + firstName + ", group=" + group + "]";
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