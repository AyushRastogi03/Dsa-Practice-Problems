package Topic3_RecursionExercise;

import java.util.Scanner;

public class PowerUsingRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt() ;
		
		while(t-- >0) {
			 
			int n  = sc.nextInt() ;
			int p = sc.nextInt() ;
			System.out.println(new Pow().p(n,p));
		}

	}

}

class Pow{
	public int p(int n,int p) {
		
		if(p==0) {
			return 1;
		}
		
		return n*p(n,p-1);
	
	}
}