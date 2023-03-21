package com.day7;

import java.util.Scanner;

public class WhileTest1 {

	public static void main(String[] args) {
		//boolean > 변수.hasNext(); 다음 데이터가 있으면 true 없으면 false
		//while에 사용되면 true 일땐 계속 false되면 중단.
		/*
		 while문 - 반복횟수가 가변적인 경우 적합
		 
		 while(반복 조건){
		 	반복 명령 :
		 }
		 =>조건을 만족하는 동안(true인 동안) 계속해서 반복처리
		 조건이 거짓이 되면 반복문을 빠져나옴(break;)
		 */
	
		Scanner sc = new Scanner("\n\n가나다 하나 둘\n\n라\n\n");
		String str="";			/*
											 \n
											 \n
										 가나다 하나 둘\n
											 \n
							  			 	라\n
		 */
		//public boolean hasNext()
		while(sc.hasNext()){
			
			str=sc.nextLine();
			System.out.println("출력:" + str);
			
		}//while
		
		str=sc.nextLine();
		System.out.println("while 탈출 후 1 : " + str);
		
		//str=sc.nextLine(); //실행에러, No line fountd
		//System.out.println("while 탈출 후 2 : " + str);

		System.out.println("\n==========next()============");
		
		sc = new Scanner("\n\n가나다 하나 둘\n\n라\n\n");
		str="";
		//public boolean hasNext()
		while(sc.hasNext()){
			
			str=sc.next();
			System.out.println("출력:" + str);
			
		}//while
		
		str=sc.nextLine();
		System.out.println("while 탈출 후 1 : " + str);
		
		str=sc.nextLine();
		System.out.println("while 탈출 후 2 : " + str);
		
		//str=sc.nextLine(); //실행에러, No line found
		//System.out.println("while 탈출 후 3 : "+ str);
		
		System.out.println("\n==========next()============");
		
		sc = new Scanner("\n\n123 45 67\n\n890\n\n");
		str="";
		//public boolean hasNext()
		while(sc.hasNext()){
			
			int k=sc.nextInt();
			System.out.println("출력:" + k);
			
		}//while
		
		str=sc.nextLine();
		System.out.println("while 탈출 후 1 : " + str);
		
		str=sc.nextLine();
		System.out.println("while 탈출 후 2 : " + str);
		
		str=sc.nextLine(); //실행에러, No line found
		System.out.println("while 탈출 후 3 : "+ str);


		

	}

}
