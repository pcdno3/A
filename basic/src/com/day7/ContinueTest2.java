package com.day7;

import java.util.Scanner;

public class ContinueTest2 {

	public static void main(String[] args) {
		//두 개의 정수 입력받기
		//두 개의 정수 나눗셈 하는 프로그램 작성하기
		Scanner sc = new Scanner(System.in);
		
		for(;;) {
			System.out.println("두 개의 정수를 입력하세요<피제수 제수 순으로 입력>");
			int a = sc.nextInt();
			int b = sc.nextInt();
			
				if(a==0 && b==0) {	//브레이크를 먼저하자! 비정상 적인걸 먼저 하기
					System.out.println("연산을 종료합니다");
						break;
						
					
				}else if(b==0) { 
					
					System.out.println("제수가 0이므로 연산을 생략합니다");
					continue;
					
				}
			
				System.out.println("몫 : " + a/b + ", 나머지 : " + a%b);
		}
		

	}

}

			
			
				