package com.day15;

/*
 	final
 	1) 변수에 사용되면 값을 변경할 수 없는 상수가 됨
 	2) 메서드에 사용되면 오버라이딩을 할 수 없게 됨
 	3) 클래스에 사용되면 자식 클래스에 정의하지 못하게 됨
 */

final class Parent1{
	
}
/*
class Child1 extends Parent1{	//error : The type Child1 cannot subclass the final class Parent1
	
}
*/
class Parent2{
	
	public void func() {
		System.out.println("Parent2메서드");
	}
	
	public final void finalFunc() {
		System.out.println("final 메서드");
	}
}

class Child2 extends Parent2{
	public void func() {
		System.out.println("오버라이딩 메소드");
	}
	/*
	public final void finalFunc() {		error : Cannot override the final method from Parent2
		
	}
	*/
}

class MyFinal{
	final public static double PI=3.14;
	public final int DELIVERY=30000;
	int age=10;
}
public class FinalTest1 {

	public static void main(String[] args) {
		MyFinal obj = new MyFinal();
		obj.age = 20;
		System.out.println("age = " +obj.age);
		
		System.out.println("PI = " + MyFinal.PI);
		System.out.println("배송비 : " + obj.DELIVERY);
		
		int num=30;
		final double INTEREST_RATE=0.03;
		
		num=25;
		
		System.out.println("\nnum = " + num);
		System.out.println("이자율 : " + INTEREST_RATE);
	}

}
