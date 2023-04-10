package com.day19.etc;

abstract public class Product {
	private int price; //상품의가격
	private int point;	//포인트점수
	private final double POINT_RATE=0.02;	//가격의 2%가 포인트 점수
	
	public Product(int price) {
		this.price=price;
		this.point=(int)(price*POINT_RATE);
	}
	
	public int getPrice() {
		return price;
	}
	
	public int getPoint() {
		return point;
	}
	
	public abstract String kind();


}

class TV extends Product{
	
	TV(int price){
		super(price);
	}
	
	public String kind() {
		return "TV";
	}
	
}

class Computer extends Product{
	
	Computer(int price){
		super(price);
	}
	
	public String kind() {
		return "Computer";
	}
	
}
