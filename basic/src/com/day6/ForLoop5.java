package com.day6;

public class ForLoop5 {

	public static void main(String[] args) {
		System.out.println("7의 배수이거나 9의 배수");
		for(int i=1;i<100;i++) {
			if(i%7==0 || i%9==0) {
				System.out.print(i + "\t");
			}

	}

}
