package com.day5;

import java.util.Scanner;

public class OverlapIf3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("주민번호 첫번째 뒷자리를 입력해주세요.");
		int id=sc.nextInt();
		
		String result="";
		
		if(id==1) {
			
			result="남자";
		}else if(id==2) {
			
			result="여자";
		}else {
			
			result="잘못 입력하였습니다.";
		}
		System.out.println(result);
		
	}

}
