package Topic2_BitMagicExercise;

import java.util.Scanner;

public class PowerOf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc  = new Scanner(System.in);
        int s = sc.nextInt() ;
        
        while(s-->0) {
        	int t = sc.nextInt() ;
        	
        	Power l = new Power() ;
        	
        	System.out.println(l.pow(t));
	}

}
}

class Power {
	public static int pow(int n) {
			        
		if(n==0) {
			return 0 ;
		}
		
		int t = n & (n-1) ;
		if(t==0) {
			return 1 ;
			
		}
		else {
			 return 0 ;
		}
		
	}
}
