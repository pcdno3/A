package com.day18;

import java.util.Scanner;

/*
 	인터페이스(interface)
 	- 일종의 추상 클래스
 	- 추상메서드와 상수만을 멤버로 가질 수 있다
 	- 메서드 목록만을 가진다. 클래스의 뼈대만 가지고 있는 것
 	- 미리 정해진 규칙에 맞게 구현하도록 표준을 제시하는데 사용됨
 	- 의무적으로 구현해야 하는 메서드의 목록을 인터페이스로 작성하여 자식 클래스들이 강제적 구현하도록 함
 	
 	인터페이스의 선언
 	interface 인터페이스이름{
 		public static final 타입 상수이름=값;
 		public abstract 메서드이름(매개변수);
 	}
 	
 	=> 모든 상수는 public static final, 생략
 	=> 모든 메서드는 public abstract 생략
 	
 	인터페이스의 구현
 	class 자식클래스이름 implements 인터페이스이름{
 		//추상 메서드 구현
 	}
 	
 	인터페이스의 메서드 중 일부만 구현한다면, 자식 클래스도 추상 클래스로 선언되어야 함
 */

interface IAnimal{
	public abstract void sound();
	void display();
}

class Cat implements IAnimal{
	public void sound() {
		System.out.println("야옹~!");
	}
	public void display() {
		System.out.println("Cat의 display()");
	}
}

abstract class Dog implements IAnimal{	//IAnimal의 display()는 구현하지 않았으므로 추상클래스
	public void sound() {
		System.out.println("멍멍이다멍멍멍");
	}

}

class Cow implements IAnimal{
	public void sound() {
		System.out.println("음~~~~~~~~~~~~~메~!");
	}
	
	public void display() {
		System.out.println("Cow의 display()");
	}
	
	/*
	 	void display(); { //error :  부모의 메서드를 오버라이딩할 때 접근 제한자는 부모보다 넓어야함
	 	
	 	}
	 */
}

public class InterfaceTest1 {

	public static void main(String[] args) {
		//IAnimal a = new IAnimal();// error 인터페이스 객체 생성 불가
		IAnimal an = new Cat();
		an.sound();
		an.display();
		
		// an = new Dog(); // error ; 추상 클래스는 객체 생성 불가
		an = new Cow();
		an.sound();
		an.display();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\n1.고양이 2.소 3.종료");
		int type = sc.nextInt();
		
		IAnimal ani = null;
		if(type==1){
			ani = new Cat();
		}else if (type==2){
			ani = new Cow();
		}else if (type==3) {
			return;
		}else {
			System.out.println("잘못입력!");
			return;
		}
		ani.sound();
		ani.display();
	}

}
