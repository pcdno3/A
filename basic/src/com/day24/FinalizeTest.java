package com.day24;

class MyTest{
	private String objName;
	
	MyTest(String name){
		this.objName=name;
	}
	
	//오버라이딩
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println(objName + "이 소멸됨!");
		
	}
	
}

public class FinalizeTest {

	public static void main(String[] args) {
		/*
		 finalize() - 인스턴스가 소멸되기 직전에 자바 가상머신에 의해서 자동으로 호출되는 메서드
		 */
		
		MyTest obj1 = new MyTest("인스턴스1");
		MyTest obj2 = new MyTest("인스턴스2");
		
		obj1 = obj2;   //obj1이 obj2를 가리키기 때문에 obj1의 값을 가리키는 것이 없기 때문에 obj1이 가비지
	    obj2 = null;   //obj1이 obj2를 가리키고 있기 때문에 obj2는 가비지가 되지 않는다
	    obj1 = null;   //obj1이 obj2를 가리키다가 null이 됐기 때문에 obj2도 가비지가 된다
		
		System.out.println("프로그램을 종료합니다.");
		
		System.gc();
		System.runFinalization();

	}

}
