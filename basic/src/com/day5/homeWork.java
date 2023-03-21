package com.day5;

import java.util.Scanner;

public class homeWork {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("산술연산자를 입력하세요<+, -, *, /, %> ");//산술연산자 중 하나를 선택하게 하세요
		String oper=sc.nextLine();
		System.out.println("실수를 두 개 입력하세요.");//실수 두 개를 입력받으세요
		double num1=sc.nextInt();
		double num2=sc.nextInt();
		String result="";
		double sol=0.0;
		switch(oper){
		case "+" :	//+선택했으면 두 수 더하기
			sol= num1+num2;
			break;
								//- 선택했으면 두 수 빼기
		case "-":
			sol= num1-num2;
			break;
								//* 선택했으면 두 수 곱하기
		case "*" :
			sol= num1*num2;
			break;
								// /을 선택했으면 두 수 나누기
		case "/" :
			sol= num1/num2;
			break;
								// %를 선택했으면 두 수의 나머지를 구하여 결과값 출력하기
		case "%" :
			sol= num1%num2;
			break;
		default :
			System.out.println("잘 못 입력하셨습니다.");;
		}
		
		System.out.println(sol);				
		
	}

}
