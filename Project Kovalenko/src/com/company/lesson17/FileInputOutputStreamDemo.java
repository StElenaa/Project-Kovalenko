package com.company.lesson17;

import java.io.*;

public class FileInputOutputStreamDemo {
	public static void main(String args[]) {
		try (OutputStream output = new FileOutputStream("src\\io\\a.txt");
				InputStream input = new FileInputStream("src\\io\\a.txt")) {
			char c[] = { 'a', 'b', 'c' };
			for (char cc : c) {
				output.write(cc);
			}
			int size = input.available();
			for (int j = 0; j < size; j++) {
				System.out.print((char) input.read() + " ");
			}
		} catch (IOException e) {
			System.out.print("Exception");
		}
	}
}
