package Demo;

import java.util.Scanner;

//Exercise 1 – Create and Print a Matrix
//Task:
//
//Write a program that declares a 3×3 2D array.
//
//Input values from the keyboard.
//
//Print the matrix you just entered.
public class exmaple_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		
		int[][] MyArray = new int[3][3];
		for (int i = 0; i < MyArray.length; i++) {
			for (int j = 0; j < MyArray[i].length; j++) {
				System.out.print("Enter number (row " + i + ", column " + j + "): ");
				MyArray[i][j]= Integer.parseInt(scanner.nextLine());
				System.out.println();
			}
		}
		
		for (int i = 0; i < MyArray.length; i++) {
			for (int j = 0; j < MyArray[i].length; j++) {
				System.out.print(MyArray[i][j] + " ");
			}
			System.out.println();
		}
	

	}

}
