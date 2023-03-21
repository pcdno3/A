package com.day7;

import java.util.Scanner;

public class ForTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//두개의 정수 입력받기
		System.out.println("두개의 정수를 입력하세요");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		//입력 받은 두 정수와 그사이에 존재하는 모든 정수 합 계산
		for(int i=num1;num1<=num2;num1++) {
			
			i++;
			
		}
		System.out.println(i+"~"+num2+"사이의 정수의 합 : ");
	}

}
