package com.day20.collection;

import java.util.ArrayList;

public class ArrayListTest2 {

	public static void main(String[] args) {
		/*
		 Generics 컬렉션
		 - JDK1.5에 추가된 기능
		 - 컬렉션에 저장할 객체의 타입을 지정
		 - 지정한 타입의 객체만 해당 컬렉션에 저장할 수 있다
		 - 꺼낼때는 자동으로 형변환해줌
		 
		 컬렉션클래스<저장할 객체의 타입> 변수명 = new 컬렉션클래스<저장할 객체의 타입>();
		*/
		
		//ArrayList<Integer> list = new ArrayList<>();  //가능
		ArrayList<Integer> list = new ArrayList<Integer>(3);
		
		System.out.println("list.size="+ list.size());  //0
		
		//저장
		list.add(10);  //autoboxing
		list.add(17);
		list.add(23);
		
		//참조 - 읽어오기
		for(int i=0;i<list.size();i++) {
			int k=list.get(i);  //형변환 안해도 됨, unboxing도 해줌
			System.out.println(k);
		}
		
		//삭제
		list.remove(1);  //index가 1인 데이터 삭제
		System.out.println("\n=======삭제 후======");
		for(int n : list) {
			System.out.println(n);
		}
		
		//for문에서 초기화
		ArrayList<Integer> list2 = new ArrayList<>(4);
		
		/*
		for(int i=0;i<list2.size();i++) {  //값이 들어가지 않음! - size가 0이므로
			list2.add(i+1); 
		}
		*/
		
		for(int i=0;i<4;i++) {  //초기화할때는 갯수를 직접 지정해야 함
			list2.add(i+1); 
		}//for
		
		System.out.println("\n=================");
		//읽어오기
		for(int n : list2) {
			System.out.print(n + " ");
		}
		
		System.out.println("\n\nlist2.size="+list2.size());
	}

}








