package com.day24;

class Outer{
	class InstanceInner{
		int iv=100;
	}
	
	static class StaticInner{
		int iv =200;
		static int cv=300;
	}
	
	public void method() {
		class LocalInner{
			int iv = 400;
		}
	}
}

public class InnerTest3 {

	public static void main(String[] args) {
		System.out.println("Outer.StaticInner.cv : " + Outer.StaticInner.cv);
		
		Outer.StaticInner si = new Outer.StaticInner();
		System.out.println("si.iv =" + si.iv);
		
		Outer oc = new Outer();
		Outer.InstanceInner ii = oc.new InstanceInner();
		System.out.println("ii.iv=" + ii.iv);

	}

}
