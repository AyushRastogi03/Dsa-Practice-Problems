package Topic3_Recursion;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); 
		
		int t = sc.nextInt() ;
		
		
		int sum = Sum(t);
      
		 System.out.println("Sum - " + sum);
	}
	
	public static int Sum(int t) {
		
		if(t<=9) {
			return t ; 
		}
		
		return t%10 + Sum(t/10);
		
	}

}
