package com.day24;

/*
 	import문 - 패키지명 생략하고 클래스명만으로 사용
 	static improt문 - static멤버를 호출할 때 클래스명도 생략할 수 있다.
 */

import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.Math.random;
import static java.lang.Math.PI;
//import static java.lang.Math.*;


public class StaticImportTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//System.out.println(Math.random());
		out.println("랜덤값 : " + random());
		
		//System.out.println("PI =" + Math.PI);
		out.println("PI=" + PI);

	}

}
