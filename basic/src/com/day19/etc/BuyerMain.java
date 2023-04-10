package com.day19.etc;

import java.util.Scanner;

public class BuyerMain {
	
	public static void main(String[] args) {
		/*
		 Buyer b = new Buyer(1000);
		
		b.buy(new TV(100));
		b.showInfo();
		
		b.buy(new Computer(200));
		b.showInfo();
		
		b.summary();
		 */
		
		Scanner sc = new Scanner(System.in);
		Buyer b = new Buyer(1000);
		while(true) {
			System.out.println("1.상품구매 2.구매내역조회 3.종료");
			int type = sc.nextInt();
			
			switch(type) {
				case 1:
					
					System.out.println("구매할 상품 선택 1.TV 2.Computer");
					int k = sc.nextInt();
					if(k!=1 && k!=2) {
						System.out.println("잘 못 입력!");
						continue;
					}
					System.out.println("상품 가격 입력!");
					int price = sc.nextInt();
					
					Product p = null;
					if(k==1) {
						p = new TV(price);
					}else if(k==2) {
						p = new Computer(price);
					}
					b.buy(p);
					b.showInfo();
					break;

				case 2:
					System.out.println("구매내역 조회 !");
					b.summary();
					break;
				case 3:
					System.out.println("종료합니다!");
					return;
					
				default:
					System.out.println("잘 못 입력!");
					continue;

					
			}
			
		}
	}
}
