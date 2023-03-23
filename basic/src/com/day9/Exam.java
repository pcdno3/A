package com.day9;

import java.util.Scanner;

public class Exam {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 두 개를 입력하세요");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int temp=0;
		if(a>b){
			temp=a;
			 a=b;
			 b=temp;
		}
		int sum=0;
		for(int i=a;i<=b;i++)
			sum+=i;
		
		System.out.println(sum);
		
		
	}
}
