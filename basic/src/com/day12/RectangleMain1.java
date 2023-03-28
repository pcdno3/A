package com.day12;

import java.util.Scanner;

class Rectangle{
	double width;
	double height;
	
	Rectangle(double w, double h){
		width=w;
		height=h;
	}
	
	public double findarea() {
		double area = width * height;
		return area;
	}
	
	public double findRound() {
		double round = (width + height) *2;
		return round;
	}
}

public class RectangleMain1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("사각형의 가로, 세로를 입력하세요");
		double w = sc.nextDouble();
		double h = sc.nextDouble();
		
		Rectangle rec = new Rectangle(w , h);
		
		System.out.println("직사각형의 넓이 : " + rec.findarea());
		System.out.println("직사각형의 둘레 : " + rec.findRound());
		

	}

}
