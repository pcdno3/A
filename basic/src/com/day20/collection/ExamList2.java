package com.day20.collection;

import java.util.ArrayList;

class Product{
	private String code;
	private String pdName;
	private int price;

	public Product(String code, String pdName, int price) {
		this.code = code;
		this.pdName = pdName;
		this.price = price;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getPdName() {
		return pdName;
	}

	public void setPdName(String pdName) {
		this.pdName = pdName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String toString() {
		return "Product [code=" + code + ", pdName=" + pdName + ", price=" + price + "]";
	}
}

public class ExamList2 {
	public static void main(String[] args) {
		ArrayList<Product> list = new ArrayList<Product>();

		list.add(new Product("A01", "삼성 노트북", 1900000));
		list.add(new Product("B01", "키보드", 27000));
		list.add(new Product("C01", "마우스", 16000));

		for(int i=0;i<list.size();i++) {
			Product p = list.get(i);

			System.out.println(p);			
		}

		System.out.println();

		for(Product p : list) {
			System.out.println(p);
		}

		//배열
		System.out.println("\n----배열---");

		Product[] arr = new Product[3];
		arr[0]=new Product("A01", "삼성 노트북", 1900000);
		arr[1]=new Product("A02", "LG 노트북", 1800000);
		arr[2]=new Product("A03", "델 노트북", 1600000);

		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

		System.out.println();
		for(Product p : arr) {
			System.out.println(p);
		}
	}

}
