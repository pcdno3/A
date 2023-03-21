package com.day4.condition;

import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int num=sc.nextInt();
		String result="";
		if(num>0){
			result="양수";
		}else if(num<0){			
			result="음수";
		}else{
			result="0 입니다.";
		}
			System.out.println(result);
	}

}
