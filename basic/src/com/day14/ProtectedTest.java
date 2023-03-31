package com.day14;

import com.day13.Myparent;

class Child extends Myparent {
	public void showInfo() {
		//System.out.println("private num1 : " + num1);
		//error : The field Myparent.num1 is not visible
		
		//System.out.println("default num2 : " + num2);
		//error : The field Myparent.num2 is not visible
		
		System.out.println("protected num3 : " + num3);
		System.out.println("public num4 : " + num4 + "\n");
	}
}

public class ProtectedTest {

	public static void main(String[] args) {
		Myparent p = new Myparent();
		//System.out.println("main Myparent mum1 = " + p.num1);	//error
		//System.out.println("main Myparent mum2 = " + p.num2); //error
		//System.out.println("main Myparent mum3 = " + p.num3); //error
		System.out.println("main Myparent mum4 = " + p.num4);
		
		Child ch = new Child();
		
		//System.out.println("main Child num 1 = " + ch.num1); //error
		//System.out.println("main Child num 2 = " + ch.num2); //error
		//System.out.println("main Child num 3 = " + ch.num3); //error
		System.out.println("main Child num 4 = " + ch.num4);
		
		ch.showInfo();
		
		/*
		  protected 
			객체의 메모리를 생성한 후 점(.)찍고 접근할 때는 완벽한 default이면서
			상속관계의 클래스 디자인타임에는 완벽한 public
		 */
	} 

}
