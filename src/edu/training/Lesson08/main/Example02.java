package edu.training.Lesson08.main;

import java.util.Random;

public class Example02 {

	public static void main(String[] args) {
		int [][] arr = new int[2][3];
		
		initArray(arr);
		
		printArray(arr);
		
	}
	
	public static int[][] initArray(int[][] mas) {
        Random rand = new Random();
        
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = rand.nextInt(10);
            }
        }
        
        return mas;
    }
	
	public static void printArray(int[][] mas) {
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.printf("[%1d]", mas[i][j]);
            }
            System.out.println();
        }

    }

}
