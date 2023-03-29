package com.day13;

import java.util.Scanner;

class Time{
	int hour, min, sec;
	
	Time(int hour, int min, int sec){
		this.hour=hour;
		this.min=min;
		this.sec=sec;
	}

	public void nowTime() {
		System.out.println(hour + "시 " + min + "분 " + sec + "초 입니다.");
	}
	
	public void totalSec() {
		System.out.println(hour*60*60 + min*60 + sec + "초 입니다.");
	}
	
}
public class EXEX {

	public static void main(String[] args) {
			Scanner sc = new Scanner (System.in);
			System.out.println("시, 분, 초를 입력해주세요");
			
			int hour = sc.nextInt();
			int min = sc.nextInt();
			int sec = sc.nextInt();
			
			Time tie = new Time(hour, min, sec);
			
			tie.nowTime();
			tie.totalSec();

			
	}
	
}
