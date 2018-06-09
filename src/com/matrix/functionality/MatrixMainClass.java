package com.matrix.functionality;

import com.matrix.lowestcost.DisplayMatrixClass;
import com.matrix.lowestcost.MultiDimensionalArrayInput;

public class MatrixMainClass {

	public static void main(String[] args) {
		
		int[][] mat ={{3,4,1,2,8,6},{6,1,8,2,7,4},{5,9,3,9,9,5},{8,4,1,3,2,6},{3,7,2,1,2,3}};
		int[][] mat1 = {{19,10,19,10,19},{21,23,20,19,12},{20,12,20,11,10}};
		int[][] mat2 = {{3,4,1,2,8,6},{6,1,8,2,7,4},{5,9,3,9,9,5},{8,4,1,3,2,6},{3,7,2,8,6,4}};
		
		MultiDimensionalArrayInput mi = new MultiDimensionalArrayInput();
		DisplayMatrixClass dmc = new DisplayMatrixClass();
		LowestPasth lp = new LowestPasth();
		
		
		//mi.multiDimensionalArray();
		
		System.out.println("Input Matrix is ");
		//dmc.matrixDisplay(mi.MatrixArray);
		dmc.matrixDisplay(mat);
//		dmc.matrixDisplay(mat1);
		
		//lp.pathDirection(mi.MatrixArray);
		lp.pathDirection(mat);
        lp.displayResult();
        
//        lp.pathDirection(mat1);
//        lp.displayResult();

		
		
	}

}
