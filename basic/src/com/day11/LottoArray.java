package com.day11;

import java.util.Scanner;

public class LottoArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] Arr = new int[8];
		int sum=0;
		for(;;) {
			System.out.println("복권 판매점 번호<1~8>와 복권 판매량을 입력하세요.<끝날때는 Q>");
			String number = sc.next();
			
			if(number.equalsIgnoreCase("Q")) {
				System.out.println("종료되었습니다.");
				break;
			}
			int count = sc.nextInt(); 
			int i = Integer.parseInt(number)-1;
			Arr[i] += count;
		
			System.out.println("그룹번호 : " + number + ", 판매량 : " + Arr[i]);
			
		}

	}

}
