package com.day16;

import java.util.Scanner;


public class PolymoArray3 {
	static final int MAX_COUNT = 2;
	
	static Shape2[] sh = new Shape2[MAX_COUNT];
	static int index=0;
	
	static Scanner sc = new Scanner(System.in);
	
	public static void ShowMenu() {
		System.out.println("1.원 2.사각형 3.보기 4.종료");
	}
	
	public static void inputCircle() {
		if(index==MAX_COUNT) {
			System.out.println("저장소의 공간이 부족합니다.");
			return;
		}
		System.out.println("반지름을 입력하세요.");
		int radius = sc.nextInt();					
		sh[index++] = new Circle2(radius);
	}
	
	public static void inputRect() {
		if(index==MAX_COUNT) {
			System.out.println("저장소의 공간이 부족합니다.");
			return;
		}
		System.out.println("가로, 세로를 입력하세요.");
		int width = sc.nextInt();
		int height = sc.nextInt();
		sh[index++] = new Rect2(width, height);
	}
	
	public static void printArea() {
		if(index==0) {
			System.out.println("저장된 정보가 없습니다.");
			return;
		}
		System.out.println("-----------보기----------");
		for(int i=0; i<index; i++) {
			System.out.println(sh[i].kind() + "의 면적 : " + sh[i].findArea());
		}
		System.out.println("------------------------");
	}
	
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		while(true){
		
			ShowMenu();
			int type = sc.nextInt();

			switch(type) {
				
				case 1:
					
					inputCircle();
					break;
					
				case 2:
					
					inputRect();
					break;
					
				case 3:
					
					printArea();
					break;
				case 4:
					System.out.println("시스템을 종료합니다.");
					System.exit(0);
					
				default:
					System.out.println("잘못입력하셨습니다.");
					continue;			
					
			}//switch
		}//while

	}

}
