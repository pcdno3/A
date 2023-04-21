import java.util.ArrayList;
import java.util.TreeSet;

public class HW0421 {

	public static void main(String[] args) {
		
		//numbers의 무작위 크기 지정
		int rnd1 = (int)(Math.random()*98+2);
		int[] numbers = new int[rnd1];
		//numbers의 무작위 값 넣기
		for(int i=2; i<numbers.length; i++) {
			int rnd2 = (int)(Math.random()*101);
			numbers[i]=rnd2;
		}
		
		ArrayList<Integer> result = new ArrayList<>();

		//result에 number[] 두개의수 뽑아서 더해서 넣기
		for(int i=2; i<numbers.length; i++) {
			for(int j=2; j<numbers.length; j++) {
				if(i!=j) {
					int sum = numbers[i] + numbers[j];
					result.add(sum);					
				}

			}

		}//바깥for
		
		//중복제외, 오름차순
		TreeSet<Integer> result2 = new TreeSet<>(result);
		ArrayList<Integer> result3 = new ArrayList<>(result2);
		
		
		//출력
		System.out.println("numbers");
		System.out.print("[");
		
		for(int i=2; i<numbers.length; i++) {
			System.out.print(numbers[i]);		
			if(i<numbers.length-1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
		
		System.out.println("result");
		System.out.print("[");
		for(int i=0; i<result3.size(); i++) {
			int re = result3.get(i);
			System.out.print(re);	
			
			if(i<result3.size()-1) {
				System.out.print(", ");
			}
		}		
		System.out.println("]");
		
		
		

	}
}
