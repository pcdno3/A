package com.day23;

import java.util.Calendar;
import java.util.Date;

public class DateConversion {

	public static void main(String[] args) {
		//1. Calendar를 Date로 변환
		Calendar cal = Calendar.getInstance();
		cal.set(2023, 9, 5);//2023-10-05;
		System.out.println("cal=" + CalendarTest2.showDate(cal));
		
		Date d = cal.getTime();	//Date Calendar.getTime()
		System.out.println("d= " + d.toLocaleString());
		
		//2. Date를 Calendar로 변환
		Date date = new Date(2023, 2, 7);	//2023-03-07
		
		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(date);
		System.out.println(CalendarTest2.showDate(cal2));

	}

}
