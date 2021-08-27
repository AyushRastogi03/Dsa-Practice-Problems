package Topic1_MathematicsExercise;

import java.util.Scanner;

public class GPTerm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       
       int a = sc.nextInt();
       int b = sc.nextInt();
       int n = sc.nextInt();
       
       double d = gpterm(a,b,n);
       
       System.out.println("Nth term is - " + (int)Math.floor(d));
	}
	
	static double gpterm(int a , int b, int n) {
		
		double r  = (double)b/(double)a ;
		
		return a*(double)Math.pow(r,n-1);
		
	
	}

}
