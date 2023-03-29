package com.day13;

public class StaticTest {
	private int num1=10;//인스턴스 변수
	private static int num2=20; // static 변수
	
	public int add() {	//instance메서드 - static변수에도 접근 가능
		return num1+num2;
	}
	
	public static int multiply(int a, int b) {	//static 메서드 - static만 접근가능!!!!
		//int c = num1*num2;
		//ㄴ>error : Cannot make a static reference to the non-static field num1
		//인스턴스 변수(num1)는 static 메서드에 올 수 없음
		int c=a*b;
		return c;
	}

	public static void main(String[] args) {
		int result = multiply(10, 5);	//같은 클래스 이므로 클래스명 생략하고 메서드()만 호출가능
		
		System.out.println("두 수의 곱 : " + result);
		
		//result=add(); //error
		//static메서드는 static만 접근가능
		//접근하려면 객체 생성 후 접근해야 함
		StaticTest obj = new StaticTest();
		result = obj.add();
		System.out.println("두 수의 합 : " + result);
	}

}
