package com.day6;

public class ScopeTest {

	public static void main(String[] args) {
		/*
		 지역변수
		 - 메서드나 {} 블럭안에서 선언된 변수
		 - 메서드에서 선언된 변수는 해당 메서드가 종료되면 소멸됨
		 - {} 블럭안에서 선언된 변수는 해당 {}블럭을 벗어나면 소멸됨
		 */
		//변수의 범위 (Scope)
		int n=20;	//main 메서드에서 선언된 지역변수, main 메서드가 종료되면 소멸.
		System.out.println("n=" + n);
		
		//for(int n=0;n<3;n++ {	//error
		//}

		for(int i=0;i<3;i++) {
			
			System.out.println(i + ".hello");
			System.out.println("for문 내부, n=" + n + "\n");
			
		}
		
		for(int i=0;i<2;i++) {
			
			int num=5;
			System.out.println("i=" + i + ", num=" + num);
			
		}
		
		System.out.println("n=" + n);
	//	System.out.println("num= " + num);	error
	//	System.out.println("i= " + i); error
		
		/*
		 1.
		 
		 *****	
		 	 
		 */
		for(int i=0;i<5;i++) {
			
			System.out.print("*");
			
		}
		/*
		 2.
		
		 *
		 *
		 *
		 */
		System.out.println("\n");
	
		for(int i=0;i<3;i++) {
			
			System.out.println("*");
			
		}
	}

}
