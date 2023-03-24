package com.day10;

public class SeasonArray {

	public static void main(String[] args) {
		String[] season = new String[4];
		season[0] = "봄";
		season[1] = "여름";
		season[2] = "가을";
		season[3] = "겨울";
		int sum=0;
		
		for(String n : season) {
			System.out.println("season[" +sum+ "] = " + n );
			sum+=1;
		}
		System.out.println("\n\n================");
		double num=10.0;
		double [][] dArr = new double[3][2];
		for(int i=0; i<dArr.length; i++) {
			for (int j=0; j<dArr[i].length; j++) {
				
				dArr[i][j] =num;
				num=((num+0.1)*100)/100;
			}
		}
		
		for(int i=0; i<dArr.length; i++) {
			for(int j=0; j<dArr[i].length; j++) {
				System.out.print("dArr[" + i + "][" + j + "] = ");
				System.out.print(dArr[i][j] + "\n");
			}
		}
		/*	 i  j	 j*i+j
		dArr[0][0] = 0*0+0; 
		dArr[0][1] = 1*0+1; 
		dArr[1][0] = 0*1+0;
		dArr[1][1] = 1*1+1;
		dArr[2][0] = 0*2+1;
		dArr[2][1] = 1*2+1;
		*/

	}

}
