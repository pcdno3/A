package com.day23;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DataFormatTest {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(2023, 0, 12); //2023-01-12;
		Date d = cal.getTime();	//Calendar를 Date로 변환한 후 format 메서드 이용
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년MM월dd일 HH시mm분ss초");
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd E요일");
		SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS a");
		
		//public final String format(Date date)
		String str = sdf.format(d);
		System.out.println(str);
		System.out.println(sdf2.format(d));
		System.out.println(sdf3.format(d));
		System.out.println(sdf4.format(d));
		//public Date parse(String source) throws ParseException - 문자열을 날짜로 변환
		

	}

}
