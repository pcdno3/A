package com.day23;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import javax.xml.crypto.Data;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요.");
		int num = sc.nextInt();
		DecimalFormat df = new DecimalFormat("###,###");
		String str1 = df.format(num);
		System.out.println(str1);
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 MM월 dd일 E");

			try {
				System.out.println("날짜를 입력하세요<2013/09/30>");
				sc.nextLine();
				String str2 = sc.nextLine();
				Date d = sdf.parse(str2);
				str2 = sdf2.format(d);
				System.out.println(str2);
			} catch (ParseException e) {
				
				e.printStackTrace();
			}
			
			Date d = new Date();
			
			SimpleDateFormat sdf3 = new SimpleDateFormat("오늘날짜 : yyyy-MM-dd E요일 hh:mm:ss a");
			String str = sdf3.format(d);
			System.out.println(str);

	}

}
