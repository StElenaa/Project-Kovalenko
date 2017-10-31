package com.company.lesson7;

/**
 * Сщздан пример наследования, реализован класс Student и класс Aspirant,
 * аспирант отличается от студента наличием некой научной работы. Создана
 * переменная типа Student, которая ссылается на объект типа Aspirant.
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
		System.out.println("Карточка аспаранта: ");
		System.out.println(getLastName() + " " + getFirstName() + "; " + "Группа - " + getGroup() + "\n"
				+ "Научная работа на тему: " + work);
	}

	public static void main(String[] args) {
		AspirantL7 as1 = new AspirantL7("Иванов", "Василий", "java15", "Программирование на java");
		AspirantL7 as2 = new AspirantL7("Васильев", "Петр", "java15", "Программирование на javaFX");
		StudentL7 st = new AspirantL7("Петраков", "Иван", "java15", "Программирование на javaFX");
		as1.aspirantCard();
		as2.aspirantCard();
	}
}
