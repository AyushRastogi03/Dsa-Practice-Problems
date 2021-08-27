package Topic2_BitMagic;

import java.util.Scanner;

public class OneOddOccuring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		
		
		
		// naive solution 
		System.out.println("Naive Solution");
		int c ;
		
		for(int i=0;i<arr.length;i++) {
			c=0 ;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					c++ ;
				}
			}
			if(c%2!=0) {
				System.out.println(arr[i]);
				break ;
			}
		}
		
		// better solution 
		
		System.out.println("Better Solution ");  // using xor 
		int res = 0 ;
		for(int i=0;i<arr.length;i++) {
			res = res ^ arr[i];
		}
		
		System.out.println(res);
		

	}

}
