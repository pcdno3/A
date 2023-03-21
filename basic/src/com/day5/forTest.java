package com.day5;

public class forTest {

	public static void main(String[] args) {
		/*
		 반복문 - 반복적인 작업을 수행할 때 사용
		 for, while, do~while, 확장 for
		 
		 [1] for문
		  - 반복횟수가 미리 정해진 경우 주로 사용
		  - 지정된 횟수만큼 반복해서 실행함
		  
		  for(초기식;조건식;증감식){
		  		반복명령;
		  }
		  
		  초기식은 처음 한번만 실행함
		 */
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		for(int i=0;i<3;i++) {	//i=0,1,2 -> 3번 반복
			System.out.println(i+1+".Hello java!");
		}//for
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		
		for(int i=0;i<4;i++) {
			System.out.println(i);
		}
		
		System.out.println("\n=========1씩 감소=========");
		for(int i=3;i>0;i--) {
			System.out.println("i=" + i);
		}//for
		/*
		 i++ => i=i+1 =>i+=1
		 i+=2
		 */
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		for(int i=1;i<10;i+=2) {
			System.out.println(i);
		}
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		for(int i=0;i<10;i++) {
			if(i%2==1) {
				System.out.println(i);
			}
		}
		String result="";
		for(int i=10;i>-7;i-=2) { //i는 10부터 i가 -7보다클떄까지 i=i-2하겠다
			if(i>0) {//i가 0보다 크면 
				result=i+"  java"; //i + java 출력
			}else if(i==0){//i가 0일때
				result=i+"  oracle";//i + 오라클 출력
			}else {//그 외는
				result=i+" spring";//i + spring 출력
			}
			System.out.println(result);
		}	
		
		
		
	}

}
