package com.day13;

/*
 static메서드
 - 생선된 객체가 전혀 없어도 호출 가능
 클래스로부터 호출해야 함
 클래스명.static 메서드()
 
 static메서드는 static 데이터만 사용 가능, 인ㅌ스턴수 변수에 접근 불가
 
 */

class Calculator {
	//메서드
	public static int add(int a, int b ) {
		return a+b;
	}
	
	public int minus (int a, int b) {
		return a-b;
	}

	
}

public class CalculatorMain {

	public static void main(String[] args) {
		//static메서드 호출 - 클래스명.메서드()
		
		int result = Calculator.add(10, 30);
		System.out.println("두 수의 합 : " + result);
		
		int n = Integer.parseInt("123");
		
		//Instance 메서드 호출 => 객체 생성 후 참조변수.메서드()
		Calculator cal = new Calculator();//객체 생성
		result = cal.minus(50,20);//메서드 호출
		System.out.println("두 수의 차 : " + result);
		
		//Scanner sc = new Scanner (System.in); //객체 생성
		//int k = sc.nextInt();//메서드 호출

	}

}