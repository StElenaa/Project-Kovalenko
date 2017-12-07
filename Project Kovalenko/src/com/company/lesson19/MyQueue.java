package com.company.lesson19;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueue<T> {
	private Queue<T> q;
	boolean valueSet = false;

	public MyQueue() {
		q = new LinkedList<>();
	}

	public synchronized T get() {
		while (!valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		valueSet = false;
		notify();
		return q.poll();
	}

	public synchronized void put(T n) {
		while (valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		valueSet = true;
		q.add(n);
		notify();
	}
}
