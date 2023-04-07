package com.day18;

import java.util.Scanner;

interface IShape{
	void draw();
	void delete();
	
}

class Circle implements IShape{
	public void draw() {
		System.out.println("원을 그립니다");
	}
	public void delete() {
		System.out.println("원을 지웁니다");
	}
}

class Rect implements IShape{
	public void draw() {
		System.out.println("사각형을 그립니다");
	}
	
	public void delete() {
		System.out.println("사각형을 지웁니다");
	}
}



public class IShapeTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IShape[] ISArr = new IShape[3];
		
		for(int i=0; i<ISArr.length; i++) {
			System.out.println("도형을 선택하세요 <1.원, 2.사각형>");
			int shape = sc.nextInt();
			
			if(shape==1) {
				ISArr[i] = new Circle();		
			}else if(shape==2) {
				ISArr[i] = new Rect();
			}else {
				System.out.println("잘못입력!");
				return;
			}//if
			
		}//for
		
		System.out.println("\n=============for문============");
		for(int i=0; i<ISArr.length; i++) {
				ISArr[i].draw();
				ISArr[i].delete();
			}//for
		
		System.out.println("\n==========확장for문============");
		for(IShape is : ISArr) {
			is.draw();
			is.delete();
		}//확장for
			
	}

}
