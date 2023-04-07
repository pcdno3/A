package com.day18.etc;

//과일 판매자 클래스(과일장사)
public class FruitSeller {
	private int numOfApple;	//사과의 개수
	private int myMoney;	//판매수익(남은 돈)
	private final int APPLE_PRICE;	//사과 하나의 가격
	
	public FruitSeller(int money, int numOfApple, int price) {
		this.myMoney=money;
		this.numOfApple = numOfApple;
		this.APPLE_PRICE=price;
		//=> final 상수 - 생성자에서 단 한번 초기화: 인스턴스별로 다른값 할당
	}
	/*
	 	public int saleApple(int money) {// 사과를 판매하는 메서드
		int num=money/APPLE_PRICE;
		numOfApple -= num;
		myMoney += money;
		return num;	//구매자에게 줄 사과갯수
		}
	 */
	/*
	  
	public int[] saleApple(int money) {// 사과를 판매하는 메서드
		int num=money/APPLE_PRICE;
		int change = money % APPLE_PRICE;
		numOfApple -= num;
		myMoney += money-change;
		int[] buyer = new int[2];
		buyer[0] = num;
		buyer[1] = change;
		
		return buyer;	//구매자에게 줄 사과갯수
			
	}
	 */
	public FruitResult saleApple(int money) {// 사과를 판매하는 메서드
		int num=money/APPLE_PRICE;
		int change = money % APPLE_PRICE;
		
		numOfApple -= num;
		myMoney += money-change;

		FruitResult result = new FruitResult(num, change);
		return result;	//구매자에게 줄 사과갯수
			
	}
		public void showInfo() {
			System.out.println("남은사과 : " + numOfApple);
			System.out.println("판매수익 : " + myMoney+"\n");
		}
}