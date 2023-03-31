package com.day14;

import java.util.Scanner;

class Student{	
	private String name;
	private String idNo;
	
	public Student(String name, String idNo) {
		this.name = name;
		this.idNo = idNo;
	}

	public void showInfo()	{
		System.out.println("이름:"+ name);
		System.out.println("학번:"+ idNo+"\n");
	}
}

public class StudentExam {

	public static void main(String[] args) {
		Student st = new Student("홍길동", "2021002");
		st.showInfo();
		
		System.out.println("\n---배열 이용---");
		Student[] arr = new Student[3];
		arr[0]=new Student("김길동", "2021001");
		arr[1]=new Student("이길동", "2021002");
		arr[2]=new Student("박길동", "2021003");
		
		for(int i=0;i<arr.length;i++) {
			arr[i].showInfo();
		}//for
		
		//
		Scanner sc = new Scanner(System.in);
		Student[] stArr = new Student[3];
		for(int i=0;i<stArr.length;i++) {
			System.out.println("이름, 학번을 입력하세요");
			String name = sc.nextLine();
			String idNo = sc.nextLine();
			
			stArr[i]=new Student(name, idNo);			
		}//for
		
		
		System.out.println("\n=====학생 리스트=======");
		for(int i=0;i<stArr.length;i++) {
			stArr[i].showInfo();
		}
		
		System.out.println("\n---확장 for이용---");
		for(Student s : stArr) {
			s.showInfo();
		}//for
		
		//
		Student[] stArr2 = new Student[100];
		int index=0;

		while(true) {
			System.out.println("1.저장 2.전체학생 조회 3.종료  선택!");
			int type=sc.nextInt();

			switch(type) {
				case 1:
					System.out.println("이름, 학번을 입력하세요");
					sc.nextLine();
					String name = sc.nextLine();
					String idNo = sc.nextLine();
	
					stArr2[index++]=new Student(name, idNo);
					
					System.out.println();
					break;
				case 2:
					System.out.println("\n=====학생 리스트=======");
					for(int i=0;i<index;i++) {
						stArr2[i].showInfo();
					}
	
					break;
				case 3:
					System.out.println("프로그램을 종료합니다!");
					//return;
					System.exit(0);	
				default:
					System.out.println("잘못 입력했어요!\n");
					continue;
			}//switch

		}//while
	}

}
