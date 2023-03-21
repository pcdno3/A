package com.day5;

import java.util.Scanner;

public class switchTest6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("평균을 입력하세요.");
		int avg=sc.nextInt();
		
		String result="";
		if(avg<=100 && avg>0) {
			switch((int)avg/10) {
			case 10:
			case 9:
				result="A";
				break;
			case 8:
				result="B";
				break;
			case 7:
				result="C";
				break;
			case 6:
				result="D";
				break;
			case 5:
				result="F";
				break;
			default:
				result="잘 못 입력하셨습니다.";
			
			}
		}else {
			System.out.println("잘 못 입력하셨습니다.");
		}
		
		System.out.println(result);
		
		int n=-1;
		//String res=(n>0)?"양수":"음수";
		String res=(n>0)?"양수":(n==0)?"0":"음수";
		System.out.println(res);
	}

}
