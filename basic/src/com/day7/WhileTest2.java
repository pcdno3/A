package com.day7;

public class WhileTest2 {

	public static void main(String[] args) {
		/*
		 for문 처럼 사용하는 것도 가능
		 
		 for(초기식;조건식;증감식){
		 	반복명령;
		 	
		 =>
		 초기식
		 while(조건식){
		 	반복명령;
		 	
		 	증감식;
		 }
		 
		 */
		//횟수가 정해져 있을떄 for문
		for(int i=0; i<3; i++) {
			System.out.println(i);
		}
		
		System.out.println("\n===========while=========");
		
		int k=0;	//조건식
		while(k<3) {//while	횟수가 정해져 있지 않을 때 while문
			
			System.out.println("k=" +k); //반복명령;
			
			k++;	//증감식
		}//while
	}

}
