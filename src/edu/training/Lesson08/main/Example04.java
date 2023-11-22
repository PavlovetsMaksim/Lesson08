package edu.training.Lesson08.main;

import java.util.Random;

public class Example04 {

	public static void main(String[] args) {		
		int [][] arr = new int[4][5];
		
		initArray(arr);
		
		printArray(arr);
		
		firstRow(arr);
		lastRow(arr);
		
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
	
	public static void firstRow(int[][] mas) {        
        System.out.println("First Row");
        
        for (int i = 0; i < mas[0].length; i++) {
            System.out.printf("[%3d]", mas[0][i]);
        }
        
        System.out.println();
    }
	
	public static void lastRow(int[][] mas) {
        System.out.println("Last Row");
        
        for (int i = 0; i < mas[mas.length - 1].length; i++) {
            System.out.printf("[%3d]", mas[mas.length - 1][i]);
        }
    }

}
