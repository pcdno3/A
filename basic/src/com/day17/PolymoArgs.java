package com.day17;
class Person {
	public String kind(){
	
		return "사람";
	}
};

class Student extends Person{
	
	public String kind(){
		return "학생";
	}
};

class Graduate extends Student	{
	public String kind()	{
		return "대학원생";
	}
};

class Assistant extends Person	{
	
	public String kind(){
		return "조교";
	}
};

class Professor extends Person	{
	
	public String kind()	{
		return "교수";
	}
}//

public class PolymoArgs {
	/*
	 * 
	public static void register(Student s) {
		System.out.println(s.kind() + "이/가 등록합니다.");
	}
	
	public static void register(Graduate s) {
		System.out.println(s.kind() + "이/가 등록합니다.");
	}
	
	public static void register(Assistant s) {
		System.out.println(s.kind() + "이/가 등록합니다.");
	}
	 */
	public static void register(Person p) {
		if(p instanceof Student || p instanceof Assistant) {
			System.out.println(p.kind() + "이/가 등록합니다");
		}else {
			System.out.println(p.kind() + "은/는 등록할 수 없습니다.");
		}
	}

	public static void main(String[] args) {
		
		Person[] pArr = {new Student(), new Graduate(), new Assistant()};
		
		for(int i=0; i<pArr.length; i++) {
			register(pArr[i]);
		}
	/*
	 	
		for(int i=0; i<pArr.length; i++) {
			if(pArr[i] instanceof Student) {
				Student s = (Student)pArr[i];
				register(s);
			}else if(pArr[i] instanceof Graduate){
				Graduate g = (Graduate)pArr[i];
				register(g);
			}else if(pArr[i] instanceof Assistant) {
				Assistant a = (Assistant)pArr[i];
				register(a);
	 */
				
			}
		}


	}

}
