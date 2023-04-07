package com.day18.etc;


//과일 구매자 클래스(나)
public class FruitBuyer {
		private int myMoney;	//남은돈
		private int numOfApple;	//구매한 사과 개수
		
		public FruitBuyer(int money) {
			myMoney = money;
		}
		/*
		 
		public void buyApple(FruitSeller seller, int money) {	//사과를 구매하는 메서드
			//사과를 구매하는데 있어서 필요한 것 - 구매대상, 구매금액 => 매개변수로 전달되어야 함
			//seller 아저씨, 사과 2000원어치 주세요
			if(this.myMoney<money) {
				System.out.println("잔액 부족!");	
			}else {
				int[] num = seller.saleApple(money);
				numOfApple += num[0];
				myMoney -= (money-num[1]);
			}
		}
		 */
		
		public void buyApple(FruitSeller seller, int money) {	//사과를 구매하는 메서드
			//사과를 구매하는데 있어서 필요한 것 - 구매대상, 구매금액 => 매개변수로 전달되어야 함
			//seller 아저씨, 사과 2000원어치 주세요
			if(myMoney<money) {
				System.out.println("잔액 부족!");	
				return;
			}else {
				FruitResult result = seller.saleApple(money);
				int num = result.getNum();
				int change = result.getChange();
				numOfApple += num;
				myMoney -= change;
			}
		}
		public void showInfo() {
			System.out.println("현재 잔액 : " + myMoney);
			System.out.println("사과 갯수 : " + numOfApple);
		}


}
