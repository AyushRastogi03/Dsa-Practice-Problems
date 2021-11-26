package Topic3_RecursionExercise;

import java.util.Scanner;

public class FibonacciUSingRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt() ;
		
		while(t-- >0) {
			 
			int n  = sc.nextInt() ;
			System.out.println(new Solz().num(n));
		}

	}

}

class Solz{
	public static int num(int n) {
	 
		if(n==0) {
			return 0;
		}
		if(n==1) {
			return 1 ;
		}
		
		return  num(n-1) + num(n-2); 
		
	}
}