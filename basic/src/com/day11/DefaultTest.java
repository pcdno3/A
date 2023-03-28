package com.day11;

import com.day12.BBB;

public class DefaultTest {

	public static void main(String[] args) {
		//AAA aa = new AAA(); //error
		BBB obj = new BBB();
		obj.showInfo();
		
		//System.out.println("private x = " obj.x);
		//System.out.println("default y = " + obj.y);
		//System.out.println("protected z = " + obj.z);
		System.out.println("public w = " + obj.w + "\n");
	}

}
