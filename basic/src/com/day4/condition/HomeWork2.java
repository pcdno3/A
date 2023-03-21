package com.day4.condition;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("아이디를 입력하세요.");
		String id=sc.nextLine();
		System.out.println("비밀번호를 입력하세요.");
		String password=sc.nextLine();
	
		boolean bool1=id.equals("hong");
		boolean bool2=password.equals("1234");
		if(bool1&&bool2){
			System.out.println("로그인되었습니다");
		}else{
			System.out.println("아이디나 비밀번호가 틀렸습니다.");
		}
		
	}
}
