package com.company.lesson19;

public class Consumer implements Runnable {
	MyQueue<Integer> myQueue;

	public Consumer(MyQueue<Integer> myQueue) {
		this.myQueue = myQueue;
	}

	@Override
	public void run() {
		while (true) {
			System.out.println("Получено: " + myQueue.get() + " " + Thread.currentThread().getName());
		}
	}
}
