package com.day24;

public class AnonymousTest1 {
	
	Object iv = new Object() {
		void method() {}
	};
	
	static Object cv = new Object() {
		void method() {}
	};
	
	void myMethod() {
		Object iv = new Object() {
			void method() {}
			
		};
	}

	public static void main(String[] args) {
		/*
		  익명 클래스
		  - 이름이 없는 클래스
		  - 클래스의 선언과 객체의 생성을 동시에 하기 때문에 단 한번만 사용될 수 있다
		  
		  new 부모클래스명(){
		  	//멤버선언
		  }
		  
		  또는
		  
		  new 인터페이스명(){
		  	//멈버선언
		  }
		  
		 */

	}

}
