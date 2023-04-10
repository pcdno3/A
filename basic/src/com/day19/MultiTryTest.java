package com.day19;

import java.util.InputMismatchException;

public class MultiTryTest {

	public static void main(String[] args) {
		/*
		 다중 catch문
		 - try문에서 여러 개의 예외가 발생할 수 있을 때는 여러 개의 catch문을 나열하고
		 	각각 다르게 처리할 수 있다
		 - 발생한 예외의 종류와 일치하는 단 한개의 catch블럭만 수행됨
		 - catch에서 예외는 자식에서 부모 순으로 와야 함
		 */
		try {
		
		}catch(ArithmeticException e) {
			System.out.println("예외 : 0으로 나누면 안됨!" + e.getMessage());
		}catch(InputMismatchException e) {
			System.out.println("정수만 입력해야 함 !" +  e.getMessage());
		}catch(Exception e) {
			System.out.println("예외 발생 : " + e.getMessage());
		}
		
		System.out.println("\n==========next!==========");
	}

}
