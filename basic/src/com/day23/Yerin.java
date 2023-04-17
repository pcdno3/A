package com.day23;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Yerin {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	      
	      //1.사용자로부터 정수를 입력 받아서 천단위 구분기호가 표시되도록 출력하기
	      System.out.println("정수를 입력하세요.");
	      int num = sc.nextInt();
	      
	      DecimalFormat df = new DecimalFormat("#,###");
	      System.out.println(df.format(num));
	      
	      //2. 사용자로부터 날짜를 “2022/05/11”의 형태로 입력 받아서 무슨 요일인지 출력하는 프로그램을 작성하시오
	      System.out.println("날짜를 입력하세요. ####/##/##");
	      String day = sc.next();
	      
	      SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd");
	      SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy/MM/dd E요일");
	      try {
	         Date d = sdf2.parse(day);
	         
	         System.out.println(sdf3.format(d));
	      } catch (ParseException e) {
	         
	         e.printStackTrace();
	      }
	      
	      //3.  사용자에게 날짜를 입력 받아서 "2022년 09월 30일 월" 형태로 출력하시오. SimpleDateFormat, parse()메서드 이용
	      Calendar cal = Calendar.getInstance();      
	      Date day2 = cal.getTime();      

	      SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM-dd E요일 hh:mm:ss a");
	      System.out.println("\n오늘날짜 : "+sdf4.format(day2));
	      
	      
	      

	   }

	}