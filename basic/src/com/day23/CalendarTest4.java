package com.day23;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarTest4 {

	public static void main(String[] args) {
		Calendar cal = new GregorianCalendar();

		Calendar heesu = Calendar.getInstance();
		heesu.set(1997, 11, 31);
		
		long gap = (cal.getTimeInMillis()-heesu.getTimeInMillis())/1000;
		gap = gap/(24*60*60);
		System.out.println("생일<1997-12-31>이후 경과일 수 : " + gap + "일");
		
		Date d1 = cal.getTime();
		Date d2 = new Date(2023-1900, 7, 25);
		
		long gap2 = (d2.getTime() - d1.getTime())/1000;
		gap2 = gap2/(24*60*60);
		System.out.println("수료일 까지 남은 일수 : " + gap2 + "일");
		
		Calendar today = new GregorianCalendar();
		System.out.print("2023년 04월 17일 부터 100일 후 : ");
		today.add(Calendar.DATE, 100);
		System.out.print(CalendarTest2.showDate(today));
		
	}

}
