package Topic3_RecursionExercise;

import java.util.Scanner;

public class SumOfDigitOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt() ;
		
		while(t-- >0) {
			 
			int n  = sc.nextInt() ;
			System.out.println(new Sol().sum(n));
		}

	}

}

class Sol{
	public static int sum(int n) {
		
		
		if(n==0) {
			return 0 ;
		}
		
		return n%10 + sum(n/10); 
	}
}