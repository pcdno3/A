package com.day4.condition;

import java.util.Scanner;

public class HomeWork32 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		int num1=sc.nextInt();
		String a=(num1%2==0)? "짝수" : "홀수";
				
		System.out.println(a);
		}
	}