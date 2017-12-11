package com.company.lesson17;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Класс, который копирует содержимое из файла file.txt в файл buffWriter.txt.
 * Используем классы BufferedReader, FileReader, BufferedWriter , FileWriter.
 * 
 * @author Elen
 *
 */
public class FileCopyBuffered {

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new FileReader("src\\com\\company\\lesson17\\file.txt"));
				BufferedWriter bw = new BufferedWriter(new FileWriter("src\\io\\buffWriter.txt"))) {
			int c;
			while ((c = br.read()) != -1) {
				bw.write(c);
			}
			bw.flush();
		} catch (IOException e) {
			System.out.print("Exception");
		}
	}
}
