package com.day14;

import java.util.Scanner;


class Rect{
	private int width;
	private int height;
	
	static int area;
	
	Rect(int width, int height){
		this.width=width;
		this.height=height;
	}
	
	public int findArea() {
		int area;
		 return area = width*height;
		// System.out.println(area);
	}
	
	
}

class EXEX {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean bool=true;
		
		Rect[] rec = new Rect[100];
		int index=0;
		
		while(bool) {
		System.out.println("1.저장 2.저장된 전체 사각형 면적 조회 3.종료");
		int select=sc.nextInt();

			switch(select) {
				case 1:
					System.out.println("가로, 세로를 입력해주세요");
					int width = sc.nextInt();
					int height = sc.nextInt();
					
					rec [index++] = new Rect(width, height);
					break;
				case 2:
					System.out.println("==전체 사각형 면적==");
					for(int i=0; i<index; i++) {
						
						System.out.println(rec[i].findArea());
					}
					
					break;
					
				case 3:
					System.out.println("프로그램을 종료합니다.");
					bool=false;
					break;
					
				default:
					System.out.println("잘못 입력했어요!\n");
					continue;
			
			}
		
		
		
		
		
		}

	}
}
