package com.company.lesson8;

/**
 * Создан массив типа Student, содержащий объекты класса Student и Aspirant.
 * Вызван метод getScholarship() для каждого элемента массива.
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

	public void aspirantCard() {
		System.out.println("Карточка аспиранта: ");
		System.out.println(getLastName() + " " + getFirstName() + "; " + "Группа - " + getGroup() + "\n"
				+ "Научная работа на тему: " + work);
	}

	@Override
	public int getScholarship() {
		return 200;
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
		AspirantL8 other = (AspirantL8) obj;
		if (work == null) {
			if (other.work != null)
				return false;
		} else if (!work.equals(other.work))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AspirantL8 [work=" + work + ", getLastName()=" + getLastName() + ", getFirstName()=" + getFirstName()
				+ ", getGroup()=" + getGroup() + ", super.toString()=" + super.toString() + "]";
	}

	public static void main(String[] args) {
		AspirantL8 as1 = new AspirantL8("Иванов", "Василий", "java15", "Программирование на java");
		AspirantL8 as2 = new AspirantL8("Васильев", "Петр", "java15", "Программирование на javaFX");
		as1.aspirantCard();
		System.out.println("Степендия аспиратна: " + as1.getScholarship() + "\n");
		as2.aspirantCard();
		System.out.println("Степендия аспиратна: " + as2.getScholarship() + "\n");

		StudentL8[] lists = new StudentL8[2];
		lists[0] = new AspirantL8("Иванов", "Василий", "java15", "Программирование на java");
		lists[1] = new StudentL8("Иванов", "Иван", "java17");
		for (StudentL8 list : lists) {
			System.out.println("Вызов метода getScholarship() для элемента массива - ");
			System.out.println("Степендия: " + list.getScholarship() + "\n");
		}
	}
}
