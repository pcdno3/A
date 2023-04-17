package com.day23;

import java.util.Scanner;
import java.util.TreeSet;

public class Exam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" '-'를 제외한 주민번호 13자리를 입력하세요");
		String Id = sc.nextLine();
			//012345-6789012	
		//Id= 961105-1515519
		
		if(Id.length()!=13) {
			System.out.println("주민번호 잘 못 입력!");
		}
		String year1=Id.substring(0, 2);
		String month=Id.substring(2, 4);
		String date=Id.substring(4, 6);
		 
		char genNum = Id.charAt(6);
		String gender="";
		String year2="";
		if(genNum=='1' || genNum=='3') {
			gender="남";
		}else if(genNum=='2' || genNum=='4') {
			gender="여";
		}
		
		if(genNum=='1' || genNum=='2') {
			year2="19"+year1;
		}else if(genNum=='3' || genNum=='4') {
			year2="20"+year1;
		}
		
		System.out.println(year2 + "년 " + month + "월 " + date + "일, " + gender);
		
	}

}

