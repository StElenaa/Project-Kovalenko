package com.company.lesson9.tabl;

public class Tabl1 {
	private int a;
	int b;
	protected int c;
	public int d;

	private void name1() {
		a = 5;
		b = 10;
		c = 7;
		d = 2;
	}

	void name2() {
		a = 5;
		b = 10;
		c = 7;
		d = 2;
	}

	protected void name3() {
		name1();
		name2();
	}

	public void name4() {
		name1();
		name2();
		name3();
	}
}
