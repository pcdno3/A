package com.day12;

import java.util.Scanner;

class Temporary{
	//1매개변수
	String name;
	int time;
	int pay;
	//2생성자
	Temporary(String name, int time, int pay){
		this.name = name;
		this.time = time;
		this.pay = pay;	
	}
	
	//3 getter / setter
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
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
	
	//4메서드
	
	public int totalPay() {
		int money;
		return money=time*pay;
	}
	
	public String rating() {
		String result="";
		if(pay<=10000)
			result="임시직";
		else
			result="정직원";
		
		return result;
	}
	
	public void showInfo() {
		System.out.println("고용형태 : " + );
		
	}
}

public class TemporaryMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("이름 , 일한시간 , 시간당 급여를 입력하세요");
		String name = sc.nextLine();
		int time = sc.nextInt();
		int pay = sc.nextInt()
		Temporary tem = new Temporary(name, time, pay);

	}

}
