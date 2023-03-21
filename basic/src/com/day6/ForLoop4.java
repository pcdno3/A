package com.day6;

public class ForLoop4 {

	public static void main(String[] args) {
		System.out.println("7의 배수이거나 9의 배수");
		for(int i=1; i<100; i++) {
			if(i%7==0 || i%9==0) {
				System.out.print(i + "\t");
				
			}
	 }
		System.out.println("\n");
		
	      //2. 7의 배수이자 9의 배수인 수는 한번만 출력하면 됨
	      int count = 0;
	      for(int i = 1; i < 100; i++) { //i가 100이 되기전까지 i + 1
	         if(i % 7 == 0 || i % 9 == 0) { //i / 7 = 0이거나 i / 9 = 0일때
	            System.out.print(i + "\t");
	            if(++count % 5 == 0) { //1씩 증가한 count / 5 = 0일때 System.out.println();을 한다
	               System.out.println();
	            }
	         }
	      }
	      
	      //1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수(2의 배수도 아니고, 3의 배수도 아닌 수)의 총합을 구하시오
	      int sum = 0;
	      
	      for(int i = 0; i <= 20; i++) { //i가 20보다 작거나 같을때까지 i + 1
	         if(!(i % 2 == 0 || i % 3 == 0)) { //(!)i에 2를 나누고 남은 값이 0이 아니거나 3을 나누고 남은 값이 0이 아닐때
	         sum += i;
	         }         
	      }
	      System.out.println("\n\n" + sum);      
	      
	      
	      //1 + (1 + 2) + (1 + 2 + 3) + (1 + 2 + 3 + 4) + ... + (1 + 2 + 3 ... + 10)의 결과를 계산하시오.
	      sum = 0;
	      for(int i = 0; i <= 10; i++) {
	         sum += i;
	      }
	      System.out.println("totalsum = " + sum);
	}
}