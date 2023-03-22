package com.day8;

import java.util.Scanner;

public class ScopeTest {
	public static int getsum(int count) {
		int sum=0;
		for(int i=1; i<=count;i++) {
			sum+=i;
		}
		return sum;
	}
	public static int more(int a, int b) {
		int c=0;
		if(a>b) {
			c=a;
		}else if(b>a){
			c=b;
		}
		return c;
	}
			
	public static int sum(int a, int b) {
		int c=0;
		c=(a%b);
		return c;
	}
		
	/*
	 지역변수
	 - 메서드나 {}블럭안에서 선언된 변수
	 - 해당 메서드를 벗어나면(종료되면) 소먈 (매개변수도 마찬가지)
	 - 블럭변수 : 해당 블럭을 벗어나면 소멸
	 */

	public static void main(String[] args) {
		int count=3;
		int sum=getsum(count);
		System.out.println(sum);

		
		Scanner sc = new Scanner(System.in);
		System.out.println("두 수를 입력하세요");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int n=more(num1, num2);
		System.out.println("더 큰수는 "+ n);
		
		for(;;) {
			
			System.out.println("두 수를 입력하세요");
			int num3=sc.nextInt();
			int num4=sc.nextInt();
			
		}
		
		
	}

}
