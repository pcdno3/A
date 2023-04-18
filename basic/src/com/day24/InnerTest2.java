package com.day24;

public class InnerTest2 {
	private int outerIv=10;
	private static int outerCv=20;
	
	class InstanceInner{
		int iiv = outerIv;
		int iiv2 = outerCv;
	}
	
	static class StaticInner{
		//int siv = outerIv;	//error: 스태틱 클래스는 외부 클래스의 static 멤버만 접근할 수 있다.
		static int scv = outerCv;	
	}
	
	public void method() {
		int Iv=100;
		final int LV=200;
		
		class LocalInner{
			int liv = outerIv;
			int liv2 = outerCv;
			
			int liv3 = Iv;	//외부 클래스의 지역변수는 final이 붙은 변수(상수)만 접근가능하다.
							//=> JDK 8.0 부터는 지역변수도 접근 가능
			int liv4=LV;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
