package com.day11;

import java.util.Scanner;

class Calculator{
	public double plus (double a, double b) {
		double c=0;
		c= a + b;
		return c;
	}
	
	public double minus (double a, double b) {
		double c=0;
		c= a - b;
		return c;
	}
	
	public double multiply (double a, double b) {
		double c=0;
		c= a * b;
		return c;
	}
	
	public double divide (double a, double b) {
		double c=0;
		c= a / b;
		return c;
	}
	
}
public class CalculatorMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Calculator cal = new Calculator();
		System.out.println("두실수를 입력하세요.");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		String result="";
		double plus = cal.plus(a, b);
		double minus = cal.minus(a, b);
		double multiply = cal.multiply(a, b);
		double divide = cal.divide(a, b);
		
		System.out.println("a= " + a +", b= " + b);
		System.out.println("a + b = " + plus);
		System.out.println("a - b = " + minus);
		System.out.println("a * b = " + multiply);
		System.out.println("a / b = " + divide);
		
		
		
		
		
	}

}
