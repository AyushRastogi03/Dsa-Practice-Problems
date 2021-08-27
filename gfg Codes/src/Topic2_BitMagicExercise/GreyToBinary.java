package Topic2_BitMagicExercise;

import java.util.Scanner;

public class GreyToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc  = new Scanner(System.in);
        int s = sc.nextInt() ;
        
        while(s-->0) {
        	int t = sc.nextInt() ;
        	
        	G2B l = new G2B() ;
        	
        	System.out.println(l.Convert(t));
	}

}
}

class G2B {
	public static int Convert(int n) {
			int res =n ;        
		while(n>0) {
		  
			n = n>>1 ;
			res = res^n ;
			
			
		}
		return res ;
		
	}
}
