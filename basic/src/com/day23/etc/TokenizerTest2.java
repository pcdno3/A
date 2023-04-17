package com.day23.etc;

import java.util.StringTokenizer;

public class TokenizerTest2 {

	public static void main(String[] args) {
		String str = "1,홍길동,100,90,80|2,김길동,95,85,75|3,이길동,88,77,66";
		
		StringTokenizer st = new StringTokenizer(str, "|");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			//System.out.println(token);
			StringTokenizer st2 = new StringTokenizer(token, ",");
			while(st2.hasMoreTokens()) {
				String token2 = st2.nextToken();
				System.out.print(token2 + "\t");
			}
			System.out.println("\n");
		}//while
		
		
		String str2 = "1,홍길동,100,90,80|2,김길동,95,85,75|3,이길동,88,77,66";
		String[] sArr = str2.split("\\|");
		
		for(String s : sArr) {
			//System.out.println(s);
			
			
			String[] sArr2 = s.split(",");
			
			for(String ss : sArr2) {
				
				System.out.print(ss + "\t");
			}
			System.out.println();
		}
			

		
	
		

		
	}

}
