package com.company.lesson19;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueue<T> {
	private Queue<T> q;

	public MyQueue() {
		q = new LinkedList<>();
	}

	public synchronized T get() {
		while (q.isEmpty()) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		return q.poll();
	}

	public synchronized void put(T n) {
		q.offer(n);
		notifyAll();
	}
}
