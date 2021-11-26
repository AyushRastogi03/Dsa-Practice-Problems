package Topic3_RecursionExercise;

import java.util.Scanner;

public class LuckyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt() ;
		int i=2 ;
		while(t-- >0) {
			 
			int n  = sc.nextInt() ;
			System.out.println(new Solve().lucky(n,i));
		}

	}

}

class Solve{
	public static boolean lucky(int n,int i) {
		
	 if(n%i==0) {
		 return false;
	 }
	 if (i > n) return true;
	
	 int f = n- n/i ;
	
	 return lucky(f,i++);
	
	
	 
	}
}