package com.day9;

import java.util.Scanner;

public class OverloadingTest1 {
	
	/*
	 오버로드 메서드
	 -하나의 클래스내에서 메서드의 이름이 같고, 매개 변수의 개수나 자료형이 다른 메서드를 오버로딩메서드 라고함
	 
	 -리턴 타입으로는 구별하지 않음
	 
	 */
	public static int add(int a, int b) {
		int c=a+b;
		return c;
	}
	
	public static double add(double a, double b) {
		double c=a+b;
		return c;
	}
	
	public static String add(String a, String b) {
		String c=a+b;
		return c;
	}
	/*
	public static String add(int a, int b) {	//매개변수 개수 , 자료형이 같아서 error
		String str=Integer.toString(a+b);
		return str;
	}*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요");
		int in1=sc.nextInt();
		int in2=sc.nextInt();
		
		int i=add(in1, in2);
		System.out.println(i);
		
		System.out.println("실수를 입력하세요");
		double dou1=sc.nextDouble();
		double dou2=sc.nextDouble();
		double d=add(dou1, dou2);
		System.out.println(d);
		
		System.out.println("합칠 문장을 입력하세요");
		sc.nextLine();
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		String S=add(str1, str2);
		System.out.println(S);
	}

}
