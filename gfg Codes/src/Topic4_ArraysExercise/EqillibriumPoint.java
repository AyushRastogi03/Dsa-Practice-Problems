package Topic4_ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

/* Q . Given an array A of n positive numbers. The task is to find the first Equilibium Point in the array. 
Equilibrium Point in an array is a position such that the sum of elements before it is equal to the sum of elements after it.
 * Input: 
n = 5 
A[] = {1,3,5,2,2} 
Output: 3 
Explanation: For second test case 
equilibrium point is at position 3 
as elements before it (1+3) = 
elements after it (2+2). 
 * 
 */

public class EqillibriumPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub  
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] p = new int[n];
		
		for(int i=0;i<n;i++) {
			p[i]  =sc.nextInt() ;
		}
		
		int pos = returnPosition(p,n);
		
		System.out.println(pos);
		
	}
	
	public static int returnPosition(int[] p,int n) {
		
		int sum =0;
		
		for(int i=0;i<n;i++) {
			sum+=p[i];
		}
		
		long l = 0;
		for(int i=0;i<n;i++) {
			sum-=p[i];
			
			if(l==sum) {
				return i+1;
			}
			
			l+=p[i];
		}
		
		return -1;
	}

}
