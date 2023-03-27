package com.day11;

public class SeasonArray1 {

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
		double num=10.1;
		double [][] dArr = new double[3][2];
		for(int i=0; i<dArr.length; i++) {
			for (int j=0; j<dArr[i].length; j++) {
				
				dArr[i][j] =num;
				num=(num+0.1);
			}
		}
		
		for(int i=0; i<dArr.length; i++) {
			for(int j=0; j<dArr[i].length; j++) {
				System.out.print("dArr[" + i + "][" + j + "] = ");
				System.out.print(dArr[i][j] + "\n");
			}
		}
		/*	 i  j	j크기*i+j
		dArr[0][0] = 2*0+0  = 0
		dArr[0][1] = 2*0+1; = 1
		dArr[1][0] = 2*1+0; = 2
		dArr[1][1] = 2*1+1; = 3 
		dArr[2][0] = 2*2+0; = 4
		dArr[2][1] = 2*2+1; = 5
		*/
		double [] dArr2 = new double[dArr.length * dArr[0].length];	
		
		for(int i=0; i<dArr.length; i++) {
			for(int j=0; j<dArr[i].length; j++) {
				
				dArr2[(dArr[i].length * i) + j] = dArr[i][j];
				
			}
			
		}
		sum=0;
		for(double n : dArr2) {
			System.out.println("dArr2["+ sum++ +"] = " + n);
		}
	}

}