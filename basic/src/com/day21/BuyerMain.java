package com.day21;

public class BuyerMain {

	public static void main(String[] args) {
		Buyer b = new Buyer(1000);
		
		//200만원 TV구매
		Product p1 = new TV(200);
		b.buy(p1);
		//150만원 Computer 구매
		Product p2 = new Computer(150);
		b.buy(p2);
		//300만원 TV구매
		Product p3 = new TV(300);
		b.buy(p3);
		//200만원인 TV반품
		b.refund(p1);
		
		
		b.showInfo();
		b.summary();
	}

}
