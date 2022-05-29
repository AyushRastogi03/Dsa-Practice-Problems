                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                package Topic4_ArraysExercise;

import java.util.Scanner;

public class MinimumAdjDiffInCircular {

	public static void main(String[] args) {
		 // TODO Auto-generated method stub
   
		Scanner sc = new Scanner(System.in); 
		
		int n = sc.nextInt();
		
		int[] ar = new int[n] ;
		
		for(int i=0;i<n;i++) {
			
			ar[i] = sc.nextInt() ;
		}
		
		int m = Math.abs(ar[n-1] - ar[0]);
		
		for(int i=1;i<n;i++) {
			int t = Math.abs(ar[i]-ar[i-1] );
			
			if(m>t) {
				m = t ; 
			}
			
		}
	
	    System.out.println(m);
	}

}
