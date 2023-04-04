package com.day16;

import java.util.Scanner;

class ManagerPay{
	
	Scanner sc = new Scanner(System.in);
	
	public void selectType() {
		System.out.println("고용형태 - 고용직<P>, 임시직<T>, 판매직<S>를 입력하세요");	
	}
	
	public void findPermanent() {
		System.out.println("이름, 기본급여를 입력하세요");
		String name = sc.nextLine();
		int salary = sc.nextInt();
		
		Employee p = new Permanent(name, salary);
		System.out.println("========================");
		System.out.println("고용형태 : 고용직");
		System.out.println("이름 : " + name);
		System.out.println("급여 : " + p.findPay());
	}
	
	public void findTemporary() {
		System.out.println("이름, 일한시간, 시간당급여를 입력하세요");
		String name = sc.nextLine();
		int time = sc.nextInt();
		int pay = sc.nextInt();
		
		Employee t = new Temporary(name, time, pay);
		System.out.println("고용형태 : 임시직");
		System.out.println("이름 : " + name);
		System.out.println("급여 : " + t.findPay());
	}
	
	public void findSalesPerson() {
		System.out.println("이름, 기본급여, 판매수익을 입력하세요.");
		String name = sc.nextLine();
		int salary = sc.nextInt();
		int earnings = sc.nextInt();
		
		Permanent s = new SalesPerson(name, salary, earnings);
		System.out.println("고용형태 : 판매직");
		System.out.println("이름 : " + name);
		System.out.println("급여 : " + s.findPay());
	}
	
	
}

class Employee{
	protected String name;
	
	Employee(String name){
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public int findPay() {
		return 0;
	}
}

class Permanent extends Employee {
	
	protected int salary;
	
	Permanent(String name, int salary){
		super(name);
		this.salary=salary;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary=salary;
		}
	
	public int findPay() {
		return salary;
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
	
	public int getTime() {
		return time;
	}
	
	public void setTime(int time) {
		this.time=time;
	}
	
	public int getPay() {
		return pay;
	}
	
	public void setPay(int pay) {
		this.pay=pay;
	}
	
	public int findPay() {
		return time*pay;
	}
	
}

class SalesPerson extends Permanent{
	
	private int earnings;
	final double RATE=0.15;
	
	SalesPerson(String name, int salary, int earnings){
		super(name, salary);
		this.earnings=earnings;
	}
	
	public int findPay() {
		return salary+(int)(earnings*RATE);
	}
}

public class PermanentMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ManagerPay m = new ManagerPay();
		
		m.selectType();	
		String type = sc.nextLine();
		
		if(type.equalsIgnoreCase("P")) {
			m.findPermanent();
			
		}else if(type.equalsIgnoreCase("t")) {
			m.findTemporary();

			
		}else if(type.equalsIgnoreCase("S")) {
			m.findSalesPerson();
		}else {
			System.out.println("잘못입력!");
			return;
		}
		
	}

}
