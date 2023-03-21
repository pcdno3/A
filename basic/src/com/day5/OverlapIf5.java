package com.day5;

import java.util.Scanner;

public class OverlapIf5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("나이를 입력하세요.");
		int age=sc.nextInt();
		String result="";
		
		if(age>=20) {//바깥if 열기
			System.out.println("취미를 입력하세요 : 1. 영화 2. 축구 3. 야구 4.등산");
			int hobby = sc.nextInt();
			
			if(hobby==1) {	//안쪽if 열기
				
				result="영화를 선택하였습니다.";
			
			}else if(hobby==2) {
				
				result="축구를 선택하였습니다.";
			
			}else if(hobby==3) {
				
				result="야구를 선택하였습니다.";
			
			}else if(hobby==4) {
				
				result="등산을 선택하였습니다.";
			
			}else {
			
				result="잘못 입력하였습니다.";
			}//안쪽if 닫기
			System.out.println(result);
		}else {//바깥 if
			System.out.println("20세 미만은 사용하실 수 없습니다.");		}
		
	}

}
