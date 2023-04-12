package com.day21;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class EnumerationTest2 {

	public static void main(String[] args) {
		
		Double[] arr = {1.1, 2.2, 3.3, 4.4};
		System.out.println("===배열===");
		for(double d : arr) {
			System.out.print(d + " ");
		}
		
		ArrayList<Double> dList = new ArrayList<>();
		
		for(int i=0; i<4; i++) {
			dList.add(1.5+i);
		} 
		System.out.println("\n===for===");
		for(int i=0; i<dList.size();i++) {
			double d = dList.get(i);
			System.out.print(d + " ");
		}
		System.out.println("\n===확장for===");
		for(double d2 : dList) {
			System.out.print(d2 + " ");
		}
		
		HashSet<Double> set = new HashSet<>();
		for(int i=0; i<4; i++) {
			set.add(1.5+i);
		}
		System.out.println("\n===HashSet iterator<>===");
		Iterator<Double> iter = set.iterator();
		while(iter.hasNext()) {
			double d = iter.next();
			System.out.print(d + " ");
		}

	}

}
