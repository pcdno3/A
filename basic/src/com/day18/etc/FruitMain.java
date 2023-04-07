package com.day18.etc;

public class FruitMain {

	public static void main(String[] args) {
		FruitBuyer buyer = new FruitBuyer(10000);
		/*
		  두 명의 과일 장사가 있고, 이들의 판매내용
	 과일장사1 : 보유하고 있는 사과의 개수는 30개, 개당 가격은 1500원
	 과일장사2 : 보유하고 있는 사과의 개수는 20개, 개당 가격은 1000원
		 */
		
		FruitSeller seller = new FruitSeller(0, 30, 1500);
		FruitSeller seller2 = new FruitSeller(0, 20, 1000);
		buyer.buyApple(seller, 4500);
		buyer.buyApple(seller2, 2000);
		
		
		seller.showInfo();
		seller2.showInfo();
		System.out.println("\n========구매자의 현재 상황========");
		buyer.showInfo();
		
		//seller1에게 2000원 어치 사과 구매
		buyer.buyApple(seller, 2000);
		System.out.println("====구매자 현재 상황====");
		buyer.showInfo();
		System.out.println("seller 현재 상황");
		seller.showInfo();
		
		//seller2에게 5000원 어치 사과 구매
		buyer.buyApple(seller2, 5000);
		
	}

}
