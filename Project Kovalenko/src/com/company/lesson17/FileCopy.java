package com.company.lesson17;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
	public static void main(String args[]) {

		try (FileInputStream fileIn = new FileInputStream("src\\com\\company\\lesson17\\file.txt");
				FileOutputStream fileOut = new FileOutputStream("src\\com\\company\\lesson17\\copied_file.txt")) {
			int a;
			while ((a = fileIn.read()) != -1) {
				fileOut.write(a);
			}
		} catch (IOException e) {
			System.out.print(e.getMessage());
		}
	}
}
