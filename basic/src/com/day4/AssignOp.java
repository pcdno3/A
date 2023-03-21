package com.day4;

public class AssignOp {

	public static void main(String[] args) {
		/*
		 대입연산자
		 =, +=, -=, *=, /=, %=
		 		 <<<<<<<<시작
		 진행방향 : 오른쪽 에서 왼쪽
		 
		 a=b; //b의 값을 a에 할당
		 a+=b; //a=a+b, a에 b를 더한 후 a에 할당
		 */
		int a=7;
		int b=3;
		System.out.println("a=" + a + ", b=" + b);
		
		a+=b; //a=a+b;
		System.out.println("a+=b 후 a=" + a);
		
		a/=b; //a=a/b
		System.out.println("a/=b 후 a=" + a);
		
		a*=2; //a=a*2
		System.out.println("a*=2 후 a=" + a);

	}

}
