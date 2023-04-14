package com.day22;

import java.util.Date;

public class DataTest1 {

	public static void main(String[] args) {
		
		Date d = new Date();	//현재날짜
		System.out.println("d= " + d);
		System.out.println("현재 날짜 : " + d.toLocaleString());
		
		int year = d.getYear();
		int month = d.getMonth();//0~11
		
		System.out.println(year + 1900 + "년");
		System.out.println(month + 1  + "월");
		System.out.println(d.getDay() + "일");
		System.out.println(d.getHours() + "시 " + d.getMinutes() + "분 " + d.getSeconds() +"초");
		System.out.println("요일 : " + d.getDay()); //0: 일요일
		
		//현재 시간을 1970년 1월 1일 0시 0분 0초를 기준으로 밀리초 단위로 환산
		long gap = d.getTime()/1000;	//초
		
		System.out.println("70/01/01 이후 경과된 시간(초) : " + gap);
		
		gap=gap/(24*60*60);//일
		System.out.println("70/01/01 이후 경과된 시간(일수) : " + gap);
		
	}

}
