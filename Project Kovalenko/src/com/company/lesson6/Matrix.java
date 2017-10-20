package com.company.lesson6;

import java.util.Arrays;

/**
 * Класс "Матрица". Класс имеет следующие поля: 1) двумерный массив вещественных
 * чисел; 2) количество строк и столбцов в матрице. Класс имеет следующие
 * методы: сложение с другой матрицей; умножение на число; вывод на печать.
 * 
 * @author Elen
 *
 */
public class Matrix {
	double[][] array;
	int lines, columns;

	public Matrix(double[][] arg) {
		super();
		this.lines = arg.length;
		this.columns = arg[0].length;
		array = arg;
	}

	public Matrix mul(double a) {
		double[][] res = new double[this.lines][this.columns];
		for (int i = 0; i < this.lines; i++) {
			for (int j = 0; j < this.columns; j++) {
				res[i][j] = this.array[i][j] * a;
			}
		}
		return new Matrix(res);
	}

	public Matrix add(Matrix other) {
		int resLines = this.lines > other.lines ? this.lines : other.lines;
		int resColumns = this.columns > other.columns ? this.columns : other.columns;
		double[][] res = new double[resLines][resColumns];
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res[i].length; j++) {
				if (i >= this.lines) {
					if (j >= other.columns) {
						res[i][j] = 0;
					} else {
						res[i][j] = other.array[i][j];
					}
				} else if (i >= other.lines) {
					if (j >= this.columns) {
						res[i][j] = 0;
					} else {
						res[i][j] = this.array[i][j];
					}
				} else {
					if (j >= other.columns) {
						res[i][j] = this.array[i][j];
					} else if (j >= this.columns) {
						res[i][j] = other.array[i][j];
					} else {
						res[i][j] = this.array[i][j] + other.array[i][j];
					}
				}
			}
		}
		return new Matrix(res);
	}

	public void printmatrix() {
		System.out.println("Количество строк    - " + this.lines);
		System.out.println("Количество столбцов - " + this.columns);
		System.out.println(Arrays.deepToString(this.array));
	}

	public static void main(String[] args) {
		double d = 6;
		Matrix m1 = new Matrix(new double[][] { { 1, 3, 0 }, { 9, 0, 1 }, { 2, 4, 7 } });
		Matrix m2 = new Matrix(new double[][] { { 2, 4 }, { 1, 3 }, { 1, 3 }, { 1, 3 } });

		System.out.println("Первая матрица:");
		m1.printmatrix();
		System.out.println("\nВторая матрица:");
		m2.printmatrix();
		System.out.println("\nУмножение первой матрицы на число " + d);
		m1.mul(d).printmatrix();
		System.out.println("\nСумма первой и второй матрицы");
		m1.add(m2).printmatrix();
	}
}
