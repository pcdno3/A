package com.day6;

import java.util.Scanner;

public class ForOverLap2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("3의 배수의 개수를 입력하세요");
		int num=sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			
			System.out.print(i*3+"\t");
			
		}
		System.out.println();
		
		System.out.println("n의 계승 구하기 : n을 입력하세요");
		int num2=sc.nextInt();
		int sum = 1;
		for(int i=1;i<=num2;i++) {
		
			sum*=i;
			 
		}
		System.out.println("1~"+num2+"까지의 곱<계승, factorial>:"+ sum );

	}

}
