package com.company.lesson12;

import java.util.Date;

/**
 * Создан класс Employee, у которого есть переменные класса - fullname, salary.
 * Создан массив содержащий несколько объектов этого типа. Создан класс Report,
 * который содержит статический метод generateReport, в котором выводится
 * информация о зарплате всех сотрудников. Используется форматирование строк.
 * Salary выровнено по правому краю, десятичное значение имеет 2 знака после
 * запятой.
 * 
 * @author Elen
 *
 */
public class Employee {
	private String fullname;
	private float salary;
	private Date salaryDate;

	public Employee(String fullname, float salary) {
		this.fullname = fullname;
		this.salary = salary;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public Date getSalaryDate() {
		return new Date();
	}

	public void setSalaryDate(Date salaryDate) {
		this.salaryDate = salaryDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fullname == null) ? 0 : fullname.hashCode());
		result = prime * result + Float.floatToIntBits(salary);
		result = prime * result + ((salaryDate == null) ? 0 : salaryDate.hashCode());
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
		Employee other = (Employee) obj;
		if (fullname == null) {
			if (other.fullname != null)
				return false;
		} else if (!fullname.equals(other.fullname))
			return false;
		if (Float.floatToIntBits(salary) != Float.floatToIntBits(other.salary))
			return false;
		if (salaryDate == null) {
			if (other.salaryDate != null)
				return false;
		} else if (!salaryDate.equals(other.salaryDate))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [fullname=" + fullname + ", salary=" + salary + ", salaryDate=" + salaryDate + "]";
	}
}
