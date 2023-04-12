package com.day21;

import java.util.ArrayList;
import java.util.Scanner;

class Score{
	private int sum;
	private double average;
	
	public int getSum() {
		return sum;
	}
	
	public double getAverage() {
		return average;
	}
	
	public void findTotal(ArrayList<Integer> list) {
		sum=0;
		for(int i=0; i<list.size(); i++) {
			sum +=list.get(i);
		}//for
		
	}
	
	public void fintAverage(ArrayList<Integer> list) {
		findTotal(list);
		
		average = (double)sum/list.size();
	}
}

public class ArrayListScore {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Score s = new Score();
		System.out.println("국어, 영어, 수학 점수를 입력하세요.");
		ArrayList<Integer> list = new ArrayList<>(3);
		for(int i=0; i<3; i++) {
			list.add(sc.nextInt());			
		}
		System.out.print("국어, 영어, 수학 점수 : ");
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		
		s.findTotal(list);
		s.fintAverage(list);
		
		System.out.println("\n총점 = " + s.getSum() + " 평균 = " + s.getAverage());
	}

}
