package com.matrix.lowestcost;

import java.util.Scanner;
import com.matrix.lcInterface.InputMatrixarray;

public class MultiDimensionalArrayInput implements InputMatrixarray {

	static private Scanner s = new Scanner(System.in);
	static int[][] MatrixArray;

	public void multiDimensionalArray() {

		System.out.println("Enter the number of rows ");
		int row = s.nextInt();

		System.out.println("Enter the number of columns ");
		int column = s.nextInt();

		MatrixArray = new int[row][column];

		for (int i = 0; i < MatrixArray.length; i++) {
			for (int j = 0; j < MatrixArray[i].length; j++) {

				System.out.println("Enter the element "+ i+""+j + " of the matrix");
				MatrixArray[i][j] = s.nextInt();
			}
		}

	}

	
}
