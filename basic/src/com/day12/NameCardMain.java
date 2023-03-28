package com.day12;

import java.util.Scanner;

class NameCard{
	String name;
	String phoneNumber;
	String address;
	String position;
	
	NameCard(String n, String phone, String add, String posi){
		name = n;
		phoneNumber = phone;
		address = add;
		position = posi;
	}
	
	public void showInfo() {
		System.out.println("이름 : " + name );
		System.out.println("전화번호 : " + phoneNumber);
		System.out.println("회사주소 : " + address);
		System.out.println("직급  : " + position);
	}
	
}

public class NameCardMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 , 전화번호, 회사주소, 직급을 입력하세요");
		String name=sc.nextLine();
		String number=sc.nextLine();
		String address=sc.nextLine();
		String position=sc.nextLine();
		
		System.out.println("=======================================");
		NameCard nc = new NameCard(name, number, address, position);
		
		nc.showInfo();

	}

}
