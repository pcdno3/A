package com.day13;

class Person{
//	1.멤버 변수 (필드)
	private String name;	
	private int age;
	private static int count; // static은 객체별로 생성하지 않고 하나만 생성해서 공유함
	/*  
	 static 변수(클래스 변수)
    - 클래스 차원에서 단 하나만 생성되며, 모든 객체가 공유한다.
    
    static멤버
    - 클래스의, 공통적인 의 의미를 가지고 있다.
    - 클래스 차원에서 바로 호출이 가능하다
    - 객체 생성하지 않아도 클래스의 이름으로 접근할 수 있다.
    
    static변수의 초기화 시점
    - 해당 클래스가 메모리에 로드될 때 생성됨
    
    바이트 코드, static변수는 메모리의 메소드영역에 로드된다.
	 */
//	2. 생성자
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		
		System.out.println(++count + " 번째 객체 생성!");
	}
//	3. 메서드
	public void display() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}

}
public class PersonTest {

	public static void main(String[] args) {
		
		Person hong = new Person("홍길동", 23);
		hong.display();
		
		Person kim = new Person("김길동", 20);
		kim.display();
		
		/*
		 멤버 변수는 객체별로 따로 할당
		 메서드는 공유
		 */	
		}
		

	}

