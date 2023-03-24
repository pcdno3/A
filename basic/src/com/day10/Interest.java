package com.day10;

import java.util.Scanner;

public class Interest {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long[] money = new long[5];
		
		for(int i=0; i<money.length; i++) {
			System.out.println("잔고를 입력하세요");
			money[i] = sc.nextLong();
		}
		
		System.out.println("이자율을 입력하세요");
		double interest = sc.nextDouble();
		
		for(int i=0; i<money.length; i++) {
			
			money[i] +=money[i]*interest/100;
			
			System.out.println("이자가 반영된 잔고 조회 : " + Math.round(money[i]));
		}

	}

}
