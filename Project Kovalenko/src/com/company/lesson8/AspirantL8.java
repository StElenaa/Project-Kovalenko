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

	@Override
	public int getScholarship() {
		return 200;
	}

	public void aspirantCard() {
		System.out.println("Карточка аспиранта: ");
		System.out.println(getLastName() + " " + getFirstName() + "; " + "Группа - " + getGroup() + "\n"
				+ "Научная работа на тему: " + work);
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
