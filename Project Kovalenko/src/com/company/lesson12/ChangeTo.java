package com.company.lesson12;

/**
 * Ìåòîä çàìåíÿåò â ñòðîêå âñå âõîæäåíèÿ «object oriented programming»(íå
 * ó÷èòûâàåòñÿ ðåãèñòð ñèìâîëîâ) íà «OOP».
 * 
 * @author Elen
 *
 */
public class ChangeTo {
	static final String A = "object-oriented programming";
	static final String B = "OOP";

	public static String replacer(String s) {
		String st = s;
		int i = s.toLowerCase().indexOf(A);
		if (i >= 0) {
			st = s.substring(0, i) + B + s.substring(i + A.length());
			st = replacer(st);
		}
		return st;
	}

	public static void main(String[] args) {
		String s = "Object-oRiented programming uses objects. object-oriented proGramming developed As the dominant programming methodology in the early and ...";
		System.out.println(replacer(s));
	}
}
