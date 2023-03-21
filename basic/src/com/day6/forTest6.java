package com.day6;

import java.util.Scanner;

public class forTest6 {

	public static void main(String[] args) {
		/*
		 1~3까지의 합 구하기(누적)
		 sum += i
		 기존 sum에 i를 더한다
		 1+2+3+
		 sum = sum + i
		 
		 sum=0
		 		sum + i
		 i=1	0 + 1
		 i=2	0+1 + 2
		 i=3	0+1+2 + 3
		 */
		System.out.println("1~n 까지의 덧셈 : n 을 입력하세요");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		int sum=0;	//누적하는 변수는 반드시 0으로 초기화
		
		for(int i=0;i<=num;i++) {
			
			sum+=i;
			
		}
		
		System.out.println("1~"+num+"까지의 합 : "+sum);
		
		//1~10까지 짝수의 합
		sum=0;
		for(int i=0;i<=10;i+=2) {
			
			sum+=i;
		}
		
		System.out.println("1~10까지의 짝수 합 : " + sum);
		
		System.out.println("1~n 까지의 홀수의 합 : n 을 입력하세요");
		int num2=sc.nextInt();
		
		sum = 0;
		
		for(int i=1;i<=num2;i+=2) {	//i=i+2
			
			sum+=i;//1+3+5+7+..... 
			
		}
		
		System.out.println("1~n 까지의 홀수의 합 : "+sum);
		
	}

}
