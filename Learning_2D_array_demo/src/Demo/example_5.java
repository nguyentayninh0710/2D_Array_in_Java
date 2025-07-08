package Demo;
//Problem Statement
//Write a Java program that:
//
//Asks the user to input the size of a square matrix n × n (n ≥ 2).  (x)
//
//Inputs all elements of the matrix from the keyboard.   (x)
//
//Prints the original matrix.  (x)
//
//Computes and prints the transpose of the matrix.  (x)
//
//(Transpose: swap rows with columns.)
// original: 
// 4 5 6 7
// 1 2 0 9
// 2 3 8 0
// 9 6 4 3

import java.util.Scanner;

// Transpose:
// 4 1 2 9
// 5 2 3 6
// 6 0 8 4
// 7 9 0 3
//Computes and prints:
//
//The sum of each row.   (x)
//
//The sum of each column.   (x)
//
//The sum of the main diagonal.    (x)
//
//The sum of the secondary diagonal (from top-right to bottom-left).
public class example_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scanner = new Scanner(System.in);
		
		int row;
		do { 
			System.out.println("Enter the number of row (larger or equal to 2): ");
			row = Integer.parseInt(scanner.nextLine());	
			
			if(row < 2) {
				System.out.println("Row needs to be > or = 2!!");
			}
			
		}while(row < 2);	

		int[][] Array = new int[row][row];
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < row; j++) {
				System.out.print("Enter number at row " + i + ", column " + j + ": ");
				Array[i][j] =  Integer.parseInt(scanner.nextLine());
			}
			System.out.println();
		}
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < row; j++) {
				System.out.print(Array[i][j] + " ");
			}
			System.out.println();
		}
		
		//transposed
		
		int[][] ArrayTransposed = new int[row][row];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < row; j++) {
				ArrayTransposed[i][j] = Array[j][i];
			}
			System.out.println();
		}
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < row; j++) {
				System.out.print(ArrayTransposed[i][j] + " ");
			}
			System.out.println();
		}
		
		//sum of each row 
		
		for (int i = 0; i < row; i++) {
			int sumRow = 0;
			for (int j = 0; j < row; j++) {
				sumRow += ArrayTransposed[i][j];
			}
			System.out.println("Sum of row " + i + ": " + sumRow);
		}
		
		System.out.println();
		
		//sum of each column
		for (int i = 0; i < row; i++) {
			int sumColumn = 0;
			for (int j = 0; j < row; j++) {
				sumColumn += Array[i][j];
			}
			System.out.println("Sum of column " + i + ": " + sumColumn);
		}
		
		System.out.println();
		
		//sum of diagonal
		int sumDiagonal = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < row; j++) {
				if(i == j) {
					sumDiagonal += ArrayTransposed[i][j];
				}
			}
		}
		System.out.println("Sum of diagonal: "+ sumDiagonal);
		
		//The sum of top-right and bottom-left 
		
		int sumTopRight = 0; 
		int sumBottomLeft = 0; 
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < row; j++) {
				if(i < j) {
					sumTopRight += ArrayTransposed[i][j];
				} else if(i > j) {
					sumBottomLeft += ArrayTransposed[i][j];
				} 
			}
		}
		System.out.println("Top-right sum: "+ sumTopRight);
		System.out.println("Bottom-left sum: "+ sumBottomLeft);

	}

}
