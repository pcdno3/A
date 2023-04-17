package HomeWork0417;

import java.util.Scanner;

public class HomeWork0417 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean bool = true;
		while(bool) {
			System.out.println("배열의 개수를 입력하세요<짝수로>");
			int num = sc.nextInt();
			if(num%2!=0) {
				System.out.println("짝수를 입력해주세요");
				return;
			}
			
			int[] arr = new int[num];
			for(int i=0; i<arr.length; i++) {
				int index=0;
				int ran = (int)(Math.random()*(num/2));
				if(arr[i]==ran) {
					index++;
				}
				
				System.out.print(arr[i] + " ");
				
			}
			

			
			
			System.out.println("\nQuit<Y/N>");
			sc.nextLine();
			String str = sc.nextLine();
			if(str.equalsIgnoreCase("Y")) {
				System.out.println("시스템을 종료합니다.");
				bool=false;
				return;
			}
			
			
		}//while

	}

}
