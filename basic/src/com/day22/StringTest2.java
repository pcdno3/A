package com.day22;

public class StringTest2 {

	public static void main(String[] args) {
		//String replace(char oldChar, char newChar)
		//			  01234567890		
		String str = "123456789";
		String s = str.replace('7', '칠');
		System.out.println("str = " + str + ", s = " + s);
		
		s=str.replace("5", "다섯");
		System.out.println("str = " + str + ", s = " + s);
		
		//split() - 특정 구분자를 하여 문자열을 여러 개의 토막으로 분리
		//String[] split(String regex)
		str = "java,oracle,jquery,spring";
		
		String[] arr = str.split(",");	//,를 구분자로 하여 나눈다

		for(String ss : arr) {
			System.out.println(ss);
		}
		
		System.out.println("\n==============");
		
		//String[] split(String regex, int limit)
		str = "html.css.jsp.mybatis";
		String[] arr2 = str.split("\\.", 3);	//결과가 안나오면 구분자 앞에 \\를 붙인다.
		for(String ss : arr2) {
			System.out.println(ss);
		}
		
		
	}

}
