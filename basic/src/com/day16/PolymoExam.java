package com.day16;

import java.util.Scanner;

class Animal{
	   public void bark(){
	      System.out.println("울다");
	   }
	   public void parent(){
	      System.out.println("난 부모-동물");
	   }
	}

class Cat extends Animal{
	   public void bark()   {
	      System.out.println("야옹야옹");
	   }
	   public void child()   {
	      System.out.println("난 자식-고양이");
	   }
	}

class Cow extends Animal{
	   public void bark()   {
	      System.out.println("음메음메");
	   }
	}

class Dog extends Animal{
	   public void bark()   {
	      System.out.println("멍멍");
	   }
	}


public class PolymoExam {

	public static void main(String[] args) {
		//1. 다향성 기본
		Animal ani = new Cat();
		ani.bark();		//자식메서드
		ani.parent();	//부모 메서드
		//ani.child();
		
		ani = new Cow();
		ani.bark();	//자식메서드
		
		ani = new Dog();
		ani.bark();	//자식메서드
		
		
		//2. 사용자 입력받기, 다향성 이용
		Scanner sc = new Scanner(System.in);
		System.out.println("울음소리를 1. 고양이 2.소 3.강아지 입력해주세요");
		int type = sc.nextInt();
		
		Animal ani2=null;
		
		if(type==1) {
			ani2 = new Cat();
		}else if(type==2) {
			ani2 = new Cow();
		}else if(type==3) {
			ani2 = new Dog();
		}else {
			System.out.println("잘못 입력!");
			return;
		}
		
		ani2.bark();
		
		
		//메서드 이용
		Animal ani3 = createAnimal(type);
		
		if(ani3!=null) {
			ani3.bark();
		}else {
			System.out.println("잘못입력 !");
			return;
		}
		
		//다형성 이용한 배열 이용
		Animal[] ani4 = new Animal[3];
		ani4[0] = new Cat();
		ani4[1] = new Cow();
		ani4[2] = new Dog();
		
		for(Animal a : ani4) {
			a.bark();
		}
	}
	public static Animal createAnimal(int type) {
		Animal ani3 = null;
		if(type==1){
			ani3 = new Cat();
		}else if(type==2) {
			ani3 = new Cow();
		}else if(type==3) {
			ani3 = new Dog();
		}
		return ani3;
	}

}
