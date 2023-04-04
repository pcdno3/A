package com.day16;

import java.util.Scanner;

class Shape2{
	
	public double findArea() {
		return 0;
		
	}
	
	public String kind() {
		return "도형의 종류";
	}
}

class Circle2 extends Shape2{
	private int r;
	static final double PI=3.14;
	
	Circle2(int r){
		this.r=r;
	}
	
	public double findArea() {
		return r*r*PI;
	}
	
	public String kind() {
		return "원";
	}
	
}

class Rect2 extends Shape2{
	private int width;
	private int height;
	
	Rect2(int width, int height){
		this.width=width;
		this.height=height;
	}
	
	public double findArea() {
		return width*height;
	}
	
	public String kind() {
		return "사각형";
	}
}

public class PolymoArray {

	public static void main(String[] args) {
		final int MAX_COUNT = 2;
		
		Shape2[] sh = new Shape2[MAX_COUNT];
		int index=0;
		
		Scanner sc = new Scanner(System.in);
		
		while(true){
		
			System.out.println("1.원 2.사각형 3.보기 4.종료");
			int type = sc.nextInt();
			
			if(type==1 || type==2) {
				if(index==MAX_COUNT) {
					System.out.println("저장소의 공간이 부족합니다.");
					continue;
				}
			}
			
			switch(type) {
				
				case 1:
					
					System.out.println("반지름을 입력하세요.");
					int radius = sc.nextInt();					
					sh[index++] = new Circle2(radius);
					break;
					
				case 2:

					System.out.println("가로, 세로를 입력하세요.");
					int width = sc.nextInt();
					int height = sc.nextInt();
					sh[index++] = new Rect2(width, height);
					break;
					
				case 3:
					if(index==0) {
						System.out.println("저장된 정보가 없습니다.");
						continue;
					}
					System.out.println("-----------보기----------");
					for(int i=0; i<index; i++) {
						System.out.println(sh[i].kind() + "의 면적 : " + sh[i].findArea());
					}
					System.out.println("------------------------");
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
