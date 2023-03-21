package com.day7;

public class WhileTest3 {

	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=100;i++) {
			
			if(i%3==0 || i%5==0) {
				sum+=i;
				
			}
		}
			System.out.println("3의 배수와 5의 배수의 합 : " +sum);
			
			
		sum=0;
		int k=0;
		while(k<=100) {
			k++;
			if(k%5==0 || k%3==0 ) {
				sum+=k;
			}
		}
			System.out.println("3의 배수와 5의 배수의 합 : " +sum);

	}

}
