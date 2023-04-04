package com.day16;

public class ClassArgsTest {
	public static double mul(int a, double b) {
		return a*b;
	}
	
	//1. 매개변수가 클래스인 경우
	public static void func1(Circle c) {
		//참조변수가 보이면 참조변수.
		c.draw();
		c.delete();
		c.sayCircle();
	}
	
	//2. 매개변수의 다형성
	
	//3. 반환타입이 클래스인 경우
	public static Circle func3() {	//반환타입이 Circle(클래스)이면 Circle객체가 리턴된다
		Circle c = new Circle();
		return c;
	}
	//4. 반환타입에 다형성 이용
	
	public static void main(String[] args) {
		/*
		 	메서드의 매개변수가 int면 main에서 int값을 넣는다
		 				  String이면 String값을 넣는다
		 				  Circle이면 Circle값을 넣는다
		 				  어떻게 넣나? new로 객체 생성해서 넣는다.
		 */
		
		// 1)매개변수가 클래스인 경우
		func1(new Circle());
		
		// 2)매개변수의 다형성
		
		// 3)반환타입이 클래스
		Circle c2 = func3();
		c2.draw();
		// 4)반환타입에 다형성이 이용된 경우

	}

}
