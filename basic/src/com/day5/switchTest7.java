package com.day5;

import java.util.Scanner;

public class switchTest7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("월을 입력하세요.");
		int month=sc.nextInt();
		
		String str = "";
		
			switch(month){
			case 1:
			case 2:
			case 3:
				str=month + "월은 1사분기입니다.";
				break;
			case 4:
			case 5:
			case 6:
				str=month + "월은 1사분기입니다.";
				break;
			case 7:
			case 8:
			case 9:
				str=month + "월은 1사분기입니다.";
				break;
			case 10:
			case 11:
			case 12:
				str=month + "월은 1사분기입니다.";
				break;
			default:
				str=month + "월은 1사분기입니다.";		
					
			}
			System.out.println(str);
	}

}
