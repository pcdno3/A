package com.day7;

import java.util.Scanner;

public class DoWhile3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력할 정수의 개수를 입력하세요");
		int count=sc.nextInt();
		double sum=0;
		for(int i=0; i<count;i++) {
			System.out.println("숫자를 입력하세요");
			double num = sc.nextDouble();
			sum+=num;
			
		}
		double avg=(double)(sum/count);

		
		System.out.println("입력된 정수의 전체 평균 : " + Math.round(avg*100)/100.0);
		
		
	}

}
