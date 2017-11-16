package com.company.lesson13;

import java.io.UnsupportedEncodingException;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;

import com.company.lesson12.Employee;

public class FullReport {
	public static void generateReport(Employee[] emps, String language, String country)
			throws UnsupportedEncodingException {
		Locale current = new Locale(language, country);
		ResourceBundle rb = ResourceBundle.getBundle("com.company.lesson13.zagolovok", current);
		String s1 = rb.getString("FIO");
		s1 = new String(s1.getBytes("ISO-8859-1"), "UTF-8");
		String s2 = rb.getString("Zarplata");
		s2 = new String(s2.getBytes("ISO-8859-1"), "UTF-8");
		String s3 = rb.getString("Data");
		s3 = new String(s3.getBytes("ISO-8859-1"), "UTF-8");
		System.out.printf("%-15s  %15s  %10s\n", s1, s2, s3);
		
		DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM, current);
		NumberFormat nf = NumberFormat.getCurrencyInstance(current);
		for (Employee employee : emps) {
			System.out.printf("%-15s  %15s  %10s\n", employee.getFullname(),
					nf.format(employee.getSalary()), df.format(employee.getSalaryDate()));
		}
	}

	public static void main(String[] args) throws UnsupportedEncodingException {
		Employee e1 = new Employee("Ivanov Ivan", 25000.00f);
		Employee e2 = new Employee("Petrov Petr", 3000.00f);
		Employee e3 = new Employee("Sidorov Sidor", 550.00f);
		Employee[] eMas = new Employee[] { e1, e2, e3 };
		try {
			generateReport(eMas, "", "");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
}
