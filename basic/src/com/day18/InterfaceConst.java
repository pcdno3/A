package com.day18;

import java.util.Scanner;

//인터페이스 내에 존재하는 변수는 무조건 public static final 로 선언된다는 특성을 활용.
//자바에서 사용하는 다수의 상수 선언 방식
interface Week{
	int MON = 1;
	int TUE = 2;
	int WED = 3;
	int THU = 4;
	int FRI = 5;
	int SAT = 6;
	int SUN = 7;
}

public class InterfaceConst {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("요일을 선택해주세요!");
		System.out.println("1.월요일, 2.화요일, 3.수요일, 4.목요일, 5.금요일, 6.토요일, 7.일요일");
		int select = sc.nextInt();
		
		switch(select) {
			case Week.MON:
				System.out.println("주간회의가 있습니다"); 
				break;
			case Week.TUE:
				System.out.println("프로젝트 기획 회의가 있습니다"); 
				break;
			case Week.WED:
				System.out.println("진행사항 보고하는 날 입니다"); 
				break;
			case Week.THU:
				System.out.println("사내 축구시합이 있습니다"); 
				break;
			case Week.FRI:
				System.out.println("프로젝트 마감일입니다"); 
				break;
			case Week.SAT:
				System.out.println("가족과 저녁약속이 있습니다."); 
				break;
			case Week.SUN:
				System.out.println("예린이가 바보가되는 날 입니다"); 
				break;
		}

	}

}
