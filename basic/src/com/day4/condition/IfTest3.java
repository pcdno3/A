package com.day4.condition;

import java.util.Scanner;

public class IfTest3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("당신의 평균 점수를 입력하세요.");
		int point=sc.nextInt();
		String result="";
	
		if((point>=90)&&(point<=100)) {	
			
			result="A";
			
		}else if(point>=80 && point<90) { //if에서 >= 이면, else if 에선 < 
		
			result="B";
	
		}else if(point>=70 && point<80) {
		
			result="C";
	
		}else if(point>=50 && point<70) {
		
			result="D";
		
		
		}else if(point<50 && point>=0){
		
			result="F";
		
		}else {
		
			result="잘못 입력!";
		}
		
		System.out.println("평균 : " + point);
		System.out.println("학점 : " + result);

		/*
		 중첩 if문
		 -if문이 중복으로 사용된 것
		 -바깥족 if문이 참이 되어야 안쪽 if문을 수행함
		 
		 if(조건식){
		 	if(조건식){
		 		
		 		문장
		 	}
		 }
		 */
		
		if(point>=0 && point<=100) {
			if(point>=90) {	
				
				result="A";
				
			}else if(point>=80) { //if에서 >= 이면, else if 에선 < 
			
				result="B";
		
			}else if(point>=70) {
			
				result="C";
		
			}else if(point>=50) {
			
				result="D";
			
			
			}else{
			
				result="F";
			
	
			}//안쪽if
			
		}else {
			
			result="잘못 입력함!!";
			
		}//바깥 if
		System.out.println(result);
	}
}

	



