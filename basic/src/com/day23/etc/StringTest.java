package com.day23.etc;

public class StringTest {

	public static void main(String[] args) {
		/*
		 String 클래스의 인스턴스는 상수 형태의 인스턴스
		 원칙 - 문자열이 동일한 경우에는 하나의 String 인스턴스만 생성해서 공유한다!
		 */
		
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = "Java";
		
		if(str1==str2) {	//참조형에서 == 은 주소값 비교
			System.out.println("str1, str2는 동일 인스턴스 참조");
		}else {
			System.out.println("str1, str2는 다른 인스턴스 참조");	
		}
		if(str2==str3) {	//참조형에서 == 은 주소값 비교
			System.out.println("str2, str3는 동일 인스턴스 참조");
		}else {
			System.out.println("str2, str3는 다른 인스턴스 참조");	
		}
		
		String str4 = new String("Hello");
		String str5 = new String("Hello");
		
		if(str4==str5) {	//참조형에서 == 은 주소값 비교
			System.out.println("str4, str5는 동일 인스턴스 참조");
		}else {
			System.out.println("str4, str5는 다른 인스턴스 참조");	
		}
		
		if(str1==str5) {	//참조형에서 == 은 주소값 비교
			System.out.println("str1, str5는 동일 인스턴스 참조");
		}else {
			System.out.println("str1, str5는 다른 인스턴스 참조");	
		}
	}

}
