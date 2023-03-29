package com.day13;

class BankAccount{
	private int balance;//원금 , 잔액
	public static final double interest = 0.03;//이자율
	private static int totalBalance;//각 개체의 원금의 합계
	
	BankAccount(int balance){
		this.balance = balance;
		
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public static int getTotalBalance() {
		return totalBalance;
	}
	
	public static void setTotalBalance(int totalBalance) {
		BankAccount.totalBalance = totalBalance;
	}
	
	//메서드
	public void findTotal() {
		totalBalance += balance;
	}
}

public class BackAccountTest {

	public static void main(String[] args) {
		BankAccount ba1 = new BankAccount(50000);
		BankAccount ba2 = new BankAccount(100000);
		ba1.findTotal();
		ba2.findTotal();
		
		System.out.println("계좌1의 원금 : " + ba1.getBalance());
		System.out.println("계좌2의 원금 : " + ba2.getBalance());
		System.out.println("전 계좌의 합 : " + BankAccount.getTotalBalance());
		System.out.println("이율 : " + BankAccount.interest);
		//static 변수나 메서드 : 클래스명.변수, 클래스명.메서드
	}

}
