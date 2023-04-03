package com.day15;

/*
 	1)super.멤버 - 부모클래스의 멤버를 참조하는 super.
 	부모의 멤버와 자신의 멤버를 구별할 때 사용된다.
 	this나 super는 static메서드에서는 사용 불가!
 	2)super() - 부모클래스의 생성자를 호출하는 super()
 */

class Parent{
	protected int x = 10;
}

class Child extends Parent{
	private int x = 20;
	
	
	public void showInfo() {
		System.out.println("x = " + x);			//20
		System.out.println("x = " + this.x);	//20
		System.out.println("x = " + super.x);	//10, 부모의 멤버인 x 참조 수퍼~
	}
}

public class SuperTest1 {

	public static void main(String[] args) {
		Child ch = new Child();
		ch.showInfo();

	}

}
