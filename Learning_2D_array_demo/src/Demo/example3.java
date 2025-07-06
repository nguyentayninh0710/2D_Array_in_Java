package Demo;

import java.util.Scanner;

//Task:

// Write a program to find and print the largest value in a 2D array.
public class example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of row: ");
		int row = Integer.parseInt(scanner.nextLine());
		System.out.println("Enter the number of column: ");
		int column = Integer.parseInt(scanner.nextLine());
	
		
		int[][] MyArray = new int[row][column];
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.println("Enter number (row " + i + ", column " + j + "): ");
				MyArray[i][j] =  Integer.parseInt(scanner.nextLine());
			}
		}
		// check max
		
		int max = MyArray[0][0]; 
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				if (MyArray[i][j] > max) {
					MyArray[i][j] = max;
				}
			}
		}
		
		System.out.println("Max: " + max);		

	}

}
