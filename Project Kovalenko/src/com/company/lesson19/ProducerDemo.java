package com.company.lesson19;

public class ProducerDemo {
	public static void main(String[] args) {
		MyQueue<Integer> myQueue = new MyQueue<>();

		Consumer consumer = new Consumer(myQueue);
		Consumer consumer1 = new Consumer(myQueue);
		Producer producer = new Producer(myQueue);

		Thread t1 = new Thread(consumer);
		Thread t2 = new Thread(consumer1);
		Thread t3 = new Thread(producer);

		t1.start();
		t2.start();
		t3.start();
	}
}
