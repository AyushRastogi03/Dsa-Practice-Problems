package Topic3_RecursionExercise;

import java.util.Scanner;

public class JosephousProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt() ;
		
		
		while(t-- >0) {
			 
			int n  = sc.nextInt() ;
			int f = sc.nextInt() ;
			System.out.println(new Jop().jo(n,f));
		}

	}

}

class Jop{
	public static int jo(int n,int f) {
	
		if(n==1) {
			
			return 1 ;
		}
		
		return ((jo(n-1,f)+f-1)%n) +1 ;
		
	}
}