package com.day5;

import java.util.Scanner;

public class OverlapIf {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("회원여부를 입력하세요<1. 회원, 2. 비회원>");
		int flag=sc.nextInt();
		System.out.println(flag);
		String gift="";
		
		if(flag==1) { //회원일 경우에만처리 , 바깥if
				
			System.out.println("회원이 구매한 금액을 입력하세요");
			
			int price=sc.nextInt();
			
			if(price>1000000) {//안 if
						
				gift="외장하드";
			}else if(price>=500000) {// price<=1000000
				
				gift="스피커";
			}else if(price>=100000) {// price<500000
				
				gift="마우스";
			}else {// price<100000
				
				gift="10만원 미만은 사은품이 없습니다.";
			}
		}else {	//비회원일 경우 바로 바깥 if
						
			gift="비회원은 사은품 증정 불가";
			
		}//바깥if닫기
			
			System.out.println("구매금액별 사은품 : " +gift);
	}

}
