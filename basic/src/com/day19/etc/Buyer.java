package com.day19.etc;

public class Buyer {
	private int myMoney;
	private int point;
	
	//구입한 상품을 저장할 배열 추가
	private Product[] pdArr = new Product[10];
	private int index;	//배열의 첨자로 사용될 변수
	
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
		pdArr[index++] = p;
		System.out.println(p.kind() + "을(를) 구매하였습니다.");
	}
	
	
	public void showInfo() {
		System.out.println("현재 잔고 : " + myMoney);
		System.out.println("포인트 : " + point + "\n");
	}
	
	public void summary() {
		//구매한 상품명들과 상품 가격의 합게 출력
		int sum=0;
		String itemList="";
		
		for(int i=0; i<index; i++) {
			sum += pdArr[i].getPrice();
			itemList += pdArr[i].kind();
			if(i<index-1) {
				itemList+=",";
			}
					
			
		}
		
		System.out.println("\n구매하신 물건의 총 금액은 " + sum + "입니다.");
		System.out.println("구매하신 제품은 " + itemList + "입니다.");
	}
	
	
}
