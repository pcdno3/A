package com.day18;

import java.util.Scanner;

abstract class Employee{
	
	protected String name;
	
	Employee(String name){
		this.name=name;
	}
	
	public abstract int getPay();
	
	public void display() {
		System.out.println("name : " + name);
	}
}

class Permanent extends Employee{
	
	private int salary;
	private int bonus;
	
	Permanent(String name, int salary, int bonus){
		super(name);
		this.salary=salary;
		this.bonus=bonus;
	}
	
	public int getPay() {
		 return salary + bonus;
		
	}
	
	public void display() {
		super.display();
		System.out.println("salary : " + salary);
		System.out.println("bonus : " + bonus);
	}
	
	public void permanent() {
		System.out.println("고용직 입니다.");
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
	
	public int getPay() {
		return time * pay;
		
	}
	
	public void display() {
		super.display();
		System.out.println("time : " + time);
		System.out.println("pay : " + pay);
	}
	
	public void temporary() {
		System.out.println("임시직 입니다.");
	}


}




public class IEmployeeTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee[] em = new Employee[3];
		for(int i=0; i<em.length; i++) {
			System.out.println("채용형태를 선택하세요 1.고용직 2.임시직");
			int type = sc.nextInt();
			if(type==1) {
				System.out.println("이름, 기본급여, 보너스를 입력하세요");
				sc.nextLine();
				String name = sc.nextLine();
				int salary = sc.nextInt();
				int bonus = sc.nextInt();
				em[i] = new Permanent(name, salary, bonus);
			}else if(type==2) {
				System.out.println("이름, 일한시간, 급여를 입력하세요");
				sc.nextLine();
				String name = sc.nextLine();
				int time = sc.nextInt();
				int pay = sc.nextInt();
				em[i] = new Temporary(name, time, pay);
			}else {
				System.out.println("잘못입력!");
				return;				
			}
		}
			System.out.println("\n==============오버라이딩 메서드 호출===========");
			for(int i=0; i<em.length; i++) {
					System.out.println("급여 : " + em[i].getPay());					
				}
			
			
			System.out.println("\n===========자신만의 메서드 호출=================");
			for(Employee e : em) {
				if(e instanceof Permanent) {
					Permanent p =(Permanent)e;
					p.display();
				}else if(e instanceof Temporary) {
					Temporary t =(Temporary)e;
					t.display();
				}
			}
		
	}

}
