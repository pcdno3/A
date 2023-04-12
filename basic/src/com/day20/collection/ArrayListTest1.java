package com.day20.collection;

import java.util.ArrayList;

public class ArrayListTest1 {

	public static void main(String[] args) {
		/*
		 컬렉션(Collection)
		 - 데이터의 저장을 위해 정의된 클래스
		 
		 프레임워크(Framework)
		 - 잘 정의된, 약속된 구조나 골격
		 모든 컬렉션 클래스를 표준화된 방식으로 다룰 수 있도록 체계화됨
		 
		 컬렉션 프레임워크
		 - 데이터 그룹을 저장하는 클래스들을 표준화한 설계
		 
		 컬렉션 - 배열과 달리 메모리의 사이즈를 동적으로 확장할 수 있다
		 
		 컬렉션 프레임워크의 핵심 인터페이스
		 -List, Set, Map
		 
		 1) List
		 - 순서가 유지됨, 데이터의 중복을 허용함
		 구현클래스 - ArrayList, Vector
		 
		 2) Set
		 - 순서를 유지하지 않음, 데이터의 중복을 허용하지 않음
		 구현클래스 - HashSet, TreeSet
		 
		 3) Map
		 - key, value쌍으로 이루어진 데이터의 집합
		 순서는 유지되지 않으며, 키는 중복허용하지 않고, 값을 중복 허용
		 구현클래스 - HashMap, Hashtable, Properties
		 
		 List,Set의 부모 : Collection		 
		*/
		
		ArrayList list = new ArrayList(3);
		//데이터 저장
		list.add(new Integer(10)); //JDK 5.0 이전 - 컬렉션에 값을 저장할 때 객체로 저장해야 
									//하므로, Wrapper클래스 사용
		list.add(new Integer(20));
		list.add(30); //JDK 5.0-autoboxing : 기본 자료형 값이 컴파일러에 의해서 자동으로
						//Wrapper 클래스로 변환되어 저장
		/*
		 Boxing - 스택에 저장된 기본자료형 데이터를 힙영역의 참조형으로 변환하는것
		 Unboxing - 참조형의 데이터를 기본형으로 변환
		*/

		System.out.println("ArrayList의 크기:"+ list.size()+"\n");
		
		//데이터 참조
		for(int i=0;i<list.size();i++) {
			Object obj = list.get(i);
			Integer n = (Integer)obj;
			System.out.println(n);
		}//for
		
		list.add(new Double(3.14));
		list.add("java");
		Object obj=list.get(3);
		Double d = (Double)obj;
		System.out.println("\n"+d);
	
		String str=(String)list.get(4);
		System.out.println("\n" + str);
		
	}

}










