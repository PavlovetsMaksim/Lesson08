package edu.training.Lesson08.main;

import java.util.Random;

public class Example07 {

	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		
		initArray(arr);

		printArray(arr);

		int result = negativeSum(arr);
		
		System.out.println("Сумма: " + result);

	}

	public static int[][] initArray(int[][] mas) {
		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = 100 - rand.nextInt(201);
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
        int sum = 0;
        
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if (mas[i][j] <= 0 && (mas[i][j] % 2 != 0)) {
                    sum += Math.abs(mas[i][j]);
                }
            }
        }
        
        return sum;
    }

}
