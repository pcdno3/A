package com.day13;

import java.util.Scanner;

class FoodSale{
	
	String menu;
	private int quantity;
	private int price; 
	private double discount=0.15;
	
	public static int cellPrice;
	public static int totalPrice=0;
	
	FoodSale(String menu, int quantity, int price){
		this.menu=menu;
		this.quantity=quantity;
		this.price = price;	
	}
	
	public String getMenu(String menu) {
		return menu;
	}
	public void setMenu() {
		this.menu=menu;
	}

	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price=price;
	}
	
	public void cellPrice() {
		int salePrice = (int)(quantity * price * discount);
		int cellPrice = quantity * price - salePrice;
	}
	
	public int totalPrice() {
		return totalPrice+=cellPrice;
		
	}
	
	
}

public class FoodSaleMain {
	public static void main(String[] args) {
		for(;;) {
			
		Scanner sc = new Scanner (System.in);
		System.out.println("메뉴, 수량, 단가를 입력하세요!");
		String menu = sc.nextLine();
		int quantity = sc.nextInt();
		int price = sc.nextInt();
		
		FoodSale fs = new FoodSale(menu, quantity, price);
		
		fs.cellPrice();
		fs.totalPrice();
		
		System.out.println("판매가격 : " + fs.totalPrice());
		
		System.out.println("그만하시겠습니까?(Q)uit");
		sc.nextLine();
		String str=sc.nextLine();
		if(str.equalsIgnoreCase("Q")) 
			break;
		}
	}

}
