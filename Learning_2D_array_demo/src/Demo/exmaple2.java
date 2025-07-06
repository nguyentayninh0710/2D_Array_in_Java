package Demo;

import java.util.Scanner;

//Exercise 2 – Sum of All Elements
//Task:
//
//Write a function to compute the sum of all elements in a 2D integer array.
public class exmaple2 {
	
	public static int Sum(int[][] array) {
	int total = 0; 
			
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array[i].length; j++) {
					total += array[i][j];
				}
			}
	
	return total;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Enter number of row: ");
		int row = Integer.parseInt(scanner.nextLine());
		System.out.println("Enter number of column: ");
		int column = Integer.parseInt(scanner.nextLine());
		
		int[][] Array = new int[row][column];
		
		//input
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.println("Enter number (row " + i + ", column " + j + "): ");
				Array[i][j] = Integer.parseInt(scanner.nextLine());
			}
		}
		
		//sum
		System.out.println(Sum(Array));
		
		
		

	}

}
