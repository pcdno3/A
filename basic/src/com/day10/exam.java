package com.day10;

import java.util.Scanner;

public class exam {
	public static boolean check(String a) {
		
		boolean bool=true;
		
		for(int i=0; i<a.length(); i++) {
			char ch=a.charAt(i);
				if(ch>'9' || ch<'0') {
					bool=false;
					break;
				}
		}
			return bool;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("문자열을 입력해주세요.");
		String str =sc.nextLine();
		
		boolean check= check(str);
		System.out.println(check);
		
	}

}
