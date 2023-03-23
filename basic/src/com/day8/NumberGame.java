package com.day8;

import java.util.Scanner;

public class NumberGame {
	public static int rnd() {
		int answer=(int)(Math.random()*100+1);
		return answer;		
	}
	
	//특정 숫자 사이의 임의의 값을 구하는 메서드
	public	static int rnd2(int a, int b) { // 
		int answer=(int)(Math.random()*(b-a+1)+a);
		return answer;
	}

	public static void main(String[] args) {
		/*
		 임의의 랜덤값 리턴하는 메서드
		 Math.random();
		 0.0<= x <1.0 은 double값을 리턴
		 
		 public static double random()
		 
		 예) 1~100 사이의 임의의 정수 구하기
		 [1] 각 변에 100을 곱한다
		 0.0*100 <= Math.random()*100<1.0*100
		  0.0<= Math.random()*100<100.0
		 
		 [2] 각 변에 1을 더한다
		 0.0+1 <= Math.random()*100+1 < 100.0+1
		 1.0 <= Math.random()*100+1 < 101.0
		 
		 [3] 각 변을 int형으로 형변환한다.
		 (int)1.0 <= (int)Math.random()*100+1 < (int)101.0
		 1 <= (int)Math.random()*100+1 < 101
		 
		 규칙
		 1) 발생시키려는 수의 개수를 각 변에 곱한다
		 2) 시작값을 더한다
		 3) int로 형변환한다.

	     예) B~F 사이의 임의의 값 구하기
		 66 <= int(Math.random()*5 + 'B') <71
		 
		 */
		//1. 1~100사이의 임의의 값을 구한다 - 정답
		
		//int answer=(int)(Math.random()*100+1);
		
		Scanner sc = new Scanner (System.in);
		int answer=rnd();
		
		for(int i=0; i<4; i++) {	//2. 4번 반복처리
			//2.1 사용자로 부터 숫자 입력받기
			System.out.println("숫자를 입력하세요");
			int num=sc.nextInt();
			
			//2.2 정답과 사용자값 비교
			String result="";
			if(num==answer) {
				result="정답입니다";
				break;
			}
			
			if(i==3) {
				result="실패 !!! 정답은 " + answer;
			}else if(num>answer) {
				result="너무 큽니다. 조금 더 작은 수를 입력하세요\n";
			}else{
				result="더 큰 수를 입력하세요.";
			}
			

			//2.3 결과 출력
			System.out.println(result);
		}//for
		
		System.out.println("숫자를 입력하세요");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int rnd2=rnd2(num1, num2);
		
	}

}
