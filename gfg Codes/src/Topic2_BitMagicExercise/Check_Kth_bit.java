package Topic2_BitMagicExercise;

import java.util.Scanner;

public class Check_Kth_bit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt() ;
		
		while(t-->0) {
			
			int N = sc.nextInt() ;
			int k = sc.nextInt() ;
			
			Solve s = new Solve() ;
			
			System.out.println(s.SetOrNot(N,k));
			
		}
		
		
		
	}

}

class Solve{
	 
	public static String SetOrNot(int n , int k) {
		
		if((n&(1<<k-1))!=0) {
			return "Yes";
		}
		
			return "No" ;
		
	}
}
