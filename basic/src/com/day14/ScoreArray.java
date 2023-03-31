package com.day14;

import java.util.Scanner;

import javax.swing.Scrollable;

class Score{
	//멤버변수
	private int[] subject;
	
	//생성자
	Score(int[] subject){
		this.subject = subject;
	}
	//getter/setter
	public int[] getSubject() {
		return subject;
	}
	
	public void setSubject(int[] subject) {
		this.subject = subject;
	}
	
	public int totalSubject() {
			int sum=0;
		for(int i=0;i<subject.length;i++) {
			sum+=subject[i];
		}
		return sum;
	}
	
	public double avg() {
		double avg;
		int sum = totalSubject();
		avg = (double)sum/subject.length;
		return avg;
	}
	
	//메서드
}
public class ScoreArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[3];
		
		for(int i=0; i<arr.length;i++) {
			System.out.println("국어, 영어, 수학 점수를 입력하세요");
			arr[i] = sc.nextInt();
		}
		Score sco = new Score(arr);
		System.out.println("총점 =  "+sco.totalSubject() + ", 평균 = " + sco.avg());
		
		
		//getter이용해서 점수 출력하기
		int[] subject = sco.getSubject();
		for(int i =0; i<subject.length;i++) {
			System.out.println("국어, 영어, 수학 점수를 입력하세요");
			subject[i]=sc.nextInt();
		
		sco.setSubject(subject);
		
		System.out.println("총점 = " + sco.totalSubject() + ", 평균 = " + sco.avg());
		
	}

}
