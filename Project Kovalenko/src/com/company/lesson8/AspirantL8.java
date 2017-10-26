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

	public AspirantL8(String lastName, String firstName, String group, int scholarship, String work) {
		super(lastName, firstName, group, scholarship);
		this.work = work;
	}

	public void aspirantCard() {
		System.out.println("Карточка аспиранта: ");
		System.out.println(
				lastName + " " + firstName + "; " + "Группа - " + group + "\n" + "Научная работа на тему: " + work);
	}

	public int getScholarship() {
		scholarship = 200;
		return scholarship;
	}

	public static void main(String[] args) {
		int scholarship = 0;
		AspirantL8 as1 = new AspirantL8("Иванов", "Василий", "java15", scholarship, "Программирование на java");
		AspirantL8 as2 = new AspirantL8("Васильев", "Петр", "java15", scholarship, "Программирование на javaFX");
		as1.aspirantCard();
		System.out.println("Степендия аспиратна: " + as1.getScholarship() + "\n");
		as2.aspirantCard();
		System.out.println("Степендия аспиратна: " + as2.getScholarship() + "\n");

		StudentL8[] lists = new StudentL8[2];
		lists[0] = new AspirantL8("Иванов", "Василий", "java15", scholarship, "Программирование на java");
		lists[1] = new StudentL8("Иванов", "Иван", "java17", scholarship);
		for (StudentL8 list : lists) {
			System.out.println("Вызов метода getScholarship() для элемента массива - ");
			System.out.println("Степендия: " + list.getScholarship() + "\n");
		}
	}
}
