package com.day19.etc;

abstract class Shape {
	private Point p;
	
	Shape(){
		this(new Point(0,0));
	}
	
	Shape (Point p){
		this.p = p;
	}
	
	Point getP() {
		return p;
	}
	
	void setP(Point p) {
		this.p = p;
	}
	
	abstract double calcArea();	//도형의 면적을 계산해서 반환하는 메서드
	


}

class Point {
	   private int x;
	   private int y;

	   Point() {
	      this(0,0);
	   }

	   Point(int x, int y) {
	      this.x=x;
	      this.y=y;
	   }

	   public String findInfo() {
	      return "["+x+","+y+"]";
	   }
	}

class Circle extends Shape { //클래스를 작성하시오
		
		private double radius;
		
		Circle(double radius){
			this.radius=radius;

		}
		
		public double getRadius() {
			return radius;
		}
		
		public double calcArea() {
			double area=radius*radius*3.14;
			return area;
		}
		
		
}

class Rect extends Shape { //클래스를 작성하시오
		
		private double width;
		private double height;
		
		Rect(double width, double height){
			this()
		}
		
		Rect(Point p,double width, double height){
			super(p);
			this.width=width;
			this.height=height;
		}
		
		
		
		public boolean isSquare() {
			boolean bool=true;
			if(width!=height) {
				bool=false;
			}
				
			return bool;			
		}
		
		public double calcArea() {
			double area=(double)(width*height);
			return area;
		}
}

class Exercise{
	   // sumArea 메서드를 작성하시오

	public double sumArea(Shape[] arr) {
		double sum=0;
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i].calcArea();
		}
		return sum;
	}
	   public static void main(String[] args){
	      Shape[] arr = {new Circle(5.2), new Circle(3, 4), new Circle(1)};
	      System.out.println("면적의 합:"+sumArea(arr));
	   }
	}