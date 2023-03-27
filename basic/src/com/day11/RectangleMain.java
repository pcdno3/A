package com.day11;

import java.util.Scanner;

class Rectangle{
	int width;
	int height;
	
	public int findArea() {
		int area; 
		area = width * height;
		return area;
	}
	public int findRound() {
		int round;
		round = (width + height)*2;
		return round;
	}
}
public class RectangleMain {

	public static void main(String[] args) {
		Rectangle rec = new Rectangle();
		Scanner sc = new Scanner (System.in);
		System.out.println("사각형의 가로, 세로를 입력하세요");;
		int width = sc.nextInt();
		int height = sc.nextInt();
		rec.height = height;
		rec.width = width;
		
		int area = rec.findArea();
		int round = rec.findRound();
		
		System.out.println("사각형의 넓이 : " + area);
		System.out.println("사각형의 둘레 : " + round);
		
		

	}

}
