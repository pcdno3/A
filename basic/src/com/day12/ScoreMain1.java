package com.day12;

import java.util.Scanner;

class Score{
	int kor;
	int eng;
	int math;
	
	Score (int k, int e, int m){
		kor=k;
		eng=e;
		math=m;
	}
	
	public int findTotal() {
		int total = kor + eng + math;
		return total;
	}
	
	public float findAvg() {
		
		float avg =findTotal()/3f;
		return avg;
	}
	
	
}
public class ScoreMain1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 , 영어, 수학 점수를 입력해주세요");
		int kor= sc.nextInt();
		int eng= sc.nextInt();
		int math= sc.nextInt();
		
		Score sco = new Score(kor, eng, math);
		
		System.out.println("총점 = " + sco.findTotal() + ", 평균 = " + sco.findAvg());
		
	}

}
