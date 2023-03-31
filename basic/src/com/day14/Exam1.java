package com.day14;

class FoodSale{
	private String menu;
	private int quantity;
	private int cost;
	private int price;
	
	public static double sale=0.1;
	public static int totalprice;
	
	FoodSale(String menu, int Quantity, int cost, int price){
		this.menu=menu;
		this.quantity=quantity;
		this.cost=cost;
		this.price=price;
	}
	
	public double SalePrice() {
		double saleprice = (double)(quantity*cost*sale);
	}
}
public class Exam1 {

	public static void main(String[] args) {
		

	}

}
