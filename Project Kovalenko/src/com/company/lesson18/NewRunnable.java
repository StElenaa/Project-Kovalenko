package com.company.lesson18;

/**
 * Класс, реализующий интерфейс Runnable. Переопределен run() метод. В цикле for
 * распечатываем значения от 0 до 100 делящиеся на 10 без остатка. Используем
 * статический метод Thread.sleep() чтобы сделать паузу. Создать три потока,
 * выполняющих задачу распечатки значений.
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
