package com.company.lesson15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * ����� Student, �������� ��������� �������������� � ���, ������, ����, ������
 * �� ���������. ������� ���������, ���������� ������� ������ Student. ���������
 * ��� ��������, ����������� ������� ���� ������� ��������. ���� ������� ����
 * >=3, ������� ����������� �� ��������� ����, ����� �����������. �����
 * printStudents(List students, int course) �������� ������ ��������� � �����
 * ����� � �������� �� ������� ����� ��� ��������� �� ������, ������� ���������
 * �� ������ �����. ��� ������ ������ � ���� ������ ������������ ��������.
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
	}

	private static void printStudents(List<Student> students, int course) {
		Iterator<Student> iterator = students.iterator();
		while (iterator.hasNext()) {
			Student student = (Student) iterator.next();
			if (student.getCourse() == course) {
				System.out.println(student.toString() + (student.averageRating() >= 3 ? " - �����������" : " - �����������"));
			}
		}
	}
}
