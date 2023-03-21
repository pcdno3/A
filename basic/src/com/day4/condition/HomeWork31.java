package com.day4.condition;

import java.util.Scanner;

public class HomeWork31 {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("숫자를 입력하세요.");
			int num1=sc.nextInt();
			
			String	result="";
			if(num1%2==0){
				result="짝수";
			}else {
				result="홀수";
			}
			System.out.println(result);
			
	}
}