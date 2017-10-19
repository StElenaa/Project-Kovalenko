package com.company.lesson6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * �������� ������ Phone, ������� �������� ���������� number, model � weight.
 * �������� ���� ����������� ����� ������. � ����� Phone ��������� ����� -
 * receiveCall, �������� ���� �������� � ��� ��������� � ������� �� �������
 * ��������� ������� {name}� � ����� - getPhoneNumber � ���������� �����
 * ��������. ��������� ��� ������ ��� ������� �� ��������. �������� �����������
 * � ����� Phone, ������� ��������� �� ���� ��������� ��� �������������
 * ���������� ������. �������� ����������� ��� ����������. �� ������������ �
 * ����������� ���������� ����������� �� ���������. �������� ������������� �����
 * receiveCall, ������� ��������� ��� ��������� - ��� ��������� � ����� ��������
 * ���������. ������ ���� �����.
 * 
 * @author Elen
 *
 */
public class Phone {
	String model;
	int number, weight;

	public Phone(String model, int number, int weight) {
		this();
		this.model = model;
		this.number = number;
		this.weight = weight;
	}

	public Phone() {
	}

	public void receiveCall(String name) {
		System.out.println("������- " + name);
	}

	public void receiveCall(String name, int number) {
		System.out.println("������- " + name + " ����� �������� - " + number);
	}

	public Integer getPhoneNumber() {
		return number;
	}

	public static void main(String args[]) {
		Phone p1 = new Phone();
		Phone p2 = new Phone();
		Phone p3 = new Phone("GGG", 1234567, 123);

		p1.number = 14356;
		p1.model = "NNN";
		p1.weight = 15;

		p2.receiveCall("Dasha", 5555);
		p1.receiveCall("Glasha");
		System.out.println("����� ��������: " + p1.getPhoneNumber());
		p3.receiveCall("Sasha");
		System.out.println("����� ��������: " + p3.getPhoneNumber());
	}
}