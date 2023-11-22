package edu.training.Lesson08.main;

import java.util.Arrays;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int[][] arr = new int[4][5];

		initArray(arr);

		printArray(arr);

		System.out.println("\nChanged Array");

		swapColumns(arr);

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
				System.out.printf("[%3d]", mas[i][j]);
			}
			System.out.println();
		}

	}

	public static void swapColumns(int[][] mas) {
		for (int i = 0; i < mas.length; i++) {
			int temp;
			temp = mas[i][0];
			mas[i][0] = mas[i][1];
			mas[i][1] = temp;
		}

		printArray(mas);
	}
}
