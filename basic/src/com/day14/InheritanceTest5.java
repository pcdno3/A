package com.day14;

import java.util.Scanner;

class Person2{
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

class Student3 extends Person2{
	protected int idNo;
	
	public int getIdNo() {
		return idNo;
	}
	public void setIdNo(int idNo) {
		this.idNo=idNo;
	}
	
	public void study() {
		System.out.println("공부한다");
	}
	
}

class Graduate extends Student3{
	private String major;
	
	public String getMajor() {
		return major;
	}
	
	public void setMajor(String major) {
		this.major=major;
	}
	public void writeThesis() {
		System.out.println("논문을 쓴다");
	}
}
public class InheritanceTest5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Graduate add = new Graduate();
		
		System.out.println("이름, 나이, 학번, 전공을 입력하세요");
		String name = sc.nextLine();
		int age = sc.nextInt();
		int idNo = sc.nextInt();
		sc.nextLine();
		String major = sc.nextLine();
		
		add.setName(name);
		add.setAge(age);
		add.setIdNo(idNo);
		add.setMajor(major);
		
		System.out.println("=========================");
		System.out.println("이름 : " + add.getName());
		System.out.println("나이 : " + add.getAge());
		System.out.println("학번 : " + add.getIdNo());
		System.out.println("전공 : " + add.getMajor());
		add.writeThesis();
	}

}
