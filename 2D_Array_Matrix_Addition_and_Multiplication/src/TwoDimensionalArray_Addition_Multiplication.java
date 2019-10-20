
/*
 * This class prints two-dimensional arrays A and B and conducts their sum and
 * multiplication.
 * 
 * Author: Mikolaj Wieczorek
 * 
 */

import java.io.*;
import java.util.*;

public class TwoDimensionalArray_Addition_Multiplication {

	// Method to Print the two-dimensional array A.
	public static void PrintArrayA(int A[][]) {
		// Loop through all rows
		for (int[] row : A)
			// converting each row as string using Arrays.toString
			// printing in a separate line
			System.out.println(Arrays.toString(row));
	}

	// Method to Print the two-dimensional array B.
	public static void PrintArrayB(int B[][]) {
		// Loop through all rows
		for (int[] row : B)
			// converting each row as string using Arrays.toString
			// printing in a separate line
			System.out.println(Arrays.toString(row));
	}

	// Method to Print the array of sum of matrix A and B.
	public static void Printaddition(int addition[][]) {
		for (int[] row : addition)
			// converting each row as string using Arrays.toString
			// printing in a separate line
			System.out.println(Arrays.toString(row));

	}

	// Method to Print the array of multiplication of matrix A and B.
	public static void Printmultiplication(int multiplication[][]) {
		for (int[] row : multiplication)
			// converting each row as string using Arrays.toString
			// printing in a separate line
			System.out.println(Arrays.toString(row));

	}

	public static void main(String[] args)

	{
		int value = 1; // set the number into the variable from which the matrix should start
		int rowCount = 3; // set the number of rows for the matrix
		int columnCount = 3; // set the number of columns for the matrix

		// declaring and initializing A, B, addition, and multiplication arrays
		int A[][] = new int[rowCount][columnCount];
		int B[][] = new int[rowCount][columnCount];
		int addition[][] = new int[rowCount][columnCount]; // another (addition) array to store the sum of A[] and B[]
		int multiplication[][] = new int[rowCount][columnCount]; // another (multiplication) array to store the
																	// multiplication of A[] and B[]

		// With two nested for loops, we can address every spot in this 2D array
		// For every column i, we go to every row j
		for (int i = 0; i < columnCount; i++) {
			for (int j = 0; j < rowCount; ++j) {
				A[j][i] = value;
				B[j][i] = value * 10;

				addition[j][i] = A[j][i] + B[j][i];
				++value; // increment the value and go through the loop again
				// System.out.print(addition[j][i] + " "); //using Arrays.toString to print in a
				// nice format
			}
			// System.out.println(); //using Arrays.toString to print in a nice format
		}
		// System.out.println();

		// 3 nested for loops to conduct multiplication of A and B matrices.
		for (int i = 0; i < columnCount; i++) {
			for (int j = 0; j < rowCount; ++j) {
				multiplication[j][i] = 0;

				for (int k = 0; k < rowCount; k++) {
					multiplication[j][i] += A[j][k] * B[k][i];
					++value; // increment the value and go through the loop again
				} // end of k loop
					// System.out.print(multiplication[i][j] + " "); //using Arrays.toString to
					// print in a nice format
			} // end of j loop
				// System.out.println(); //using Arrays.toString to print in a nice format
		}

		System.out.println("Matrix A:");
		PrintArrayA(A);
		System.out.println();
		System.out.println("Matrix B:");
		PrintArrayB(B);
		System.out.println();
		System.out.println("Addition of A and B matrices:");
		Printaddition(addition);
		System.out.println();
		System.out.println("Multiplication of A and B matrices:");
		Printmultiplication(multiplication);

	}

}
