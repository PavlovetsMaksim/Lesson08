package edu.training.Lesson08.main;

import java.util.Random;

public class Example08 {

	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		
		initArray(arr);

		printArray(arr);

		int result = negativeSum(arr);
		
		System.out.println("Число 7 встречается " + result + " раз.");

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
	
	public static int negativeSum(int[][] mas) {
		int count = 0;
		
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if (mas[i][j] == 7) {
                    count++;
                }
            }
        }
        
        return count;
    }

}
