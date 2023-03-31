package com.day14;

/*
 	오버라이딩
  	- 자식클래스에서 부모로부터 상속받은 메서드의 내용을 변경하는 것
 */

//2차원 좌포계의 한 점을 표현
class Point{
	protected int x;
	protected int y;
	
	public String findLocation() {
		String result="x="+", y="+y;
		return result;
	}
}

class Point3D extends Point{
	private int z;
	
	//오버라이딩
	public String findLocation() {
		String result="x="+"x, y="+y+", z="+z;
		return result;
	}
	
	/*
	 	오버라이딩의 조건
	 	-메서드의 선언부는 부모의 것과 완전히 일치해야 함
	 	=> 이름, 매개변수, 반환타입이 같아야 함
	 	
	 	-접근 제한자는 부모 메서드보다 좁은 범위로 변경할 수 없다
	 	예) 부모 메서드가 protected라면 오버라이딩하는 자식 메서드는 protected나 public이여야함
	 	
	 	- 부모 메서드보다 많은 수의 예외를 선언할 수 없다
	 	
	 */
}

public class OverridingTest1 {

	public static void main(String[] args) {
		
		Point3D p = new Point3D();
		System.out.println("3차원 좌표 : " + p.findLocation());
		Point p2 = new Point();
		System.out.println("2차원 좌표 : " + p2.findLocation());

	}

}
