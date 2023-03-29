package com.day13;

import java.util.Scanner;

class Account{
	   //멤버 변수
	   private String accId; //계좌번호
	   private int balance; //잔액

	   //생성자
	   public Account(String accId, int balance){
	      this.accId=accId;
	      this.balance=balance;
	   }

	   //getter/setter
	   public String getAccId(){
	      return accId;
	   }

	   public void setAccId(String accId){
	      this.accId=accId;
	   }

	   public int getBalance(){
	      return balance;
	   }

	   public void setBalance(int balance){
	      this.balance=balance;
	   }

	   //메서드
	   public void deposit(int money){//입금
	      balance += money;
	   }

	   public void withdraw(int money){//출금
	      balance -= money;
	   }

	   //계좌정보를 출력하는 메서드
	   public void display(){
	      System.out.println("계좌번호 : " + accId);
	      System.out.println("잔액 :" + balance+"\n");
	   }
	}

public class ArrayClassTest {

	public static void main(String[] args) {
		/*
		 1) int배열에 임의의 값 넣고 출력(기본for)
		 2) String배열에 임의의 값 넣고 출략(확장for)
		 */
		int[] arr = new int[3];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		String[] strArr = new String[3];
		
		strArr[0] = "자바";
		strArr[1] = "너무";
		strArr[2] = "어려워";
		
		for(String n : strArr)
			System.out.println(n + " ");
		
		Account acc = new Account("박희수", 30000);
		acc.withdraw(30000);
		

		Account[] acc4 = new Account[4];
		acc4[0] = new Account("100-001-2000", 100000);
		acc4[1] = new Account("100-002-3000", 200000);
		acc4[2] = new Account("100-003-4000", 300000);
		acc4[3] = new Account("100-004-5000", 300000);
		/*
		 int배열에는 int를 넣는다
		 String배열에는 String을 넣는다
		 Account배열에는 Account를 넣는다 어떻게 new 객체를 생성해서 넣는다
		 Account[] 변수명 = new 객체[갯수];
		 변수명[갯수] = new Account();
		 */
		
		for(int i=0; i<acc4.length; i++) {
			acc4[i].withdraw(30000);
			acc4[i].display();	
		}
		
		Scanner sc = new Scanner(System.in);
		
		Account[] accList = new Account[3];
		for(int i=0; i<accList.length; i++) {
			System.out.println("==계좌번호, 잔액, 출금액을 입력하세요==");
			String accId = sc.nextLine();
			int balance = sc.nextInt();
			int money = sc.nextInt();
			sc.nextLine();
			
			accList[i] = new Account(accId, balance);
			accList[i].withdraw(money);
			
		}
		
		System.out.println("\n============은행 고객 리스트=============");
		for(int i=0; i<accList.length; i++) {
			accList[i].display();
			
		}
		
		
	}

}
