package com.company.lesson11.str;

public class DoubleOb {
	public static void longToString(long l1) {
		String s1 = Long.toString(l1);
		System.out.println("�������������� �������� ���� long � ������ String - " + s1);
	}

	public static void byteToString(byte b1) {
		String s1 = Byte.toString(b1);
		System.out.println("�������������� �������� ���� byte � ������ String - " + s1);
	}

	public static void charToString(char c1) {
		String s1 = Character.toString(c1);
		System.out.println("�������������� �������� ���� char � ������ String - " + s1);
	}

	public static void floatToString(float f1) {
		String s1 = Float.toString(f1);
		System.out.println("�������������� �������� ���� float � ������ String - " + s1);
	}

	public static void intToString(int i1) {
		String s1 = Integer.toString(i1);
		System.out.println("�������������� �������� ���� int � ������ String - " + s1);
	}

	public static void shortToString(short sh1) {
		String s1 = Short.toString(sh1);
		System.out.println("�������������� �������� ���� short � ������ String - " + s1);
	}
	public static void booleanToString(Boolean bo1) {
		String s1 = Boolean.toString(bo1);
		System.out.println("�������������� �������� ���� boolean � ������ String - " + s1);
	}

	public static void main(String[] args) {
		Double dOb = Double.valueOf(12.95);
		Double dOb1 = Double.valueOf("14.87");
		System.out.println("�������� �������� ������ Double, ��������� ����� 'valueOf()' - " + dOb + ", " + dOb1);

		double d1 = Double.parseDouble("24.5");
		System.out.println(
				"�������������� �������� ���� String � ���� double, ��������� ����� 'Double.parseDouble()' - " + d1);

		String str = dOb.toString();
		int i = dOb.intValue();
		byte b = dOb.byteValue();
		char c = (char) dOb.intValue();
		float f = dOb.floatValue();
		long l = dOb.longValue();
		short s = dOb.shortValue();
		System.out.println("�������������� ������� ������ Double �� ���� ����������� ����� - \n" + "String - " + str
				+ "\nint - " + i + "\nbyte - " + b + "\nchar - " + c + "\nfloat - " + f + "\nlong - " + l + "\nshort - "
				+ s + "\nboolean - �������������� ����������");
		System.out.println("����� �������� ���� Double �� ������� - " + dOb);

		String d = Double.toString(3.14);
		System.out.println("\n�������������� �������� ���� double � ������ String - " + d);
		longToString(3674l);
		byteToString((byte) 3674);
		charToString('s');
		floatToString(3674f);
		intToString(3674);
		shortToString((short) 3674);
		booleanToString(true);
	}
}
