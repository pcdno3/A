package com.day5;

import java.util.Scanner;

public class switchTest2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("산술연산자를 입력하세요(+, -, *, /)");
		String sign=sc.nextLine();
		String result="";
		switch(sign) {
				case "+":
					result="더하기";
					break;
				case "-":
					result="빼기";
					break;
				case"*":
					result="곱하기";
					break;
				case"/":
					result="나누기";
					break;
				default:
					result="잘못 입력!";
		}
		
			System.out.println(result);
	}

}
