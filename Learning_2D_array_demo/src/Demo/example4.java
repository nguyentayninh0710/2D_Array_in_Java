package Demo;

import java.util.Scanner;

//Task:
//
//Write a program to create and print an identity matrix of size n×n (1s on the main diagonal, 0s elsewhere).
//Expected output example:
//	1 0 0
//	0 1 0
//	0 0 1

public class example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of row/column: ");
		int row = Integer.parseInt(scanner.nextLine());
		
		int[][] MyArray = new int[row][row];
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < row; j++) {
				if(i == j) {
					System.out.print("1");
				} else {
					System.out.print("0");
				}
			}
			System.out.println();
		}
		

	}

}
