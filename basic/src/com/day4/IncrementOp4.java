package com.day4;

public class IncrementOp4 {

	public static void main(String[] args) {
			int a=0;
			
			System.out.println("a : " + a);	//0
			System.out.println("a++ : " + a++);	//0, a가 사용되고 난 후에 1증가
			System.out.println("++a : " + ++a); //2 a가 사용되기 전에 1증가
			
			double b=7;
			System.out.println("b : " + b);	//7.0
			System.out.println("b-- : " + b--); //7.0 b가 사용되고 난 후에 1감소
			System.out.println("--b : " + --b); //5.0 b가 사용되기 전에 1감소
			
			char c='A';
			System.out.println("c : " + c + ", ++c : " + ++c); //A , A가 사용되기 전에 1증가 A>B
			c='a'; //c=a 라고 다시 선언
			System.out.println("c : " + c); //a
			System.out.println("c++ : " + ++c);	//b a가 사용되기전에 1증가 a>b
	}
}