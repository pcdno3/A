package com.day15;

import java.util.*;

class Car {
	private String color;	// 색상
	private String gearType;	// 변속기 종류 - auto(자동), manual(수동)
	private int door;		// 문의 개수

	Car() {
		this("gray", "auto", 2);

	}
	Car(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	public void showInfo(){
		System.out.println("color:" + color + ", gearType:" + gearType+ ", door:"+door);
	}
}
public class Exam1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	}
}