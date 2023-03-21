package com.day5;

import java.util.Scanner;

public class OverlapIf2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("날짜(일)를 입력하세요<1~31>");
		int day=sc.nextInt();
		
		String result="";
		
		if(day>=1 && day<11) {
			
			result="초순";
			
		}else if(day<=20) {
			
			result="중순";
		}else if(day<=31) {
			
			result="하순";
			
		}else {
			result="날짜를 잘못 입력 하였습니다.";
			
		}
		
		System.out.println(result);
	}

}
