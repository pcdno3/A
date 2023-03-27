package com.day11;

public class ForArray {

	public static void main(String[] args) {
		
		int[][] dArr = new int[3][3];
		
		for(int i=0; i<dArr.length; i++) {
			for (int j=0; j<dArr[i].length; j++) {
				
				if(dArr[i]==dArr[j]) 					
					dArr[i][j]=1;
				
				
				System.out.print(dArr[i][j] + "\t");			
			}
			System.out.println();
		}
		
		System.out.println();
		int[][] dArr2 = new int[5][5];
		
		for(int i=0; i<dArr2.length; i++) {
			for(int j=0; j<dArr2[i].length; j++) {
				if(i==j || i+j==dArr2.length-1)
				dArr2[i][j]=1;
				
				System.out.print(dArr2[i][j] + "\t");
				
					
			}		
			System.out.println();
		}
		
	}
}

