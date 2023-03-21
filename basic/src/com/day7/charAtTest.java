package com.day7;

import java.util.Scanner;

public class charAtTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n값을 입력하세요");
		String value =  sc.nextLine();
		//String value = "12k34";
		char ch = ' ';
		boolean isNumber = true;
		// 반복문과 charAt(int i)를 이용해서 문자열의 문자를 하나씩 읽어서 검사한다.
			
		for(int i=0; i < value.length() ;i++) {
			ch = value.charAt(i); //1,2,k
			if(!(ch>='0' && ch<='9')) {
				isNumber = false;
				break;
			}
		}

		String str="";
		if (isNumber) {
			str=value+"는 숫자입니다.";
		} else {
			str=value+"는 숫자가 아닙니다.";
		}
		
		System.out.println(str);
		
			
	}

}
