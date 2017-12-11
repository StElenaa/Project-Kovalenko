package com.company.lesson15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Класс Student, содержит следующие характеристики – имя, группа, курс, оценки
 * по предметам. Создана коллекция, содержащая объекты класса Student. Перебраны
 * все студенты, вычисляется средний балл каждого студента. Если средний балл
 * >=3, студент переводится на следующий курс, иначе отчисляется. Метод
 * printStudents(List students, int course) получает список студентов и номер
 * курса и печатает на консоль имена тех студентов из списка, которые обучаются
 * на данном курсе. Для обхода списка в этом методе используется итератор.
 * 
 * @author Elen
 *
 */
public class ListStudents {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student("Ivanov", "java-2", 2, new int[] { 4, 5, 3, 4, 5 }));
		students.add(new Student("Petrov", "java-2", 2, new int[] { 4, 3, 3, 4, 3 }));
		students.add(new Student("Sidorov", "java-2", 2, new int[] { 5, 5, 5, 4, 5 }));
		students.add(new Student("Petrakov", "java-1", 1, new int[] { 3, 3, 3, 3, 3 }));
		students.add(new Student("Novikov", "java-1", 1, new int[] { 3, 2, 3, 3, 3 }));

		printStudents(students, 1);
		printStudents(students, 2);
		printStudents(students, 3);
		System.out.println();
		System.out.println("Перевод студентов:");
		transfer(students);
		System.out.println();
		printStudents(students, 1);
		printStudents(students, 2);
		printStudents(students, 3);
	}

	private static void transfer(List<Student> students) {
		Iterator<Student> iterator = students.iterator();
		while (iterator.hasNext()) {
			Student student = iterator.next();
			if (student.averageRating() >= 3) {
				System.out.println(student + " - переводится на " + (student.getCourse() + 1) + " курс");
				student.setCourse(student.getCourse() + 1);
			} else {
				System.out.println(student + " - отчисляется");
				iterator.remove();
			}
		}
	}

	private static void printStudents(List<Student> students, int course) {
		System.out.println("Студенты " + course + " курса");
		for (Student student : students) {
			if (student.getCourse() == course) {
				System.out.println(student);
			}
		}
	}
}
