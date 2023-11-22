package edu.training.Lesson08.main;

public class Example01 {

	public static void main(String[] args) {
		int[][] arr = new int[3][4];

        arr[0][0] = 1;
        arr[1][0] = 1;
        arr[2][0] = 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("[%1d]", arr[i][j]);
            }
            System.out.println();
        }

	}

}
