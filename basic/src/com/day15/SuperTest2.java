package com.day15;

import java.util.Scanner;

class Person{
	protected String name;
	protected int age;
	
	Person(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	public void showInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
}

class Student extends Person{
	
	protected String stNo;
	
	Student(String name, int age, String stNo){
		super(name, age);
		this.stNo=stNo;
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("학번 : " + stNo);
	}
	
	public void study() {
		System.out.println("공부합니다.");
	}

}

class Graduater extends Student{
	
	private String major;
	
	Graduater(String name, int age, String stNo, String major){
		super(name, age, stNo);
		this.major=major;
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("전공 : " + major);
	}
	
	public void writeTheis() {
		System.out.println("논믄을 씁니다.");
	}
}

public class SuperTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("이름, 나이, 학번을 입력하세요");
		String name = sc.nextLine();
		int age = sc.nextInt();
		sc.nextLine();
		String stNo = sc.nextLine();
		Student stu = new Student(name, age, stNo);
		
		stu.showInfo();
		
		System.out.println("이름, 나이, 학번, 전공을 입력하세요");
		name = sc.nextLine();
		age = sc.nextInt();
		sc.nextLine();
		stNo = sc.nextLine();
		String major = sc.nextLine();
		
		Graduater gra = new Graduater(name, age, stNo, major);
		
		gra.showInfo();
		gra.study();
		gra.writeTheis();
		
	}

}
