package com.day10;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortTest {

	public static void main(String[] args) {
		//public static void sort(int[] a)
		//	- 배열 오소를 오름차순으로 정렬하는 메서드
		int[] arr = {10,5,44,55,1000,140,3,55};
		
		for(int n : arr ) {
			System.out.print(n + " ");
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		
		Arrays.sort(arr);	//arr배열 요소들 정렬
		
		System.out.println("\n\n=======정렬 후 배열 요소들=======");
		for(int n : arr) {
			System.out.print(n + " ");
		}
		
		/*
		 	확장 for문
		 	- 특정 집합의 요소들을 반복처리할 때 사용
		 	- 배열이나 컬렉션의 모든 요소들을 순회할 때 많이 사용
		 	- 배열이나 컬렉션의 데이터가 있는 만큼 반복
		 	
		 	for(자료형 변수 : 배열){
		 	
		 	}
		 */
		System.out.println("\n\n==================");
		int[] num = {10,20,30,40};
		
		for(int n : num) {
			System.out.print(n + " ");
		}
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i] + " ");
		}
		
		System.out.println("\n\n==================");
		String[] sArr = {"java", "oracle", "spring"};
		
		for(String s : sArr) {
			System.out.print(s + " ");
		}
		for(int i=0; i<sArr.length; i++) {
			System.out.print(sArr[i] + " ");
		}

	}

}
