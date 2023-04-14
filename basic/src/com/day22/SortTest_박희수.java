package com.day22;

import java.util.Arrays;
import java.util.Scanner;

class Sort{
	
	public void sort(int[] arr) {
		int temp=0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<i; j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}//밖for
	}
}

public class SortTest_박희수 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		
		System.out.println("5개의 숫자를 입력해주세요.");
		for(int i=0; i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		Sort s = new Sort();
		
		s.sort(arr);
		
		System.out.print("내림차순 정렬 : ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}

	}

}
