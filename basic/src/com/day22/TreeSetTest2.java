package com.day22;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest2 {

	public static void main(String[] args) {
		
		TreeSet<Integer> set = new TreeSet<>();
		
		while(set.size()<6) {
			int num = (int)(Math.random()*45)+1;
			set.add(num);
		}//while
		
		Iterator<Integer> iter = set.iterator();
		while(iter.hasNext()) {
			int num = iter.next();
			System.out.print(num + " ");
		}
		
	}

}
