package com.day11;

public class dArrayTest {

	public static void main(String[] args) {
		int[][] iArr = new int[4][5];
		int total=0;
		for(int i=0; i<iArr.length; i++) {
			
			for(int j=0; j<iArr[i].length;j++) {
				iArr[i][j]=(int)(Math.random()*100);
				System.out.print(iArr[i][j] + " ");
				 total+=iArr[i][j];
			}
			System.out.println();
	
		}
		int a = iArr.length * iArr[0].length;
		System.out.println("\n총합 : " + total + ", 평균 : " + total/a);

	}

}
