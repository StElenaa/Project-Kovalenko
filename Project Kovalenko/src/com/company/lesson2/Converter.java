package com.company.lesson2;

/**
 * Программа, в которой показаны преобразования всех совместимых примитивных
 * типов друг к другу. Преобразование для каждого типа вынесены в отдельный
 * метод.
 * 
 * @author Elen
 *
 */
public class Converter {
	public static void main(String[] args) {
		short s = byte2short((byte) 120);
		char c = byte2char((byte) 27);
		int i = byte2int((byte) 59);
		long l = byte2long((byte) 65);
		float f = byte2float((byte) 46);
		double d = byte2double((byte) 75);

		byte b = short2byte(s);
		b = char2byte(c);
		b = int2byte(i);
		b = long2byte(l);
		b = float2byte(f);
		b = double2byte(d);

		s = char2short(c);
		s = int2short(i);
		s = long2short(l);
		s = float2short(f);
		s = double2short(d);

		c = short2char(s);
		c = int2char(i);
		c = long2char(l);
		c = float2char(f);
		c = double2char(d);

		i = short2int(s);
		i = char2int(c);
		i = long2int(l);
		i = float2int(f);
		i = double2int(d);

		l = short2long(s);
		l = char2long(c);
		l = int2long(i);
		l = float2long(f);
		l = double2long(d);

		f = short2flot(s);
		f = char2float(c);
		f = int2float(i);
		f = long2float(l);
		f = double2float(d);

		d = short2double(s);
		d = char2double(c);
		d = int2double(i);
		d = long2double(l);
		d = float2double(f);
	}

	/**
	 * Преобразование значения типа byte в значение типа short
	 * 
	 * @param a
	 *            - значение типа byte
	 * @return значение типа short
	 */
	public static short byte2short(byte a) {
		short f = a;
		return f;
	}

	/**
	 * Преобразование значения типа byte в значение типа char
	 * 
	 * @param a
	 *            - значение типа byte
	 * @return значение типа char
	 */
	public static char byte2char(byte a) {
		char f = (char) a;
		return f;
	}

	/**
	 * Преобразование значения типа byte в значение типа int
	 * 
	 * @param a
	 *            - значение типа byte
	 * @return значение типа int
	 */
	public static int byte2int(byte a) {
		int f = a;
		return f;
	}

	/**
	 * Преобразование значения типа byte в значение типа long
	 * 
	 * @param a
	 *            - значение типа byte
	 * @return значение типа long
	 */
	public static long byte2long(byte a) {
		long f = a;
		return f;
	}

	/**
	 * Преобразование значения типа byte в значение типа flot
	 * 
	 * @param a
	 *            - значение типа byte
	 * @return значение типа float
	 */
	public static float byte2float(byte a) {
		float f = a;
		return f;
	}

	/**
	 * Преобразование значения типа byte в значение типа double
	 * 
	 * @param a
	 *            - значение типа byte
	 * @return значение типа double
	 */
	public static double byte2double(byte a) {
		double f = a;
		return f;
	}

	/**
	 * Преобразование значения типа short в значение типа byte
	 * 
	 * @param a
	 *            - значение типа short
	 * @return значение типа byte
	 */
	public static byte short2byte(short a) {
		byte f = (byte) a;
		return f;
	}

	/**
	 * Преобразование значения типа short в значение типа char
	 * 
	 * @param a
	 *            - значение типа short
	 * @return значение типа char
	 */
	public static char short2char(short a) {
		char f = (char) a;
		return f;
	}

	/**
	 * Преобразование значения типа short в значение типа int
	 * 
	 * @param a
	 *            - значение типа short
	 * @return значение типа int
	 */
	public static int short2int(short a) {
		int f = a;
		return f;
	}

	/**
	 * Преобразование значения типа short в значение типа long
	 * 
	 * @param a
	 *            - значение типа short
	 * @return значение типа long
	 */
	public static long short2long(short a) {
		long f = a;
		return f;
	}

	/**
	 * Преобразование значения типа short в значение типа float
	 * 
	 * @param a
	 *            - значение типа short
	 * @return значение типа float
	 */
	public static float short2flot(short a) {
		float f = a;
		return f;
	}

	/**
	 * Преобразование значения типа short в значение типа double
	 * 
	 * @param a
	 *            - значение типа short
	 * @return значение типа double
	 */
	public static double short2double(short a) {
		double f = a;
		return f;
	}

	/**
	 * Преобразование значения типа char в значение типа byte
	 * 
	 * @param a
	 *            - значение типа char
	 * @return значение типа byte
	 */

	public static byte char2byte(char a) {
		byte f = (byte) a;
		return f;
	}

	/**
	 * Преобразование значения типа char в значение типа short
	 * 
	 * @param a
	 *            - значение типа char
	 * @return значение типа short
	 */
	public static short char2short(char a) {
		short f = (short) a;
		return f;
	}

	/**
	 * Преобразование значения типа char в значение типа int
	 * 
	 * @param a
	 *            - значение типа char
	 * @return значение типа int
	 */
	public static int char2int(char a) {
		int f = a;
		return f;
	}

	/**
	 * Преобразование значения типа char в значение типа long
	 * 
	 * @param a
	 *            - значение типа char
	 * @return значение типа long
	 */
	public static long char2long(char a) {
		long f = a;
		return f;
	}

	/**
	 * Преобразование значения типа char в значение типа float
	 * 
	 * @param a
	 *            - значение типа char
	 * @return значение типа float
	 */
	public static float char2float(char a) {
		float f = a;
		return f;
	}

	/**
	 * Преобразование значения типа char в значение типа double
	 * 
	 * @param a
	 *            - значение типа char
	 * @return значение типа double
	 */
	public static double char2double(char a) {
		double f = a;
		return f;
	}

