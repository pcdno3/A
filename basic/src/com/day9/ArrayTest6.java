package com.day9;

import java.util.Scanner;

public class ArrayTest6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("원하는 배열의 갯수를 입력하세요");
		int num=sc.nextInt();
		int [] arr= new int[num];
		for(int i=0; i<num; i++) {
			arr[i] = i;
			System.out.println("arr[" + i + "] = " + arr[i]);
		}
		
		int [] arr2=new int[5];
		for(int i=0; i<arr2.length; i++) {
			arr2 [i]=2*i+1;
			System.out.println(i);
		}

	}

}
