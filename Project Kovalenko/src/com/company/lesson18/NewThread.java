package com.company.lesson18;

public class NewThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("A" + Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {
		NewThread nt1 = new NewThread();
		NewThread nt2 = new NewThread();
		NewThread nt3 = new NewThread();
		nt1.start();
		nt2.start();
		nt3.start();
	}
}
