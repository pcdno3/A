package com.day21;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class MapeTest2 {

	public static void main(String[] args) {
		
		HashMap<String, String> map = new HashMap<>();
		
		map.put("apple", "사과");
		map.put("banana", "바나나");
		map.put("grape", "포도");
		
		//String value = map.get("apple");
		//System.out.println(value);
		Iterator<String> iter = map.keySet().iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			String value = map.get(key);
			
			System.out.println(key + " => " + value);
		}
		
		ArrayList<Character> chArr = new ArrayList<>();
		
		for(int i=65; i<91; i++) {
			chArr.add((char)i);
		}
		System.out.println("==ArrayList이용 기본for문==");
		for(int i=0; i<chArr.size(); i++) {
			char c = chArr.get(i);
			System.out.print(c + " ");
		}
		
		System.out.println("\n==ArrayList이용 확장for문==");
		for(char c : chArr) {
			System.out.print(c + " ");
		}
		HashMap<Integer, Character> map2 = new HashMap<>();
		
		for(int i=65; i<91; i++) {
			map2.put(i, (char)i);
		}
		
		System.out.println("\n===HashMap 이용 Iteratro====");
		Iterator<Integer> iter2 = map2.keySet().iterator();
		while(iter2.hasNext()) {
			
			int keys = iter2.next();
			char value = map2.get(keys);
			System.out.print(value + " ");
		}
		System.out.println("\n===HashMap 이용 for문====");
		for(int i=65; i<91; i++) {
			char value = map2.get(i);
			System.out.print(value + " ");
		}
		
		HashSet<Character> set = new HashSet<>();
		for(int i=65; i<91; i++) {
			set.add((char)i);
		}
		
		System.out.println("\n====HashSet 이용 Iterator====");
		Iterator<Character> iter3 = set.iterator();
		while(iter3.hasNext()) {
			char c = iter3.next();
			System.out.print(c + " ");
		}
		
	}

}
