package com.matrix.functionality;

import java.util.ArrayList;
import java.util.List;

public class LowestPasth {

	public int LowestCost = 0;
	public boolean Destination;
	List<Integer> Path = new ArrayList<Integer>();
	List<Integer> Cost = new ArrayList<Integer>();

	public void pathDirection(int[][] matrix) {

		Path.add(0);
		LowestCost = matrix[0][0];
		Cost.add(matrix[0][0]);

		for (int i = 0,j=0; i < (matrix[0].length - 1); i++) {
			
			
			// To find the Total cost less than 50
			if (LowestCost > 50) {
				Path.remove(i);
				Cost.remove(i);
				break;
			}
			

		if(j == 0){
			
			
			
			if(matrix[matrix.length-1][i+1] < matrix[j][i+1] && matrix[matrix.length-1][i+1] < matrix[j+1][i+1] ){
				
				LowestCost += matrix[matrix.length-1][i+1];
				Path.add(matrix.length-1);
				Cost.add(matrix[matrix.length-1][i+1]);
				j=matrix.length-1;
				
			}else if(matrix[j+1][i+1] < matrix[j][i+1] ){
				
				LowestCost += matrix[j+1][i+1];
				Path.add(j+1);
				Cost.add(matrix[j+1][i+1]);
				j = j+1;
			
			}else if(matrix[j][i+1] <= matrix[j+1][i+1]){
		
				LowestCost += matrix[j][i+1];
				Path.add(j);
				Cost.add(matrix[j][i+1]);
				
			}else if(matrix[j][i+1] == matrix[j+1][i+1] && matrix[j][i+1] == matrix[matrix.length-1][i+1]){
				
				LowestCost += matrix[matrix.length-1][i+1];
				Path.add(matrix.length-1);
				Cost.add(matrix[matrix.length-1][i+1]);
				j=matrix.length-1;
				
			}else if(matrix[j][i+1] == matrix[j+1][i+1]){
				
				LowestCost += matrix[j][i+1];
				Path.add(j);
				Cost.add(matrix[j][i+1]);
				
			}else if(matrix[j+1][i+1] == matrix[matrix.length-1][i+1]){
				
				LowestCost += matrix[matrix.length-1][i+1];
				Path.add(matrix.length-1);
				Cost.add(matrix[matrix.length-1][i+1]);
				j = matrix.length-1;
				
			}else if(matrix[j][i+1] == matrix[matrix.length-1][i+1]){
				
				LowestCost += matrix[matrix.length-1][i+1];
				Path.add(matrix.length-1);
				Cost.add(matrix[matrix.length-1][j+1]);
				j=matrix.length-1;
				
			}else{
				
			LowestCost += matrix[matrix.length-1][i+1];
			Path.add(matrix.length-1);
			Cost.add(matrix[matrix.length-1][i+1]);
			j=matrix.length-1;
			
			}
			
			
			
			
			
		}else if( j == matrix.length-1 ){
			
			
			
		
			if(matrix[j-1][i+1] < matrix[j][i+1]  && matrix[j-1][i+1] < matrix[0][i+1]){
				
				LowestCost += matrix[j-1][i+1];
				Path.add(j-1);
				Cost.add(matrix[j-1][i+1]);
				j = j-1;
				
			}else if(matrix[0][i+1] < matrix[j][i+1]){
				
				LowestCost += matrix[0][i+1];
				Path.add(0);
				Cost.add(matrix[0][i+1]);
				j=0;
				
			}else if(matrix[j][i+1] <= matrix[0][i+1]){
				
				LowestCost += matrix[j][i+1];
				Path.add(j);
				Cost.add(matrix[j][i+1]);
				
			}else if(matrix[j][i+1] == matrix[j-1][i+1]  && matrix[j][i+1] == matrix[0][i+1]){
				
				LowestCost += matrix[j-1][i+1];
				Path.add(j-1);
				Cost.add(matrix[j-1][i+1]);
				j=j-1;
				
			}else if(matrix[j][i+1] == matrix[0][i+1]){
				
				LowestCost += matrix[j][i+1];
				Path.add(j);
				Cost.add(matrix[j][i+1]);
				
			}else if(matrix[j-1][i+1] == matrix[0][i+1]){
				
				LowestCost += matrix[j-1][i+1];
				Path.add(j-1);
				Cost.add(matrix[j-1][i+1]);
				j = j-1;
				
			}else if(matrix[j][i+1] == matrix[j-1][i+1]){
				
				LowestCost += matrix[j-1][i+1];
 				Path.add(j -1 );
 				Cost.add(matrix[j-1][i+1]);
 				j = j -1;
				
			}else{
				
				LowestCost += matrix[j-1][i+1];
				Path.add(j-1);
				Cost.add(matrix[j-1][i+1]);
				j=j-1;
				
				
			}
			
			
			
			
		}else{
			
			
			
			
			if (matrix[j - 1 ][i + 1] < matrix[j][i + 1] && matrix[j - 1][i + 1] < matrix[j + 1][i + 1]) {

				LowestCost += matrix[j-1][i + 1];
				Path.add(j-1);
				Cost.add(matrix[j-1][i+1]);
				j = j-1;
                  
			} else if (matrix[j ][i + 1] <= matrix[j + 1][i + 1]) {

				LowestCost += matrix[j ][i + 1];
				Path.add(j);
				Cost.add(matrix[j][i+1]);
				
			} else if (matrix[j + 1][i + 1] < matrix[j ][i + 1]){

				LowestCost += matrix[j + 1][i + 1];
				Path.add(j + 1);
				Cost.add(matrix[j+1][i+1]);
				j = j+1;
				
			} else if (matrix[j][i + 1] == matrix[j + 1][i + 1] && matrix[j][i + 1] == matrix[j - 1][i + 1]) {

				LowestCost += matrix[j-1][i + 1];
				Path.add(j-1);
				Cost.add(matrix[j-1][i+1]);
				j=j-1;
				
			}else if (matrix[j][i + 1] == matrix[j + 1][i + 1]) {

				LowestCost += matrix[j ][i + 1];
				Path.add(j );
				Cost.add(matrix[j][i+1]);
				
			}else if (matrix[j + 1][i + 1] == matrix[j - 1][i + 1]) {

				LowestCost += matrix[j - 1][i + 1];
				Path.add(j - 1);
				Cost.add(matrix[j-1][i+1]);
				j = j-1;
				

			}  else if (matrix[j][i + 1] == matrix[j - 1][i + 1]) {

				LowestCost += matrix[j - 1][i + 1];
				Path.add(j - 1);
				Cost.add(matrix[j-1][i+1]);
				j = j-1;
			
			}  else {

				LowestCost += matrix[j-1][i + 1];
				Path.add(j-1);
				Cost.add(matrix[j-1][i+1]);
				j = j-1;
				

			}

			
			
			
		}
		
	
		
		}
		
		
		Destination = fullPath(Path.size(), matrix);

	}

	public void displayResult() {

		LowestCost=0;
		System.out.println(Destination);
		Cost.stream().forEach(p -> LowestCost +=p );
		
		System.out.println(LowestCost);
		Path.stream().map(p -> p+1).forEach( s -> System.out.println("\t"+s));

		
		
	}



	// To find whether the path is reached or not
	public boolean fullPath(int cnt, int[][] matrix) {

		if (cnt == matrix[0].length) {

			return true;

		} else {

			return false;

		}

	}

}
