package com.company.lesson4;

import java.util.Arrays;

/**
 * �������� ���������� ������� ���� char �������� 4�2. ��������� �������� �
 * ������� ����� ��� �������������. ���������� �������� ������� � ������� ������
 * Arrays.deepToString(m)
 * 
 * @author Elen
 *
 */
public class Array4 {
	public static void main(String[] args) {
		char array[][] = { { 'a', 'b' }, { 'c', 'd' }, { 'e', 'f' }, { 'g', 'h' } };
		System.out.println(Arrays.deepToString(array));
	}
}