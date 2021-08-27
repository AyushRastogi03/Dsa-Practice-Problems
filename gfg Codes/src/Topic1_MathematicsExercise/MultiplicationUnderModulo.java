package Topic1_MathematicsExercise;

import java.util.Scanner;

public class MultiplicationUnderModulo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
	     long a = sc.nextLong();
	     long  o = sc.nextLong();
	     
	     MultiplicationUnderModuloo(a,o);

       sc.close();
	}
	
	
	public static void MultiplicationUnderModuloo(long a,long b) {
		
		long c ;
		long m = 1000000007 ;
		
		c = (long)(((a%m)*(b%m))%m) ;
		
		System.out.println(c);
	}
  
}
