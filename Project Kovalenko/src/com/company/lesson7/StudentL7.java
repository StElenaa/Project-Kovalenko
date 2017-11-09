package com.company.lesson7;

public class StudentL7 {
	private String lastName, firstName, group;

	public StudentL7(String lastName, String firstName, String group) {
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
		StudentL7 other = (StudentL7) obj;
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
		return "StudentL7 [lastName=" + lastName + ", firstName=" + firstName + ", group=" + group + "]";
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
