package com.day15;

/*
 	클래스를 재사용하는 방법
 	1)상속이용 - is a 관계가 성립하면 상속을 이용한다.
 	 ~ is a ~ => ~는 일종의 ~이다
 	 예) SportsCar is a car
 	 
 	2)포함관계 이용	- has a 관계가 성립하면 포함관계를 이용한다
 	- has a ~ => ~는 ~를 가지고 있다.
 	예) Circle은 has a Point
 	
 */


class Point2{
	
	int x, y;	//원래 포함관계라면 private
	
	Point2(int x, int y){
		this.x=x;
		this.y=y;
	}
}

//포함관계 이용

class Circle2{
	private int r;
	private Point2 p;
	
	Circle2(int r, Point2 p){
		this.r=r;
		this.p=p;
	}
	
	
	public void showInfo() {
		System.out.println("x = " + p.x);
		System.out.println("y = " + p.y);
		System.out.println("r = " + r + "\n");
	}
}

public class HasATest {

	public static void main(String[] args) {
		Point2 po = new Point2(10, 20);
		Circle2 c = new Circle2(30, po);
		
		c.showInfo();
		

	}

}
