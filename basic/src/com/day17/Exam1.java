package com.day17;

public class Exam1 {
	//(1) action() 메서드를 작성하시오.
	static public void action(Robot arr) {
			if(arr instanceof DrawRobot) {
				DrawRobot dr = (DrawRobot)arr;
				dr.draw();
			}else if(arr instanceof SingRobot) {
				SingRobot s = (SingRobot)arr;
				s.sing();
			}else if(arr instanceof DanceRobot) {
				DanceRobot da = (DanceRobot)arr;
				da.dance();
			}
	}	

	public static void main(String[] args) {
		
		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot()};
		for(int i=0; i< arr.length;i++) {
			action(arr[i]);
			
		}
		//for문
		for(int i=0; i<arr.length; i++) {
			if(arr[i] instanceof DrawRobot) {
				DrawRobot dr = (DrawRobot)arr[i];
				dr.draw();
			}else if(arr[i] instanceof SingRobot) {
				SingRobot s = (SingRobot)arr[i];
				s.sing();
			}else if(arr[i] instanceof DanceRobot) {
				DanceRobot da = (DanceRobot)arr[i];
				da.dance();
			}
		}
		System.out.println("\n==========확장 for===============");
		for(Robot robot : arr) {
			if(robot instanceof DrawRobot) {
				DrawRobot dr = (DrawRobot)robot;
				dr.draw();
			}else if(robot instanceof SingRobot) {
				SingRobot s = (SingRobot)robot;
				s.sing();
			}else if(robot instanceof DanceRobot) {
				DanceRobot da = (DanceRobot)robot;
				da.dance();
			}
		}
		
		

	} // main


}
class Robot {}

class DanceRobot extends Robot {
		void dance() {
			
		System.out.println("춤을 춥니다.");
		}
}

class SingRobot extends Robot {
	
	void sing() {
		
	System.out.println("노래를 합니다.");
	
	}
}
class DrawRobot extends Robot {
	
	void draw() {
		
		System.out.println("그림을 그립니다.");
	}
}