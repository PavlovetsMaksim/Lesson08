package edu.training.Lesson08.main;

import java.util.Random;

public class Example03 {

	public static void main(String[] args) {
		int [][] arr = new int[4][5];
		
		initArray(arr);
		
		printArray(arr);
		
		firstColumn(arr);
		lastColumn(arr);
		
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
	
	public static void firstColumn(int[][] mas) {        
        System.out.println("First Column");
        
        for (int i = 0; i < mas.length; i++) {
            System.out.println("[" + mas[i][0] + "]");
        }
    }
	
	public static void lastColumn(int[][] mas) {
        System.out.println("Last Column");
        
        for (int i = 0; i < mas.length; i++) {
            System.out.println("[" + mas[i][mas[i].length - 1] + "]");
        }
    }

}
