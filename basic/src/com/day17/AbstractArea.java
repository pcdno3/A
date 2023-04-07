package com.day17;

import java.util.Scanner;

abstract class Shape2{
	public abstract void findArea();
}

class Circle2 extends Shape2{
	private double radius;
	
	Circle2(double radius){
		this.radius=radius;
	}
	
	public void findArea() {
		System.out.println("원의 면적 : " + radius*radius*3.14);
	}
	
	public void showRadius() {
		System.out.println("반지름 : " +radius);
	}
}

class Rectangle extends Shape2{
	private double width;
	private double height;
	
	Rectangle(double width, double height){
		this.height=height;
		this.width=width;
	}
	
	public void findArea() {
		 System.out.println("사각형의 면적 : " + width * height);
	}
	
	public void showLength() {
		System.out.println("가로 : " + width + "\n세로 : " + height);
	}
}

public class AbstractArea {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Shape2[] s = new Shape2[3];
		
		for(int i=0; i<s.length; i++) {
			System.out.println("도형을 선택하세요 1.원 , 2.사각형");
			int type = sc.nextInt();
			if(type==1) {
				
				System.out.println("반지름을 입력하세요");
				double radius = sc.nextDouble();
				s[i] = new Circle2(radius);
				
			}else if(type==2) {
				     
				System.out.println("가로, 세로를 입력하세요");
				double width = sc.nextDouble();
				double height = sc.nextDouble();
				s[i] = new Rectangle(width, height);
				
			}else
				System.out.println("잘못입력!");
		}

		
		System.out.println("\n===========for 문================");
		
		for(int i=0; i<s.length; i++) {
			if(s[i] instanceof Circle2) {
				Circle2 c = (Circle2)s[i];
				s[i].findArea();
				c.showRadius();
				
			}else if(s[i] instanceof Rectangle) {
				Rectangle r = (Rectangle)s[i];
				s[i].findArea();
				r.showLength();
			}
		}
		
		System.out.println("\n============확장 for문===============");
		for(Shape2 shape : s) {
			if(shape instanceof Circle2) {
				Circle2 c = (Circle2)shape;
				shape.findArea();
				c.showRadius();
				
			}else if(shape instanceof Rectangle) {
				Rectangle r = (Rectangle)shape;
				shape.findArea();
				r.showLength();
			}
		}
		
	}

}
