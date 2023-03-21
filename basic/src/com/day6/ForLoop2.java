package com.day6;

import java.util.Scanner;

public class ForLoop2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum=0;
		for(;;) {
			System.out.println("숫자를 입력하세요(끝날때는 0)");
			int num=sc.nextInt(); 
			if(num==0)break;
				
				sum+=num;
				
			}
		System.out.println("입력된 숫자의 합 : " + sum);
		}
			
	} 



