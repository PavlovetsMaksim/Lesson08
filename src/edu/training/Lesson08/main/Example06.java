package edu.training.Lesson08.main;

import java.util.Random;

public class Example06 {

	public static void main(String[] args) {
		int[][] arr = new int[5][5];

		initArray(arr);

		printArray(arr);

		showColumns(arr);

	}

	public static int[][] initArray(int[][] mas) {
		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(100);
			}
		}

		return mas;
	}

	public static void printArray(int[][] mas) {
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%2d]", mas[i][j]);
			}
			System.out.println();
		}
		System.out.println();

	}

	public static void showColumns(int[][] mas) {
		for (int i = 0; i < mas[0].length; i++) {
			if (i % 2 != 0 && mas[0][i] > mas[mas.length - 1][i]) {
				for (int j = 0; j < mas.length; j++) {
					System.out.printf("[%2d]\n", mas[j][i]);
				}
				
				System.out.println();
			}
		}
	}

}
