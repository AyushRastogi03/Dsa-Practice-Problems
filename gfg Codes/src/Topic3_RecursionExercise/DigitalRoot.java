package Topic3_RecursionExercise;

import java.util.Scanner;

public class DigitalRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc  = new Scanner(System.in);
		   
		    int t = sc.nextInt() ;
		    
		    while(t-- >0) {
				 
				int n  = sc.nextInt() ;
				System.out.println(new Solu().digital(n));
			}
			}
	

}

class Solu{
	
	public static int digital(int n) {
		
		if(n<10) {
			return n ;
		}
		
		int f = sum(n);
		
		return digital(f);
		
	}
	
	public static int sum(int n) {
		if(n==0) {
			return 0 ;
		}
		
		return n%10 + sum(n/10); 
	}
}