	/**
	 * Преобразование значения типа int в значение типа byte
	 * 
	 * @param a
	 *            - значение типа int
	 * @return значение типа byte
	 */
	public static byte int2byte(int a) {
		byte f = (byte) a;
		return f;
	}

	/**
	 * Преобразование значения типа int в значение типа short
	 * 
	 * @param a
	 *            - значение типа int
	 * @return значение типа short
	 */
	public static short int2short(int a) {
		short f = (short) a;
		return f;
	}

	/**
	 * Преобразование значения типа int в значение типа char
	 * 
	 * @param a
	 *            - значение типа int
	 * @return значение типа char
	 */
	public static char int2char(int a) {
		char f = (char) a;
		return f;
	}

	/**
	 * Преобразование значения типа int в значение типа long
	 * 
	 * @param a
	 *            - значение типа int
	 * @return значение типа long
	 */
	public static long int2long(int a) {
		long f = a;
		return f;
	}

	/**
	 * Преобразование значения типа int в значение типа double
	 * 
	 * @param a
	 *            - значение типа int
	 * @return значение типа double
	 */
	public static double int2double(int a) {
		double f = a;
		return f;
	}

	/**
	 * Преобразование значения типа long в значение типа byte
	 * 
	 * @param a
	 *            - значение типа long
	 * @return значение типа byte
	 */
	public static byte long2byte(long a) {
		byte f = (byte) a;
		return f;
	}

	/**
	 * Преобразование значения типа long в значение типа short
	 * 
	 * @param a
	 *            - значение типа long
	 * @return значение типа short
	 */
	public static short long2short(long a) {
		short f = (short) a;
		return f;
	}

	/**
	 * Преобразование значения типа long в значение типа char
	 * 
	 * @param a
	 *            - значение типа long
	 * @return значение типа char
	 */
	public static char long2char(long a) {
		char f = (char) a;
		return f;
	}

	/**
	 * Преобразование значения типа long в значение типа int
	 * 
	 * @param a
	 *            - значение типа long
	 * @return значение типа int
	 */
	public static int long2int(long a) {
		int f = (int) a;
		return f;
	}

	/**
	 * Преобразование значения типа long в значение типа float
	 * 
	 * @param a
	 *            - значение типа long
	 * @return значение типа float
	 */
	public static float long2float(long a) {
		float f = a;
		return f;
	}

	/**
	 * Преобразование значения типа long в значение типа double
	 * 
	 * @param a
	 *            - значение типа long
	 * @return значение типа double
	 */
	public static double long2double(long a) {
		double f = a;
		return f;
	}

	/**
	 * Преобразование значения типа int в значение типа float
	 * 
	 * @param a
	 *            - значение типа int
	 * @return значение типа float
	 */
	public static float int2float(int a) {
		float f = a;
		return f;
	}

	/**
	 * Преобразование значения типа float в значение типа byte
	 * 
	 * @param a
	 *            - значение типа float
	 * @return значение типа byte
	 */
	public static byte float2byte(float a) {
		byte f = (byte) a;
		return f;
	}

	/**
	 * Преобразование значения типа float в значение типа short
	 * 
	 * @param a
	 *            - значение типа float
	 * @return значение типа short
	 */
	public static short float2short(float a) {
		short f = (short) a;
		return f;
	}

	/**
	 * Преобразование значения типа float в значение типа char
	 * 
	 * @param a
	 *            - значение типа float
	 * @return значение типа char
	 */
	public static char float2char(float a) {
		char f = (char) a;
		return f;
	}

	/**
	 * Преобразование значения типа float в значение типа int
	 * 
	 * @param a
	 *            - значение типа float
	 * @return значение типа int
	 */
	public static int float2int(float a) {
		int f = (int) a;
		return f;
	}

	/**
	 * Преобразование значения типа float в значение типа long
	 * 
	 * @param a
	 *            - значение типа float
	 * @return значение типа long
	 */
	public static long float2long(float a) {
		long f = (long) a;
		return f;
	}

	/**
	 * Преобразование значения типа float в значение типа double
	 * 
	 * @param a
	 *            - значение типа float
	 * @return значение типа double
	 */
	public static double float2double(float a) {
		double f = a;
		return f;
	}

	/**
	 * Преобразование значения типа double в значение типа byte
	 * 
	 * @param a
	 *            - значение типа double
	 * @return значение типа byte
	 */
	public static byte double2byte(double a) {
		byte f = (byte) a;
		return f;
	}

	/**
	 * Преобразование значения типа double в значение типа short
	 * 
	 * @param a
	 *            - значение типа double
	 * @return значение типа short
	 */
	public static short double2short(double a) {
		short f = (short) a;
		return f;
	}

	/**
	 * Преобразование значения типа double в значение типа char
	 * 
	 * @param a
	 *            - значение типа double
	 * @return значение типа char
	 */
	public static char double2char(double a) {
		char f = (char) a;
		return f;
	}

	/**
	 * Преобразование значения типа double в значение типа int
	 * 
	 * @param a
	 *            - значение типа double
	 * @return значение типа int
	 */
	public static int double2int(double a) {
		int f = (int) a;
		return f;
	}

	/**
	 * Преобразование значения типа double в значение типа long
	 * 
	 * @param a
	 *            - значение типа double
	 * @return значение типа long
	 */
	public static long double2long(double a) {
		long f = (long) a;
		return f;
	}

	/**
	 * Преобразование значения типа double в значение типа float
	 * 
	 * @param a
	 *            - значение типа double
	 * @return значение типа float
	 */
	public static float double2float(double a) {
		float f = (float) a;
		return f;
	}
}
