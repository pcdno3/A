package com.day14;

class GrandFather{
	public GrandFather() {
		System.out.println("GrandFather 생성자 !");
	}
	
	public void showGrandFather() {
		System.out.println("GrandFather 메서드!");
	}
}//

class Father extends GrandFather{
	public Father() {
		System.out.println("Father 생성자 !");
	}
	
	public void showFather() {
		System.out.println("Father 메서드!");
	}
	
}

class Child2 extends Father{
	public Child2() {
		System.out.println("Child 생성자 !");
	}
	
	public void showChild() {
		System.out.println("Child 메서드!");
	}
}

//클래스는 중복상속(다중상속)을 할 수 없고, 단일 상속만이 가능함
//2개의 클래스로부터 동시에 상속 받을 수 없다는 뜻

public class InheritanceTest4 {

	public static void main(String[] args) {
		
		Child2 ch = new Child2();
		/*
			GrandFather 생성자 !
			Father 생성자 !
			Child 생성자 !
		 */

		/*
		 생성자 호출 - 모든 상위 레벨의 생성자가 차례대로 호출되어가지고, 제일 마지막에
		 자신의 것이 호출됨
		 */
		System.out.println("\n=======메서드 호출=========");
		ch.showChild();
		ch.showFather();
		ch.showGrandFather();
		/*
		 	=======메서드 호출=========
			Child 메서드!
			Father 메서드!
			GrandFather 메서드!

		 */
	}

}
