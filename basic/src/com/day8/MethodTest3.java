package com.day8;

public class MethodTest3 {
	//매개변수, 반환값이 모두 없는경우
	public static void X(){	
		System.out.println("Hello java\n");
	}
	//매개변수가 있는경우
	public static void Y(int a) {
		for(int i=1; i<=a; i++) {
			System.out.println("Hello java");
		}
	}
	//매개변수는 없고 변환값만 있는경우
	public static int num1() {
		int sum=0;
		for(int i=1; i<101; i++) {
			if(i%2==1)
			sum+=i;
		}
		return sum;
	}
	//매개변수도 있고 변환값도 있는경우
	public static float num2(float a, float b) {
		float c = a*b;
		return c;
	}

	public static void main(String[] args) {
		//매개변수 변환값 둘다없음
		X();
		
		//매개변수만 있음
		Y(3);
		
		//변환값만 있음
		int n=num1();
		System.out.println("1~100까지 홀수의 합 : " + n + "\n");
		
		//매개변수 변환값 둘다있음
		float f=num2(1.0F,3.0F);
		System.out.println("a*b = " + f);
		

	}

}
