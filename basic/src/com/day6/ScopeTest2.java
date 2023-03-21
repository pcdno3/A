package com.day6;

import java.util.Scanner;

public class ScopeTest2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("반복하고 싶은 횟수를 입력하세요");
		int num=sc.nextInt();
		
		for(int i=0;i<num;i++) {
			
			System.out.println("재미있는 java!");
			
		}
		
		System.out.println("\n");
		
		for(int i=0;i<num;i++) {
			
			System.out.println("i="+i);
			
		}
		
		System.out.println("\n");
		
		int sum=0;
		for(int i=0;i<=num;i++) {
			
			sum+=i;
			System.out.println("i="+i+", sum="+sum);
		}
			System.out.println("0부터 n까지의 합 : "+sum);
		
		for(char i=97;i<123;i++) {
				System.out.print((char)i);
				if(i !=122) 
				System.out.print(",");
			
		}

	}

}
