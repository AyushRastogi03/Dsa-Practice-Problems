package Topic4_ArraysExercise;

import java.util.Scanner;

/*
 * Given a sorted array arr[] of distinct integers.
 *  Sort the array into a wave-like array and return it
In other words, arrange the elements into a sequence such 
that arr[1] >= arr[2] <= arr[3] >= arr[4] <= arr[5].....

If there are multiple solutions, find the lexicographically 
smallest one.

Example 1:

Input:
n = 5
arr[] = {1,2,3,4,5}
Output: 2 1 4 3 5
Explanation: Array elements after 
sorting it in wave form are 
2 1 4 3 5.
 * 
 */

public class WaveArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] ar = new int[n];
		
		for(int i=0;i<n;i++) {
			ar[i] = sc.nextInt() ;
		}
		
		// logic for wave array 
		int temp ;
		for(int i=0;i<n-1;i+=2) {
			
			temp = ar[i];
			ar[i] = ar[i+1];
			ar[i+1] = temp;
			
			
		}
		
		for(int i=0;i<n;i++) {
			System.out.println(ar[i]);
		}
	}
	

}
