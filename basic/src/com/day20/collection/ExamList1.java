package com.day20.collection;

import java.util.ArrayList;

public class ExamList1 {

	public static void main(String[] args) {
		ArrayList<Double> list=new ArrayList<Double>(4);
		list.add(3.14);
		list.add(5.87);
		list.add(2.476);

		for(int i=0; i<list.size(); i++){
			double num = list.get(i);
			System.out.println(num);
		}
		
		System.out.println();
		
		for(double n : list) {
			System.out.println(n);
		}
		
		System.out.println();
		ArrayList<String> slist=new ArrayList<String>(6);
		for(int i=0; i<5; i++){
			slist.add(i+1+" : Hello Java");
		}

		for(int i=0; i<slist.size(); i++){
			String str = slist.get(i);
			System.out.println(str);
		}
		
		System.out.println();
		
		for(String s : slist) {
			System.out.println(s);
		}
	}

}
