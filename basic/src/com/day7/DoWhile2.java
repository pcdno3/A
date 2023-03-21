package com.day7;

import java.util.Scanner;

public class DoWhile2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0, num=0;
		
		do {
			System.out.println("숫자를 입력하세요");
			num=sc.nextInt();
			sum+=num;
			
		}while(num!=0);
		System.out.println("입력된 숫자의 합 : " + sum);
		
		

	}

}
