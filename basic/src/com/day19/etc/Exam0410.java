package com.day19.etc;

import java.util.Scanner;

class Account{
	protected String addNo;
	protected int balance;
	
	Account(String addNo, int balance){
		this.addNo=addNo;
		this.balance=balance;
	}
	
	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw(int money) {
		balance -= money;
	}
	
	public void showInfo() {
		System.out.println("계좌 번호 : " + addNo);
		System.out.println("계좌 잔액 : " + balance);
	}
}

class FaithAccount extends Account{
	
	
	FaithAccount(String addNo, int balance){
		super(addNo, balance);
		
		this.balance=(int)(balance+balance*0.01);
	}
	
	public void deposit(int money) {
		balance += money + money *0.01;
	}
	
	public void withdraw(int money) {
		balance -= money;
	}
	
	public void showInfo() {
		super.showInfo();
	}
	
}

class ContriAccount extends Account{
	
	private double contribution;
	
	ContriAccount(String addNo, int balance){
		super(addNo,balance);
		this.contribution = balance *0.01;
		this.balance-=balance*0.01;
	}
	
	public void deposit(int money) {
		balance += money + money *0.01;
	}
	
	public void withdraw(int money) {
		balance -= money;
	}
	
	
	public void showInfo() {
		super.showInfo();
		System.out.println("총 기부액 : " + contribution);
		
	}
	
}

public class Exam0410 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		System.out.println("계좌종류를 선택하세요 1.일반계좌 2.신용계좌 3.기부계좌");
		int type = sc.nextInt();
		
		Account add = null;
		
		if(type==1) {
			System.out.println("계좌번호, 잔액을 입력해주세요");
			sc.nextLine();
			String addNo = sc.nextLine();
			int balance = sc.nextInt();
			add = new Account(addNo, balance);
			
		}else if(type==2) {
			System.out.println("계좌번호, 잔액을 입력해주세요");
			sc.nextLine();
			String addNo = sc.nextLine();
			int balance = sc.nextInt();
			add = new FaithAccount(addNo, balance);
			
		}else if(type==3) {
			System.out.println("계좌번호, 잔액을 입력해주세요");
			sc.nextLine();
			String addNo = sc.nextLine();
			int balance = sc.nextInt();
			add = new ContriAccount(addNo, balance);
		}else {
			System.out.println("잘못입력!");
			return;
		}
		
		add.showInfo();
		
		
	}

}
