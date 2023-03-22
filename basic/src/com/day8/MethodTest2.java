package com.day8;

import java.util.Scanner;

public class MethodTest2 {
//========================================================	
	//1. 매개변수가 없고, 반환값(결과값)도 없는 메서드 정의
	public static void func1() {
		System.out.println("예린이 귀여워");
	}
//========================================================		
	//2. 매개변수가 있고, 반환값은 없는 메서드의 정의
	public static void func2(int cnt) {
		for(int i=0; i<cnt; i++) {
			System.out.print("예린이 바보 ");
		}
		System.out.println();
	}
//========================================================	
	//3. 매개변수는 없고, 변환값은 있는 메서드 정의
			 //결과값 자료형(매우중요)	
	public static double func3() {
		//1~10까지 합의 평균을 구해서 리턴하는 메서드
		int sum=0;
		for(int i=1; i<=10; i++) {
			sum+=i;
		}
		
		double avg=sum/10.0;
		return avg;	//결과값 자료형 확인(매우중요)
	}
//========================================================	
	//4. 매개변수도 있고, 반환값도 있는 메서드 정의
	public static int func4(int a, int b) {
		//두 수의 합을 구해서 리턴하는 메서드
		int c = a+b;
		return c;
	}
//========================================================	
	//5.혼자 해보기
	public static double func5(double a, int b) {
		double c = a%b;
		return c;
	}
	public static void main(String[] args) {
		//[1] 매개변수, 반환값, 모두 없는 메서드 호출
			func1();
			
		//[2] 매개변수는 있고 변환값은 없는 메서드 호출
			func2(5);//매개변수 값 전달
			
		//[3] 매개변수는 없고 변환값은 있는 메서드 호출
			double result = func3();//메서드의 변환타입이 double이므로 double변수로 결과값을 받아야함 (중요)
			System.out.println(result);
		
		//[4] 매개변수도 있고 변환값도 있는 메서드 호출
			int num=func4(10,20);
			System.out.println("두 수의 합 : " + num);
			
			int n1=5, n2=6;
			num=func4(n1,n2);
			
			Scanner sc = new Scanner (System.in);
			int n3=sc.nextInt();
			int n4=sc.nextInt();
			num=func4(n3, n4);
		//[5] 혼자 해보기
			double num2=func5(10.0,20);
			System.out.println(num2);
		//public static int parseInt(String s)
		int k=Integer.parseInt("123");
		
		String str="4567";
		k=Integer.parseInt(str);
		
			
		String str2 = sc.nextLine();
		k=Integer.parseInt(str2);
		System.out.println(str2);
	}

}
