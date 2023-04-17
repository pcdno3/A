package com.day23;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarTest3 {

	public static void main(String[] args) {
		Calendar cal = new GregorianCalendar(2023, 5, 1);	//2023-06-01
		System.out.println(CalendarTest2.showDate(cal));
		System.out.println("--------------9일 후--------------");
		cal.add(Calendar.DATE, 9);//void Calendar.add(int field, int amount)
		System.out.println(CalendarTest2.showDate(cal));	//2023-06-10
		
		System.out.println("-------------7개월 전--------------");
		cal.add(Calendar.MONTH, -7);
		System.out.println(CalendarTest2.showDate(cal));
		
		System.out.println("------------13년 전---------------");
		cal.add(Calendar.YEAR, -13);
		System.out.println(CalendarTest2.showDate(cal));
	}

}
