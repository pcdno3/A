package com.day24;

/*
 	내부 클래스
 	- 클래스 내에 선언된 클래스
 	- 주로 GUI 어플리케이션의 이벤트 처리에 사용됨
	- 내부 클래스의 선언 위치가 변수의 선언위치와 동일함
	인스턴스 변수, static변수, 지역변수
	인스턴스 클래스, static클래스, 지역클래스
	
	
	-private, protected 접근 제어자도 사용가능
 */
public class InnerTest1 {
	class InstanceInner{
		int iv=100;
		
		static int cv=200;//이전 버전에서는 에러
		//내부 클래스
		
		final static int CONST = 300;
	}
	
	static class StaticIner{
		int iv = 10;
		static int cv=20;
		
	}
	
	public void method() {
		//지역클래스
		class localIner{
			int iv = 1;
			static int cv = 2;//이전 버전에서는 에러
			final static int CONST = 3; //이전버전에서도 static final은 허용
		}
	}
	public static void main(String[] args) {
		System.out.println("내부 클래스 테스트");
		System.out.println(InstanceInner.CONST);
		System.out.println(InstanceInner.cv);
		System.out.println(StaticIner.cv);

	}

}
