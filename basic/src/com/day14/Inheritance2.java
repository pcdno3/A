package com.day14;

import java.util.Scanner;

class Person{
	protected String name;
	protected int age;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
		
	}
	
	public int getAge() {
		return age;
		
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	
}

class Student2 extends Person{
	
	protected String major;
	
	public String getMajor() {
		return major;
	}
	
	public void setMajor(String major) {
		this.major=major;
	}
	
}

public class Inheritance2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("이름, 나이, 전공을 입력하세요");
		String name = sc.nextLine();
		int age = sc.nextInt();
		sc.next();
		String major = sc.nextLine();
		
		
		Student2 stu = new Student2();
		stu.setName(name);
		stu.setAge(age);
		stu.setMajor(major);
		
		System.out.println("이름 : " + stu.getName());
		System.out.println("나이 : " + stu.getAge());
		System.out.println("전공 : " + stu.getMajor());

	}

}
