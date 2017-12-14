package com.company.lesson19;

public class Producer implements Runnable {
	private MyQueue<Integer> myQueue;

	public Producer(MyQueue<Integer> myQueue) {
		this.myQueue = myQueue;
	}

	@Override
	public void run() {
		int i = 0;
		while (true) {
			myQueue.put(i);
			System.out.println("Отправлено: " + i++ + " " + Thread.currentThread().getName());
		}
	}
}
