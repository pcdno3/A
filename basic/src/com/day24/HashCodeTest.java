package com.day24;

public class HashCodeTest {

	public static void main(String[] args) {
		/*
		 hashCode() - 객체의 메모리 주소를 리턴함
		 */
		
		String s1 = new String("java");
		String s2 = new String("java");
		String s3 = "java";
		String s4 = "java";
		
		System.out.println("s1의 hashCode() = " + s1.hashCode());
		System.out.println("s2의 hashCode() = " + s2.hashCode());
		System.out.println("s3의 hashCode() = " + s3.hashCode());
		System.out.println("s4의 hashCode() = " + s4.hashCode());
		/*
		 String 클래스는 문자열의 내용이 같으면, 동일한 해시코드를 반환하도록
		 hashCode 메서드를 오버라이딩 하였다.
		 */
		
		System.out.println("\ns1의 주소 : " + System.identityHashCode(s1));//객체의 주소값 리턴
		System.out.println("s2의 주소 : " + System.identityHashCode(s2));
		System.out.println("s3의 주소 : " + System.identityHashCode(s3));
		System.out.println("s4의 주소 : " + System.identityHashCode(s4));
		
		Person3 p1 = new Person3();
		Person3 p2 = new Person3();
		
		System.out.println("\n===========Person============");
		System.out.println("p1 hashCode : " + p1.hashCode());
		System.out.println("p2 hashCode : " + p2.hashCode());
		System.out.println("p1의 주소 : " + System.identityHashCode(p1));
		System.out.println("p2의 주소 : " + System.identityHashCode(p2));
		
	}

}

class Person3{
	
}
