package com.day12;

import java.util.Scanner;

class Programmer{
	//[1] 매게변수
	String name;
	String language;
	int career;
	
	//[2] 생성자
	Programmer(String name, String language, int career){
		this.name=name;
		this.language=language;
		this.career=career;
	}
	//[3] getter / setter
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getLanguage() {
		return language;
	}
	
	public void setLanguage(String language) {
		this.language = language;
	}
	
	public int setCareer() {
		return career;
	}
	
	public void setCareer(int career) {
		this.career = career;
	}
	//[4] 메서드
	
	public void showInfo() {
		System.out.println("이름 : " + name);
		System.out.println("개발언어 : " + language);
		System.out.println("개발경력 : " + career +"년");
		System.out.println("프로그래밍을 합니다.");
	}
	
	
}

public class ProgrammerMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름, 개발언어, 개발경력을 입력하세요.");
		String name = sc.nextLine();
		String language = sc.nextLine();
		int career = sc.nextInt();
		
		Programmer pro=new Programmer(name, language, career);
		pro.showInfo();
		
		pro.setName("박희수");
		pro.setLanguage("JAVA");
		pro.setCareer(0);
		
		System.out.println();
		pro.showInfo();

	}

}
