package com.company.lesson19;

public class Philosopher implements Runnable {
	private String name;
	private Furcula f1;
	private Furcula f2;

	public Philosopher(String name, Furcula f1, Furcula f2) {
		this.name = name;
		this.f1 = f1;
		this.f2 = f2;
	}

	@Override
	public void run() {
		while (true) {
			if (!f1.isBusy() && !f2.isBusy()) {
				eatten();
			}
			System.out.println("Философ " + name + " - философствует");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
	}

	private void eatten() {
		f1.setBusy(true);
		if (!f2.isBusy()) {
			f2.setBusy(true);
			System.out.println("Философ " + name + " - кушает");
			try {
				Thread.sleep(100);
			} catch (Exception e) {
			}
			f2.setBusy(false);
		}
		f1.setBusy(false);
	}
}
