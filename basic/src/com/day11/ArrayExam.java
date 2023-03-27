package com.day11;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int fstScore = 0;
		int sndScore = 0;
		
		int[] score = new int[10];
		int temp=0;
		for(int i=0; i<score.length; i++) {
			System.out.println("점수를 입력하세요");
			score[i] = sc.nextInt();
			
			if(score[i]>fstScore) {
				sndScore = fstScore;
			}else if(score[i]>sndScore) {
				sndScore=score[i];
			}
		}//for
		System.out.println("A학점은 "+ sndScore +"점 이상이 되어야 합니다.\n");
			}
			
		}
	
