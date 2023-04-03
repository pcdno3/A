package com.day15;

class Point1{
	
	protected int x, y;
	
	Point1(int x, int y){
		this.x=x;
		this.y=y;
	}
}

class Circle extends Point1{
	private int r;
	
	Circle(int x, int y, int r){
		super(x, y);
		this.r=r;
	}
	
	public void showInfo() {
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("r = " + r + "\n");
	}
}

public class IsATest {
	public static void main(String[] args) {
		Circle c = new Circle(10, 20, 50);
		c.showInfo();

	}

}
