package com.day13;

import java.util.Scanner;

class Student{
	private String name;
	private int idNo;
	
	Student(String name, int idNo){
		this.name=name;
		this.idNo=idNo;
	}
	
	//getter/setter
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public int getIdNo() {
		return idNo;
	}
	
	public void setIdNo(int idNo) {
		this.idNo=idNo;
	}
	
	public void showInfo() {
		System.out.println("이름 : " + name);
		System.out.println("학번 : " + idNo);
	}
	
}

public class StudentMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Student stu = new Student("김연아", 2012002);
		
		stu.showInfo();
		
		System.out.println("\n============================");
		
		stu.setName("유재석");
		stu.setIdNo(2012003);
		
		stu.showInfo();
		
		System.out.println("\n============================");
		
		Student[] stu2 = new Student[3];
		stu2[0] = new Student ("김유정", 2012003);
		stu2[1] = new Student ("박유정", 2012004);
		stu2[2] = new Student ("한예정", 2012005);
		
		
		for(int i=0; i<stu2.length; i++) {
			stu2[i].showInfo();
			System.out.println("\n============================");
		}
		
		Student[] stu3 = new Student[3];
		for(int i=0; i<stu3.length; i++) {
			System.out.println("이름, 학번을 입력해주세요");
			String name = sc.nextLine();
			int idNo = sc.nextInt();
			sc.nextLine();
			stu3[i] = new Student(name, idNo);
			
		}
		
		for(int i=0; i<stu3.length; i++) {
			stu3[i].showInfo();
			System.out.println("\n============================");
		}
		
		for(Student s : stu3) {
			s.showInfo();
			System.out.println("\n============================");
		}
		
		
	


	}

}
