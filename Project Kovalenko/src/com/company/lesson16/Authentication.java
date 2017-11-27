package com.company.lesson16;

/**
 * Login должен содержать только латинские буквы, цифры и знак подчеркивания.
 * Длина login должна быть меньше 20 символов. Если login не соответствует этим
 * требованиям, необходимо выбросить WrongLoginException. Password должен
 * содержать только латинские буквы, цифры и знак подчеркивания. Длина password
 * должна быть меньше 20 символов. Также password и confirmPassword должны быть
 * равны. Если password не соответствует этим требованиям, необходимо выбросить
 * WrongPasswordException. WrongPasswordException и WrongLoginException -
 * пользовательские классы исключения с двумя конструкторами – один по
 * умолчанию, второй принимает сообщение исключения и передает его в конструктор
 * класса Exception. Обработка исключений проводится внутри метода. Используем
 * multi-catch block. Метод возвращает true, если значения верны или false в
 * другом случае.
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
			System.out.println(isCorrect("llllllll", "ыыыыыыыы", "ыыыыыыыы"));
		} catch (WrongLoginException e) {
			e.printStackTrace();
		} catch (WrongPasswordException e) {
			e.printStackTrace();
		}
		try {
			System.out.println(isCorrect("ЫЫЫЫЫЫЫ", "ppppppp_", "ppppppp_"));
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
			throw new WrongLoginException("Неверный логин");
		}
		if (password == null || password.length() > 20 || !password.matches("[a-z0-9_-]")
				|| !password.equals(confPassword)) {
			throw new WrongPasswordException("Неверный пароль");
		}
		return true;
	}
}
