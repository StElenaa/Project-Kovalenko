package com.company.lesson19;

/**
 * “ри потока которые измен€ют один и тот же объект.  аждый поток выводит на
 * экран одну букву 100 раз, и затем увеличивает значение символа на 1. —оздан
 * класс расшир€ющий Thread. ѕереопределен метод run(), здесь находитс€
 * синхронизированный блок кода. ƒл€ того чтобы три объекта-потока имели доступ
 * к одному объекту, создан конструктор принимающий на вход StringBuilder
 * объект. —инхронизированный блок кода получает монитор на объект
 * StringBuilder. ¬нутри синхронизированного блока кода выведитс€ StringBuilder
 * на экран 100 раз, а потом увеличиваес€ значение символа на 1. ¬ методе main()
 * создан один объект класса StringBuilder, использу€ символ СaТ.
 * 
 * @author Elen
 *
 */
public class StringThread extends Thread {
	private StringBuilder str;

	public StringThread(StringBuilder str) {
		this.str = str;
	}

	@Override
	public void run() {
		synchronized (str) {
			System.out.println(Thread.currentThread().getName());
			for (int i = 0; i < 100; i++) {
				System.out.print(str.charAt(0));
			}
			char c = str.charAt(0);
			str.setCharAt(0, ++c);
			System.out.println();
		}
	}
}
