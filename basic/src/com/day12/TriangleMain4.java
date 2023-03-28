package com.day12;

import java.util.Scanner;

class Triangle3{
	//[1].멤버변수
	private int width;
	private int height;
	//[2].생성자
	Triangle3(int w, int h){
		width=w;
		height=h;
	}
	
	//[3]. getter/setter 만들기
	public int getWidth() {
		return width;
	}
	
	public void setWidth(int w) {
		width=w;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int h) {
		height=h;
	}
	
	
	//[4].메서드
	public int findarea() {
		int area =  width * height / 2;
		return area;
	}
}
public class TriangleMain4 {

	public static void main(String[] args) {
		//삼각형 면적 구하기
		//[5] 클래스를 새로 만들어서 면적 구하는 메서드를 만들고 , 이를 미용하여 면적 구한다
		
		
		//사용자로부터 입력받기
		Scanner sc = new Scanner (System.in);
		System.out.println("삼각형의 밑변, 높이 입력!");
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		//로직처리 - 삼각형 면적구하기
		//1)객체 생성
		Triangle3 tri = new Triangle3(w, h);
		
		//메서드 호출 - 참조변수.메서드();
		int area = tri.findarea();
		
		//결과출력
		System.out.println("삼각형의 면적 : " + area);
		
		//멤버변수의 값 변경 - setter이용
		
		tri.setWidth(10);
		tri.setWidth(30);
		
		System.out.println("\n밑변 : " + tri.getWidth() + ", 높이 : " + tri.getHeight());
		System.out.println("삼각형의 면적 : " + tri.findarea());
		
	}

}