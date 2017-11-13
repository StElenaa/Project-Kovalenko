package com.company.lesson12;

public class Report {

	public static void generateReport(Employee[] emps) {
		for (Employee employee : emps) {
			System.out.println(String.format("ФИО - %-15s зарплата - %9.2f", employee.getFullname(), employee.getSalary()));
		}
	}

	public static void main(String[] args) {
		Employee e1 = new Employee("Ivanov Ivan", 25000.00f);
		Employee e2 = new Employee("Petrov Petr", 3000.00f);
		Employee e3 = new Employee("Sidorov Sidor", 550.00f);
		Employee[] eMas = new Employee[] { e1, e2, e3 };
		generateReport(eMas);
	}
}
