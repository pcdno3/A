package com.day13;

import java.util.Scanner;

class Booksales{
	//1.멤버변수
	//인스턴스변수
	private String title;
	private int quantity, price, salesPrice;
	//static 변수
	private static int totalSalesPrice;//총 판매 금액
	//2.생성자
	
	Booksales(String title, int quantity, int price){
		this.title = title;
		this.quantity = quantity;
		this.price = price;

		
	}
	//3.getter /setter
	public int getSalesPrice() {
		return salesPrice;
	}
	public static int getTotalSalesPrice() {
		return totalSalesPrice;
	}
	//4.메서드
	public void findSalesPrice() {
		salesPrice = price * quantity;
	}
	
	public void findTotal() {
			totalSalesPrice +=salesPrice;
	}
}

public class BooksalesTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("책제목, 수량, 단가를 입력하세요!");
		String title = sc.nextLine();
		int quantity = sc.nextInt();
		int price = sc.nextInt();
		
		
		Booksales obj = new Booksales(title, quantity, price);
		obj.findSalesPrice();
		obj.findTotal();
		System.out.println("판매금액 = " + obj.getSalesPrice() + "누적판매금액 = " + Booksales.getTotalSalesPrice());
		
		System.out.println("그만하시겠습니까(Q)uit");
		sc.nextLine();
		String str = sc.nextLine();
		if(str.equalsIgnoreCase("Q")) break;
		
		
			
	}
}

