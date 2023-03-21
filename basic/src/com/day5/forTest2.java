package com.day5;

import java.util.Scanner;

public class forTest2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("반복횟수를 입력하세요.");
		int num=sc.nextInt();
		
		for(int i=0;i<num;i++) {
			System.out.println(i+" : Hello JAVA!");
		}
		/*
		 	10
		 	20
		 	30
		 	40
		 	
		 */
		
		for(int i=0;i<4;i++) {
			System.out.println((i+1)*10);
		}

	}

}
