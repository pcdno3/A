package com.day15;

import java.util.*;

class Employee{
	protected String name;
	
	Employee(String name){
		this.name=name;
	}
	
	public int findPay() {
		return 0;
	}	
	
	public void showInfo() {
		System.out.println("이름 : " + name);
	}
}

class Permanent extends Employee {
	
	private int salary;
	private int bonus;
	
	Permanent(String name, int salary, int bonus){
		super(name);
		this.salary=salary;
		this.bonus=bonus;
	}
	
	public int findPay() {
		return salary + bonus;
		
	}
	
	public void showInfo() {

		super.showInfo();
		System.out.println("기본급여 : " + salary);
		System.out.println("보너스 : " + bonus);
		
	}
}

class Temporary extends Employee{
	private int time;
	private int pay;
	
	Temporary(String name, int time, int pay){
		super(name);
		this.time=time;
		this.pay=pay;
	}
	
	public int findPay() {
		return time * pay;
	}
	
	public void showInfo() {

		super.showInfo();
		System.out.println("일한시간 : " + time);
		System.out.println("시간당 급여 : " + pay);
	}
}

class PaySystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("고용형태 - 고용직<P>, 임시직<T>을 입력하세요");
		String str = sc.nextLine();
		
		if(str.equalsIgnoreCase("P")) {
			
			System.out.println("이름, 기본급여, 보너스를 입력하세요");
			String name = sc.nextLine();
			int salary = sc.nextInt();
			int bonus = sc.nextInt();
			
			Permanent per = new Permanent(name, salary, bonus);
			
			System.out.println("고용형태 : 고용직");
			per.showInfo();
			System.out.println("총 급여 : " + per.findPay());
			
		}else if(str.equalsIgnoreCase("T")) {
			
			System.out.println("이름, 일한시간, 시간당급여를 입력하세요");
			String name = sc.nextLine();
			int time = sc.nextInt();
			int pay = sc.nextInt();
			
			Temporary tem = new Temporary(name, time, pay);
			
			System.out.println("고용형태 : 임시직");
			tem.showInfo();
			System.out.println("총 급여 : " + tem.findPay());
			
			
		}else
			System.out.println("잘못입력!");
		

	}

}
