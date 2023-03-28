package com.day12;

class Account {   
   //1. 멤버변수 선언
   String accId;   //계좌번호
   String name;   //이름
   int balance;   //잔액
  
   //2. 생성자 
   /*
     생성자
      - 멤버변수의 초기화를 목적으로 정의되는 메서드
      - 객체가 생성될 때 자동 호출되어 가장 먼저 실행되는 메서드
      
      클래스 이름과 동일한 이름의 메서드
      매게변수는 가질 수 있으나 변환값은 가질 수 없다
      
      기본생성자(매개변수 없는 생성자) - 컴파일러에 의해 자동으로 만들어지나
      	다른 생성자가 있으면 컴파일러에 의해 기본생성자가 만들어지지 않는다
      	
    */
   
   //기본생성자
   Account(){
	   
   }
   Account(String p_accId, String p_name, int p_balance){
	   accId = p_accId;
	   name  = p_name;
	   balance = p_balance;
   }
   
   //3. 메서드 선언
   //입금하다
   public void deposit(int money) {
      balance+=money;
   }

   //출금하다
   public void withdraw(int money) {
      balance-=money;             
   }

   public void showInfo() {
      System.out.println("계좌번호 : " + accId);
      System.out.println("이름 : " + name );
      System.out.println("잔액 : " + balance+"\n");      
   }
}


public class AccountMain {
   public static void main(String[] args) {
      //객체 생성
      Account acc2 = new Account("100-001-2000", "홍길동", 100000);
      /*
        
        new 클래스명(이부분) 이 생성자 호출하는 부분
        - 매개변수를 넣어주면 된다
       */
      
      //메서드 사용
      acc2.withdraw(30000); //30000원 출금
      acc2.showInfo();
      
      Account acc = new Account();
      acc.showInfo();
   }
}