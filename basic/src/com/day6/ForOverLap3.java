package com.day6;

import java.util.Scanner;

public class ForOverLap3 {

	public static void main(String[] args) {
		int sum=0;
		for(int i=0;i<101;i+=2) {
			
			sum+=i;
		}
			System.out.println("0~100까지 짝수의 합 : "+sum);
		
		System.out.println("출력할 구구단의 단을 입력하세요");
		Scanner sc = new Scanner(System.in);
		int dan=sc.nextInt();
		
		for(int i=9;i>=1;i--) {
			System.out.println(dan + " * " + i + " = " + dan*i);
		}
	}

}
