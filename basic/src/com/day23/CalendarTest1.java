package com.day23;

import java.util.Calendar;

public class CalendarTest1 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		
		System.out.println(year + "년 " + (month+1)+"월 " + cal.get(Calendar.DATE)+"일");
		System.out.println(cal.get(Calendar.HOUR_OF_DAY) + "시 "
							+ cal.get(Calendar.MINUTE) + "분 " + cal.get(Calendar.SECOND) + "초");
		
		int weekday = cal.get(Calendar.DAY_OF_WEEK);	//1:일요일
		
		System.out.println("요일 : " + weekday);
			
		
	}
}
