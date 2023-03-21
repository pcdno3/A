package com.day7;

import java.util.Scanner;

public class ContinueTest3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 개의 정수를 입력하세요.");
		int a=sc.nextInt(); //3
		int b=sc.nextInt();	//6

		int sum=0;
		if(a<b) {
			  for(int i=a; i<=b; i++) {
				  
				  sum+=i;
				 
			  }
			  
			  System.out.println(a + "~" + b + "사이의 정수의 합 : "+sum);
		  
		}else if(a>b) {
			  for(int j=b; j<=a; j++) {
				  
			  sum+=j;
				 
		}
			  
			  System.out.println(b + "~" + a + "사이의 정수의 합 : "+sum);
			  
		}else {
			System.out.println("잘못입력하였습니다.");
		}
		/*
		int temp=0;
		if(a>b){
			temp=a;
			a=b;
			b=temp;
		
		 */

	}

}
