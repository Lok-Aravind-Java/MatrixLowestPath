package com.matrix.lowestcost;

public class LowestCheck {

	private int small_val;
	int row;
	
	
	public void checkTheBest(int[][] matrix){
	
		small_val = matrix[0][0];
		
		for(int i = 0; i < matrix.length ; i++){
			
			if(small_val > matrix[i][0] ){
				
				small_val = matrix[i][0];
				row = i;
			
			}
			
		}
		
		
		for(int j = 0 ; j < matrix.length ; j++){
			
			if(small_val == matrix[j][0]){
				
				
				
			}
			
			
			
		}
	
	
	}

}
