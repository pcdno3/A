package com.day10;

import java.util.Arrays;
import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		for(;;) {
			
			// 1. 배열선언
			int[] Lotto = new int[6];
			
			//2. for()6번 1~45 랜덤값
			for(int i=0; i<6; i++) {			
			Lotto[i] = (int)(Math.random()*45+1);	
				for(int j=0; j<i; j++) {
					if(Lotto[j]==Lotto[i]) {
						i--;
						break;
					}//if
				}//안쪽for	
			}//바깥for
			/*				    j	    i
			 i=1 , j=0 		num[0] = num[1] 
			 
			 i=2 , j=0 		num[0] = num[2] 
			 i=2 , j=1 		num[1] = num[2] 
			 ...
			 i=5 , j=0 		num[0] = num[5] 
			 i=5 , j=1 		num[1] = num[5] 
			 i=5 , j=2 		num[2] = num[5] 
			 i=5 , j=3 		num[3] = num[5] 
			 i=5 , j=4 		num[4] = num[5] 
			 */
			
			//3.sort 처리
			Arrays.sort(Lotto);
			
			//4.출력
			System.out.print("로또 번호 : ");
			for(int n : Lotto) {
				System.out.print(n + " ");		
			}
			System.out.println("\n멈추시겠습니까? (Y/N)");
			String str=sc.next();
			if(str.equalsIgnoreCase("y"))break;
			else continue;
			
		
		}//무한for문

	}

}
