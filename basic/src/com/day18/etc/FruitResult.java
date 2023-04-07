package com.day18.etc;

public class FruitResult {
	private int num;	//사과개수
	private int change;	//거스름돈
	
	public FruitResult(int num, int change) {
		this.num=num;
		this.change=change;
	}

	public int getNum() {
		return num;
	}
	
	public int getChange() {
		return change;
	}
}
