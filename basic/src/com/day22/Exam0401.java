package com.day22;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;
abstract class Product{
	private int price;  //상품의 가격
	private int bonusPoint;  //포인트 점수
	private final double POINT_RATE=0.02;  //가격의 2%가 포인트점수

	Product(int price){
		this.price=price;
		this.bonusPoint = (int)(price*POINT_RATE);
	}

	public int getPrice(){
		return price;
	}

	public int getBonusPoint(){
		return bonusPoint;
	}	
}//class

class TV extends Product{
	TV(int price){
		super(price);
	}

	public String toString(){
		return "TV";
	}
}

class Computer extends Product{
	Computer(int price){
		super(price);
	}

	public String toString(){
		return "Computer";
	}
}


class Buyer {	// 고객, 물건을 사는 사람
	private int money = 1000;		// 소유금액-1000만원
	private int bonusPoint = 0;		// 보너스점수
	private ArrayList<Product> item = new ArrayList<Product>();// 구입한 제품을 저장하는데 사용될 ArrayList객체

	public void buy(Product p) {
		//1) 가진 돈에서 구입한 제품의 가격을 뺀다.
		money -= p.getPrice();

		//2) 제품의 보너스 점수를 추가한다.
		bonusPoint += p.getBonusPoint();

		//3) 구입한 제품을 ArrayList에 저장한다.
		item.add(p);

		System.out.println(p + "을/를 구입하셨습니다.");
	}

	public void refund(Product p) {// 구입한 제품을 환불한다.
		//4) 제품을 ArrayList에서 제거한다.
		if(                        ) {	
			//5) 구입한 제품의 가격만큼 가진 돈이 늘어난다
 

			//6) 제품의 보너스 점수만큼 포인트가 감소한다.
			

			System.out.println(p + "을/를 반품하셨습니다.");
		} else {	//  제거에 실패한 경우
			System.out.println("구입하신 제품 중 해당 제품이 없습니다.");		
		}
	}	

	public void summary() {     // 구매한 물품에 대한 정보를 요약해서 보여준다.
		int sum = 0;	 // 구입한 물품의 가격합계
		String itemList ="";  // 구입한 물품목록

		// 반복문을 이용해서 구입한 물품의 총 가격과 목록을 만든다.		
		//7) ArrayList가 비어있는지 확인한다.
		if(item.isEmpty()) {	 
			System.out.println("구입하신 제품이 없습니다.");
			return;
		}

		//8) 구입한 상품의 총금액과 구매상품 목록을 구한다
		





		System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
		System.out.println("구입하신 제품은 " + itemList + "입니다.");
	}
}



public class Exam0401 {

	public static void main(String[] args) {
		TreeSet<Integer> lotto = new TreeSet<>();
		for(int i=0; i<6; i++) {
			lotto.add((int)(Math.random()*45+1));
		}
		
		Iterator<Integer> iter = lotto.iterator();
		while(iter.hasNext()) {
			int num = iter.next();
			System.out.print(num + " ");
		}
		
	}
}

