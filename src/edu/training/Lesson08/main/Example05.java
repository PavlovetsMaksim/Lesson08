package edu.training.Lesson08.main;

import java.util.Random;

public class Example05 {

	public static void main(String[] args) {		
		int [][] arr = new int[5][5];
		
		initArray(arr);
		
		printArray(arr);
		
		printRows(arr);
		
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
        System.out.println();

    }
	
	public static void printRows(int[][] mas) {        
        System.out.println();
        
        for (int i = 0; i < mas.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < mas[i].length; j++) {
                    System.out.printf("[%3d]", mas[i][j]);
                }
                System.out.println();
            }
        }
        
        System.out.println();
    }

}
