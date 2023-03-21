package com.day4;

import java.util.Scanner;

public class ThreeOp2 {

	public static void main(String[] args) {
		int num=-25;
		System.out.println("num=-25 => " + (num<0? "음수" : "양수"));
		
		int num1=17;
		String a=(0==num1%2)? "짝수" : "홀수";
		System.out.println("num=17 = >" + a);
	
		Scanner sc= new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num3=sc.nextInt();
		
		System.out.println(num3);
		System.out.println("num3=" + num3 + " => " + (0==num3%2? "짝수":"홀수") );
		
		
	}

}
