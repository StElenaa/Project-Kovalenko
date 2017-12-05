package com.company.lesson17.shop;

public class WrongPasswordException extends Exception {

	public WrongPasswordException(String message) {
		super(message);
	}

	public WrongPasswordException() {
	}
}
