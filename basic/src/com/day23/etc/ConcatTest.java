package com.day23.etc;

public class ConcatTest {

	public static void main(String[] args) {
		//String concat(String str)
		//=> 두 문자열을 결합함
		String s1="java";
		String s2=" and ";
		String s3="oracle";
		String str=s1+s2+s3;
		System.out.println(str);
		
		str = s1.concat(s2).concat(s3);
		System.out.println(str);
		
		//총 3개의 문자열을 하나로 묶어줌
		//이를 위해서 추가로 생성된 인스턴스의 수가 2개
		//str = new StringBuilder().append(s1).append(s2).append(s3).toString();
	}
	
}
