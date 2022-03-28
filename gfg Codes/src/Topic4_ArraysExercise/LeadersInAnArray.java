package Topic4_ArraysExercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/* Q . Given an array A of positive integers. Your task is to find the leaders in the array. 
 * An element of array is leader if it is greater than or equal to all the elements to its right side. 
 * The rightmost element is always a leader. 
Example 1:

Input:
n = 6
A[] = {16,17,4,3,5,2}
Output: 17 5 2
Explanation: The first leader is 17 
as it is greater than all the elements
to its right.  Similarly, the next 
leader is 5. The right most element 
is always a leader so it is also 
included.
 * 
 */

public class LeadersInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt() ;
		
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt() ;
		}
		
		ArrayList<Integer> li= callLeader(arr,n);
		
		System.out.println(li);

	}
	
	public static ArrayList<Integer> callLeader(int[] arr, int n){
		
		ArrayList<Integer> a = new ArrayList<>();
		
		a.add(arr[n-1]);
		int val = arr[n-1];
		for(int i=n-2;i>0;i--) {
			if(arr[i]>val) {
				val = arr[i];
				a.add(val);
			}
		}
		
		Collections.reverse(a);
		
		return a;
	}

}
