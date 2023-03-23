package com.day9;

import java.util.Scanner;

public class FactorialTest {
	/*
	 재귀 호출(recursive call);
	 - 메서드의 내부에서 메서드 자기 자신을 다시 호출하는 것
	 - 반복적인 작업을 해야 하는 메서드에 재귀 호출 이용 가능
	 */
	
	public static long factorial(int n) {
		//f(n) = n * f(n-1), 단 f(1)=1
		long result=0;
		if(n==1) {
			result=1;
		}else {
			result=n*factorial(n-1);	//자기 자신을 다시 호출
		}
		return result;
	}
	
	public static int fib(int n) {
			int result=0;
			if(n==0) {
				result=0;
			}else if (n==1) {
				result=1;
			}else {
				result=fib(n-2)+fib(n-1);
			}
			return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long result
		= factorial(4);
		
		System.out.println("4! = " + result);
		

		for(int i=0; i<10; i++) {
			int fib=fib(i);
			System.out.print(fib + ", ");
			
		}
		

	}

}
