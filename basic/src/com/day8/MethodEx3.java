package com.day8;

import java.util.Scanner;

public class MethodEx3 {

	public static double toInch(double a) {
		double cm=0;
		cm=a*2.54;
		return cm;
	}
	public static double toCm(double b) {
		double inch=0;
		inch=b/2.54;
		return inch;
	}
		
	public static int area(int a, int b) {
		int area=0;
		area=(a*b)/2;
		return area;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("변환하려는 inch를 입력하세요");
		double inch=sc.nextDouble();
		
		double cm=toInch(inch);
		System.out.println(inch+"inch = >" + cm + "cm");
		
		System.out.println("변환하려는 cm를 입력하세요");
		cm=sc.nextDouble();
		inch=toCm(cm);
		System.out.println(cm + "cm = > " + inch + "inch");
		
		System.out.println("삼각형의 밑변의 길이, 높이를 입력하세요");
		int base=sc.nextInt();
		int height=sc.nextInt();
		int area=area(base, height);
		System.out.println("삼각형의 면적 : " + area);
		
	}

}
