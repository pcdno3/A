package com.day6;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		/*
		 무한루프 - 무한히 반복
		 break를 써서 무한루프를 빠져나오게 해야 함
		 
		 for(;;){
		 	반복할 문장;
		 	
		 	if(조건) break;
		 }
		 */
		Scanner sc = new Scanner(System.in);
		for(;;) {//무한루프
			System.out.println("게임 중~");
			System.out.println("계속하시겠습니까?(Y/N)");
			String gameYn = sc.nextLine();
			
			if(gameYn.equalsIgnoreCase("n")) {
				break;	//반복문 탈출
			}
		}
		for(;;) {
			System.out.println("숫자 입력!");
			int n = sc.nextInt();	//5 \r\n
			String result="";
			
			if(n%2==0) {
				result="짝수";
				
			}else {
				result="홀수";
			}//if
			
			System.out.println(result);
			System.out.println("그만하려면 Q 입력!");
			sc.nextLine();	//\r\n
			String quit=sc.nextLine();
			if(quit.equalsIgnoreCase("Q"))
				break;
			
		}
				

	}
	
}


