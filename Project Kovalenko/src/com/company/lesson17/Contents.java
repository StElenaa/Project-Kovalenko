package com.company.lesson17;

import java.io.File;

/**
 * Метод printContents циклически просматривает содержимое заданного каталога и
 * выводит на печать информацию о всех файлах и каталогах, находящихся в нем и в
 * его подкаталогах
 * 
 * @author Elen
 *
 */
public class Contents {
	public static void printContents(File fl) {
		if (fl.isDirectory()) {
			System.out.println("Каталог - " + fl);
			for (String fn : fl.list()) {
				File fl1 = new File(fl.getPath() + File.separator + fn);
				printContents(fl1);
			}
		} else {
			System.out.println("  файл - " + fl);
		}
	}

	public static void main(String[] args) {
		File f1 = new File("src");
		printContents(f1);
	}
}
