package Topic2_BitMagicExercise;

import java.util.Scanner;

public class BinaryToGrey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc  = new Scanner(System.in);
        int s = sc.nextInt() ;
        
        while(s-->0) {
        	int t = sc.nextInt() ;
        	
        	B2G l = new B2G() ;
        	
        	System.out.println(l.Convert(t));
	}

}
}

class B2G {
	public static int Convert(int n) {
			        
		return n ^ (n >> 1);
		
	}
}
