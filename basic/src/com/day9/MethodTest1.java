package com.day9;

import java.util.Scanner;

public class MethodTest1 {
	public static double bonus(int num, int price) {
			double bonus=0.0;
			if(num>=200) {
				bonus=price*0.3;
			}else if(num>=100) {
				bonus=price*0.2;
			}else {
				bonus=price*0.1;
			}
			return bonus;
	}
	
	public static boolean charAt(String sum) {
			boolean bool=true;
		for(int i=0; i<sum.length();i++) {
			int a=sum.charAt(i);
			if(!(a>='0' && a<='9'));{
				bool=false;
			
				
			}
		}
			return bool;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("판매수량, 판매금액을 입력하세요");
		int num=sc.nextInt();
		int price=sc.nextInt();
		
		double bonus=bonus(num, price);
		System.out.println("성과급 : " + bonus);
		sc.nextLine();
		System.out.println("값을 입력하세요");
		String sum=sc.nextLine();
		
		boolean bool=charAt(sum);
		if(bool) {
			System.out.println(sum + "은 숫자입니다.");
		} else {
			System.out.println(sum + "은 숫자가 아닙니다.");
		}
	}

}
