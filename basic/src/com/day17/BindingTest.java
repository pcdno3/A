package com.day17;

class Parent{
	protected int x = 100;
	
	public void method() {
		System.out.println("Parent Method");
	}
}

class Child extends Parent{
	protected int x = 200;
	
	public void method() {
		System.out.println("Child Method");
	}
}

public class BindingTest {
	public static void main(String[] args) {
		Parent p = new Child();//다형성
		System.out.println("p.x = " + p.x);	//100
		p.method();//자식의 오버라이딩 메서드 호출
		
		Child c = new Child();
		System.out.println("c.x = " + c.x);
		c.method();

	}

}
