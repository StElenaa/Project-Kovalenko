package com.company.lesson18;

/**
 * �����, ����������� ��������� Runnable. ������������� run() �����. � ����� for
 * ������������� �������� �� 0 �� 100 ��������� �� 10 ��� �������. ����������
 * ����������� ����� Thread.sleep() ����� ������� �����. ������� ��� ������,
 * ����������� ������ ���������� ��������.
 * 
 * @author Elen
 *
 */
public class NewRunnable implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			if (i % 10 == 0) {
				System.out.print(i + " ");
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		NewRunnable newRunnable = new NewRunnable();
		Thread thread1 = new Thread(newRunnable);
		Thread thread2 = new Thread(newRunnable);
		Thread thread3 = new Thread(newRunnable);
		thread1.start();
		thread2.start();
		thread3.start();
	}
}
