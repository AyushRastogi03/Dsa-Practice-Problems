package Topic3_Recursion;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in) ;
		
		int s = sc.nextInt() ;
		
		
		D2B(s) ;
      
		sc.close();
	}
   
	public static void D2B(int n) {
		if(n==0) {
			return ;
		}
		D2B(n/2);
		System.out.print(n%2);
		
	}
	
}
