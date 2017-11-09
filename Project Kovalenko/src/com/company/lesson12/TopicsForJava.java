package com.company.lesson12;

import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.ResourceBundle;

public class TopicsForJava {

	public static void main(String[] args) {
		try {
			printInfo("ru", "RU");
			printInfo("en", "EN");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

	private static void printInfo(String language, String country) throws UnsupportedEncodingException {
		Locale current = new Locale(language, country);
		ResourceBundle rb = ResourceBundle.getBundle("com.company.lesson12.topicsForJava", current);
		String s1 = rb.getString("theme1");
		s1 = new String(s1.getBytes("ISO-8859-1"), "UTF-8");
		String s2 = rb.getString("theme2");
		s2 = new String(s2.getBytes("ISO-8859-1"), "UTF-8");
		String s3 = rb.getString("theme3");
		s3 = new String(s3.getBytes("ISO-8859-1"), "UTF-8");
		System.out.println(s1+"\n"+s2+"\n"+s3);
		}
	}
