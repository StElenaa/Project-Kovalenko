package com.company.lesson14;

import java.util.Arrays;

/**
 * Класс "Матрица" с использованием обобщенного класса. Класс имеет следующие
 * поля: 1) двумерный массив вещественных чисел; 2) количество строк и столбцов
 * в матрице. Класс имеет следующие методы: сложение с другой матрицей;
 * умножение на число; вывод на печать.
 * 
 * @author Elen
 *
 */
public class MatrixL14<N extends Number> {
	private N[][] array;
	private int lines, columns;

	public MatrixL14(N[][] arg) {
		this.lines = arg.length;
		this.columns = arg[0].length;
		array = arg;
	}

	public N[][] getArray() {
		return array;
	}

	public void setArray(N[][] array) {
		this.array = array;
	}

	public int getLines() {
		return lines;
	}

	public void setLines(int lines) {
		this.lines = lines;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}

	public MatrixL14<N> mul(double a) {
		Number[][] res = new Number[this.lines][this.columns];
		for (int i = 0; i < this.lines; i++) {
			for (int j = 0; j < this.columns; j++) {
				res[i][j] = this.array[i][j].doubleValue() * a;
			}
		}
		return new MatrixL14(res);
	}

	public MatrixL14<N> add(MatrixL14<N> other) {
		int resLines = this.lines > other.lines ? this.lines : other.lines;
		int resColumns = this.columns > other.columns ? this.columns : other.columns;
		Number[][] res = new Number[resLines][resColumns];
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
						res[i][j] = this.array[i][j].doubleValue() + other.array[i][j].doubleValue();
					}
				}
			}
		}
		return new MatrixL14(res);
	}

	public void printmatrix() {
		System.out.println("Количество строк    - " + this.lines);
		System.out.println("Количество столбцов - " + this.columns);
		System.out.println(Arrays.deepToString(this.array));
	}

	@Override
	public String toString() {
		return "MatrixL14 [array=" + Arrays.toString(array) + ", lines=" + lines + ", columns=" + columns + "]";
	}

	public static void main(String[] args) {
		double d = 6;
		MatrixL14<Integer> m1 = new MatrixL14<Integer>(new Integer[][] { { 1, 3, 0 }, { 9, 0, 1 }, { 2, 4, 7 } });
		MatrixL14<Integer> m2 = new MatrixL14<Integer>(new Integer[][] { { 2, 4 }, { 1, 3 }, { 1, 3 }, { 1, 3 } });

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
