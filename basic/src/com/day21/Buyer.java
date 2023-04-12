package com.day21;

import java.util.ArrayList;

public class Buyer {
	private int myMoney;
	private int point;
	
	//구입한 상품을 저장할 배열 추가
	private ArrayList<Product> list = new ArrayList<>();
	//private int index;	//배열의 첨자로 사용될 변수
	
	//물건을 구매하는 메서드
	public Buyer(int money) {
		this.myMoney=money;
	}
	
	public void buy(Product p) {
		if(myMoney<p.getPrice()) {
			System.out.println("잔액이 부족합니다");
			return;
		}
		
		this.myMoney -=p.getPrice();
		this.point += p.getPoint();
				
		//구매한 상품을 배열에 저장한다
		list.add(p);
		System.out.println(p + "을(를) 구매하였습니다.");
	}
	
	
	public void showInfo() {
		System.out.println("현재 잔고 : " + myMoney);
		System.out.println("포인트 : " + point + "\n");
	}
	
	public void summary() {
		if(list.isEmpty()) {
			System.out.println("구매하신 제품이 없습니다.");
			return;
		}
		
		//구매한 상품명들과 상품 가격의 합게 출력
		int sum=0;
		String itemList="";
		
		for(int i=0; i<list.size(); i++) {
			Product p = list.get(i);
			sum += p.getPrice();
			itemList += p;	//"TV", "Computer"
			if(i<list.size()-1) {
				itemList+=",";
			}
					
			
		}
		
		System.out.println("\n구매하신 물건의 총 금액은 " + sum + "입니다.");
		System.out.println("구매하신 제품은 " + itemList + "입니다.");
	}
	
	public void refund(Product p) { //구입한 제품을 환불한다.
		//boolean remove(Object o)
		if(list.remove(p)) {
			myMoney += p.getPrice();
			point -= p.getPoint();
			System.out.println(p + "을/를 반품하셨습니다.");
		}else {
			System.out.println("구매하신 제품 중 해당 제품이 없습니다. 다시 확인하세요");
		}
	}
	
	
}
