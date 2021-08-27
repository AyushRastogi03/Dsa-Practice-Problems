package Topic2_BitMagicExercise;

import java.util.Scanner;

public class SwapAllOddnEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc = new Scanner(System.in);
		 
		 int s = sc.nextInt() ;
		 
		 while(s--> 0 ) {
			 
			 int N = sc.nextInt() ;
			 
			 Swap sw = new Swap() ;
			 
			 System.out.println(sw.swaped(N));
		 }
	}

}

class Swap {
	public static int swaped(int n) {
		int f = 0xAAAAAAAA & n ;
		f = f >>1 ;
		
		int g = 0x55555555 & n ;
		g = g<<1 ;
		
		return f^g ;
	}
}
