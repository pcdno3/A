package com.day8;

import java.util.Scanner;

public class MethodEx4 {
	
	public static String year(int year) {
		String a;
		if(year%400==0) {
			a="윤년";
		}else if(year%4==0 && year%100!=0) {
			a="윤년";
		}else {
			a="평년";
		}
		return a;
	}
		
	public static String number(int num) {
		String sum;
		if(num%2==0) {
			sum="짝수";
		}else{
			sum="홀수";
		}
		return sum;
	}
	
	public static String gender(int add) {
		String gender;
		if(add==1 || add==3) {
			gender="남자";
		}else if(add==2 || add==4) {
			gender="여자";
		}else {
			gender="잘못입력";
		}
		return gender;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//윤년 평년
		
		System.out.println("년도를 적어주세요.");
		int year = sc.nextInt();
		String n=year(year);
		
		System.out.println(year + "년도는 " + n + "입니다.");
		
		//홀수 짝수
		
		System.out.println("숫자를 입력해주세요.");
		int num=sc.nextInt();
		String result=number(num);
		
		System.out.println(result);
		
		//남자 여자 구분
		
		System.out.println("주민번호 첫번째 뒷자리를 입력해주세요.");
		int num2=sc.nextInt();
		String gender=gender(num2);
		
		System.out.println("성별은 : " + gender);
		
		
		
		

	}

}
