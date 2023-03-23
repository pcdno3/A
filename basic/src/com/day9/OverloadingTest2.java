package com.day9;

import java.util.Scanner;

public class OverloadingTest2 {
	
	public static double area(int radius) {
		double area=radius * radius* 3.14;
		return area;			
	}
	
	public static int area(int width, int height) {
		int area= width*height;
		return area;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("가로 세로 반지름을 입력하세요");
		int width=sc.nextInt();
		int height=sc.nextInt();
		int radius=sc.nextInt();
		
		int square=area(width, height);
		
		double circle=area(radius);
		
		System.out.println("사각형의 면적 : " + square);
		System.out.println("원의 면적 : " + circle);
	}

}
