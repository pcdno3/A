package com.day17;

import java.util.Scanner;

class Employee{	
	protected String name;

	public Employee(String name){
		this.name = name;
	}
	
	public void setName(String name){
			this.name = name;
	}
	
	public String getName(){
			return this.name;
	}
	
	public int findPay(){
		return 0;
	}
}//

class Permanent extends Employee{	
	protected int salary; //기본급여

	public Permanent(String name, int salary){
		super(name);
		this.salary = salary;
	}	
	
	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int findPay(){
		return salary;
	}	
}//

class Temporary extends Employee{	
	private int time; //일한시간
	private int pay;  //시간당 급여

	public Temporary(String name, int time, int pay){
		super(name);
		this.time = time;
		this.pay = pay;
	}	
	
	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

	public int findPay(){
		return time*pay;
	}	
}//

class SalesPerson extends Permanent{	
	private final double RATE = 0.15;

	private int earnings; //판매수익

	public SalesPerson(String name, int salary, int earnings){
		super(name, salary);
		this.earnings = earnings;
	}
		
	public int getEarnings() {
		return earnings;
	}

	public void setEarnings(int earnings) {
		this.earnings = earnings;
	}

	public int findPay(){
		return (int)(salary+(earnings*RATE));
	}
}//

public class EmployeeArray {
	public static void main(String[] args){
		//Employee배열 - 요소 3개 넣고 , 1)모든 직원의 findPay()메서드 호출		오버라이딩메서드 호출
		Employee[] e = new Employee[3];
		e[0] = new Permanent("홍길동", 2500000);
		e[1] = new Temporary("김기수", 9, 10000);
		e[2] = new SalesPerson("신형만", 3000000, 300000);
		
		for(int i=0; i<e.length; i++) {
			System.out.println(e[i].findPay());
		}
		
		//2 자식만의 메서드 getSalary(), getTime(), getEarnings() 호출	자신만의 메서드 호출
		//for, 확장for	이용 

		System.out.println("\n====================");
		for(int i=0; i<e.length; i++) {
			if(e[i] instanceof Permanent) {
				
				Permanent p = (Permanent)e[i];
				System.out.println(p.getSalary());
			}else if(e[i] instanceof Temporary) {
				
				Temporary t = (Temporary)e[i];
				System.out.println(t.getTime());
				
			}else if(e[i] instanceof SalesPerson) {
				SalesPerson s = (SalesPerson)e[i];
				System.out.println(s.getEarnings());
				
			}
		}
		
		for(Employee employee : e) {
			if(employee instanceof Permanent) {
				
				Permanent p = (Permanent)employee;
				System.out.println(p.getSalary());
			}else if(employee instanceof Temporary) {
				
				Temporary t = (Temporary)employee;
				System.out.println(t.getTime());
			}else if(employee instanceof  SalesPerson) {
				
				SalesPerson s = (SalesPerson)employee;
				System.out.println(s.getEarnings());
			}
		}
		
		
	}
}
