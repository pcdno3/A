package com.day22;

import java.util.Scanner;

public class StringTest3 {

	public static void main(String[] args) {
		String str = "test.txt";
		int idx1 = str.lastIndexOf(".");
		String sub1 = str.substring(0, idx1);
		String sub2 = str.substring(idx1+1);
		
		System.out.println("파일명 : " + sub1 + ", 확장자 : " + sub2);
					// 01234567890123456789012345
		String str2 = "안녕하세요\r\n 저는 홍길동 입니다.";
		
		String s = str2.replace("\r\n ", "<br>");
		System.out.println(s);
		
					// 0123456789012345678901234567
		String load = "c:\\shop\\upload\\test.txt";
		int idx2 = load.lastIndexOf("\\");
		int idx3 = load.lastIndexOf(".");
		
		String sub3 = load.substring(0, idx2);
		String sub4 = load.substring(idx2+1, idx3);
		String sub5 = load.substring(idx3+1);
		
		System.out.println("폴더 : " + sub3);
		System.out.println("파일명 : " + sub4);
		System.out.println("확장자 : " + sub5);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("URL주소를 입력하세요.");
		String URL = sc.nextLine();
		
		if(URL.indexOf("http://www.mall.com")==-1) {
			System.out.println("해당 url 주소가 적합하지 않습니다.");
		}else {
			System.out.println("해당 url 주소 : " + URL);			
		}
		
		
		System.out.println("주민등록번호를 입력하세요<하이픈 없이 입력>");
		//012345-67890123
		//960724-1213117
		String add = sc.nextLine();
		
		if(add.length()!=13) {
			System.out.println("주민번호 잘 못 입력!");
		}
		String gender = "";
		char ch = add.charAt(6);
		if(ch=='1' || ch=='3' ) {
			gender = "남";
		}else if(ch=='2' || ch=='4') {
			gender = "여";
		}
		
		String year = "";
		String year2 = add.substring(0, 2);
		String month = add.substring(2, 4);
		String day = add.substring(4, 6);		
		if(ch=='1' || ch=='2') {
			year = "19"+year2;
		}else if(ch=='3' || ch=='4') {
			year = "20"+year2;
		}
		
		System.out.println(year+"년 " + month + "월 " + day + "일 ," + gender);
	}

}
