package com.matrix.lowestcost;

public class DisplayMatrixClass {
	
	
	public static void matrixDisplay(int matarray[][]) {

		
		for (int i = 0; i < matarray.length; i++) {
			for (int j = 0; j < matarray[i].length; j++) {

				System.out.print(matarray[i][j] + "\t");
			}
			System.out.println();
		}

	}


}
