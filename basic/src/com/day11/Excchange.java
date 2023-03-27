package com.day11;

public class Excchange {

	public static void main(String[] args) {
		int[] coinUnit = {500, 100, 50, 10};
		int[] count = new int[4];
		int money = 3870;
		System.out.println("money="+money+"\n");
		for(int i=0;i<coinUnit.length;i++) {
			
			count[i]=money/coinUnit[i];
			money=money%coinUnit[i];
			
		}
		for (int i=0; i<count.length; i++) {
			System.out.println(coinUnit[i] + "원 : " + count[i]);
			
		}


	}

}
