package com.company.lesson10.clothes;

/**
 * ������� ������������ SizeClothes, ���������� ������� ������ (XXS,XS,S,M,L).
 * ������������ �������� ����� getDescription, ������������ ������ "��������
 * ������", ������� ������������� ��� ��������� XXS ����� ���������� ������
 * �������� ������. ����� ������������ �������� �������� �������� euroSize,
 * ��������������� ������� �������. ������ �����������, ����������� �� ����
 * euroSize.������� ���������� "������� ������" � ������� "������������" �
 * "������� ������" � ������� "������������". ������ ����������� ����� ������,
 * ���������� ���������� - ������ ������, ���������, ����. ������� ������
 * ���������� ������ - �������� (��������� ���������� "������� ������" �
 * "������� ������"), ����� (��������� ���������� "������� ������" � "�������
 * ������"), ���� (��������� ���������� "������� ������"), ������� (���������
 * ���������� "������� ������"). ������ ������, ���������� ��� ���� ������.
 * ������ ����� ������, ���������� ������ ������������, ������������, �� ����
 * ������� ��������� ������, ���������� ��� ���� ������. ����� ������������
 * ������� �� ������� ��� ���������� � ������� ������. ����� ������������
 * ������� �� ������� ��� ���������� � ������� ������.
 * 
 * @author Elen
 *
 */
public class Atelier {

	public static void clotheMan(Clothes[] clothes) {
		for (Clothes cl : clothes) {
			if (!(cl instanceof Skirt)) {
				System.out.println(((ManClothing) cl).clotheMan());
			}
		}
	}

	public static void clotheWoman(Clothes[] clothes) {
		for (Clothes cl : clothes) {
			if (!(cl instanceof Cravat)) {
				System.out.println(((WomanClothing) cl).clotheWoman());
			}
		}
	}

	public static void main(String[] args) {
		Clothes[] cl = new Clothes[] { new TeeShirt(SizeClothes.L, 50, "�������"),
				new Skirt(SizeClothes.M, 70, "�������"), new Pants(SizeClothes.S, 80, "�����"),
				new Cravat(SizeClothes.XXS, 60, "������") };
		clotheMan(cl);
		System.out.println();
		clotheWoman(cl);
	}
}
