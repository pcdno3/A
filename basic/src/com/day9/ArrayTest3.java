package com.day9;

import java.util.Scanner;

public class ArrayTest3 {

	public static void main(String[] args) {
		float[]arr;
		arr = new float[3];
		arr[0]=12.5F;
		arr[1]=-24.3F;
		arr[2]=0.76F;
		for(int i=0; i<arr.length; i++) {
			
			System.out.println("farr[" + i + "]= " + arr[i]);
		}

		double sum=0.0;
		double[]arr2= {65.5, 90.5, 80.5, 77.7};
		
		
		for(int i=0; i<arr2.length; i++) {
				sum+=arr2[i];
		}
		double avg=sum/arr2.length;
		System.out.println("총점 : " + sum + ", 평균 : " + avg);

	}

}
