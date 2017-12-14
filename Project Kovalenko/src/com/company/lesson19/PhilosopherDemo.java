package com.company.lesson19;

/**
 * Обедающие философы. Пять безмолвных философов сидят вокруг круглого стола,
 * перед каждым философом стоит тарелка спагетти. Вилки лежат на столе между
 * каждой парой ближайших философов. Каждый философ может либо есть, либо
 * размышлять. Философ может есть только тогда, когда держит две вилки — взятую
 * справа и слева. Взятие каждой вилки и возвращение её на стол являются
 * раздельными действиями, которые должны выполняться одно за другим
 * 
 * @author Elen
 *
 */
public class PhilosopherDemo {

	public static void main(String[] args) {
		Furcula f1 = new Furcula();
		Furcula f2 = new Furcula();
		Furcula f3 = new Furcula();
		Furcula f4 = new Furcula();
		Furcula f5 = new Furcula();

		Philosopher ph1 = new Philosopher("1", f1, f5);
		Philosopher ph2 = new Philosopher("2", f2, f1);
		Philosopher ph3 = new Philosopher("3", f3, f2);
		Philosopher ph4 = new Philosopher("4", f4, f3);
		Philosopher ph5 = new Philosopher("5", f5, f1);

		Thread t1 = new Thread(ph1);
		Thread t2 = new Thread(ph2);
		Thread t3 = new Thread(ph3);
		Thread t4 = new Thread(ph4);
		Thread t5 = new Thread(ph5);

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}
}
