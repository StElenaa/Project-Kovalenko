package com.company.lesson12;

/**
 * Ìåòîä çàìåíÿåò â ñòðîêå âñå âõîæäåíèÿ «object oriented programming»(íå
 * ó÷èòûâàåòñÿ ðåãèñòð ñèìâîëîâ) íà «OOP».
 * 
 * @author Elen
 *
 */
public class ChangeTo {
	public static String replacer(String s) {
		String st = s;
		int i = s.toLowerCase().indexOf("object-oriented programming");
		if (i >= 0) {
			st = s.substring(0, i) + "OOP" + s.substring(i + "object-oriented programming".length());
			st = replacer(st);
		}
		return st;
	}

	public static void main(String[] args) {
		String s = "Object-oRiented programming uses objects. object-oriented proGramming developed As the dominant programming methodology in the early and ...";
		System.out.println(replacer(s));
	}
}
