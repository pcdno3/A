package com.day7;

import java.io.IOException;
import java.util.Scanner;

public class WhileLoop2 {

	public static void main(String[] args)throws IOException {
		Scanner sc = new Scanner(System.in);
		String num="";
		String res="";
		
		while(true) {
			System.out.println("년도를 입력하세요(그만하려면 Q 입력)");
			String year=sc.nextLine();
			if(year.equalsIgnoreCase("Q")) break;//변수명.equalsIgnoreCase("입력값")=>대소문자 구분없이 비교하는 메소드
			
			int year2=Integer.parseInt(year);	//Integer.parseInt(변수); 숫자변수그대로 읽기
			if(year2%2==0) {					//Integer.toString(변수); 문자열 그대로 읽기 65
				
				num="짝수 해, ";
				
			}else {
				
				num="홀수 해, ";
			}
			
			if(year2%400==0 || (year2%4==0 && year2%100!=0)) {
				
				res="윤년";
				
			}else{
				
				res="평년";
				
			}
			
			System.out.println(year+"년 : "+num+res);
			
			}

		
		}

	}


