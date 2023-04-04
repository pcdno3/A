package com.day15;

import java.util.*;

class Account{
	private int balance;
	final double INTEREST_RATE=0.02;
	
	Account(int balance){
		this.balance=balance;
		
	}
	
	public int findInterest() {
		int Interest;
		return Interest=(int)(balance*INTEREST_RATE);
	}
	
}

public class AccountMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입금할 금액을 입력하세요.");
		int balance = sc.nextInt();
		Account acc = new Account(balance);
		
		System.out.println("원금 : " + balance + "원");
		System.out.println("이자율 : " + acc.INTEREST_RATE);
		System.out.println("이자 : " + acc.findInterest() + "원");
	}

}
