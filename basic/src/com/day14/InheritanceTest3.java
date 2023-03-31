package com.day14;

import java.util.Scanner;

class Human{
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

class Teacher extends Human{
	private String subject;
	
	public String getSubject() {
		return subject;
	}
	
	public void setSubject(String subject) {
		this.subject=subject;
	}
	
	public void work() {
		System.out.println(subject + "를 가리치고 있습니다.");
	}
}

class Programmer extends Human{
	private int career;
	
	public int getCareer() {
		return career;
	}
	
	public void setCareer(int career) {
		this.career=career;
	}
	
	public void work() {
		System.out.println("프로그래밍 합니다 개발 경력은 " + career+ "년 입니다.");
	}
}

public class InheritanceTest3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Teacher tea = new Teacher();
		System.out.println("이름, 나이, 과목을 입력해주세요.");
		String name = sc.nextLine();
		int age = sc.nextInt();
		sc.nextLine();
		String subject = sc.nextLine();
		
		tea.setName(name);
		tea.setAge(age);
		tea.setSubject(subject);
		System.out.println("================================\n");
		System.out.println("이름은 : " + tea.getName());
		System.out.println("나이는 : " + tea.getAge());
		System.out.println("과목은 : " + tea.getSubject());
		tea.work();
		
		Programmer pro = new Programmer();
		System.out.println("이름, 나이, 개발경력을 입력해주세요");
		name = sc.nextLine();
		age = sc.nextInt();
		int career = sc.nextInt();
		
		pro.setName(name);
		pro.setAge(age);
		pro.setCareer(career);
		System.out.println("================================\n");
		System.out.println("이름은 : " + pro.getName());
		System.out.println("나이느 : " + pro.getAge());
		System.out.println("개발경력은 : " + pro.getCareer() + "년");
		pro.work();
		
		
		

	}

}
