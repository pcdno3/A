package com.day21;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest1 {

	public static void main(String[] args) {
		/*
		 TreeSet - Set 인터페이스 구현체
		 		 - 데이터를 정렬된 상태로 유지함
		 		 
		 */
		
		TreeSet<Integer> tSet = new TreeSet<>();
		tSet.add(1);
		tSet.add(5);
		tSet.add(2);
		tSet.add(3);
		tSet.add(2); //저장될때마다 데이터가 정렬됨
		
		System.out.println("데이터 개수 : " + tSet.size());
		
		Iterator<Integer> iter = tSet.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		//Integer의 정렬 기준 - 숫자의 크고 작음을 기준으로 정렬됨
		
		TreeSet<String> set = new TreeSet<>();
		set.add("홍길동");
		set.add("이길동");
		set.add("김길동");
		set.add("xyz");
		set.add("ab");
		set.add("java");
		set.add("JAVA");
		set.add("C");
		set.add("SPRING");
		set.add("7");
		set.add("4");
		set.add("1");
		
		Iterator<String> iter2 = set.iterator();
		while(iter2.hasNext()) {
			String s = iter2.next();
			System.out.println(s);
		}
	}

}
