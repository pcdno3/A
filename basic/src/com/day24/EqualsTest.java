package com.day24;


public class EqualsTest {

	public static void main(String[] args) {
		/*
		[1] 연산자 ==
		   - 기본자료형에서는 값이 같은지 비교
		   - 참조형에서는 주소값을 비교
		   
		[2] String클래스의 equals() 메서드
			- 값이 같은지 비교
			- Object의 equals() 메서드를 오버라이딩 한 것
		[3] Object 클래스의 equals()
			- 주소값을 비교
		*/
		
		Man m = new Man(20);
		Man m2 = new Man(25);
		
		if(m==m2) {	//참조형에서는 주소값 비교
			System.out.println("m 과 m2는 같다");
		}else {
			System.out.println("m과 m2는 다르다");
		}
		
		if(m.equals(m2)) {	//주소값비교
			System.out.println("m 과 m2는 같다");
		}else {
			System.out.println("m과 m2는 다르다");
		}
		
		m=m2;
		if(m.equals(m2)) {	//주소값비교
			System.out.println("m 과 m2는 같다");
		}else {
			System.out.println("m과 m2는 다르다");
		}

	}

}



class Man{
	
	private int age;

	Man(int age){
		this.age=age;
	}
}
