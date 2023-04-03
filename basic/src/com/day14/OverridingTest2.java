package com.day14;

class Shape{
	public static double findArea(double a, double b) {
		return 0;
	}
}

class Circle{
	protected double radius;
	
	public static double findArea(double a, double b) {
		
		double area=a*a*3.14;
		return area;
	}
}

class Rectangle{
	protected double width;
	protected double height;
	
	
	public static double findArea(double a, double b) {
		
		double area = a * b;
		return area;
	}
}

public class OverridingTest2 {

	public static void main(String[] args) {
		
		Rectangle rec = new Rectangle();
		System.out.println("사각형의 면적 : " + rec.findArea(10, 20));
		
		Circle cir = new Circle();
		System.out.println("원의 면적 : " + cir.findArea(10, 0));
		
		
		

	}

}
