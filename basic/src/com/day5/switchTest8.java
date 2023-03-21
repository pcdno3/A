package com.day5;
import java.io.IOException;
import java.util.Scanner;

public class switchTest8 {

	public static void main(String[] args)throws IOException  {
		Scanner sc=new Scanner(System.in);
		System.out.println("직업을 입력하세요 : A.회사원 B.학생 C.주부 D.기타");
		char job=(char)System.in.read();
		
		String str="";
		
		switch(Character.toUpperCase(job)){
		case 'A':
			str="회사원이시군요.";
			break;
		case 'B':
			str="학생이시군요.";
			break;
		case 'C':
			str="주부이시군요.";
			break;
		case 'D':
			str="기타를 선택했어요.";
			break;
		default:
			str="잘못 입력했어요.";
		}
		System.out.println(str);
	}

}
