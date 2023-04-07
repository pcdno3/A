package com.day17;

import java.util.Scanner;

abstract class Shape{
	public abstract void draw();
}

class Circle extends Shape{
	public void draw() {
		System.out.println("원을 그립니다");
	}
	
}

class Rect extends Shape{
	public void draw() {
		System.out.println("사각형을 그립니다");
	}
}

public class AbstractShape {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Shape s = null;
		System.out.println("도형을 선택하세요<1. 원, 2. 사각형>");
		int type=sc.nextInt();
		
		if(type==1) {
			
			s = new Circle();
			
		}else if(type==2) {
			
			s =new Rect();
			
		}else
			System.out.println("잘못입력!");
			
		s.draw();
	}

}
