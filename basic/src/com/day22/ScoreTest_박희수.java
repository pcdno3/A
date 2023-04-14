package com.day22;

import java.util.Scanner;

class Score{
	protected String name;
	protected String grade;
	protected int java;
	protected int oracle;
	protected int jsp;
	
	Score(String name, String grade, int java, int oracle, int jsp){
		this.name=name;
		this.grade=grade;
		this.java=java;
		this.oracle=oracle;
		this.jsp=jsp;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getGrade() {
		return grade;
	}
	
	public void setGrade(String grade) {
		this.grade=grade;
	}
	
	public int getJava() {
		return java;
	}
	
	public void setJava(int java) {
		this.java=java;
	}
	
	public int getOracle() {
		return oracle;
	}
	
	public void setOracle(int oracle) {
		this.oracle=oracle;
	}
	
	public int getJsp() {
		return jsp;
	}
	
	public void setJsp(int jsp) {
		this.jsp=jsp;
	}
	
	public int findTotal() {
		int total = java + oracle + jsp;
		return total;
	}
	
	public double findAvg() {
		
		double Avg = (double)(findTotal()/3);
		return Avg;
	}
	
	public String findScore() {
		String score="";
		double avg = findAvg();
		if(avg<50) {
			score = "F";
		}else if(avg>=50 && avg<60) {
			score = "D";
		}else if(avg>=60 && avg<70) {
			score = "C";
		}else if(avg>=70 && avg<80) {
			score = "B";
		}else if(avg>=80) {
			score = "A";
		}
		
		return score;
		
	}
	/*
	 * 
	public String toString() {
		return name + "          " + grade + "     " + java + "     " + oracle + "     " 
				+ jsp + "     " + findTotal() + "     "  + findAvg()+ "     "  + findScore();
	}
	 */

	public void showInfo() {
		System.out.println(name + "          " + grade + "     " + java + "     " + oracle + "     " 
				+ jsp + "     " + findTotal() + "     "  + findAvg()+ "     "  + findScore());
	}
	
}

class Manager{
	Scanner sc = new Scanner(System.in);
	Score[] score = new Score[100];
	int index = 0;
	
	
	public int mainMenu() {
		System.out.println("1. 성적 입력");
		System.out.println("2. 전체학생의 성적 조회");
		System.out.println("3. 학생별 성적 조회");
		System.out.println("4. 클래스<반>별 성적 조회");
		System.out.println("5. 학생 성적 수정");
		System.out.println("6. 종료");
		int type = sc.nextInt();
		return type;
	}
	
	public void case1() {
		System.out.println("학생이름, 반, java, oracle, jsp 점수를 입력하세요.");
		sc.nextLine();
		
		String name = sc.nextLine();
		String grade = sc.nextLine();
		int java = sc.nextInt();
		int oracle = sc.nextInt();
		int jsp = sc.nextInt();
		
		score[index++] = new Score(name, grade, java, oracle, jsp);
	}
	
	public void case2() {
		if(index<0) {
			System.out.println("저장된 성적이 없습니다.");
			return;
		}
		System.out.println("===================전체 학생 성적 조회 결과=========================");
		System.out.println("학생이름      클래스    java  oracle   jsp     총점      평균     학점");
		System.out.println("==============================================================");
		for(int i=0; i<index; i++) {
			score[i].showInfo();
		}
		System.out.println("==============================================================");
	}
	
	public void case3() {
		if(index<0) {
			System.out.println("저장된 성적이 없습니다.");
			return;
		}

		System.out.println("학생이름을 입력하세요");
		sc.nextLine();
		String name = sc.nextLine();
		for(int i=0; i<index; i++) {
			if(score[i].getName().equals(name)){
				System.out.println("=================="+name+" 학생 성적 조회 결과=========================");
				System.out.println("학생이름      클래스    java  oracle   jsp     총점      평균     학점");
				score[i].showInfo();
			}
		}
	}
	
	public void case4() {
		if(index<0) {
			System.out.println("저장된 성적이 없습니다.");
			return;
		}

		System.out.println("클래스<반>을 입력하세요");
		sc.nextLine();
		String grade= sc.nextLine(); 
		System.out.println("=================="+grade+"반 성적 조회 결과=========================");
		System.out.println("학생이름      클래스    java  oracle   jsp     총점      평균     학점");
		for(int i=0; i<index; i++) {
			if(score[i].getGrade().equals(grade)) {
				score[i].showInfo();
			}
		}
	}
	
	public void case5() {
		if(index<0) {
			System.out.println("저장된 성적이 없습니다.");
			return;
		}

		System.out.println("클래스<반>와 학생이름을 입력하세요.");
		sc.nextLine();
		String grade = sc.nextLine();
		String name = sc.nextLine();
		for(int i=0; i<index; i++) {
			if(score[i].getName().equals(name) && score[i].getGrade().equals(grade)) {
				System.out.println("수정하려는 점수를 java, oracle, jsp과목 순으로 입력하세요");
				int java = sc.nextInt();
				int oracle = sc.nextInt();
				int jsp = sc.nextInt();
				score[i] = new Score(name, grade, java, oracle, jsp);
			}
		}//for
		System.out.println("수정이 완료되었습니다.");
		
	}
}

public class ScoreTest_박희수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Manager m = new Manager();
		
		boolean bool = true;	
		while(bool){
			
			int type = m.mainMenu();	
		
			
			switch(type) {
				case 1:
					m.case1();
					break;
				
				case 2:
					m.case2();
					break;
					
				case 3:
					m.case3();
					break;
					
				case 4:
					m.case4();
					break;
				case 5:
					m.case5();
					break;
					
				case 6:
					System.out.println("시스템을 종료합니다.");
					bool=false;
					return;
				default:
					System.out.println("잘못입력!");
					break;
					
					
			}//switch
			
		}//while

	}

}
