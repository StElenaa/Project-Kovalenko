package com.company.lesson12;

/**
 * ���� ��� �����, �������� 3 � 56, ���������� ��������� ��������� ������:
 * 3+56=59; 3�56=-53; 3*56=168. ������������ ����� StringBuilder.append.
 * �������� ������ �=� �� ����� ������
 * 
 * @author Elen
 *
 */
public class CompilationOfLines {

	public static void main(String[] args) {
		String s;
		int a = 3;
		int b = 56;
		StringBuilder sb = new StringBuilder(40);
		StringBuilder sb1 = new StringBuilder(40);
		StringBuilder sb2 = new StringBuilder(40);

		s = sb.append(a).append("+").append(b).append("=").append(a+b).toString();
		System.out.println(s);
		s = sb1.append(a).append("-").append(b).append("=").append(a-b).toString();
		System.out.println(s);
		s = sb2.append(a).append("*").append(b).append("=").append(a*b).toString();
		System.out.println(s);

		sb.insert(4, " ����� ");
		sb.delete(11, 12);
		System.out.println(sb);

		sb1.replace(4, 5, " ����� ");
		System.out.println(sb1);

		sb2.replace(4, 5, " ����� ");
		System.out.println(sb2);
	}
}
