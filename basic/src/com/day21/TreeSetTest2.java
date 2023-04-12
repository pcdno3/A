package com.day21;

import java.util.Iterator;
import java.util.TreeSet;

class Person implements Comparable<Person>{
	private String name;
	private int age;
	
	Person(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	public String toString() {
		return "Person[ name = " + name + ", age + " + age + " ]";
	}
	
	public int compareTo(Person p) {
		//나이를 기준으로 정렬하도록 오버라이딩
		if(this.age > p.age) {
			return 1;
		}else if(this.age<p.age) {
			return -1;
		}else {
			return 0;
		}
		
		//0return this.age-p.age;
	}
}

public class TreeSetTest2 {

	public static void main(String[] args) {
		TreeSet<Person> tSet = new TreeSet<>();
		tSet.add(new Person("홍길등", 20));//errer;
		//ClassCastException: Person cannot be cast to class Comparable
		
		
		tSet.add(new Person("김길등", 17));
		tSet.add(new Person("이길등", 31));
		//Person인스턴스가 저장될 때마다 기존에 저장된 인스턴스와의 비교를 위해서
		//CompareTo() 메서드를 번번히 호출하여, 이때 반환되는 값을 기반으로 정렬을 진행
		Iterator<Person>  iter = tSet.iterator();
		
		while(iter.hasNext()) {
			Person p = iter.next();
			System.out.println(p);
		}
		
	}

}
