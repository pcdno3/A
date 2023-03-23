package com.day9;

import java.util.Scanner;

public class ArrayTest5 {

	public static void main(String[] args) {
		//for문 안에서 배열 초기화 하기
		int[] arr=new int[5];
		//5,10,15,20,25로 초기화
		
		for(int i =0; i<arr.length; i++) {
		arr[i] = (i+1)*5;
		}
		
		//출력
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
		//사용자로부터 double값 4개 입력받아서 배열에 넣기
		double[] dArr=new double[4];
		Scanner sc = new Scanner(System.in);
		System.out.println("실수를 4번 입력하세요.");
		
		/*
		 dArr[0]=sc.nextDouble();
		 dArr[1]=sc.nextDouble();
		 dArr[2]=sc.nextDouble();
		 dArr[3]=sc.nextDouble();
		 */
		
		for(int i=0; i<dArr.length; i++) {
				
			dArr[i]=sc.nextDouble();
		}
		for(int i=0; i<dArr.length; i++) {	
			System.out.println(dArr[i]);
		}
	}

}
