package com.company.lesson16;

/**
 * Login ������ ��������� ������ ��������� �����, ����� � ���� �������������.
 * ����� login ������ ���� ������ 20 ��������. ���� login �� ������������� ����
 * �����������, ���������� ��������� WrongLoginException. Password ������
 * ��������� ������ ��������� �����, ����� � ���� �������������. ����� password
 * ������ ���� ������ 20 ��������. ����� password � confirmPassword ������ ����
 * �����. ���� password �� ������������� ���� �����������, ���������� ���������
 * WrongPasswordException. WrongPasswordException � WrongLoginException -
 * ���������������� ������ ���������� � ����� �������������� � ���� ��
 * ���������, ������ ��������� ��������� ���������� � �������� ��� � �����������
 * ������ Exception. ��������� ���������� ���������� ������ ������. ����������
 * multi-catch block. ����� ���������� true, ���� �������� ����� ��� false �
 * ������ ������.
 * 
 * @author Elen
 *
 */
public class Authentication {
	public static void main(String[] args) {

		try {
			System.out.println(isCorrect("llllllll", "pppppppp", "pppppppppppppppp"));
		} catch (WrongLoginException e) {
			e.printStackTrace();
		} catch (WrongPasswordException e) {
			e.printStackTrace();
		}
		try {
			System.out.println(isCorrect("llllllll", "pppppppp", "pppppppp"));
		} catch (WrongLoginException e) {
			e.printStackTrace();
		} catch (WrongPasswordException e) {
			e.printStackTrace();
		}
		try {
			System.out.println(isCorrect("llllllllllllllllllllllllllllllll", "pppppppp", "pppppppp"));
		} catch (WrongLoginException e) {
			e.printStackTrace();
		} catch (WrongPasswordException e) {
			e.printStackTrace();
		}
		try {
			System.out.println(
					isCorrect("llllllll", "pppppppppppppppppppppppppppppppp", "pppppppppppppppppppppppppppppppp"));
		} catch (WrongLoginException e) {
			e.printStackTrace();
		} catch (WrongPasswordException e) {
			e.printStackTrace();
		}
		try {
			System.out.println(isCorrect("llllllllllllllllllllllllllllllll", "pppppppppppppppppppppppp", "pppppppp"));
		} catch (WrongLoginException e) {
			e.printStackTrace();
		} catch (WrongPasswordException e) {
			e.printStackTrace();
		}
		try {
			System.out.println(isCorrect(null, "pppppppp", "pppppppp"));
		} catch (WrongLoginException e) {
			e.printStackTrace();
		} catch (WrongPasswordException e) {
			e.printStackTrace();
		}
		try {
			System.out.println(isCorrect("llllllll", null, "pppppppp"));
		} catch (WrongLoginException e) {
			e.printStackTrace();
		} catch (WrongPasswordException e) {
			e.printStackTrace();
		}
		try {
			System.out.println(isCorrect("llllllll", "��������", "��������"));
		} catch (WrongLoginException e) {
			e.printStackTrace();
		} catch (WrongPasswordException e) {
			e.printStackTrace();
		}
		try {
			System.out.println(isCorrect("�������", "ppppppp_", "ppppppp_"));
		} catch (WrongLoginException e) {
			e.printStackTrace();
		} catch (WrongPasswordException e) {
			e.printStackTrace();
		}
	}

	public static boolean isCorrect(String login, String password, String confPassword)
			throws WrongLoginException, WrongPasswordException {
		System.out.println(login + " " + password + " " + confPassword);
		if (login == null || login.length() > 20 || !login.matches("[a-z0-9_-]")) {
			throw new WrongLoginException("�������� �����");
		}
		if (password == null || password.length() > 20 || !password.matches("[a-z0-9_-]")
				|| !password.equals(confPassword)) {
			throw new WrongPasswordException("�������� ������");
		}
		return true;
	}
}
