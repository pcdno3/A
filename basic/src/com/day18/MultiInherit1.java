package com.day18;

interface TV2{
	public void onTV();
}

interface Computer2{
	void dataReceive();
}


//인터페이스는 다중 상속이 가능
class IPTV implements Computer2, TV2{
	public void dataReceive() {
		System.out.println("영상 데이터 수신 중");
	}
	
	public void onTV() {
		System.out.println("TV영상 출력 중");
	}
	
	public void powerOn() {
		dataReceive();
		onTV();
	}
	
}
public class MultiInherit1 {
	public static void main(String[] args) {
		IPTV obj = new IPTV();
		obj.powerOn();

	}

}
